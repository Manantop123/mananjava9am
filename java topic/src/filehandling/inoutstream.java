package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 	fileoutputstream :-it is used to write into the file.
 * 	fileinputstream:- it is used to read from the file
 * 
 */
public class inoutstream {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("t1.txt");
		String s= "hello world welcome";
		byte[] b = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		
		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}
}
