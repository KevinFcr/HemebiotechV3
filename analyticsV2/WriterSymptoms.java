package analyticsV2;

import java.util.*;
import java.io.*;

/**
 * This is our class for writing results to an external file results.out
 */

public class WriterSymptoms implements IWriterSymptom {
    private TreeMap<String, Integer> symptoms;

    public WriterSymptoms(TreeMap<String, Integer> symptoms) {
        this.symptoms = symptoms;
    }

    /**
     * This method uses a filewriter as well as a map to write the symtpoms and their occurence into the external file
     */
    public void writeSymptoms() {
        FileWriter writer = null;
        if (symptoms != null|| !symptoms.isEmpty()) { 
            try {
                writer = new FileWriter("results.out");
                for (Map.Entry<String, Integer> symptomsOccurences : symptoms.entrySet()) {
                    writer.write(symptomsOccurences.getKey() + " " + symptomsOccurences.getValue() + "\n");
                }

            } catch (IOException e) {
                System.err.println(" Error while writing into file " + e.getMessage());
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        System.err.println(" Error while writing into file " + e.getMessage());
                    }
                }

            }
        }

    }
}