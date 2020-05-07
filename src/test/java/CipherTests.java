import edu.wpi.cs3733.entity.ElbonianCipher;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
    ElbonianCipher elbonianCipher = new ElbonianCipher();

    @Test
    public void testWithoutNumbers() {
        elbonianCipher.setText("Hello");
        assertTrue(elbonianCipher.getText().equals("0805121215"));
    }

    @Test
    public void withSpaces() {
        elbonianCipher.setText("Hello Hello");
        assertTrue(elbonianCipher.getText().equals("0805121215S0805121215"));
    }

    @Test
    public void withNumbers() {
        elbonianCipher.setText("123456789");
        assertTrue(elbonianCipher.getText().equals("abcdefghi"));
    }

    @Test
    public void numbersAndLetters() {
        elbonianCipher.setText("H3llo");
        assertTrue(elbonianCipher.getText().equals("08c121215"));
    }

    @Test
    public void testEdge() {
        elbonianCipher.setText("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
        assertTrue(elbonianCipher.getText().equals("0805121215080512121508051212150805121215080512121508051212150805121215080512121508051212150805121215080512121508051212150805121215080512121508051212150805121215080512121508051212150805121215080512121508051212150805121215080512121508051212150805121215080512121508051212150805121215"));
    }
}
