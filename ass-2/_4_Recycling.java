/*Recycling
 6
2 1 5 6 2 3 // 10
 */
import java.util.*;
public class _4_Recycling {
    public static int[] prsm(int[] arr , int n ){
        int[] results = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int  i =  n-1 ; i>=0 ; i--){
            while(!stk.isEmpty() && arr[i]<=(arr[stk.peek()])){
                results[stk.pop()] = i;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()) results[stk.pop()] = -1;
        return results; 
    }
    public static int[] nxsm(int[] arr , int n ){
        int[] results = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i =  0 ; i <n ; i++){
            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()]){
                results[stk.pop()] =  i ;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()) results[stk.pop()] = n;
        return results; 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = scan.nextInt();
        }
        int PS[] = prsm(arr,n);
        int NS[] = nxsm(arr,n);
        int max = 0;
        for(int i = 0 ; i<n ; i++){
            int value = (NS[i]-PS[i]-1)*arr[i];
            if(value>max) max = value;
        }
        System.out.println(max);
        scan.close();
    }
}
