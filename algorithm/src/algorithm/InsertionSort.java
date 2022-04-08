package algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int list[]= {8,5,6,2,4};
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		
		insertionSort(list);
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
	}

	public static void insertionSort(int list[]) {
		int i,j,key;
		
		for(i=1; i<list.length; i++) {
			key = list[i];
			for(j=i-1;j>=0 && list[j]>key;j--) {
				list[j+1]=list[j];
			}
			
			list[j+1]=key;
		}
		
	}
	
}
