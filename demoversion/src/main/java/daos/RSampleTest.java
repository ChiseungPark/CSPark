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
	private String[] sampleResult = null;
	
	RList tempList = new RList();
	
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
            REXP y;
            
            System.out.println("Reading script...");
            x= c.eval("getwd();");
            System.out.println(x.asString());    
            x= c.eval("setwd("+workingDirectory+");");
            System.out.println(x.asString());    
            lthofRSummary = x.length();
            
            newCommand=newCommand+readCSv+"("+fileName+");";
            x= c.eval(newCommand);
            String[] tmpResult= c.eval("summary(R1);").asStrings();
            
            System.out.println("--------SUMMARY--------");    
            for(int index=0;index<tmpResult.length;index++){
            	System.out.println(tmpResult[index]);
            }
            System.out.println("--------RList Test--------");
            
            /* 이 부분은 돌지 않음....but don`t know why...
            tempList= c.eval("summary(R1);").asList();
                       
            for(int i=0;i<x.length();i++){
            	sampleResult[i] = tempList.at(i).toString();
            	System.out.println(sampleResult[i]);
            }
            */
            System.out.println("Length of R Summary rows is"+x.length());    
                      
            System.out.println("--------Result Completed from R--------");    // prints result
        
        } else {
            System.out.println("Rserve could not connect");
        }

        c.close();
        System.out.println("Session Closed");
    }

}
