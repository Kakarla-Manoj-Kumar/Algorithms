package algorithm;


public class Linear {
	public static int linearSearch(int nums[],int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
public static void main(String[] args) {
	
	int nums[]= {1,3,5,7,9,11,13,15,17,19};
	int target = 15;
	int result = linearSearch(nums,target);
	if(result!=-1) {
	System.out.println("Target Found At Index No : "+result);
	} 
	else {
		System.out.println("Target Not Found");
	}
	
}
}


