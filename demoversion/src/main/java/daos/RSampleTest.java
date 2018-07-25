//////////////////////////////////////////////////////
// 2018.07.02  
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// R 관련 기본 JUnit Test를 위한 코드들
//////////////////////////////////////////////////////

package daos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class RSampleTest {
	
	private String localhost = "127.0.0.1";
	private int port = 6311;
	private String workingDirectory = "'C:/demo'";
	private String fileName ="'C:/demo/API_KOR.csv'";
	private String newCommand = "R1<-";
	private String readCSv = "read.csv";
	private int lthofRSummary = 0;
	
	
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
            System.out.println(x.asString());    
            x= c.eval("setwd("+workingDirectory+");");
            System.out.println(x.asString());    
            
            newCommand=newCommand+readCSv+"("+fileName+");";
            x= c.eval(newCommand);
            String tmpResult= c.eval("summary(R1);").asString();
            
            System.out.println("--------SUMMARY--------");    
            System.out.println(tmpResult);    
            System.out.println("Length of R Summary rows"+x.length());    
            lthofRSummary = x.length();
         
            for(int i=0;i<lthofRSummary;i++){
            	            	
            }
            
            System.out.println("--------MODEL VIEWER--------");    // prints result
        
        } else {
            System.out.println("Rserve could not connect");
        }

        c.close();
        System.out.println("Session Closed");
    }

}
