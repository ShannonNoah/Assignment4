package Singleton;

/**
 * Date: July 16 2022
 * Demo class used to get the singleton object.
 * @author Shannon
 *
 */
public class SingletonPatternDemo {
 
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance(); 
		object.showMesssage();

	}

}