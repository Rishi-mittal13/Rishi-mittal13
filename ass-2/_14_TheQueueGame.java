import java.util.*;

public class _14_TheQueueGame {
public static String checkValidity(int[] inputArray , int size ){
Stack<Integer> stack = new Stack<>();
if(inputArray[0] == 0) {
return "Invalid";
}
for(int i = 0 ; i < size ; i++){
if(inputArray[i] == 1) {
stack.push(1);
} else if(stack.isEmpty() && inputArray[i] == 0) {
return "Invalid";
} else {
stack.pop();
}
}
return "Valid";
}
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int testCases = scanner.nextInt();
    for(int i = 0 ; i < testCases ; i++){
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        for(int j = 0 ; j < size ; j++){
            inputArray[j] = scanner.nextInt();
        }
        System.out.println(checkValidity(inputArray,size));
    }
    scanner.close();
}
}