package analyticsV2;

import java.util.*;
import java.io.*;

public class AnalyticsCounter {

    /**
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        /**
        * We call the ReaderSymtpom class for reading the symptom file
        * symptoms : A list of String composed of the symptoms of the file
        */

        ReaderSymptom reader = new ReaderSymptom("symptoms.txt");
        List<String> symptoms = reader.getSymptoms();
        
        /**
        * We call the Count class for sorting the symptom file
        * results : TreeMap contains the result of the list of symptoms and count sorted by symptoms
        */

        CountingSymptom  counter = new CountingSymptom(symptoms);
        TreeMap<String,Integer> results = counter.compteurSymptom();

        /**
        * Here we have our class writing the results to the chosen file
        * WriterSymptoms in the file resultat.out
        */

        WriterSymptoms writer = new WriterSymptoms(results);
        writer.writeSymptoms();
    }
}