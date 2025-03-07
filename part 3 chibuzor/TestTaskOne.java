import static  org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 

public class TestTaskOne {

	@Test
	public void testCollectScores(){
        TaskOne myTaskOne = new TaskOne();
        int scores = 2;
        int[] array = new int[1];
        array[0] = scores;
        int[] expected = myTaskOne.collectScores(scores, array);
        int[] result ={2}; 
        assertArrayEquals(result, expected); 




}
















}
