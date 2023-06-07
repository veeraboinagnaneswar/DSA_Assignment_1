import java.util.*;

class Merg_Sort{
	public void ms(int[]nums1,int m,int[] nums2,int n){
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<m;i++) {
				al.add(nums1[i]);
			
		}
		for(int i=0;i<n;i++) {
			al.add(nums2[i]);
		}
		al.sort(null);
		for(int i=0;i<al.size();i++) {
			nums1[i]=al.get(i);
		}
		System.out.println(Arrays.toString(nums1));
	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the M and N values ::");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[]arr1=new int[m+n];
		int[]arr2=new int[n];
		for(int i=0;i<m;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		Merg_Sort ms=new Merg_Sort();
		ms.ms(arr1, m, arr2, n);
	}

}
