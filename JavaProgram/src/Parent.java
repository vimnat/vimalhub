
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent is the class name and also called the test cases
		// main - control and execution starts from the main
		// and it is the heart of the program
		System.out.println(" Be motivated");
		int a = 2;
		int b = 3;
		int mul = a * b;
		System.out.println(mul);
		//to call the child, we need to declare object for the class
		
		Child1 ch = new Child1();
		//ch.validateheader();
		int x = a *  ch.validateheader();
		System.out.println(x);

	}
 
}
