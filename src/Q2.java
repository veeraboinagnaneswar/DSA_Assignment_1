import java.util.*;

class RemoveElement{
	public int removeElement(int[]nums,int val) {
		int []arr=new int[nums.length];
		int x=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				arr[x]=nums[i];
				x++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			nums[i]=arr[i];
		}
		return x;
	}
}

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the size and the array elements ::");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Please enter the val::");
		int val=sc.nextInt();
		RemoveElement re=new RemoveElement();
		int x=re.removeElement(arr, val);
		System.out.println(x);
	}

}
