import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        double rating = 0;
        double average = 0;
        int totalRating = 0;
        int number = 0;


        while (rating != -1) {
            System.out.println("Type your rating from 0 to 10 or -1 for stop: ");
            rating = reading.nextDouble();

            if (rating != -1) {
                average += rating;
                totalRating ++;
            }

        }
        System.out.println("The average ratings is: " + average/totalRating);


    }

}

