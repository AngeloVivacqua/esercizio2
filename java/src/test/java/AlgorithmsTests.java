import org.example.Algorithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlgorithmsTests {
    private Algorithms algorithms;
    @BeforeEach
    public void init(){
        this.algorithms=new Algorithms();
    }
    @Test
    public void testInputNull(){
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> {this.algorithms.checkAcronym(null,null);});
        Assertions.assertEquals(e.getMessage(),"Acronym and phrase cannot be null");
    }
    @Test
    public void tesLunghezzaAcronimoNumeroMaiuscole(){
        Assertions.assertFalse(algorithms.checkAcronym("USA","Una Volta"));
        Assertions.assertTrue(algorithms.checkAcronym("USA","Unavolta Sola Adesso"));
        Assertions.assertFalse(algorithms.checkAcronym("U","Una Volta"));
        Assertions.assertTrue(algorithms.checkAcronym("USA","Una Solta Aola"));
        Assertions.assertFalse(algorithms.checkAcronym("USA","Una Solta aola"));
    }
    @Test
    public void testMatchAcronimo(){
        Assertions.assertTrue(this.algorithms.checkAcronym("CPF","Ciao Provo Funzione"));
        Assertions.assertFalse(this.algorithms.checkAcronym("CP","Ciao Provo la Funzione"));

        Assertions.assertTrue(this.algorithms.checkAcronym("CPF","Ciao Provo la Funzione"));
    }

    @Test
    public void testMoltiSpazi(){
        Assertions.assertTrue(this.algorithms.checkAcronym("CPF","Ciao Provo    Funzione"));
    }


}
