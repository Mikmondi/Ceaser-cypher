package models;

import java.util.ArrayList;
import java.util.List;



public class CypherDecoder {
    private CypherEncoder EncoderDetails = new CypherEncoder("", 0);

    private String decodeText;
    private int decodeKey;
    private List<String> decodedOutput = new ArrayList<String>();
// Getter method
    public String getUserText() {
        this.decodeText = EncoderDetails.getInputString();
        return this.decodeText;
    }

    public int getUserKey() {
        this.decodeKey = EncoderDetails.getRotateKey();
        return this.decodeKey;
    }
//Setter method
    public String setUserText(String userInput) {
        return this.decodeText = userInput;
    }

    public int setUserKey(int userKey) {
        return this.decodeKey = userKey;
    }


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
