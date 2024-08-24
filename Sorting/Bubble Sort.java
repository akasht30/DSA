package org;

public class BubbleSort {

	
	void toSort(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	
	
	void toDoubleBubbleDown(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] ar= {12,34,78,10,9,94};
		
		new BubbleSort().toSort(ar);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("------");
		new BubbleSort().toDoubleBubbleDown(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
