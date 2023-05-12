import java.util.Scanner;
public class QuadrantIdentifier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        double x = input.nextDouble();
        System.out.print("Enter the y-coordinate: ");
        double y = input.nextDouble();

        int quadrant;

        if (x == 0 || y == 0) {
            quadrant = 0;
        } else if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }

        System.out.println("The point is in quadrant " + quadrant);
    }
}

