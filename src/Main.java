import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] message = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        int key = 3;

        char[] encrypted = encrypt(message, key);
        System.out.println("Зашифрованное сообщение: " + new String (encrypted));
    }

    public static char[] encrypt(char[] message, int key) {
        char[] encrypted = new char[message.length];
        for (int i = 0; i < message.length; i++) {
            if (Character.isLetter(message[i])) {
                int originalIndex = message[i] ;
                int shiftedIndex = (originalIndex + key);
                encrypted[i] = (char) ( shiftedIndex);
            } else {
                encrypted[i] = message[i];
            }
        }
        return encrypted;
    }
}