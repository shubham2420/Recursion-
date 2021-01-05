/**
 * Description: Testing driver for the Findfile class
 * @author shubhamkamboj
 *Pre: must be in same project as findFile 
 *Post: none 
 */
public class Driver {
	/**
	 * Description: main method that runs the tests for the findFile class 
	 * @param args
	 * @throws Exception
	 * Pre: none 
	 * Post: none 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Running test for single file: "); 
		String targetFile = "Doppler.pdf"; 
		String pathToSearch = "/Users/shubhamkamboj/Downloads";
		
		int MAX_NUMBER_OF_FILES_TO_FIND = 1;
		FindFile finder = new FindFile(MAX_NUMBER_OF_FILES_TO_FIND); //creates findFile object 
		try{
			finder.directorySearch(targetFile, pathToSearch); //searches directory 
			System.out.println("Found " + finder.getCount() + " file: " + finder.getFiles());
		}catch(Exception e) {
			System.out.println(finder.getFiles()); // prints files even if exception is thrown 
		}
		if(finder.getFiles().isEmpty()) { //checks if the queue is empty
			System.out.println("File not found");
		}
		
		System.out.println("Running test for multiple files: ");
		String targetFile2 = "abc.java"; //runs test for multiple files 
		String pathToSearch2 = "/Users/shubhamkamboj/eclipse-workspace";
		
		int MAX_NUMBER_OF_FILES_TO_FIND2 = 2;
		FindFile finder2 = new FindFile(MAX_NUMBER_OF_FILES_TO_FIND2); //creates findFile object 
		try{
			finder2.directorySearch(targetFile2, pathToSearch2); //searches for file 
			System.out.println(finder2.getFiles());
		}catch(Exception e) {
			System.out.println(finder2.getFiles()); //catches exception and prints the files 
		}
		if(finder2.getFiles().isEmpty()) { //checks if the queue is empty 
			System.out.println("File not found");
		}
		
		System.out.println("Running test for file that doesnt exist: ");
		String targetFile3 = "oooqmox.java"; //a file that doesnt exists 
		String pathToSearch3 = "/Users/shubhamkamboj/eclipse-workspace";
		
		int MAX_NUMBER_OF_FILES_TO_FIND3 = 1;
		FindFile finder3 = new FindFile(MAX_NUMBER_OF_FILES_TO_FIND3);
		try{
			finder.directorySearch(targetFile3, pathToSearch3); // searches directory for the file 
			System.out.println(finder3.getFiles());
		}catch(Exception e) {
			System.out.println(finder3.getFiles()); //prints files after catching exception 
		}
		if(finder3.getFiles().isEmpty()) { //checks for an empty queue
			System.out.println("File not found");
		}
		
		System.out.println("Running test for max number of files: ");
		String targetFile4 = "abc.java"; 
		String pathToSearch4 = "/Users/shubhamkamboj/eclipse-workspace";
		
		int MAX_NUMBER_OF_FILES_TO_FIND4 = 1; //more than one file in directory 
		FindFile finder4 = new FindFile(MAX_NUMBER_OF_FILES_TO_FIND4);
		try{
			finder4.directorySearch(targetFile4, pathToSearch4); //searches for the file 
			System.out.println(finder4.getFiles());
		}catch(Exception e) {
			System.out.println("Found more files than required: "); 
			System.out.println(finder4.getFiles()); // prints files after catching exception 
		}
		if(finder4.getFiles().isEmpty()) { //checks if queue is empty 
			System.out.println("File not found");
		}
		
	}
}
