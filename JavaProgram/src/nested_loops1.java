
public class nested_loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// printing pyramid
		int k=3;
		for (int i=0;i<3;i++)
		{
			for (int j=1;j<=1+i;j++)
			{				
				System.out.print(k);
			    System.out.print("\t");
				
			    	k=k+3;
			    
			}
			
			System.out.println("");
		}

		// printing pyramid reverse
		
		int h=1;
		for (int i=0;i<4;i++)
		{
			for (int j=1;j<=4-i;j++)
			{
				System.out.print(h);
			    System.out.print("\t");
			    h++;
			}
			
			System.out.println("");
		}
	}

}
