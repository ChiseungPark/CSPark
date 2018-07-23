//////////////////////////////////////////////////////
// 2018.07.02  
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// Rserve 를 이용해서 실제 데이터를 전송하는 클래스
// 
//////////////////////////////////////////////////////

package daos;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class RDao {		
		
		private String localhost = "127.0.0.1";
		private int port = 6311;
		private String workingDirectory = "'C:/demo'";
		private String fileName ="'C:/demo/API_KOR.csv'";
		private String newCommand = "R1<-";
		private String readCSv = "read.csv";
		private int lthofRSummary = 0;
		private RList rl = null;
		
		
		@Test
		public void Rconnect() throws RserveException, REXPMismatchException, FileNotFoundException, IOException {
	        RConnection c = new RConnection(localhost, port);
	        if(c.isConnected()) {
	            System.out.println("Connected to RServe.");
	            if(c.needLogin()) {
	                System.out.println("Providing Login");
	                c.login("pchis", "passw0rd");
	            }

	            REXP x;
	            
	            System.out.println("Reading script...");
	            x= c.eval("getwd();");
	            System.out.println(x.asString());    // prints result1
	            x= c.eval("setwd("+workingDirectory+");");
	            System.out.println(x.asString());    // prints result2
	            
	            newCommand=newCommand+readCSv+"("+fileName+");";
	            x= c.eval(newCommand);
	            x= c.eval("summary(R1);");
	            
	            System.out.println("--------SUMMARY--------");    // prints result
	            System.out.println("Length of R Summary rows"+x.length());    // prints result
	            lthofRSummary = x.length();
	            //System.out.println("Length of R Summary column"+rl.toString());    // prints result
	            for(int i=0;i<lthofRSummary;i++){
	            	//System.out.println(rl.get(i).toString());
	            }	            
	            System.out.println("--------MODEL VIEWER--------");    // prints result
	        
	        } else {
	            System.out.println("Rserve could not connect");
	        }

	        c.close();
	        System.out.println("Session Closed");
	    }

}


	



