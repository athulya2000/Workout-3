package sportsstar;

import java.util.Scanner;

class Footballer{
    void income(int in){
        int individualIncome=in*150000;
        System.out.println("Individual income of footballer is :"+individualIncome);
    }

}
class Cricketer{
     void income(int inc){
         int individualIncome=inc*100000;
         System.out.println("Individual income of cricketer is :"+individualIncome);
     }

}

public class Sports {
    public static void main(String[] args) {
        Footballer f=new Footballer();
        System.out.println("Enter the number of football players");
        Scanner s=new Scanner(System.in);
        int fb_count=s.nextInt();
        int[] goals=new int[fb_count];
        int totalGoals=0;
        System.out.println("Enter the number of goals scored by each footballer:");
        for(int i=0;i<fb_count;i++){
            goals[i]=s.nextInt();
            totalGoals=totalGoals+goals[i];
        }
        int avg_goals=totalGoals/fb_count;
        f.income(avg_goals);

        Cricketer c=new Cricketer();
        System.out.println("Enter the number of cricket players");
        int cricketer_count=s.nextInt();
        int[] bat_bowl=new int[cricketer_count];
        int cricket_score=0;
        System.out.println("Enter the bating or bowling average of each cricketer: ");
        for(int i=0;i<cricketer_count;i++){
            bat_bowl[i]=s.nextInt();
            cricket_score=cricket_score+bat_bowl[i];
        }
        int avg_bat_bowl=cricket_score/cricketer_count;
        c.income(avg_bat_bowl);
    }
}
