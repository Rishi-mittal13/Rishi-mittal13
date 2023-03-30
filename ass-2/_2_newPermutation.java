//New Permutation
import java.util.*;
public class _2_newPermutation {
    public static void printAllPermutation(String s , String result  , int ind){
        if(ind==s.length()){
            System.out.print(result + " ");
            return ;
        }
        if(Character.isLetter(s.charAt(ind))){
            printAllPermutation(s, result+Character.toLowerCase(s.charAt(ind)), ind+1);
            printAllPermutation(s, result+Character.toUpperCase(s.charAt(ind)), ind+1);
        }
        else{
            printAllPermutation(s, result+s.charAt(ind), ind+1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printAllPermutation(s,"",0);
        scn.close();
    }
}
