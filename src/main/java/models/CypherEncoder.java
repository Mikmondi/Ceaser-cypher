package models;

import java.util.ArrayList;
import java.util.List;

public class CypherEncoder {
    private String userInput;
    private int rotateKey;
    private List<String> encryptedInput = new ArrayList<String>();

    public String encryptText(String userInput, int rotateKey){
        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isUpperCase(userInput.charAt(i))) {
                int newCharValue = ((int)(userInput.charAt(i)) + rotateKey - 65) % 26 + 65;
                char encodedChar = (char)(newCharValue);
                String encodedString = Character.toString(encodedChar);
                encryptedInput.add(encodedString);
            } else if (Character.isLowerCase(userInput.charAt(i))) {
                int newCharValue = ((int)(userInput.charAt(i)) + rotateKey - 97) % 26 + 97;
                char encodedChar = (char)(newCharValue);
                String encodedString = Character.toString(encodedChar);
                encryptedInput.add(encodedString);
            } else {
                String encodedString = Character.toString(userInput.charAt(i));
                encryptedInput.add(encodedString);
            }
        }
        return String.join("", encryptedInput);
    }

}