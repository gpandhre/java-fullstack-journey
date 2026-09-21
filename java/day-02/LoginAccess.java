import java.util.Scanner;
public class LoginAccess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email verified status (true/false): ");
        boolean emailVerified = sc.nextBoolean();
        System.out.println("Enter your phone verified status (true/false): ");
        boolean phoneVerified = sc.nextBoolean();

        if(emailVerified || phoneVerified){
            System.out.println("You can access your account.");
        } else {
            System.out.println("You cannot access your account.");
        }

        sc.close();
    }
}
