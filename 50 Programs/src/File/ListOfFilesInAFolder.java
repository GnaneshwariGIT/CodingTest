package File;

import java.io.File;

public class ListOfFilesInAFolder {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\nishanth home\\Desktop\\Java");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
	}
}
