import  models.CypherEncoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

        CypherEncoder encoder = new CypherEncoder("", 0);

        while (programRunning) {
            System.out.println("Welcome to My Caeser Cypher program. Choose one of the following options:");
            System.out.println("1. Encrypt");
            System.out.println("3. Exit");
        }
        try {
            String choice = bufferedReader.readLine();
            if (choice.equals("1")) {
                System.out.println("Enter the text that you want to be encrypted:");
                String userInputText = bufferedReader.readLine();
                System.out.println("Enter an integer that you want to use as the encoding key:");
                String stringInputKey = bufferedReader.readLine();
                int inputKey = Integer.parseInt(stringInputKey);
                encoder.setUserText(userInputText);
                encoder.setRotateKey(inputKey);
                String encodingResult = encoder.encryptText();
                System.out.println("Encrypted Text: " + encodingResult);
            }else if (choice.equals("3")) {
                    System.out.println("Goodbye!");
                    programRunning = false;
                } else {
                    System.out.println("That input cannot be recognized.");
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

