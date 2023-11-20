public class Main {
    public static void main(String[] args) {
        System.out.println("----This is the Scream Match----");
        System.out.println("Film: American Sniper");

        int releaseYear = 2014;
        System.out.println("Release year: " + releaseYear);
        boolean planIncluded = true;
        double filmReviews = 9.8;

        double average = (9.8 + 6.7 + 8) /3;
        System.out.println("Average Reviews: " + average);

        String Synopsis = "Film American Sniper from Navy Seals Released on " + releaseYear;
        System.out.println("Film Synopsis: " + Synopsis);

        int rating = (int) (average/2);
        System.out.println("The film rating is: " + rating);
    }
    }
}
