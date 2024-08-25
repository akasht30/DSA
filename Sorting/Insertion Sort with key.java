package org;

public class InsertionSort {

	void toSort(int[] ar) {
		
		for(int i=1;i<ar.length;i++) {
			int key= ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>key) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		int[] ar= {90,78,10,67,45,34};

		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("-----");
		 new InsertionSort().toSort(ar);
		 
		 for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]+" ");
			}
	}
	
}
