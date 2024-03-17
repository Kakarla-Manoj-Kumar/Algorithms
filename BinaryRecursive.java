package algorithm;

public class BinaryRecursive {
	public static int binaryRecursive(int nums[],int target,int left,int right) {
		int mid=(left+right)/2;
		int steps=0;
		
		if(nums[mid]==target) {
			steps++;
			System.out.println("Total Steps Taken : "+steps);
			return mid;
		}
		else if(nums[mid]<=target) {
			return binaryRecursive(nums, target, mid+1, right);
		}
		else {
			return binaryRecursive(nums, target, left, mid-1);
		}
		
		
	}

	public static void main(String[] args) {
		int nums[] = {1,3,5,7,9,11,13,15,17,19};
		int target = 5;
		
		int result = binaryRecursive(nums,target,0,nums.length-1);
		 if(result != -1){
		System.out.println("Target Found At Index : "+result);
		}
		 else{
			System.out.println("Target Not Found");
		 }

	}

}
