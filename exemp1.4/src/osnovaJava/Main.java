package osnovaJava;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        boolean rez = task10and20(x1,x2);
        System.out.println(rez);
    }
    public static boolean task10and20(int x1, int x2){
        if (((x1+x2) >= 10) && ((x1+x2) <= 20)) {
            return true;
        } else{
            return false;
            }
    }



    }
