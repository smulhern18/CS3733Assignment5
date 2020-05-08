import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import javafx.scene.control.TextArea;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
    TextArea textArea = new TextArea();
    ElbonianCipher elbonianCipher = new ElbonianCipher(textArea);
    CaesarCipher caesarCipher = new CaesarCipher(textArea);
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
        elbonianCipher.setText("1234567890");
        assertTrue(elbonianCipher.getText().equals("abcdefghi_"));
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

    @Test
    public void testPuntuation() {

    }

    @Test
    public void testLowerCase() {
        caesarCipher.setText("abcdef");
        assertTrue(caesarCipher.getText().equals("zyxwvu"));
    }

    @Test
    public void testUpperCase() {
        caesarCipher.setText("ABCDEF");
        assertTrue(caesarCipher.getText().equals("ZYXWVU"));
    }

    @Test
    public void testwithNONLetters() {
        caesarCipher.setText("Ab1a k");
        assertTrue(caesarCipher.getText().equals("Zy1z p"));
    }
}
