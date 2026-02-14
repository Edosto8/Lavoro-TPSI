public class Main {
    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();

        Libro l1 = new Libro("123", "Il Signore degli Anelli", "Tolkien", 1954);
        Libro l2 = new Libro("456", "1984", "Orwell", 1949);

        Utente u1 = new Utente("Edoardo", "Rossi", "U001");

        b.aggiungiLibro(l1);
        b.aggiungiLibro(l2);

        b.prestaLibro("456", u1);

        System.out.println("Libri disponibili:");
        for (Libro l : b.getLibriDisponibili()) {
            System.out.println(l.getTitolo());
        }

        System.out.println("\nLibri non disponibili:");
        for (Libro l : b.getLibriNonDisponibili()) {
            System.out.println(l.getTitolo());
        }
    }
}


