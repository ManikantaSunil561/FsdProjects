import java.io.File;
import java.io.IOException;
public class DisplayFile{
	public static void main(String[] args) throws IOException {
		String path="F:\\mphasis\\";
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}

}
