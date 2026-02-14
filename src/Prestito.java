import java.time.LocalDate;

public class Prestito {
    private Libro libro;
    private Utente utente;
    private LocalDate dataInizio;
    private LocalDate dataFine;

    public Prestito(Libro libro, Utente utente, LocalDate dataInizio, LocalDate dataFine) {
        this.libro = libro;
        this.utente = utente;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public Libro getLibro() {
        return libro;
    }

    public Utente getUtente() {
        return utente;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    @Override
    public String toString() {
        return "Prestito: " + libro.getTitolo() + " a " + utente.getNome() +
                " dal " + dataInizio + " al " + dataFine;
    }
}