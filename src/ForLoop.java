import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        double rating = 0;
        double average = 0  ;

        for (int i = 0; i < 3; i++) {
            System.out.println("Type your rating from 0 to 10 ");
            rating = reading.nextDouble();
            average += rating;
        }
        System.out.println("The average ratings is: " + average/3);

    }
}
