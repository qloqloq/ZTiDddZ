import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {

    @Test
    public void shouldEncodePhrase() {
        String validInput = "P@ssword123!";
        String expectedResult = "UEBzc3dvcmQxMjMh";

        assertEquals(EncoderUtil.encode(validInput), expectedResult);
    }

    @Test
    public void shouldThrowException_WhenTryingToEncodeNull() {
        RuntimeException exceptionThrown =
                assertThrows(RuntimeException.class, () -> EncoderUtil.encode(null));

        assertEquals("Input must not be null", exceptionThrown.getMessage());
    }
    @Test
    public void shouldDecodePhrase_WhenValidInput() {
        String encodedPhrase = "UEBzc3dvcmQxMjMh";
        String decodedPhrase = "P@ssword123!";

        assertEquals(EncoderUtil.decode(encodedPhrase), decodedPhrase);
    }

    @Test
    public void shouldThrowException_WhenTryingToDecodeNull() {
        RuntimeException exceptionThrown =
                assertThrows(RuntimeException.class, () -> EncoderUtil.decode(null));

        assertEquals("Input must not be null", exceptionThrown.getMessage());
    }
}
