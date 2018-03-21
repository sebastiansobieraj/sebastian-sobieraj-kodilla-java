package lotto;

public class Numbers {
    public static void main(String args[]) {
        int wynik = number(17868);

        System.out.println(wynik);
    }

    public static int number(int n) {
        int result = 0;
        while (n != 0) {
//            int a = n % 10;
            result = (result * 10) + (n % 10);
            n = n / 10;
        }
        return result;
    }
}
