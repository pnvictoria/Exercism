package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HandshakeCalculator {
    public static List<Signal> calculateHandshake (int number) {
        int searchLimiter = 32 - Integer.numberOfLeadingZeros(number);
        List<Signal> signals = new ArrayList();
        for (int i = 0; i < searchLimiter; i++) {
            if (CheckBit(number, i)) {
                switch (i) {
                    case 0:
                        signals.add(Signal.WINK);
                        break;
                    case 1:
                        signals.add(Signal.DOUBLE_BLINK);
                        break;
                    case 2:
                        signals.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 3:
                        signals.add(Signal.JUMP);
                        break;
                    case 4:
                        Collections.reverse(signals);
                        break;
                    default:
                        break;
                }
            }
        }
        return signals;
    }
    public static boolean CheckBit(int x, int k) {
        return (x & 1 << k) != 0;
    }
}