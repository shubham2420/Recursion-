/**
 * Description: item not found exception class 
 * @author shubhamkamboj
 *Pre: none 
 *Post: none 
 */
public class ItemNotFoundException extends Exception{
	/**
	 * Description: constructor for the item not found exception class
	 * Pre: none
	 * Post: none 
	 */
	public ItemNotFoundException() {
		super("Item Not Found"); //calls the parent class
	}
	/**
	 * Description: constructor for item not found exception with a string argument 
	 * @param message
	 * Pre: none 
	 * Post: none 
	 */
	public ItemNotFoundException(String message) {
		super(message); // calls the parent class with the desired message 
	}
}
