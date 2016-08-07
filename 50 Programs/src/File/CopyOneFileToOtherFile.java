package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyOneFileToOtherFile {

	public static void main(String[] args){	
    	InputStream inStream = null;
    	OutputStream outStream = null;
    	try{
 
    	    File file1 =new File("C:\\Users\\nishanth home\\Desktop\\Java\\File.txt");
    	    File file2 =new File("C:\\Users\\nishanth home\\Desktop\\Java\\File3.txt");
 
    	    inStream = new FileInputStream(file1);
    	    outStream = new FileOutputStream(file2);    	   
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    while ((length = inStream.read(buffer)) > 0){
    	    	outStream.write(buffer, 0, length);
    	    }
 
    	    if (inStream != null)inStream.close();
    	    if (outStream != null)outStream.close();
 
    	    System.out.println("File Copied..");
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
}
