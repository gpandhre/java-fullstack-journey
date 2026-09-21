public class WhileCountEven {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }
        System.out.println("Count of even numbers from 1 to 20: " + count);
    }
}
