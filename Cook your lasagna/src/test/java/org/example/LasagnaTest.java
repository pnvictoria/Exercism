package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LasagnaTest extends TestCase {
    public Lasagna lasagna;

    public LasagnaTest() {
        lasagna = new Lasagna();
    }

    @Test
    public void totalTimeInMinutes_shouldReturnSum_whenInputThreeLayer() {
        Assertions.assertEquals(26, lasagna.totalTimeInMinutes(3, 20));
    }
}
