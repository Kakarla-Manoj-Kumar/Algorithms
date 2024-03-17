package algorithm;

public class SelectionSort{
	public static void main(String[] args) {
		int arr[]= {9,7,6,5,4,3};
		int minIndex=0;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			minIndex=i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
		for(int nums: arr) {
			System.out.print(nums+" ");
		}
	}
}