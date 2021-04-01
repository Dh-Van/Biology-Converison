package processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import enums.AminoAcids;

/**
 * RNAAMINO
 */
public class RNAAMINO {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        File input = new File("outputs/OutputRNA.txt");
        File output = new File("outputs/OutputAmino.txt");

        Scanner reader = new Scanner(input);
        FileWriter writer = new FileWriter(output);

        String codon = "";
        int index = 0;
        //TAKE SUBSTRING TO PREVENT ISSUES
        while (reader.hasNext()) {
            codon += reader.next();
            if(codon.substring(index, codon.length()-1).length() == 2){
                System.out.println(codon.substring(index, codon.length()));
                writer.write(AminoAcids.valueOf("Phe").convert(codon));
                index += 3;
            }
            // writer.write(AminoAcids.valueOf(reader.next()).convert());
        }

        reader.close();
        writer.close();
    }
}