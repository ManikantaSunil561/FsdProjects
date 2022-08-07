package filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling{
	void CreateFile() {
		File obj  =  new File("E:\\FileHandling");
		try {
			if(obj.createNewFile()) 
			{
				System.out.println("File Created :->"+obj.getName());
			}
			else 
			{
				System.out.println("already exit");
			}
		}
		catch(Exception e) 
		{
			System.out.println("error:->"+e);
		}
	}
	void WriteFile() {
		try {
			FileWriter w  = new FileWriter("Abc.txt");
			w.write("Here is filehandling Project");
			w.close();
			System.out.println("write successfully");
		}
		catch(Exception e) 
		{
			System.out.println("error:->"+e);
		}
	}
	void ReadFile() {
		try {
			File obj2  =  new File("Abc.txt");
			Scanner myReader = new Scanner(obj2);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.print(data+ " ");
		      }
		      myReader.close();
		}
		catch(Exception e) 
		{
			System.out.println("error:->"+e);
		}
	}
	void append() {
             try { 
	         String data = " Tutorials Point is a best website in the world";
	         File f1 = new File("files");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         } 
	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("Append ");
	      } catch(Exception e){
	         e.printStackTrace();
	      }
	}
	public static void main(String[] args) 
	{
		FileHandling obj = new FileHandling();
		obj.CreateFile();
		obj.WriteFile();
		obj.ReadFile();
        obj.append();
	}

}