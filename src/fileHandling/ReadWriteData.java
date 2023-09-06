package fileHandling;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteData 
{

	public static void readdata() throws Exception
	{
		
		File f = new File("./Data/test.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
	 int r = fr.read();  //84 
	 
	 
	 
	 while(r!=-1)  //r=84, 104, 105
	 {
		 System.out.print((char)r);  //This
		 
		 r=fr.read();  //h = 104, i=105, -1
	 }
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./Data/test12.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line of this program");  // "\n" - go to next line  
		fw.flush();  //save
		fw.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		
		ReadWriteData.readdata();
		ReadWriteData.writedata();
	}
}
