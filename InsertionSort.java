package algorithm;

public class InsertionSort {

	public static void main(String[] args) {
	int arr[]= {9,8,7,6,5,4,3,2,1};
	int key =0;
	for(int i=1;i<arr.length;i++) {
		int j=i-1;
		key=arr[i];
		while(j>=0&&key<arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	for(int nums:arr) {
		System.out.print(nums+" ");
	}
	}
		
}
