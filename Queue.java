
public class Queue {
	Object[] theArray; // array of objects 
	
	public Queue() { //initializes the array with length 0
		theArray = new Object[0]; 
	}
	/**
	 * Description: adds the object to the end of the queue
	 * Pre: parameter must be of object
	 * Post: adds the object to the end of the queue  
	 */
	public Queue(Object[] other) {
		theArray = new Object[other.length];
		theArray = other;
	}
	public void enqueue(Object other) { // add the object to the end of the queue
		Object[] tempArray = createAndCopyNewArray(theArray); //creates a copy of theArray with a length of 1 more 
		tempArray[tempArray.length-1] = other;
		theArray = tempArray; // assigns tempArray to theArray
	}
	/**
	 * Description: Removes the first object in the queue 
	 * Pre: none
	 * Post: object at the beginning of the queue removed 
	 */
	public Object dequeue() { // removes the first object in the queue 
		Object[] tempArray = new Object[theArray.length -1]; //creates an array with length 1 less than theArray
		Object toReturn = theArray[0];
		int temp = 0;
		for(int i = 1; i < theArray.length ; i++) { // populates copy array with all values besides the first 
			tempArray[temp] = theArray[i];
			temp++;
		}
		theArray = tempArray;
		return toReturn;
	}
	/**
	 * Description: returns the size of the array 
	 * Pre: none 
	 * Post: none
	 */
	public int size() { // returns the size of the array 
		return theArray.length;
	}
	/**
	 * Description: returns the array in a String format 
	 * Pre: none
	 * Post: none 
	 */
	public String toString() { // puts array into a String form 
		String toReturn = "";
		for(int i = 0; i < theArray.length; i ++) {
			toReturn += theArray[i] + ",";
		}
		return toReturn;
	}
	/**
	 * Description: checks if the array is empty 
	 * Pre: none
	 * Post: none
	 */
	public boolean isEmpty() { //checks if array is empty 
		if(theArray.length == 0) {
			return true;
		}
		return false;
	}
	/**
	 * Description: gets the object at the given index
	 * Pre: index must be less than the arrays length  
	 * Post: none 
	 */
	private Object get(int index) { // returns the object at desired index 
		return theArray[index];
	}
	/**
	 * Description: check if two queues are equal
	 * Pre: Parameter must be of type Queue 
	 * Post: none 
	 */
	public boolean equals(Queue other) { // check if two queues are equal
		for(int i = 0; i < this.theArray.length ; i ++) {
			if(!(other.get(i).equals(this.theArray[i]))){
				break;
			}else {
				return true;
			}
		}
		return false;
	}
	/**
	 * Description: create and copys theArray with length of plus one 
	 * Pre: Parameter must be an array of type Object 
	 * Post: none 
	 */
	public Object[] createAndCopyNewArray(Object[] other) { // creates a copy array with a length of +1 than theArray
		Object[] tempArray = new Object[this.theArray.length+1];
		for(int i = 0; i < this.theArray.length ; i++) {
			tempArray[i] = this.theArray[i];
		}
		return tempArray;	
	}
	
}
