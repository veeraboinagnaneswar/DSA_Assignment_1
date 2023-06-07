import java.util.*;

class TwoSum{
	public int[] twoSum(int[]arr,int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("please enter the target ::");
		int target=sc.nextInt();
		TwoSum ts=new TwoSum();
		int[]a=ts.twoSum(arr, target);
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
