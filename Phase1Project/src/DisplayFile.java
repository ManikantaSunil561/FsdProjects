import java.io.File;
import java.io.IOException;
public class DisplayFile{
	public void displayfile() throws IOException {
		String path="F:\\mphasis\\";
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}

}
