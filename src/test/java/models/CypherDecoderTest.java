package models;

import static org.junit.Assert.*;
import org.junit.Test;

public class CypherDecoderTest {
    @Test
    public void testCypherDecoder_String() throws Exception {
        CypherDecoder testCypherDecoder = new CypherDecoder("b", 1);
        assertEquals("a", testCypherDecoder.decryptText());

    }

    @Test
    public void testCypherDecoder_TwoLetter_String() throws Exception {
        CypherDecoder testCypherDecoder = new CypherDecoder("gh", 1);
        assertEquals("fg", testCypherDecoder.decryptText());
    }
}