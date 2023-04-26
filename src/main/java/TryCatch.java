import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        String[] saying = {"All is fair in love and war", "Action speak louder than words", "Don't wait for tomorrow", "Do it now", "Fail until you succeed", "Better late than never", "Work hard until its no longer hard", "Live your life", "go up", "Cloud are nice to look at"};
        Scanner input = new Scanner(System.in);

        int index;
        String again = "y";
        while (again.equalsIgnoreCase("y")) {
            try {


                System.out.println("Enter a number between 1 to 10 to select a quote ");
                index = input.nextInt();
                if (index >= 1 && index <= 10) {
                    System.out.println(saying[index - 1]);
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 to 10 ");
                }
                System.out.println("Do you want to see another quote? (y/n) ");
                input.next();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 to 10");
                input.nextLine();
            }
        }
    }
}