package models;

public class CypherEncoder {
    private String userInput;
    private int rotateKey;
    String encryptedInput = new String();
    public String encryptText(String userInput, int rotateKey){
        for (int index = 0; index < userInput.length(); index++) {
            char c = userInput.charAt(index);
            int charPosition = alphabets.indexOf(c);
            if (charPosition == -1){
                encryptedText.append(c);
            }
return encryptedInput;
    }

}