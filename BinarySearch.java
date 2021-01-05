/**
 * Description: Binary search class that searches for a specific element in a sorted array 
 * @author shubhamkamboj
 *Pre: array must be sorted 
 *Post: none 
 */
public class BinarySearch extends SearchAlgorithm{
	
	/**
	 * Description: no arg constructor 
	 * Pre: none 
	 * Post: none 
	 */
	public BinarySearch() {	
	}
	
	/**
	 * Description: searches binary through an array without recursion
	 * Pre: none 
	 * Post: none 
	 */
	public int search(String[] words, String wordToFind) throws ItemNotFoundException {
		int lowIndex = 0;
		int highIndex = words.length -1;
		while(lowIndex <= highIndex) { //condition to keep searching half the array 
			int midIndex = (highIndex+lowIndex)/2; //middle index 
			if(words[midIndex].equals(wordToFind)) { //returns index if element is found 
				return midIndex;
			}
			if(wordToFind.compareTo(words[midIndex]) > 0) {  //if the middle index element precedes the word 
				lowIndex = midIndex + 1; 
			}
			else {
				highIndex = midIndex -1; // if the word precedes the element 
			}
			this.incrementCount(); //keeps track of the count 
		}
		throw new ItemNotFoundException();
	}

	/**
	 * Description: searches binary through the array recursively 
	 * Pre: none 
	 * Post: none 
	 */
	public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException {
		int LowIndex = 0;
		int HighIndex = words.length -1;
		return searchBinary(words, LowIndex, HighIndex, wordToFind); //calls a submethod 
	}
	
	/**
	 * Description: does a binary search recursively 
	 * @param words
	 * @param low
	 * @param high
	 * @param wordToFind
	 * @return int 
	 * @throws ItemNotFoundException
	 * Pre: none 
	 * Post: none 
	 */
	public int searchBinary(String[] words, int low, int high, String wordToFind) throws ItemNotFoundException {
		if(low <= high) { //condition to keep going 
			int middle = (high + low)/2; //middle of the array 
			if(words[middle].equals(wordToFind)){ // returns the index if found 
				return middle;
			}
			if(wordToFind.compareTo(words[middle]) > 0) { // discards the first half of the array and recursively calls 
				return searchBinary(words, middle + 1, high , wordToFind);
			}else {
				return searchBinary(words,low,middle -1, wordToFind);// discards the second half of the array and recyrsively calls 
			} 
		}
		this.incrementCount(); //increments how many comparisons being made 
		throw new ItemNotFoundException(); //throws exception if item is not found 
	}
	
}
