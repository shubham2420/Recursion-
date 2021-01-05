/**
 * Description: linear search class which searches linearly through an array 
 * @author shubhamkamboj
 *Pre: none 
 *Post: none 
 */
public class LinearSearch extends SearchAlgorithm{
	
	/**
	 * Description: no arg constructor 
	 * Pre: none 
	 * Post: none 
	 */
	public LinearSearch() {
	}
	
	/**
	 * Description: searches interatively through an array 
	 * @param words, wordToFind
	 * @return int 
	 * Pre: none 
	 * Post: none 
	 */
	public int search(String[] words, String wordToFind) throws ItemNotFoundException {
		for(int i = 0; i < words.length; i++) { //traverses through the array 
			this.incrementCount();
			if(words[i].equals(wordToFind)){ 
				return i; // returns index if there is a match 
			}
		}
		throw new ItemNotFoundException("String not found");
	}
	/**
	 * Description: Linear search that searches recursively through an array
	 * Pre: none 
	 * Post: none 
	 * I get a stackoverflow error because the computer cannot handle so many recursions one by one of a 
	 * file this large 
	 */
	public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException {
		return linearRecursive(words, words.length -1, wordToFind); //calls the submethod 
	}
	/**
	 * Description: searches recursively by implementing linear search 
	 * @param words
	 * @param num
	 * @param wordToFind
	 * @return int 
	 * @throws ItemNotFoundException
	 * Pre: none 
	 * Post: none 
	 */
	public int linearRecursive(String[] words, int num, String wordToFind) throws ItemNotFoundException {
		if(num < 0) { // if element is not found 
			throw new ItemNotFoundException(); 
		}
		if(words[num].equals(wordToFind)) { // base case if element found 
			return num;
		}
		this.incrementCount();
		return linearRecursive(words, num-1, wordToFind); // looks for the element 
	}
	
}
