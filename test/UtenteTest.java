import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtenteTest {

    @Test
    public void testCostruttore() {
        Utente u = new Utente("Giulia", "Bianchi", "U102");

        assertEquals("Giulia", u.getNome());
        assertEquals("Bianchi", u.getCognome());
        assertEquals("U102", u.getId());
    }
}
