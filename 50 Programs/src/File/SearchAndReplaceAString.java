package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchAndReplaceAString {

	public static void main(String[] args){
	    double count = 0,countBuffer=0,countLine=0;
	    String lineNumber = "";
	    String filePath = "C:\\Users\\nishanth home\\Desktop\\QA Training\\Notes\\ReplaceString.txt";
	    BufferedReader br;
	    String inputSearch = "are";
	    String line = "";

	    try {
	        br = new BufferedReader(new FileReader(filePath));
	        try {
	            while((line = br.readLine()) != null)
	            {
	                countLine++;
	                String[] words = line.split(" ");

	                for (String word : words) {
	                  if (word.equals(inputSearch)) {
	                    count++;
	                    countBuffer++;
	                  }
	                }

	                if(countBuffer > 0){
	                    countBuffer = 0;
	                    lineNumber += countLine + ",";
	                }

	            }
	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }

	    System.out.println("Times found at--"+count);
	    System.out.println("Word found at--"+lineNumber);

        try{
        File file = new File("C:\\Users\\nishanth home\\Desktop\\QA Training\\Notes\\ReplaceString.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line1 = "", oldtext = "";
        while((line1 = reader.readLine()) != null)
            {
            oldtext += line1 + " ";
        }
        reader.close();
        
        String newtext = oldtext.replaceAll("are", "is");
        System.out.println(newtext);

        FileWriter writer = new FileWriter("C:\\Users\\nishanth home\\Desktop\\QA Training\\Notes\\ReplaceString.txt");
        writer.write(newtext);writer.close();
    }
    catch (IOException ioe){
        ioe.printStackTrace();
    }
	}
	
}