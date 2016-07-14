import java.util.Scanner;


public class InterfaceLearning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int val = sc.nextInt();
		System.out.println();
		ILearnInterface ilf = new Class1();
		ilf.setNumberValue(val);
		
		System.out.println();
		ILearnInterface ilf1 = new Class2();
		ilf1.setNumberValue(val);
	}

}
