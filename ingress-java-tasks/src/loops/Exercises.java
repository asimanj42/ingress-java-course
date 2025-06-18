package loops;

public class Exercises {

    public static void main(String[] args) {
//        ucVeBeseBolunenEdedleriCapEt();
//        sadeEdedleriCapEt(100);
        palindromeEdedleriCapEt(500);
    }

    public static void ucVeBeseBolunenEdedleriCapEt() {
        String bolunen3 = "";
        String bolunen5 = "";
        String bolunen3ve5 = "";

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                bolunen3ve5 += i + " ";
            } else if (i % 3 == 0) {
                bolunen3 += i + " ";
            } else if (i % 5 == 0) {
                bolunen5 += i + " ";
            }
        }
        System.out.println("3-e bolunen ededler:");
        System.out.println(bolunen3);
        System.out.println("5-e bolunen ededler:");
        System.out.println(bolunen5);
        System.out.println("Həm 3, hem de 5-e bolunen ededler:");
        System.out.println(bolunen3ve5);
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /*
    3. 1-dən N-ə qədər olan bütün sadə ədədləri tap.


    Sadə ədəd – yalnız 1 və özünə bölünən.
     */

    public static void sadeEdedleriCapEt(int n) {
        for (int i = 2; i <= n; i++) {
            boolean sadeEdeddirmi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sadeEdeddirmi = false;
                    break;
                }
            }
            if (sadeEdeddirmi) {
                System.out.print(i + " ");
            }
        }
    }

    public static void palindromeEdedleriCapEt(int n) {
        for (int i = 0; i <= n; i++) {
            String eded = String.valueOf(i);
            String tersEded = new StringBuilder(eded).reverse().toString();
            if (eded.equals(tersEded)) {
                System.out.print(i + " ");
            }
        }
    }

    //no string
    public static void palindromeEdedler(int n) {

        for (int i = 0; i <= n; i++) {
            int eded = i;
            int tersEded = 0;

            while (eded > 0) {
                int qaliq = eded % 10;
                tersEded = tersEded * 10 + qaliq;
                eded /= 10;
            }

            if (i == tersEded) {
                System.out.print(i + " ");
            }
        }

    }
}
