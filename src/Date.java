import java.util.Scanner;

public class Date {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int d = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int daysInMonths = 31;
        if(m==2){
            daysInMonths = 28;
        }
        if(m==4 || m==6 || m==9 || m==11){
            daysInMonths = 30;
        }

        d += 5;

        if(d>=daysInMonths){
            d -= daysInMonths;
            m++;

            if(m>12){
                m=1;
            }
        }

        System.out.printf("%d.%02d", d, m);
    }
}
