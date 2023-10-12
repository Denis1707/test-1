import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] message = str.toCharArray();


        int key = in.nextInt();

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