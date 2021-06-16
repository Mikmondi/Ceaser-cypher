package models;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class CypherEncoderTest {
    @Test
    public void testCypherEncoder() {
        CypherEncoder testCypherEncoder = new CypherEncoder("A",0);
        assertEquals(true, testCypherEncoder instanceof CypherEncoder);

    }

    @Test
    public void testCypherEncoder_getUserRotateKey_int() {
        CypherEncoder testCypherEncoder = new CypherEncoder("",1);
        assertEquals("", testCypherEncoder.encryptText("",1));
    }

    @Test
    public void testCypherEncoder_String() throws Exception {
        CypherEncoder testCypherEncoder=new CypherEncoder("x", 1);
        assertEquals("y", testCypherEncoder.encryptText("x",1));
    }
    @Test
    public  void testCypherEncoder_twoLetter_String(){
        CypherEncoder testCypherEncoder = new CypherEncoder("ABC",1);
        assertEquals("BCD", CypherEncoder.("ABC",1));
    }
}