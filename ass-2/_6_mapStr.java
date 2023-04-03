//map String (java).
import java.util.Scanner;
public class _6_mapStr {
    public static void printAll(String numb , String result , int ind ){
        if(ind==numb.length()) {System.out.println(result); return ;}
        if(numb.charAt(ind)=='0') return ;
        printAll(numb, result + ((char)(Integer.parseInt(numb.substring(ind, ind+1))+64)), ind+1);
        if((ind<numb.length()-1) && (numb.charAt(ind)=='1'|| numb.charAt(ind)=='2' ||  numb.charAt(ind)<'7' )){
            printAll(numb, result + ((char)(Integer.parseInt(numb.substring(ind, ind+2))+64)), ind+2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numb = scan.next();
        printAll(numb,"",0);
        scan.close();
    }
}