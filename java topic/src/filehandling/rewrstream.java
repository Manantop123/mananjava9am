package filehandling;
/*
 * filewriter :- is used to write txt into file.
 * filereader:- is used to read txtfrom file.
 */

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class rewrstream {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("txt2.txt");
		String s = "hello worls welocme";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileInputStream fi = new FileInputStream("txt2.txt");
		int i;
		while((i=fi.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\nfile read successfully");
	}
}
