//////////////////////////////////////////////////////
// 2018.07.02  
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// R로 값을 던지기 위한 데이터 포멧으로 C에서의 structure라고 할 수 있다.
// 
//////////////////////////////////////////////////////

package r;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Rcommand {
	
	private String localhost = "127.0.0.1";
	private String comma = ",";
	private int port = 6311;
	private String newCommand = "R1<-c(";
	private String readCSv = "read.csv";
	private String[] inputStrings = null;
	private String[] resultArray = null;
	private String[] emptyresult = {"not","connected to R"};
	RList tempList = new RList();
	
	public String[] rSummary (String[] input) 
			throws RserveException, REXPMismatchException, FileNotFoundException, IOException {
        RConnection c = new RConnection(localhost, port);
        if(c.isConnected()) {
           if(c.needLogin()) {
                c.login("pchis", "passw0rd");
            }
            
            inputStrings = input;
            //R CLI처럼 벡터를 만들어 준다.
            for(int index=0;index<inputStrings.length;index++){
            	if(index != (inputStrings.length-1)){
            	newCommand = newCommand+inputStrings[index]+comma;
            	}
            	else
            		newCommand = newCommand+inputStrings[index]+");";
            }
            REXP x;
            
            x = c.eval(newCommand);
            resultArray = c.eval("summary(R1);").asStrings();    
            
            c.close();
            return resultArray;
        } 
        else {
            return emptyresult;
        }  
    }
}
