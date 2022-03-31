package day6;
import java.io.*;
import java.util.Locale;


public class FileI {
        public static void main(String[] args) {
            FileI readWriteFile;
            readWriteFile = new FileI();
            try {
                readWriteFile.readDataFromFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //create object of Readers and writers
        public void readDataFromFile() throws IOException {
            try{
                FileReader fd = new FileReader("input.txt");
                FileWriter fw = new FileWriter("output.txt");
                String s = "";
                int j = 0;
                while((j = fd.read()) != -1) {
                    if (((char) j) != ',') {
                        s += (char) j;
                    } else {
                        //System.out.println(s);
                        s = s.substring(0, 1).toUpperCase(Locale.ROOT) + s.substring(1).toLowerCase(Locale.ROOT);
                        System.out.println(s);
                        fw.write(s + ",");

                        s = "";
                    }

                }
                s = s.substring(0, 1).toUpperCase(Locale.ROOT) + s.substring(1).toLowerCase(Locale.ROOT);
                fw.write(s);
                fd.close();
                fw.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

