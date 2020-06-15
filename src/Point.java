import java.util.Scanner;

public class Point {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int point = Integer.parseInt(scanner.nextLine());

        int left = Math.min(first, second);
        int right = Math.max(first, second);

        int distanceLeft = Math.abs(left-point);
        int distanceRight = Math.abs(right-point);

        int minDistance = Math.min(distanceLeft, distanceRight);

        if(point>=left && point<=right){
            System.out.println("In");
        } else {
            System.out.println("Out");
        }

        System.out.println(minDistance);
    }
}
