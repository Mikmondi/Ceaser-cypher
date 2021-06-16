import  models.CypherEncoder;
import models.CypherDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

        CypherEncoder encoder = new CypherEncoder("", 0);
        CypherDecoder decoder = new CypherDecoder("", 0);

        while (programRunning) {
            System.out.println("Welcome to My Ceaser Cypher program. Choose one of the following options:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            programRunning = false;
        }
        try {
            String choice = bufferedReader.readLine();
            if (choice.equals("1")) {
                System.out.println("Enter the text to be encrypted:");
                String userInputText = bufferedReader.readLine();
                System.out.println("Enter an encoding key number:");
                String stringInputKey = bufferedReader.readLine();
                int inputKey = Integer.parseInt(stringInputKey);
                encoder.setUserText(userInputText);
                encoder.setRotateKey(inputKey);
                String encodingResult = encoder.encryptText();
                System.out.println("Encrypted Text: " + encodingResult);
            }else if (choice.equals("2")) {
                System.out.println("Enter the text to be decrypted:");
                String userInputText = bufferedReader.readLine();
                System.out.println("Enter a decoding key number:");
                String stringInputKey = bufferedReader.readLine();
                int inputKey = Integer.parseInt(stringInputKey);
                decoder.setUserText(userInputText);
                decoder.setUserKey(inputKey);
                String decodingResult = decoder.decryptText();
                System.out.println("Decrypted Text: " + decodingResult);
            }else if (choice.equals("3")) {
                    System.out.println("Goodbye!");
                } else {
                    System.out.println("That input cannot be recognized.");
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

