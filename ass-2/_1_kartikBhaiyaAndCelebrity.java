import java.util.*;
public class _1_kartikBhaiyaAndCelebrity{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] array = new int[n][n];
	    for(int l = 0 ; l<n ; l++){
	        for(int m = 0 ; m<n ; m++){
	            array[l][m]  = sc.nextInt();
	        }
	    }
	    int[] a1 = new int[n];
	    int[] a2 = new int[n];
	    for(int i = 0 ;i<n ; i++){
	        for(int j = 0 ; j<n ; j++){
	            if(array[i][j]==1){
	                a2[j]++;
	                a1[i]++;
	            }
	        }
	    }
	    for(int i  = 0 ; i <n ; i++){
	        if(a1[i]==0 && a2[i]==(n-1)){
	            System.out.println(i+"");
	            return ;
	        }
	    }
	    System.out.println("No Celebrity");
        sc.close();
    }
}