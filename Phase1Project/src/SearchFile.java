import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SearchFile{
	public void searchfile() throws IOException {
		String path="F:\\mphasis\\";
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}

}
