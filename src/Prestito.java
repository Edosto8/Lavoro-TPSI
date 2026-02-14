public class Prestito {
    private Libro libro;
    private Utente utente;

    public Prestito(Libro libro, Utente utente) {
        this.libro = libro;
        this.utente = utente;
    }

    public Libro getLibro() {
        return libro;
    }

    public Utente getUtente() {
        return utente;
    }
}
