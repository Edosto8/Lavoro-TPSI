import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    public void testCostruttore() {
        Libro l = new Libro("9781234567890", "Il Piccolo Principe", "Antoine de Saint-Exupéry", 1943);

        assertEquals("9781234567890", l.getIsbn());
        assertEquals("Il Piccolo Principe", l.getTitolo());
        assertEquals("Antoine de Saint-Exupéry", l.getAutore());
        assertEquals(1943, l.getAnno());
        assertTrue(l.isDisponibile());
    }

    @Test
    public void testDisponibilita() {
        Libro l = new Libro("9781234567890", "Il Piccolo Principe", "Antoine de Saint-Exupéry", 1943);
        l.setDisponibile(false);
        assertFalse(l.isDisponibile());
    }
}


