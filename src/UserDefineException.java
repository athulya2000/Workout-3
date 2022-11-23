import java.util.Scanner;

class InvalidPanException extends Exception{
    InvalidPanException(String msg){
        super(msg);
    }
}
public class UserDefineException {
    public static void main(String[] args) {
        System.out.println("Enter the name:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Enter the PAN card number:");
        String panCardNo = s.nextLine();
        if (name.toLowerCase().charAt(0) == panCardNo.toLowerCase().charAt(4)) {
            System.out.println("Valid PAN Card number");
        } else {
            try {
                throw new InvalidPanException("Invalid Pan Card");
            } catch (InvalidPanException e) {
                System.out.println(e.getMessage());
                System.out.println("Please update the PAN Card");
            }
        }
    }
}


