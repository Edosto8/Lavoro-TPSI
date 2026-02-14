public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        Libro l1 = new Libro("123", "Il Signore degli Anelli", "Tolkien", 1954);
        Utente u1 = new Utente("Edoardo", "Rossi", "U001");

        b.aggiungiLibro(l1);

        System.out.println("Prestito: " + b.prestaLibro("123", u1));
        System.out.println("Disponibile? " + l1.isDisponibile());

        System.out.println("Restituzione: " + b.restituisciLibro("123"));
        System.out.println("Disponibile? " + l1.isDisponibile());
    }
}
