package algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		
		int list[]= {7,4,5,1,3};
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
		System.out.println();
		
		bubbleSort(list);
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
	}

	public static void bubbleSort(int list[]){
		
		int i,j,tmp;
		for(i=list.length-1;i>0;i--) {
			for(j=0;j<i;j++) {
				if(list[j]>list[j+1]) {
					tmp=list[j];
					list[j]=list[j+1];
					list[j+1]=tmp;
				}
			}
		}
		
	}
	
}
