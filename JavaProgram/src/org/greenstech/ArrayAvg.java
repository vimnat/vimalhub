package org.greenstech;

public class ArrayAvg {

    public static void main(String[] args) {

    int[] price = {100, 180, 310, 40, 535, 695};
    int a=0;
    for (int i=0;i<price.length;i++){
    	System.out.println("i: "+price[i]);
        for(int j=i+1;j<price.length;j++){
        	
            if (price[j] > price[i]){
                 a = price[j] - price[i];
            }
        
        }
		System.out.println("A: "+a);
    }

	}

}
