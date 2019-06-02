package pcoet.utils.algorithms;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class QuicksortTest 
{
    private Quicksort quicksort = new Quicksort();

    @Test
    public void qucksortReturnsExpectedString() {
        assertThat(quicksort.sort(), containsString("TODO: Implement quicksort"));
    }
}