public class DoWhileCountEven {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        } while (i <= 20);
        System.out.println("The count of even numbers from 1 to 20 is: " + count);
    }
}
