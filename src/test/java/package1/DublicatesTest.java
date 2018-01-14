package package1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class DublicatesTest {

    @Test
    public void dublicateOnceIntTest() {
        Collection<Integer> inputIntOnce = Arrays.asList(1, 2, 1, 0, 1, 288, 2, 0, 1);
        Collection<Integer> resultIntOnce = DublicateUtil.findElementsWithoutDublicates(inputIntOnce);

        Assert.assertThat(resultIntOnce, hasSize(1));
        Assert.assertThat(resultIntOnce, hasItem(288));
    }

    @Test
    public void dublicateOnceStrTest() {
        Collection<String> inputStrOnce = Arrays.asList("a", "b", "a", "c", "d", "d", "b");
        Collection<String> resultStrOnce = DublicateUtil.findElementsWithoutDublicates(inputStrOnce);

        Assert.assertThat(resultStrOnce, hasSize(1));
        Assert.assertThat(resultStrOnce, hasItem("c"));
    }

    @Test
    public void dublicateMoreIntTest() {
        Collection<Integer> inputIntMore = Arrays.asList(555, 1, 2, 1, 0, 1, 288, 2, 0, 1, 99);
        Collection<Integer> resultIntMore = DublicateUtil.findElementsWithoutDublicates(inputIntMore);

        Assert.assertThat(resultIntMore, hasSize(3));
        Assert.assertThat(resultIntMore, hasItems(288, 99, 555));
    }

    @Test
    public void dublicateMoreStrTest() {
        Collection<String> inputStrMore = Arrays.asList("hhh", "a", "b", "a", "hello", "c", "d", "d", "b");
        Collection<String> resultStrMore = DublicateUtil.findElementsWithoutDublicates(inputStrMore);

        Assert.assertThat(resultStrMore, hasSize(3));
        Assert.assertThat(resultStrMore, hasItems("c", "hhh", "hello"));
    }

    @Test
    public void dublicateNoneIntTest() {
        Collection<Integer> inputIntNone = Arrays.asList(1, 2, 1, 0, 1, 2, 0, 1);
        Collection<Integer> resultIntNone = DublicateUtil.findElementsWithoutDublicates(inputIntNone);

        Assert.assertThat(resultIntNone, hasSize(0));
    }

    @Test
    public void dublicateNonrStrTest() {
        Collection<String> inputStrNone = Arrays.asList("a", "b", "a", "d", "d", "b");
        Collection<String> resultStrNone = DublicateUtil.findElementsWithoutDublicates(inputStrNone);

        Assert.assertThat(resultStrNone, hasSize(0));
    }

}
