package algorithm;

public class MergeSort {
	public static void merge(int arr[],int left,int mid,int right) {
		int n1 =mid-left+1;
		int n2 =right-mid;
		int leftarr[]=new int[n1];
		int rightarr[]= new int[n2];
		
		for(int x=0;x<n1;x++) {
			leftarr[x]=arr[left+x];
		}
		for(int x=0;x<n2;x++) {
			rightarr[x]=arr[mid+1+x];
		}
		
		int i=0;
		int j=0;
		int k = left;
		
		while(i<n1&&j<n2) {
			if(leftarr[i]<=rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
			}else {
				arr[k]=rightarr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
		}
		
	}
	public static void mergeSort(int arr[],int left,int right) {
		
		if(left<right) {
			int mid=(left+right)/2;
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {20,30,80,40,60,28,39,63};
		
		mergeSort(arr,0,arr.length-1);
		
		for(int nums:arr) {
			System.out.print(nums+" ");
		}
	}

}
