import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class file 
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw=new FileWriter("test.txt");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader obj=new BufferedReader(ir);
		//BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		String str="this is a test file.";
		String str1="its object is to test read";
		fw.write(str);
		fw.write(str1);
		fw.close();
		System.out.println("file write is over");
		FileReader fr=new FileReader("test.txt");
		BufferedReader br=new BufferedReader(fr);
		//str=obj.readLine();
		//str1=obj.readLine();
		fr.close();
		System.out.println("file read is over");
		System.out.println(str);
		System.out.println(str1);
		
	}
}
