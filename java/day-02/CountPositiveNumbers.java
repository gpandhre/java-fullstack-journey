import java.util.Scanner;
public class CountPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }
        System.out.println("Count of positive numbers: " + count);
        sc.close();
    }
}
