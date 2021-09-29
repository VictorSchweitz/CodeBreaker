import java.util.Scanner;

public class Encryption
{
    static Scanner scanner = new Scanner(System.in);

    // Making alphabet String available in all scopes by making it static
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";


    public static void main(String[] args)
    {
        // 1
        int character = characterToIndex('t');
        System.out.println(character);
        

        // 2. Index to character
        char index = indexToCharacter(2);
        System.out.println(index);

        // 3.
        char letterToShiftForward = caesarCharacterEncoded('V');
        System.out.println(wordEncoded("hello"));

        // 4.
        char letterToShiftBackwards = caesarCharacterDecoded('V');
        System.out.println(wordDecoded("hello"));
    }


    // 1. Character to index
    // Method must return an int and takes a character as parameter
    public static int characterToIndex(char numberToLetter)
    {
        System.out.println("Task 1: Turn character into index");

        // Setting the position number equal the index number that I want to get + 1 and then return it
        int characterPosNumber = alphabet.indexOf(numberToLetter) + 1;
        return characterPosNumber;
    }


    // 2. Index to character
    // Method must return a char and takes an int as parameter
    public static char indexToCharacter(int letterToNumber)
    {
        System.out.println('\n' + "Task 2: Turn index into character");

        // Setting numberToCharacter to the letter's number position in the alphabet String and add 3,
        // since I know that I have to get the value 3 letters further in the alphabet and thereafter return it
        char numberToCharacter = alphabet.charAt(letterToNumber + 3);
        return numberToCharacter;
    }


    // 3. Caesar Character Encoder
    // Method must return a character and takes a character as parameter
    public static char caesarCharacterEncoded(char letterToEncode)
    {
        // Setting the return position equal to index of the letter to be encoded and add 3,
        // since I have to get the value 3 letters further in the alphabet and then return it
        int returnPosition = alphabet.indexOf(letterToEncode) + 3;
        return alphabet.charAt(returnPosition);
    }
    

    // Here, I make it possible to insert multiple characters
    // Method must return a String and takes a String as parameter
    public static String wordEncoded(String wordToEncode)
    {
        System.out.println('\n' + "Task 3: Caesar Encoding - Push returned letter 3 letters forward in the alphabet");

        // Creating and empty String to put letters into
        String wordToReturn = "";

        // Looping over the wordToEncode
        for (int i = 0; i < wordToEncode.length(); i++)
        {
            // For each iteration, I add the character at the position 3 letters further ahead in the alphabet
            wordToReturn += caesarCharacterEncoded(wordToEncode.charAt(i));
        }

        // Then I return the final word
        return wordToReturn;
    }



    // 4. Caesar Character Decoder
    // Method must return a character and takes a character as parameter
    public static char caesarCharacterDecoded(char letterToDecode)
    {
        // Setting the return position equal to index of the letter to be encoded and subtract 3,
        // since I have to get the value 3 letters backwards in the alphabet and then return it
        int returnPosition = alphabet.indexOf(letterToDecode) - 3;
        return alphabet.charAt(returnPosition);
    }

    // Here, I make it possible to insert multiple characters
    // Method must return a String and takes a String as parameter
    public static String wordDecoded(String wordToDecode)
    {
        System.out.println('\n' + "Task 4: Caesar Decoding - Push returned letter 3 letters backwards in the alphabet");

        //
        String wordToReturn = "";

        for (int i = 0; i < wordToDecode.length(); i++)
        {
            // For each iteration, I add the character at the position 3 letters further ahead in the alphabet
            wordToReturn += caesarCharacterDecoded(wordToDecode.charAt(i));
        }

        // Then I return the final word
        return wordToReturn;
    }
}
