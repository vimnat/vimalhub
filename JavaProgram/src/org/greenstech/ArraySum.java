package org.greenstech;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 4};
		//System.out.println(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.println(sum);
		}
		
		int[][] a= {{1,3,5},{4,6,8}};
		for(int i=0;i<2;i++) {
			System.out.println(a[i]);
			for(int j=0;j<3;j++) {
				System.out.println(a[j]);
			}
		}
		

	}

}
