import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        System.out.println("Enter the multiple lines of input:");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toLowerCase();
        int vowels=0;
        int word=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels++;
            }
        }
        System.out.println("vowels count is:"+vowels);
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)==' ') &&(str.charAt(i+1)!=' ')){
               word++;
            }
        }
        System.out.println("word count is:"+word);
    }
}



