package analyticsV2;

import java.util.*;

public class CountingSymptom {
    private List<String> symptoms;

    public CountingSymptom(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    /**
     * Counting symptom with a if/else condition
     * @return a TreeMap with the symptoms it contains
     */
    public TreeMap<String, Integer> compteurSymptom() {

        TreeMap<String, Integer> triSymptoms = new TreeMap<String, Integer>();
        for (String symptoms : symptoms){
            if (triSymptoms.containsKey(symptoms)){
                triSymptoms.put(symptoms, triSymptoms.get(symptoms)+1 ); /*the "put" adds the symptom that already exists and the "get" retrieves the symptom that already exists and increments it by +1*/
            } else {
                triSymptoms.put(symptoms, 1);
            }
        }

        return triSymptoms;
    }
}