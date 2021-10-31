package zd;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static StandardWatchEventKinds StandardWatchEventKind;

    public static void main(String[] args) throws IOException, InterruptedException  {

        /*Scanner in = new Scanner(System.in);
        //while (true) {
        System.out.println("Hello");
        System.out.print("Enter IP address or 'quit' to exit: ");
        String answer = in.nextLine();
        
        if(answer.equals("quit")){
            //break;
            System.exit(0);
        }

            if (!Validator.validIP(answer)) {
                System.out.println("Invalid IP address");
            }

        System.out.printf("IP: %s\n", answer);*/

            Path myDir = Paths.get("C:\\Users\\Vetal\\Desktop\\checkIP\\src\\zd");

            //Path myDir = Paths.get("c:/my_test_folder/data");

            while (true) {
                try {
                    // create the watcher service and register for events
                    WatchService watcher = myDir.getFileSystem().newWatchService();
                    myDir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
                            StandardWatchEventKinds.ENTRY_DELETE,
                            StandardWatchEventKinds.ENTRY_MODIFY);

                    // let's grab a watch key
                    WatchKey watchKey = watcher.take();

                    // now let's process the events pending for this watch key
                    List<WatchEvent<?>> events = watchKey.pollEvents();
                    for (WatchEvent event : events) {

                        // get the file name for the event
                        Path fileName = (Path) event.context();

                        // determine the type of event and call appropriate handler method
                        if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                            System.out.println("MOD");
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Error: " + e.toString());
                }
            }
        }



      /*  //////////////////////////////////////////////////////////////
        ArrayList<String> addressIP = new ArrayList<String>();

        String fileName = "C:\\Users\\Vetal\\Desktop\\checkIP\\src\\zd\\blacklist.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                //обрабатываем считанную строку - пишем ее в консоль
                //System.out.println(line);
                addressIP.add(line);
            }
            br.close();
            fr.close();



        for(int i = 0; i< addressIP.size(); i++) {
            System.out.println(addressIP.get(i));
        }*/
    }
   // }

