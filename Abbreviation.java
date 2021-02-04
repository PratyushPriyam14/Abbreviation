import java.io.*;
import java.util.*;
public class Abbreviation {
    public static void abb(String str,String asf,int count,int pos) {
        if (pos == str.length()) {
            if (count == 0) {
                System.out.println(asf);
            } else {
                System.out.println(asf + count);
            }
            return;
        }
        if (count > 0) {
            abb(str, asf + count + str.charAt(pos), 0, pos + 1);
        }
        else {
            abb(str, asf + str.charAt(pos), 0, pos + 1);
        }
        abb(str,asf,count+1,pos+1);
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        abb(str," ",0,0);
    }
}
