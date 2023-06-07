import java.util.*;

class MoveZero{
	public int[] move_Zero(int[]nums) {
		int[]arr=new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[x]=nums[i];
                x++;
            }
        }
        /*for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }*/
        return arr;
	}
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the size ::");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("please enter the elements ::");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		MoveZero mz=new MoveZero();
		int[]a=mz.move_Zero(arr);
		System.out.println(Arrays.toString(a));

	}

}
