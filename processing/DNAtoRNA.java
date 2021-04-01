package processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import enums.RNA;

/**
 * DNAtoRNA
 */
public class DNAtoRNA {

    public static void main(String[] args) throws IOException, FileNotFoundException{
        File input = new File("inputs/Input.txt");
        File output = new File("outputs/OutputRNA.txt");

        Scanner reader = new Scanner(input);
        FileWriter writer = new FileWriter(output);

        while (reader.hasNext()) {
            writer.write(RNA.valueOf(reader.next()).convert());
        }

        reader.close();
        writer.close();
    }
}