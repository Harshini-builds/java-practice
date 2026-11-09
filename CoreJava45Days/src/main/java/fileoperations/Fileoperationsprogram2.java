package fileoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoperationsprogram2 {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Harshini\\Desktop\\HTML\\image\\8.jpg");
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Harshini\\Desktop\\HTML\\image\\11.jpg");
	byte[] arr=new byte[1024];
	int count;
	while((count=fis.read(arr))!=-1) {
		fos.write(arr, 0, count);
	}
	fis.close();
	fos.close();
	
	}
}
