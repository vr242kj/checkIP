package zd;

import java.io.*;
import java.util.ArrayList;

public class Reader {

    private ArrayList<String> addressIP = new ArrayList<>();

    public ArrayList<String> getAddressIP() {
        return addressIP;
    }

    public void setAddressIP(ArrayList<String> addressIP) {
        this.addressIP = addressIP;
    }

    public void readFile() throws IOException {

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
    }

}
