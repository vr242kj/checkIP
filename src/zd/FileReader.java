package zd;

import java.io.*;
import java.util.ArrayList;

public class FileReader implements Reader {

    private ArrayList<String> addressIP = new ArrayList<>();

    public ArrayList<String> getAddressIP() {
        return addressIP;
    }

    public void setAddressIP(ArrayList<String> addressIP) {
        this.addressIP = addressIP;
    }

    public void readFile() throws IOException {

        addressIP.clear();
        String fileName = "C:\\Users\\Vetal\\Desktop\\checkIP\\src\\zd\\blacklist.txt";
        File file = new File(fileName);
        java.io.FileReader fr = new java.io.FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {

            addressIP.add(line);
        }

        br.close();
        fr.close();
    }

}
