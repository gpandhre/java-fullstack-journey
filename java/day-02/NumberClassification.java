import java.util.Scanner;
public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int countZeroes = 0;
        int countPositive = 0;
        int countNegative = 0;  
        for (int i = 0; i < n; i++) {
           
            if (numbers[i] == 0) {
                countZeroes++;
            } else if (numbers[i] > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            
        }
            System.out.println("Count of Zeroes: " + countZeroes); 
            System.out.println("Count of Positive Numbers: " + countPositive);
            System.out.println("Count of Negative Numbers: " + countNegative);
        sc.close();
    }
}
