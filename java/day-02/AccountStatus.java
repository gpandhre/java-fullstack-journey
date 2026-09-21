import java.util.Scanner;
public class AccountStatus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account locked status (true/false): ");
        boolean accountLocked = sc.nextBoolean();

        if(!accountLocked){
            System.out.println("Account is active.");
        } else {
            System.out.println("Account is locked.");
        }

        sc.close();
    }
}
