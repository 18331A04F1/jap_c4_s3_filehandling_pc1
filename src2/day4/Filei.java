package day4;
import java.io.*;
import java.util.Locale;

public class Filei {
    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        try {
            readWriteFile.readDataFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() throws IOException {


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter file name");
            String fname = br.readLine();
            System.out.println("Enter target file");
            String tfname = br.readLine();
            BufferedReader fr = new BufferedReader(new FileReader("input.txt"));
            String s1 = null;
            String s2 = "";
            BufferedWriter fs = new BufferedWriter(new FileWriter("output.txt"));
            while ((s1 = fr.readLine()) != null) {
                String[] s = s1.split(",");
                for (String x : s) {
                    String a = String.valueOf(x.charAt(0)).toUpperCase();
                    for (int y = 1; y < x.length(); y++) {
                        s2 = s2 + a + x.charAt(y);
                    }

                }
                fs.write(s2);
            }
            fs.close();
            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
