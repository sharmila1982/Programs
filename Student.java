
import java.util.Scanner;

class Student1 {

    int amt = getFeePaid();
    int mode, a;

    Student1(int a) {

        this.a = a;
    }

    Student1(int amt, int mode) {
        this.amt = amt;
        this.mode = mode;

    }

    int getTotalFee() {
        return switch (a) {
            case 1 ->
                10000;
            case 2 ->
                7500;
            default ->
                17500;
        };
    }

    int getDue(int totfee) {
        return totfee - amt;
    }

    int getFeePaid() {

        return amt;
    }

    void payment() {
        if (mode == 1) {
            System.out.println(" payment paid through online "); 
        }else {
            System.out.println("payment done through Cash");
        }
    }
}

public class Student {

    public static void main(String[] args) throws Exception {
        int admin_no = 10001;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1.To select only Java\n2.To select Python\n3.To select both Java and Python courses");
        int a = sc.nextInt();
        if (a < 1 || a > 3) {
            throw new Exception("Enter valid input");

        }
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sd.nextLine();

        Student1 s = new Student1(a);
        int totfee = s.getTotalFee();
        System.out.println("Hai.." + name + " your total fee is:" + totfee + " and your admin number is " + admin_no);
        System.out.println("How much amount do you want to pay:");
        int amt = sc.nextInt();
        System.out.println("Payment mode.Press,\n1.Online payment\n2.Cash payment");
        int mode = sc.nextInt();
        Student1 s1 = new Student1(amt, mode);

        System.out.println("Total fee paid:" + s1.getFeePaid());
        System.out.println("Fee Balance: " + s1.getDue(totfee));
        s.payment();
    }

}
