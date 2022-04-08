package algorithm;

public class SelectionSort {

	public static void main(String[] args) {

		int list[]= {9,6,7,3,5};
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		
		selectionSort(list);
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
	}

	public static void selectionSort(int list[]) {
		int i,j,least,tmp;
		for(i=0;i<list.length-1;i++) {
			least=i;
			for(j=i+1;j<list.length;j++) {
				if(list[j]<list[least]) {
					least=j;
				}
			}
			
			if(least != i) {
				tmp=list[i];
				list[i]=list[least];
				list[least]=tmp;
			}
			
		}
	}
}
