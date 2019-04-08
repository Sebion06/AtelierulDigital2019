package lab5;

import java.io.*;
import java.util.Scanner;

public class IOOperations {
    public String readFromFile(String filePath) {
        String text = "";
        FileReader fr = null;
        try {
            fr = new FileReader(filePath);
            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (Character.isUpperCase(ch)) {
                    if (ch == 'X') text += ' ';
                    else text += ch;
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } catch (IOException exception) {
            System.out.println("File not found");
        } finally {
            closeFile(fr);
        }
        return text;
    }

    private void closeFile(FileReader fr) {
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException exception) {
                System.out.println("Unable to close stream");
            }
        }
    }

    public void readFromKeyboard() {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a double:");
        Double a = scanner.nextDouble();
        System.out.println("The inserted number is:" + a);

    }

    public void writeToFile(String message, String filepath){
        try(
            FileWriter fw = new FileWriter(filepath);
            BufferedWriter bw = new BufferedWriter(fw);
        ){
            bw.write(message);
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
