import org.example.Algorithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortTests {
    private Algorithms algorithms;
    @BeforeEach
    public void init(){
        this.algorithms=new Algorithms();
    }
    @Test
    public void testInputNull(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> {this.algorithms.sort(null);});
        Assertions.assertEquals(e.getMessage(),"Array cannot be null");
    }
    @Test
    public void testOrdinamentoArrayOrdinato(){
        int[] array = new int[]{1,2,3,4,5,6};
        this.algorithms.sort(array);
        int[] arrayAtteso= new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrayAtteso,array);
    }
    @Test
    public void testOrdinamentoArrayDecrescente(){
        int[] array = new int[]{6,5,4,3,2,1};
        this.algorithms.sort(array);
        int[] arrayAtteso= new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrayAtteso,array);
    }
    @Test
    public void testOrdinamentoArrayvaloriMultipli(){
        int[] array = new int[]{8,4,6,9,6,2,5,7,6};
        this.algorithms.sort(array);
        int[] arrayAtteso= new int[]{2,4,5,6,6,6,7,8,9};
        Assertions.assertArrayEquals(arrayAtteso,array);

    }
}
