package algorithm;

public class QuickSort {
	
	public static int partician(int arr[],int low,int high) {
		
		int pivot = arr[high];
		int temp=0;
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	
	public static void quickSort(int[]arr,int low,int high) {
		if(low<high) {
			int pi = partician(arr,low,high);
			
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		
		quickSort(arr,0,arr.length-1);
		
		for(int nums:arr) {
			System.out.print(nums+" ");
		}
	}
	
}

		

 