package org;

public class SelectionSort {

	void toSort(int[] ar ) {
		
		for(int i=0;i<ar.length;i++) {
			int midIndex=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[midIndex]) {
					midIndex=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[midIndex];
			ar[midIndex]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[] ar= {20,390,10,80,79};
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----");
		new SelectionSort().toSort(ar);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
}
