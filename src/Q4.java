import java.util.*;

class AddOne{
	public int[] addone(int[]arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}

		arr = new int[arr.length + 1];
		arr[0] = 1;
		return arr;
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		AddOne ao=new AddOne();
		int[]a=ao.addone(arr);
		System.out.println(Arrays.toString(a));
	}

}
