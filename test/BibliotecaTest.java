import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    public void testAggiungiLibro() {
        Biblioteca b = new Biblioteca();
        Libro l = new Libro("9788807901351", "I Promessi Sposi", "Alessandro Manzoni", 1827);

        b.aggiungiLibro(l);
        assertEquals(1, b.getLibriDisponibili().size());
    }

    @Test
    public void testPrestaLibro() {
        Biblioteca b = new Biblioteca();
        Libro l = new Libro("9788807901351", "I Promessi Sposi", "Alessandro Manzoni", 1827);
        Utente u = new Utente("Marco", "Neri", "U300");

        b.aggiungiLibro(l);
        boolean prestato = b.prestaLibro("9788807901351", u);

        assertTrue(prestato);
        assertFalse(l.isDisponibile());
    }

    @Test
    public void testRestituisciLibro() {
        Biblioteca b = new Biblioteca();
        Libro l = new Libro("9788807901351", "I Promessi Sposi", "Alessandro Manzoni", 1827);
        Utente u = new Utente("Marco", "Neri", "U300");

        b.aggiungiLibro(l);
        b.prestaLibro("9788807901351", u);
        boolean restituito = b.restituisciLibro("9788807901351");

        assertTrue(restituito);
        assertTrue(l.isDisponibile());
    }
}
