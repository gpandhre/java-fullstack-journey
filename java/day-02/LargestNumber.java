import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int largest = numbers[0];

        for(int i=1; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
