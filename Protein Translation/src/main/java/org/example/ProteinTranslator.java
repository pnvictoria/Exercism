package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {
    private static final Map<String, String> proteinMap = new HashMap<>();
    private static final List<String> stopSequences = new ArrayList<>();

    static {
        proteinMap.put("AUG", "Methionine");
        proteinMap.put("UUU", "Phenylalanine");
        proteinMap.put("UUC", "Phenylalanine");
        proteinMap.put("UUA", "Leucine");
        proteinMap.put("UUG", "Leucine");
        proteinMap.put("UCU", "Serine");
        proteinMap.put("UCC", "Serine");
        proteinMap.put("UCA", "Serine");
        proteinMap.put("UCG", "Serine");
        proteinMap.put("UAU", "Tyrosine");
        proteinMap.put("UAC", "Tyrosine");
        proteinMap.put("UGU", "Cysteine");
        proteinMap.put("UGC", "Cysteine");
        proteinMap.put("UGG", "Tryptophan");
        stopSequences.add("UAA");
        stopSequences.add("UAG");
        stopSequences.add("UGA");
    }

    public List<String> translate(String rnaSequence) {
        List<String> output = new ArrayList<>();
        for (String item : rnaSequence.split("(?<=\\G.{3})")) {
            if (stopSequences.contains(item)) {
                break;
            } else {
                output.add(proteinMap.get(item));
            }
        }
        return output;
    }
}
