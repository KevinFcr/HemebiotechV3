package analyticsV2;

/**
 * This interface makes it possible to use the method writeSymptoms in several classes
 */

public interface IWriterSymptom {
    
    /**
     * She will use a filewriter as well as using a map to write the keys/values ​​to the external file
     */

    public void writeSymptoms ();
    
}