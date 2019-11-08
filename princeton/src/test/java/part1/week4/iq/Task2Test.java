package part1.week4.iq;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Task2Test {

    private Task2 queue;

    @Before
    public void init() {
        queue = createQueue();
    }

    @Test
    public void testSample() {
        for (int i = 0; i < 10; i++) {
            Assert.assertNotEquals(0, queue.sample());
        }
    }

    @Test
    public void testDelRandom() {
        for (int i = 0; i < 10; i++) {
            Assert.assertNotEquals(0, queue.delRandom());
        }
    }

    private Task2 createQueue() {
        int[] keys = {10, 20, 30, 40, 50, 60, 70, 90, 90, 100};
        return new Task2(keys);
    }
}