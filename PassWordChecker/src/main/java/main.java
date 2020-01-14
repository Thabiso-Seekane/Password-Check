import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        passwordChecker pass = new passwordChecker();

        System.out.println("Please create password:");
        String password = input.nextLine();
        pass.funcPassword(password);
    }
}
