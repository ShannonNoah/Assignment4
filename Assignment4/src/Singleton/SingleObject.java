package Singleton;

/**
 * Date: July 16 2022
 * Singleton class used to create a single object.
 * @author Shannon
 * 
 *
 */
public class SingleObject {
 
	// create an object of SingleObject.
	private static SingleObject instance = new SingleObject();
	
	
	/**
	 * Constructor for SingleObject. Made private so that this class cannot be instantiated.
	 */
	private SingleObject() {};
	
	/**
	 * Method to get the only object available.
	 * @return SingleObject
	 */
	public static SingleObject getInstance(){
		return instance;
	}
	
	/**
	 *  Method to display the message.
	 */
	public void showMesssage() {
		System.out.println("Hello World");
	}

}

