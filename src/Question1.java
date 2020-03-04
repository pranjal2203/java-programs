import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


class Question1
{
	public static void main(String[] args) throws IOException 
	{
		int i;
		PrintWriter pw =new PrintWriter(System.out, true);
		FileInputStream fin;
		
		if(args.length!= 1)
		{
			pw.println("test.txt");
			return;
		}
	
		fin = new FileInputStream(args[0]);
		
		i = fin.read();
		do
		{
			if(i!=-1)
			System.out.println((char)i);
		}while(i!=-1);
		
		}
	
	//fin.close();
	
	
	}	


	
	