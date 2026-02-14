import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrestitoTest {

    @Test
    public void testCostruttore() {
        Libro l = new Libro("9788804676481", "La coscienza di Zeno", "Italo Svevo", 1923);
        Utente u = new Utente("Luca", "Verdi", "U205");

        Prestito p = new Prestito(l, u);

        assertEquals(l, p.getLibro());
        assertEquals(u, p.getUtente());
    }
}
