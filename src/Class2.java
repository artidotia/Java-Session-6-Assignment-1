
public class Class2 implements ILearnInterface{

	public void setNumberValue(int val) {
		System.out.println("You are in class2 which implements interface and prints square of the given number!");
		System.out.println("The square of " + val + " is: " + val * val);
	}

}
