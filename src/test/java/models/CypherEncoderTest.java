package models;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class CypherEncoderTest {
    @Test
    public void testCypherEncoder() {
        CypherEncoder testCypherEncoder = new CypherEncoder();
        assertEquals("", testCypherEncoder.getClass());

    }

    @Test
    public void testCypherEncoder_getUserRotateKey_int() {
        CypherEncoder testCypherEncoder = new CypherEncoder();
        String testOutput = "";
        assertEquals(0,testCypherEncoder.getClass());
    }
}