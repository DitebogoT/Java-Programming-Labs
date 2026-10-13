public class LoginCheck {
    String username = "Ditebogo04";
    String password = "Gh3tt0Ang3L!";

    static void Check()
    {
        LoginCheck checker = new LoginCheck();
        if(checker.username.equals("Ditebogo04") && checker.password.equals("Gh3tt0Ang3L!")){
            System.out.println("Login successful");
        }else {
            System.out.println("Invalid credentials");
        }
    }
}

//Create LoginCheck.
//Compare a username and password stored in String variables with expected values.
//Display Login successful or Invalid credentials.
//
//Important: Use .equals() to compare String contents rather than ==.