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
			  
		    key = list[i]; // ���� ���Ե� ������ i��° ������ key ������ ����

		    // ���� ���ĵ� �迭�� i-gap�����̹Ƿ� i-gap��°���� �������� �����Ѵ�.
		    // j ���� first �̻��̾�� �ϰ�
		    // key ������ ���ĵ� �迭�� �ִ� ���� ũ�� j��°�� j+gap��°�� �̵�
		    
		    for(j=i-gap; j>=first && list[j]>key; j=j-gap){
		      list[j+gap] = list[j]; // ���ڵ带 gap��ŭ ���������� �̵�
		    }
		    
		    list[j+gap] = key;
		    
		  }
	}
	
	public static void shell_sort(int list[], int n) {
		
		int i, gap;

		  for(gap=n/2; gap>0; gap=gap/2){
		    if((gap%2) == 0) {
		      gap++; // gap�� Ȧ���� �����.
		    }
		    // �κ� ����Ʈ�� ������ gap�� ����.
		    
		    for(i=0; i<gap; i++){
		      // �κ� ����Ʈ�� ���� ���� ���� ����
		      inc_insertion_sort(list, i, n-1, gap);
		    }
		    
		  }
		  
	}
	
}