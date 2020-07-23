
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Vimalnath Ramachandran";
		System.out.println(a);
		System.out.println(a.charAt(7));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.substring(9, 13));
		System.out.println(a.concat(" SMR"));
		String b = a.substring(9);
		System.out.println(b);
		System.out.println(b.trim());
		String[] c = a.split(" ");
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		System.out.println(a.length());
		
		String s=a.substring(0, 5);
		System.out.println(s);
		
		
		
		/* for (int i=a.length()-14;i>=0;i-- )
		{
		System.out.println(a.charAt(i));
		} */
		String t = "";
		int i= a.length()-14;
		while (i>=0)
		{
			//t = t + a.charAt(i);
			System.out.print(a.charAt(i));
			i--;
			
		}
			
			//System.out.println(t);
		 
	}

}
