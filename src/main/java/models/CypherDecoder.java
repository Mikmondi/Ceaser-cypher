package models;

import java.util.ArrayList;
import java.util.List;



public class CypherDecoder {
    private CypherEncoder EncoderDetails = new CypherEncoder("", 0);

    private String decodeText;
    private int decodeKey;
    private List<String> decodedOutput = new ArrayList<String>();

    public CypherDecoder(String decodeText, int decodeKey) {
        this.decodeText = decodeText;
        this.decodeKey = decodeKey;
    }
    public String decryptText() {
        for (int i = 0; i < decodeText.length(); i++) {
            if (Character.isUpperCase(decodeText.charAt(i))) {
                int decodedValue = ((int)(decodeText.charAt(i)) + (26 - decodeKey) - 65) % 26 + 65;
                char decodedChar = (char)(decodedValue);
                String decodedString = Character.toString(decodedChar);
                decodedOutput.add(decodedString);
            } else if (Character.isLowerCase(decodeText.charAt(i))) {
                int decodedValue = ((int)(decodeText.charAt(i)) + (26 - decodeKey) - 97) % 26 + 97;
                char decodedChar = (char)(decodedValue);
                String decodedString = Character.toString(decodedChar);
                decodedOutput.add(decodedString);
            } else {
                String encodedString = Character.toString(decodeText.charAt(i));
                decodedOutput.add(encodedString);
            }
        }
        return String.join("", decodedOutput);
    }

}
