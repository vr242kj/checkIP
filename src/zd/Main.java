package zd;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        Reader reader = new Reader();

        while (true) {

            System.out.println("Hello");
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



            System.out.printf("IP: %s\n", answer);

        }
    }

}
