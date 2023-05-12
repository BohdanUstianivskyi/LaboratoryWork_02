import java.util.Scanner;
public class SelectionOperator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter month number: ");
            int month = input.nextInt();

            int days;

            switch (month) {
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }

            System.out.println("Number of days in month " + month + " is " + days);
        }
    }


