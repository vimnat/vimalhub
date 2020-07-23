
public class Javabeginner {

	public int case1() {

		System.out.println("success");

		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 4;
		int b = 4;

		Javabeginner x = new Javabeginner();
		// System.out.println(x.case1());

		Child1 y = new Child1();

		int d = a + b + x.case1() + y.validateheader();
		System.out.println(d);

	}

}
