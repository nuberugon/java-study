public class MethodKadai {
    public static void main(String[] args) {
        // hello();
        // callName("tanaka");
        // int result = sum(1,4);
        // System.out.println(sum(1,4));
        //greet("なかた");
       //int result = doubleNumber(10,2);
       //System.out.println(doubleNumber(10,2));
        boolean result = isEven()
    }


    // 引数なし 戻り値なし
    //public static void hello() {
      //  System.out.println("こんにちは");
    //}

    // 引数あり 戻り値なし
    //public static void callName(String name) {
      //  System.out.println(name);
    //}

    // 引数あり 戻り値あり
    //public static int sum(int x, int y) {
    //  return x + y;
    //}
    //public static void greet(String name) {
    //  System.out.println("こんにちは、" + name + "さん！");
    //}
    //public static int doubleNumber (int x, int y) {
    //    return x * y;
      public static boolean isEven (int x, int y) {
        return x % y;
      }
}
