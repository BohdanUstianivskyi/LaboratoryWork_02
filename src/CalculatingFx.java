import java.util.Scanner;
public class CalculatingFx {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter x: ");
            double x = input.nextDouble();
            double result;

            if (x < 0) {
                result = 5 * Math.sqrt(Math.pow(x, 2) + 3);
            } else if (x >= 0 && x <= 3) {
                result = Math.cosh(x) + 5;
            } else  {
                result = -x + Math.log(x);
            }

            System.out.println("F(x) = " + result);
        }
    }


