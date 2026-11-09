package fileoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Harshini\\Desktop\\Java\\file4",true);
		//String data="Java";
		//byte[]arr=data.getBytes();
		int data=   65;//we can also insert integer data into file
		fos.write(data);
		System.out.println("Connection created and data written inside the specified file");
		fos.close();
		System.out.println("---------------------------------------------------------------------");
		FileInputStream fis=new FileInputStream("C:\\Users\\Harshini\\Desktop\\Java\\file4");
		int i;
		System.out.println("Connection created and started reading from file ");
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}

}
