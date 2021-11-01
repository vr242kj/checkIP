package zd;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        Reader reader = new Reader();

        while (true) {

            System.out.print("Enter IP address or 'quit' to exit: ");
            String answer = in.nextLine();

            if (answer.equals("quit")) {
                //break;
                System.exit(0);
            }

            if (!Validator.validIP(answer)) {
                System.out.println("Invalid IP address");
            }

            //  Reader.readFile();
            reader.readFile();

            if (access(answer, reader)) {
                System.out.println("Access allowed");
            } else {
                System.out.println("Access disallowed");
            }
        }
    }

    public static boolean access(String answer, Reader reader) {
        for (int i = 0; i < reader.getAddressIP().size(); i++) {
            if (reader.getAddressIP().get(i).equals(answer)) {
                return false;
            }
        }
        return true;
    }

}
