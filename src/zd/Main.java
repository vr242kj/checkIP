package zd;

import java.io.*;
import java.util.Scanner;

/** Клас для запуску програми
 <b>name</b> и <b>color</b>
 @author Vitaliy
 @version 1.0
 */
public class Main {


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        FileReader reader = new FileReader();
        // програма працює допоки користувач не введе слово "quit"
        while (true) {

            System.out.print("Enter IP address or 'quit' to exit: ");
            String answer = in.nextLine();

            if (answer.equals("quit")) {
                //break;
                System.exit(0);
            }
            // провірка валідності ip адреси
            if (!ValidatorIP.validIP(answer)) {
                System.out.println("Invalid IP address");
            } else {
                //  Reader.readFile();
                reader.readFile();
                // провірка доступу для заданої ip адреси
                if (access(answer, reader)) {
                    System.out.println("Access allowed");
                } else {
                    System.out.println("Access disallowed");
                }
            }
        }
    }

    /**
     * Функція для провірки наявності введеної користувачем ip адреси в blacklist  
     * @param answer - ip яке ввів користувач
     * @param reader - об'єкт класа FileReader, для доступу до колекції ArrayList<String> addressIP
     */
    public static boolean access(String answer, FileReader reader) {
        for (int i = 0; i < reader.getAddressIP().size(); i++) {
            if (reader.getAddressIP().get(i).equals(answer)) {
                return false;
            }
        }
        return true;
    }

}
