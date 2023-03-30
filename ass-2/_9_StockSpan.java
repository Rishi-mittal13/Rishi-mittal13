/*Sample Input
5
30
35
40
38
35
Sample Output
1 2 3 1 1 END */

import java.util.*;
public class _9_StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0 ; i<n ; i++){
            data[i] =  sc.nextInt();
        }
        int[] array = new int[n];
        Arrays.fill(array , 1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i<n ; i++){
            while(!stack.isEmpty() && data[i]>=(data[stack.peek()])){
                array[i]+=array[stack.pop()];
            }
            stack.push(i);
        }
        for(int i  = 0 ; i<n ; i++){
            System.out.print(array[i]+ " " );
        }
        System.out.print("END");
    }
}
