import java.util.Scanner;

public class RetailPrice {
    public static void main(String args[]) {
        String cont;
        double cost, retail, rate;
        rate = 2.5;

        Scanner keybd = new Scanner(System.in);

        System.out.println("If you want quiet enter -1:");
        do {
            System.out.println("What is the WholePrice? ");
            cost = keybd.nextInt();
            if (cost > -1 ){
                retail = cost * rate;
                System.out.println(retail);}
            else
                System.out.println("I see that you want quiet the retail price calculator.");
        }while (cost != -1);
        System.out.println("Thank you for using the retail price calculator.");
    }
}
