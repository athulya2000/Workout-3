import java.util.Scanner;

public class Substring {
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("Substring of the given string are:");
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String substr=str.substring(i,j);
                System.out.println(substr);
            }
        }
    }
}
