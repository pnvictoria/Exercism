package org.example;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    public static void main(String[] args) {
        System.out.println(Blackjack.parseCard("fff"));
    }

    public static int parseCard(String card) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ace", 11);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("jack", 10);
        map.put("queen", 10);
        map.put("king", 10);
        return map.get(card) == null ? 0 : map.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) return "P";
        else if (dealerScore < 10) return "W";
        else return "S";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) return "S";
        else if (handScore <= 11) return "H";
        else if (dealerScore >= 7) return "H";
        else return "S";
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore)
            return largeHand(isBlackjack(card1, card2), dealerScore);
        else
            return smallHand(handScore, dealerScore);
    }
}


