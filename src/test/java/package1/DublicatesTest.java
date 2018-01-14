package package1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class DublicatesTest extends Assert {

    @Test
    public void dublicateOnceIntTest() {
        Collection<Integer> inputIntOnce = Arrays.asList(1, 2, 1, 0, 1, 288, 2, 0, 1);
        Collection<Integer> resultIntOnce = DublicateUtil.findElementsWithoutDublicates(inputIntOnce);

        assertEquals(resultIntOnce.size(), 1);
        assertTrue(resultIntOnce.contains(288));
    }

    @Test
    public void dublicateOnceStrTest() {
        Collection<String> inputStrOnce = Arrays.asList("a", "b", "a", "c", "d", "d", "b");
        Collection<String> resultStrOnce = DublicateUtil.findElementsWithoutDublicates(inputStrOnce);

        assertEquals(resultStrOnce.size(), 1);
        assertTrue(resultStrOnce.contains("c"));
    }

    @Test
    public void dublicateMoreIntTest() {
        Collection<Integer> inputIntMore = Arrays.asList(555, 1, 2, 1, 0, 1, 288, 2, 0, 1, 99);
        Collection<Integer> resultIntMore = DublicateUtil.findElementsWithoutDublicates(inputIntMore);

        assertEquals(resultIntMore.size(), 3);
        assertTrue(resultIntMore.contains(288));
        assertTrue(resultIntMore.contains(99));
        assertTrue(resultIntMore.contains(555));
    }

    @Test
    public void dublicateMoreStrTest() {
        Collection<String> inputStrMore = Arrays.asList("hhh", "a", "b", "a", "hello", "c", "d", "d", "b");
        Collection<String> resultStrMore = DublicateUtil.findElementsWithoutDublicates(inputStrMore);

        assertEquals(resultStrMore.size(), 3);
        assertTrue(resultStrMore.contains("c"));
        assertTrue(resultStrMore.contains("hhh"));
        assertTrue(resultStrMore.contains("hello"));
    }

    @Test
    public void dublicateNoneIntTest() {
        Collection<Integer> inputIntNone = Arrays.asList(1, 2, 1, 0, 1, 2, 0, 1);
        Collection<Integer> resultIntNone = DublicateUtil.findElementsWithoutDublicates(inputIntNone);

        assertEquals(resultIntNone.size(), 0);
    }

    @Test
    public void dublicateNonrStrTest() {
        Collection<String> inputStrNone = Arrays.asList("a", "b", "a", "d", "d", "b");
        Collection<String> resultStrNone = DublicateUtil.findElementsWithoutDublicates(inputStrNone);

        assertEquals(resultStrNone.size(), 0);
    }
}
