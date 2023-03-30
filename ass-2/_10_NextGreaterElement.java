/*Sample Input
2
4
11 13 21 3
5
11 9 13 21 3
Sample Output
11,13
13,21
21,-1
3,-1
11,13
9,13
13,21
21,-1
3,-1 */

import java.util.*;
public class _10_NextGreaterElement{
    public static int[] NGE(int[] data , int n){
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ;i<n ; i++){
            while(!stack.isEmpty() && data[i]>data[stack.peek()]){
                ans[stack.pop()] = i;  
            }
            stack.push(i);
        }
        for(int i = 0 ; i<ans.length ; i++){
            ans[i] = data[ans[i]];
        }
        while(!stack.isEmpty()) ans[stack.pop()] =  -1;
        return ans;
    }
    public static void print(int[] arr , int data[] ){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]+","+data[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for(int i = 0 ; i<test ; i++){
            int l = s.nextInt();
            int data[] = new int[l];
            for(int j = 0 ;j<l  ;j++){
                data[j] = s.nextInt();
            }
            int[] ans = NGE(data, l);
            print(data, ans);
        }
        s.close();
        
    }
}