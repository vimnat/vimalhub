
public class IndianTraffic implements InterfaceCentral, InterfaceCentral1{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceCentral a = new IndianTraffic();
		a.GreenGo();
		a.YellowWait();
		a.RedStop(); 
		
		InterfaceCentral1 b = new IndianTraffic();
		b.whitepassing();		

	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("Green");
		
	}

	@Override
	public void YellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Red");
		
	}

	@Override
	public void whitepassing() {
		// TODO Auto-generated method stub
		System.out.println("passby");
		
	}

}
