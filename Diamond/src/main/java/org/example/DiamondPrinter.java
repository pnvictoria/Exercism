package org.example;

import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    public List<String> printToList(char c) {
        List<String> list = new ArrayList<String>();
        int boxsize = (c - 'A') * 2 + 1;
        int midpoint = boxsize / 2 + 1;
        for (int row = 0; row < midpoint; row++) {
            list.add(buildRow(row, boxsize, c));
        }
        for (int row = midpoint - 2; row >= 0; row--) {
            list.add(list.get(row));
        }
        return list;
    }

    public String buildRow(int row, int boxsize, int maxLetter) {
        Character currentLetter = Character.toChars('A' + row)[0];
        int index1 = maxLetter - currentLetter;
        int index2 = boxsize - index1 - 1;
        StringBuilder sb = new StringBuilder();
        for (int col = 0; col < boxsize; col++) {
            sb.append((col == index1 || col == index2) ? currentLetter : ' ');
        }
        return sb.toString();
    }
}

