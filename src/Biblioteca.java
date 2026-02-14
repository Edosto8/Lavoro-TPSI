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

        if (libro != null && libro.isDisponibile()) {
            libro.setDisponibile(false);

            Prestito p = new Prestito(libro, utente);
            prestiti.add(p);

            return true;
        }

        return false;
    }

    public boolean restituisciLibro(String isbn) {
        Libro libro = cercaLibroPerIsbn(isbn);

        if (libro != null && !libro.isDisponibile()) {
            libro.setDisponibile(true);
            return true;
        }

        return false;
    }

    public ArrayList<Libro> getLibriDisponibili() {
        ArrayList<Libro> disponibili = new ArrayList<>();
        for (Libro l : libri) {
            if (l.isDisponibile()) {
                disponibili.add(l);
            }
        }
        return disponibili;
    }

    public ArrayList<Libro> getLibriNonDisponibili() {
        ArrayList<Libro> nonDisponibili = new ArrayList<>();
        for (Libro l : libri) {
            if (!l.isDisponibile()) {
                nonDisponibili.add(l);
            }
        }
        return nonDisponibili;
    }
}


