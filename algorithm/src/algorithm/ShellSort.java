package algorithm;

public class ShellSort{
	
	public static void main(String[] args) {
		int i;
		int n=11;
		int list[]={10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16};

		for(i=0;i<n;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		shell_sort(list,n);
		
		for(i=0;i<n;i++) {
			System.out.print(list[i]+" ");
		}
		
	}
	
	public static void inc_insertion_sort(int list[], int first, int last, int gap) {
		int i, j, key;

		  for(i=first+gap; i<=last; i=i+gap){
			  
		    key = list[i]; // 현재 삽입될 숫자인 i번째 정수를 key 변수로 복사

		    // 현재 정렬된 배열은 i-gap까지이므로 i-gap번째부터 역순으로 조사한다.
		    // j 값은 first 이상이어야 하고
		    // key 값보다 정렬된 배열에 있는 값이 크면 j번째를 j+gap번째로 이동
		    
		    for(j=i-gap; j>=first && list[j]>key; j=j-gap){
		      list[j+gap] = list[j]; // 레코드를 gap만큼 오른쪽으로 이동
		    }
		    
		    list[j+gap] = key;
		    
		  }
	}
	
	public static void shell_sort(int list[], int n) {
		
		int i, gap;

		  for(gap=n/2; gap>0; gap=gap/2){
		    if((gap%2) == 0) {
		      gap++; // gap을 홀수로 만든다.
		    }
		    // 부분 리스트의 개수는 gap과 같다.
		    
		    for(i=0; i<gap; i++){
		      // 부분 리스트에 대한 삽입 정렬 수행
		      inc_insertion_sort(list, i, n-1, gap);
		    }
		    
		  }
		  
	}
	
}