import java.io.*;
/**
 * Description: a class that finds a specific file given the directory 
 * @author shubhamkamboj
 * Pre: must provide a target file and target directory 
 * Post: none
 */
public class FindFile {
	private int maxFiles;
	private Queue files; 
	/**
	 * Description: Constructor for findFile
	 * @param maxFiles
	 * Pre: takes in a parameter maxFiles
	 * Post: creates a findFile object 
	 */
	public FindFile(int maxFiles) {
		this.maxFiles = maxFiles;
		files = new Queue(); //initializes the queue object 
		
	}
	/**
	 * Description: a recursive routine that searches the directory for a target file 
	 * @param target
	 * @param dirName
	 * @throws Exception
	 * Pre: none 
	 * Post: enqueues file in a queue if it exists in the directory 
	 */
	public void directorySearch(String target, String dirName) throws Exception {
		File f = new File(dirName); //converts directory name into a file
		if(!(f.isDirectory())) { // checks if it is a directory
			throw new IllegalArgumentException();
		}
		File[] fileList = f.listFiles(); // gets the list of files under the directory 
		for(int i = 0; i < fileList.length; i ++) { //traverses through the files 
				if(fileList[i].isDirectory()) {	 
						directorySearch(target, fileList[i].getPath()); //calls directorySearch if a directory is found 
				}
				if(fileList[i].getName().equals(target)) {
						files.enqueue(fileList[i].getPath()); //enqueues the file path if it is found 
				}
		}
		if(files.size() > this.maxFiles) { //throws exception if more files are found than the max size declared 
			throw new Exception("More than " + this.maxFiles + " found");
		}
	}
	/**
	 * Description: gets the number of files in the queue
	 * @return
	 * Pre: none 
	 * Post: none 
	 */
	public int getCount() {
		return files.size();
	}
	/**
	 * Description: gets the queue of files 
	 * @return
	 * Pre: none 
	 * Post: none
	 */
	public Queue getFiles() {
		return files;
	}
}
