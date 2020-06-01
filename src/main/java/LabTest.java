import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LabTest {

    @Test
    void encrypt() {
        String expected = "bbd";
        String encrypted = Lab6.encrypt("aac", (char) 1);
        Assertions.assertEquals(expected, encrypted);

    }

    @Test
    void decrypt() {
        String expected = "adc";
        String decrypted = Lab6.decrypt("bed", (char) 1);
        Assertions.assertEquals(expected, decrypted);

    }
}