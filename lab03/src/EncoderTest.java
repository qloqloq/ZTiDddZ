import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {

    private final Encoder encoder = new Encoder();

    @Test
    public void shouldEncodePhrase() {
        String validInput = "P@ssword123!";
        String expectedResult = "UEBzc3dvcmQxMjMh";

        assertEquals(encoder.encode(validInput), expectedResult);
    }

    @Test
    public void shouldThrowException_WhenTryingToEncodeNull() {
        RuntimeException exceptionThrown =
                assertThrows(RuntimeException.class, () -> encoder.encode(null));

        assertEquals("Input must not be null", exceptionThrown.getMessage());
    }

    @Test
    public void shouldDecodePhrase() {
        String encodedPhrase = "UEBzc3dvcmQxMjMh";
        String decodedPhrase = "P@ssword123!";

        assertEquals(encoder.decode(encodedPhrase), decodedPhrase);
    }

    @Test
    public void shouldThrowException_WhenTryingToDecodeNull() {
        RuntimeException exceptionThrown =
                assertThrows(RuntimeException.class, () -> encoder.decode(null));

        assertEquals("Input must not be null", exceptionThrown.getMessage());
    }
}
