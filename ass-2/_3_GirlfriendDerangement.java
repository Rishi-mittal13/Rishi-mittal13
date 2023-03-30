//Girlfriends Derangements

import java.util.*;
public class _3_GirlfriendDerangement {
    public static int printDerangement(int elm){
        if(elm==1) return 0 ;
        if(elm==2) return 1;
        return (elm-1)*(printDerangement(elm-1)+printDerangement(elm-2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elm = scan.nextInt();
        System.out.println(printDerangement(elm));
        scan.close();
    }
}
