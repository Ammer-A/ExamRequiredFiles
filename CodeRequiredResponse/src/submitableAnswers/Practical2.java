package submitableAnswers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practical2 {
	public static void DoesFileExist(String path) {
		File importFile = new File(path);
		Scanner reader = null;
		// part A :
		// read file path and tell user if the file exist 
		try {
			System.out.println( "file exist !");
			reader = new Scanner(importFile);
			// catch the file does not exist exception here
		} catch (FileNotFoundException e) {
			System.out.println( "file does not exist !");
			e.printStackTrace();
		}
		// check if file has  lines and run until finish
		while (reader.hasNextLine()) {
			String source = reader.nextLine();
			// split string lines using a delimiter ( , and -)
			String[] process = source.split("[-,]");
			for (String result : process) {
				System.out.println(result);
			}

		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		

		DoesFileExist("src/TestFileLoadANDoutput.txt");

	}

}
