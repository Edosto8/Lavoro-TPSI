import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libri = new ArrayList<>();
    private ArrayList<Prestito> prestiti = new ArrayList<>();

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public Libro cercaLibroPerIsbn(String isbn) {
        for (Libro l : libri) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean prestaLibro(String isbn, Utente utente) {
        Libro libro = cercaLibroPerIsbn(isbn);

        if (libro == null || !libro.isDisponibile()) {
            return false;
        }

        libro.setDisponibile(false);
        Prestito p = new Prestito(libro, utente, java.time.LocalDate.now(),
                java.time.LocalDate.now().plusDays(30));
        prestiti.add(p);
        return true;
    }

    public boolean restituisciLibro(String isbn) {
        Libro libro = cercaLibroPerIsbn(isbn);

        if (libro == null || libro.isDisponibile()) {
            return false;
        }

        libro.setDisponibile(true);
        return true;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public ArrayList<Prestito> getPrestiti() {
        return prestiti;
    }
}
