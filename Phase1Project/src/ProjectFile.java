import java.util.Scanner;
public class ProjectFile{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AddFile a=new AddFile();
		DeleteFile de=new DeleteFile();
		DisplayFile d=new DisplayFile();
		SearchFile s=new SearchFile();
		System.out.println("Enter Value For Yhe Operation:");
		int v=sc.nextInt();
		while(true)
		{
			switch(v){
				case 1: d.DisplayFile();
						break;
				case 2:
					while(true){
						System.out.println("Enter The Value For Operation");
						int v1=sc.nextInt();
						switch(v1) {
						case 1:
							a.AddFile();
							break;
						}
					}
				case 3:System.out("exit");
					   break;
			}


	}
}