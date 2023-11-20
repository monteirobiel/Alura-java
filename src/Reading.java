import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Type your favorite film: ");
        String film = reading.nextLine();
        System.out.println("Type the Release Year");
        int releaseYear = reading.nextInt();
        System.out.println("Type your rating from 0 to 10 ");
        double rating = reading.nextDouble();

        System.out.println("Film Name: " + film + ", Release Year: " + releaseYear + ", Your Rating: " + rating);

    }
}
