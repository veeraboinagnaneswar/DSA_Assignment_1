import java.util.*;

class IsDup{
	public boolean isConDup(int[]arr) {
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				return true;
			}
		}
		return false;
	}
}

public class Q6 {

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
		IsDup id=new IsDup();
		System.out.println(id.isConDup(arr));
	}

}
