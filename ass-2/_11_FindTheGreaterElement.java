/*Sample Input
3
1 2 3
Sample Output
2 3 -1 */

import java.util.*;
public class _11_FindTheGreaterElement{
    public static int[] NGE(int[] array , int n){
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = (2*n)-1 ; i>=0  ; i--){
            while(!stk.isEmpty() && (array[i%n]>=array[stk.peek()])){
                stk.pop();
            }
            if(stk.isEmpty()) {
            ans[i%n] = -1;}
            else ans[i%n] = array[stk.peek()];
            stk.push(i%n);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i<n ; i++ ) array[i] = sc.nextInt();
        int[] ans = NGE(array , n);
        for(int i = 0 ; i<n ; i++) System.out.print(ans[i] + " "); 
    }
}