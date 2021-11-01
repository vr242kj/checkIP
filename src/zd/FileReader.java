package zd;

import java.io.*;
import java.util.ArrayList;

public class FileReader implements Reader {

    /** Змінна яка буде зберігати всі ip адреси зчитані з файлу */
    private ArrayList<String> addressIP = new ArrayList<>();

    /**
     * Функція отримання поля {@link FileReader#addressIP}
     * @return повертає змінну яка зберігає всі ip
     */
    public ArrayList<String> getAddressIP() {
        return addressIP;
    }

    /**
     * Функція для встановлення значень для змінної {@link FileReader#addressIP}
     * @param addressIP - змінна яка буде зберігати ip адреси
     */
    public void setAddressIP(ArrayList<String> addressIP) {
        this.addressIP = addressIP;
    }

    /**
     * Функція для встановлення значень для змінної {@link FileReader#addressIP}
     */
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
