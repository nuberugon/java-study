public class Kadai1 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            int num = i + 1;
            System.out.print(num);
            System.out.print(" ");
            if (num % 10 == 0) {
                System.out.println();
            }
            // commit test
        }
    }
}