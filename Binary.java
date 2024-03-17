package algorithm;

public class Binary{

public static void main(String[] args){
	
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int target = 5;
	
	int result = binarySearch(arr,target);
	if(result!=-1) {
		System.out.println("Target Found At The Index Number : "+ result);
		
	}
	else{
		System.out.println("Target Not Found");
	}
}

private static int binarySearch(int[] arr, int target) {
	int left=0;
	int right=arr.length-1;
	while(right<=right) {
		int mid=(left+right)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid]<target) {
			left=mid+1;
		}
		else {
			right = mid-1;
		}
	}
	return -1;
}


}