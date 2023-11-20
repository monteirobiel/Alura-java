public class Conditional {
    public static void main(String[] args) {

        int releaseYear = 2014;
        boolean planIncluded = true;
        double filmReviews = 9.8;
        String planType = "Premium";

        if (releaseYear >= 2023) {
            System.out.println("This film was Released this year");
        }else if (releaseYear >= 2014) {
            System.out.println("This isn't an old film");
        }else {
            System.out.println("This is an old film");
        }


        if (planIncluded == true || planType.equals("Premium")) {
            System.out.println("You have access to this film ! ");
        }else {
            System.out.println("You have to pay to watch this film ! ");
        }
    }
}
