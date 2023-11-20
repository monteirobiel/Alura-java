import java.util.Random;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

                Scanner reading = new Scanner(System.in);
                int generatedNumber = new Random().nextInt(100);
                int attempts = 0;

                while (attempts < 5) {
                    System.out.print("Type an number between 0 and 100: ");
                    int typedNumber = reading.nextInt();
                    attempts++;

                    if (typedNumber == generatedNumber) {
                        System.out.println("Congrats, you got the number in " + attempts + " attempts!");
                        break;
                    } else if (typedNumber < generatedNumber) {
                        System.out.println("The number typed its smaller than the generated number");
                    } else {
                        System.out.println("The number typed its greater than the generated number");
                    }
                }

                if (attempts == 5) {
                    System.out.println("You didn't get the number in 5 attempts. The number was:  " + generatedNumber);
                }
            }
        }

    }
}
