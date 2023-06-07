import java.util.*;

class SetInt{
	public int[] setint(int[]nums) {
		var numsOfRepeat = new int[nums.length+1]; 
        var result = new int[2];
        int missNum = 0; 
        
        for (int i = 0; i < nums.length; i++){
            missNum = missNum + (i+1);      
            numsOfRepeat[nums[i]]+=1; 
            if (numsOfRepeat[nums[i]] == 2){  
                result[0] = nums[i]; 
            } else {
                missNum-=nums[i];
            }
        }
        
        result[1] = missNum;
        return result;
	}
}

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SetInt si=new SetInt();
		int[]a=si.setint(arr);
		System.out.println(Arrays.toString(a));
	}

}
