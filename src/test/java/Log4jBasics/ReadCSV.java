package Log4jBasics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

	public static void main(String[] args) throws IOException {
		String fname= "C:\\brahma\\Practise\\SelniumPractiseNew\\Nov2023WorkSpace\\MyMavenProjectWitCMD\\src\\test\\java\\Log4jBasics\\MyCsvFile.csv";

		//  to read .txt  we have 2 classes --> FileReader, BufferedReader classes
		
		
		FileReader  fr = new FileReader(fname);
		BufferedReader  br  = new BufferedReader(fr);
		
		String line1 = br.readLine();
		String line2 = br.readLine();
		String line3 = br.readLine();
		String line4 = br.readLine();// null
		
		
		System.out.println("lin1="+line1);
		System.out.println("lin2="+line2);
		System.out.println("lin3="+line3);
		System.out.println("line4="+line4);
		//		        lin1=ram,10,Bng, 100
		//				lin2=sita,20, CHN,200
		//				lin2=sita,20, CHN,200
		//				lin3=null

		// get  Ram 10 Bng 100  without comma's frm lin1=ram,10,Bng, 100

		System.out.println("val from array=");
		String sarr [] = line1.split(",");
		
		for(int i=0;i<=sarr.length-1;i++)
		{
			System.out.print(sarr[i]+ "\t");
		}
		
		// HW   Read all lines and get values individually

	}

}