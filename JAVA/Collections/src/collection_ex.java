import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class collection_ex {
	
	 
	//ArrayList to store the CSV information in the ArrayList.
	public ArrayList<Object> CSVData = new ArrayList<Object>();
	
	//data.csv is the csv file from the external API.
	String f = "/Users/anuvrattiku/Desktop/junittest.csv";
	
	File filename = new File(f);
	
	public ArrayList<Object> parseCSV() {
	
	try {
	Scanner inputfile = new Scanner(filename);
	while (inputfile.hasNext()) {
		inputfile.next();//Ignore the CSV headers
		String data = inputfile.next();
		
		String[] values= data.split(",");//Removes the comma from the comma separated file
		for (int x =0; x < 8; x++) {
		//Add all the arrays generated into the CSVData array list. x is the number of columns in our CSV file. 
		
		CSVData.add(values[x]);//Feed array values into an array list.
			
		}
	}
	inputfile.close();
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	
	//Splitting the CSVData into sublists according to row information
	int x = 0;
	while (x < CSVData.size()) {
	
		try {
			
			ArrayList<Object> sensor_data = new ArrayList<Object>(CSVData.subList(x, x+8));
			x = x+8;
			System.out.println(sensor_data);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	return CSVData;
	
	}
	
}

