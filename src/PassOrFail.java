import java.util.Scanner;

public class PassOrFail {
    int Mark = -45;
    boolean Result;

    static void getResult()
    {

        PassOrFail passOrFail = new PassOrFail();
        if (passOrFail.Mark<0 || passOrFail.Mark>100){
            System.out.println("You've entered an invalid number, please try again.");
            System.out.println();
        }
        else if (passOrFail.Mark >= 50){
            System.out.println("You have passed the test.");
            System.out.println();
        }
        else if (passOrFail.Mark < 50){
            System.out.println("You have failed the test.");
            System.out.println();
        }

    }
}
//Create PassOrFail. If a mark is 50 or higher, display Pass; otherwise, display Fail.
//
//Challenge: Reject marks below 0 or above 100.