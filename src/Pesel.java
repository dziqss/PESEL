import java.util.Scanner;

class PESEL{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String PESEL;
        String PLEC;    // 0, 2, 4, 6, 8 – oznaczają płeć żeńską, a 1, 3, 5, 7, 9 – płeć męską
        System.out.println("PESEL ");
        PESEL = in.nextLine();
        String d = PESEL.substring(4, 6);
        String m = PESEL.substring(2, 4);
        String r = PESEL.substring(0, 2);
        String p = PESEL.substring(9, 10);
        System.out.println("Urodziłe(a)ś się dnia: " + d + " miesiąca " + m + " roku " + r);


        switch (p) {
            case "0":
            case "2":
            case "4":
            case "6":
            case "8":

                System.out.println("Płeć żeńska");
                break;
            default:
                System.out.println("Płeć męska");
        }
    }
}