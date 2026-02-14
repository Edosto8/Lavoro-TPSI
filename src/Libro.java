public class Libro {
    private String isbn;
    private String titolo;
    private String autore;
    private int anno;
    private boolean disponibile = true;

    public Libro(String isbn, String titolo, String autore, int anno) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getAnno() {
        return anno;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile){
        this.disponibile= disponibile;

    }
}
