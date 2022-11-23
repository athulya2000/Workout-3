import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ExceptionHandling {
    static class exceptionLineTooShort extends Exception{
        exceptionLineTooShort(String msg){
            super(msg);
        }
    }
    static class exceptionLineTooLong extends Exception{
        exceptionLineTooLong(String msg){
            super(msg);
        }
    }
    public static int lengthCheck(String str){
        int i=0;
        int len=0;
        for(char ch:str.toCharArray()){
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println("Enter the input line");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("Length of the input string is"+lengthCheck(str));

        try {
            if (lengthCheck(str) < 5) {
                throw new exceptionLineTooShort("The input is too short");
            }
            else if (lengthCheck(str) > 10) {
                 throw new exceptionLineTooLong("The input is too long");
            }
        }catch(exceptionLineTooShort e){
            System.out.println(e.getMessage());
        }
        catch (exceptionLineTooLong e2){
            System.out.println(e2.getMessage());
        }

    }
}
