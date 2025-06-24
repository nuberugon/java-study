public class Kadai1 {
    public static void main(String[] args) {
        try {
            int i1 = Integer.parseInt(args[0]);
            for (int i = 0; i < 1000; i++){
                int num = i + 1;
                System.out.print(num);
                System.out.print(" ");
                if (num % i1 == 0) {
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("数字以外が入力されています");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("何も入力されていません");
        }
    }
}