package sports;

abstract class OutdoorGame {
    abstract void team();

}
class Football extends OutdoorGame{
    void team(){
        System.out.println("Brazil");
    }

}
class Cricket extends OutdoorGame{
    void team(){
        System.out.println("India");
    }

}
public class Main{
    public static void main(String[] args) {
        Football fb=new Football();
        fb.team();
        Cricket ct=new Cricket();
        ct.team();

    }
}
