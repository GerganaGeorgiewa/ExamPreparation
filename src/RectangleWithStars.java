import java.util.Scanner;

public class RectangleWithStars {
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int numRows = n;
        if(n%2==0){
            numRows--;
        }
        System.out.print(repeatStr("%", 2*n));
        System.out.println();
        for (int i = 0; i < numRows; i++) {
            System.out.print("%");

            if(i==numRows/2){
                System.out.print(repeatStr(" ", n-2));
                System.out.print("**");
                System.out.print(repeatStr(" ", n-2));
            } else {
                System.out.print(repeatStr(" ", n * 2 - 2));
            }

            System.out.print("%");
            System.out.println();
        }
        System.out.print(repeatStr("%", 2*n));
        System.out.println();
    }
}
