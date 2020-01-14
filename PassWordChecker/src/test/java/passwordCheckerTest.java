import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordCheckerTest {

    @Test
    void password() {
        passwordChecker pass = new passwordChecker();
        boolean tester = pass.funcPassword("Thabiso088#");
        assertTrue(tester);




    }
}