import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class PhoneDirectory {
	private Map<String, String> directoryMap = new HashMap<String, String>();
	File file;
	// local variable declarations and methods …

	/**
	 * read file from some default location of your choosing
	 */
	public PhoneDirectory() {
	    
		file = new File("ContactInfo.txt");
		 try {
			 	
	            Scanner scanner = new Scanner(file);
	            int n=0;
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                String [] input = line.split(",",2);
                	input[n] = input[n].trim();
                	input[n+1] = input[n+1].trim();
                	directoryMap.put(input[n], input[n+1]);
                	n = n+2;
	            }
	            
	            scanner.close();
	     } 
		 
		 catch (FileNotFoundException e) {
	            e.printStackTrace();
	      }
	}
	
	/**
	 *read file and create in memory phone directory
	 * @param phoneDirectoyFile
	 */
	public PhoneDirectory(String phoneDirectoyFile) {
	   
		file = new File("phoneDirectoryFile");

		 try {
			 	file.createNewFile();
	            Scanner scanner = new Scanner(file);
	            scanner.close();
	     } 
		 
		 catch (IOException e) {
	            e.printStackTrace();
	      }
	}
	
	/**
	 * return phone number based on name
	 * @param personName
	 * @return
	 */
	public String lookup(String personName) {
		String number;
		if (directoryMap.containsKey(personName)){
			String result = "Person's information is not in directory.";
			return result;
		}
		else{
			number = directoryMap.get(personName);
			return number;
		}
	}
	
	/**
	 *if the name is already in the directory add it else replace existing name with the new phone number.
	 * @param name
	 * @param phoneNumber
	 */
	public void addorChangeEntry(String name, String phoneNumber) {

		directoryMap.put(name, phoneNumber);
	}
	
	/**
	 * Remove entry from the phone book associate with “name”
	 * @param name
	 */
	public void deleteEntry(String name) {
		directoryMap.remove(name);
	}
	
	/**
	 * write contents of in memory phone directory to a file.
	 */
	public void write() {
	
		try {
			 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (String key : directoryMap.keySet()){
				
		        bw.write(key + ", " + directoryMap.get(key) + "\n");
		     }
			bw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		
		}
	}
}
