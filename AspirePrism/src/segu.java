
public class segu {

	 static final in MAX_CHAR=26;
	    static void printCommon(String s1,String s2)
	{
	int [] a1= new_int[MAX_CHAR];
	int [] a2= new_int[MAX_CHAR];

	int length1= S1.length();
	int length2= S2.length();
	(
	for(int i=0;i<length1;i++)
	    a1[s1.charAt(i) - "a"] + = 1 ;
	    
	for(int i=0;i<length1;i++)
	    a2[s2.charAt(i) - "a"] + = 1 ;
	for(int i=0;i<MAX_CHAR;i++)
	    {
	        if(a1[i]!=0 && a2[i]!=0)
	            for(int j=0;j<Math.min(a1[i],a2[i])
	            System.out.print(((char(i+'a')));
	    }
	}
	    
	public static void main(String[] args)
	    {
	        String s1="Hello All \r\n" + 
	        		"	           This is Nick\r\n" + 
	        		"	           how life is going on..\r\n" + 
	        		"	           how about the weather in USA\r\n" + 
	        		"	           life good here." , s2="Hello All\r\n" + 
	        				"	        				This is John\r\n" + 
	        				"	        		           How about the life in US\r\n" + 
	        				"	        		           how is the weather in USA\r\n" + 
	        				"	        		           life good here.\r\n" + 
	        				"	        		           Hello all again\r\n" + 
	        				"	        		           This is snow\r\n" + 
	        				"	        		           weather is bad"
	        printCommon(s1,s2);
	    }

}
