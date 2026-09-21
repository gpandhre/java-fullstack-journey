import java.util.Scanner;
public class DrivingEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your driving license status (true/false): ");
        boolean hasLicense = sc.nextBoolean();
        if(age >= 18 && hasLicense){
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }

        sc.close();
    }
}
