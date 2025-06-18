package operators;

import java.util.Scanner;

public class Exercise {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.print("1-ci ededi daxil edin: ");
//        int num1 = scanner.nextInt();
//        System.out.print("2-ci ededi daxil edin: ");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Cem: " + cem(num1, num2));
//        System.out.println("-------------------------------");
//
//        System.out.println("Ferq: " + ferq(num2, num1));
//        System.out.println("-------------------------------");
//
//        ikisindenHansiBoyukdur(num1, num2);
//        System.out.println("-------------------------------");
//
//        System.out.println("Heftenin gununu daxil edin: ");
//        int num4 = scanner.nextInt();
//        hefteninGunleri(num4);
//        System.out.println("-------------------------------");
//
//        System.out.println("Iki eded daxil edin: ");
//        int num5 = scanner.nextInt();
//        int num6 = scanner.nextInt();
//        ikisindenHansiBoyukdur(num5, num6);
//        System.out.println("-------------------------------");
//
//        System.out.println("3 ededi daxil edin: ");
//        int num7 = scanner.nextInt();
//        int num8 = scanner.nextInt();
//        int num9 = scanner.nextInt();
//        ucundenHansiBoyukdur(num7, num8, num9);
//        System.out.println("-------------------------------");

//        dorddenHansiKicikdir(-1000, 6, 7, 10);
//        emekHaqqiArtimi(1000, 10);
//        System.out.println(balSkalasi(133));
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operation = scanner.next();
        operatoruIcraEt(num1, num2, operation);
        System.out.println(balSkalasi(100));
        scanner.close();
    }

    public static int cem(int num1, int num2) {
        return num1 + num2;
    }

    public static int ferq(int num1, int num2) {
        return num1 - num2;
    }

    public static void ikisindenHansiBoyukdur(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " boyukdur");
        } else if (num2 > num1) {
            System.out.println(num2 + " boyukdur");
        } else {
            System.out.println(num2 + " beraberdir");
        }
    }

    public static void hefteninGunleri(int num) {
        if (num > 7 || num < 1) {
            System.out.println("Duzgun daxil edin");
            return;
        }
        switch (num) {
            case 1 -> System.out.println("Bazar ertesi");
            case 2 -> System.out.println("Cersenbe axsamisi");
            case 3 -> System.out.println("Cersenbe");
            case 4 -> System.out.println("Cume axsamisi");
            case 5 -> System.out.println("Cume");
            case 6 -> System.out.println("Senbe");
            case 7 -> System.out.println("Bazar");
        }
    }

    public static void ucundenHansiBoyukdur(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " boyukdur");
            } else {
                System.out.println(num3 + " boyukdur");
            }
        } else if (num2 > num3) {
            System.out.println(num2 + " boyukdur");
        } else {
            System.out.println(num3 + " boyukdur");
        }
    }

    public static void hansiFesil(int num) {
        if (num > 12 || num < 1) {
            System.out.println("Duzgun daxil edin");
            return;
        }
        switch (num) {
            case 12, 1, 2 -> System.out.println("Qis");
            case 3, 4, 5 -> System.out.println("Bahar");
            case 6, 7, 8 -> System.out.println("Yay");
            case 9, 10, 11 -> System.out.println("Payiz");
        }
    }

    public static void operatoruIcraEt(int num1, int num2, String operator) {

        switch (operator) {
            case "+" -> System.out.println("Cem: " + (num1 + num2));
            case "-" -> System.out.println("Ferq: " + (num1 - num2));
            case "*" -> System.out.println("Hasil: " + (num1 * num2));
            case "/" -> System.out.println("Bolme: " + (num1 / num2));
        }

    }

    public static void emekHaqqiArtimi(int emekHaqqi, int staj) {
        double faiz = 0;
        if (staj >= 1 && staj <= 3) {
            faiz = 0.05;
        } else if (staj >= 4 && staj <= 7) {
            faiz = 0.10;
        } else if (staj >= 8 && staj <= 15) {
            faiz = 0.15;
        } else if (staj > 15) {
            faiz = 0.20;
        }
        double artim = emekHaqqi * faiz;

        System.out.println("Artim : " + artim);
        System.out.println("Yekun maas: " + (emekHaqqi + artim));
    }

    public static String balSkalasi(int bal) {
        if (bal < 0 || bal > 100) {
            throw new RuntimeException("Duzgun daxil edin");
        }
        if (bal >= 91) {
            return "A";
        } else if (bal >= 81) {
            return "B";
        } else if (bal >= 71) {
            return "C";
        } else if (bal >= 61) {
            return "D";
        } else if (bal >= 51) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void dorddenHansiKicikdir(int num1, int num2, int num3, int num4) {
        if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println(num1 + " en kicikdir");
        } else if (num2 < num3 && num2 < num4) {
            System.out.println(num2 + " en kicikdir");
        } else if (num3 < num4) {
            System.out.println(num3 + " en kicikdir");
        } else {
            System.out.println(num4 + " en kicikdir");
        }
    }

}
