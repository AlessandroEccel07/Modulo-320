public class Libro {
    public String Titolo;
    public int AnnoPubblicazione;
    public String Autore;
    public Boolean Disponibile;

    public Libro() {
        Titolo = "";
        AnnoPubblicazione = 0;
        Autore = "";
        Disponibile = false;
    }

    public Libro(String xTitolo, String xAutore, int xAnnoPubblicazione, Boolean xDisponibile) {
        Titolo = xTitolo;
        AnnoPubblicazione = xAnnoPubblicazione;
        Autore = xAutore;
        Disponibile = xDisponibile;
    }

    public void stampaInfo() {
        System.out.println("Titolo: " + Titolo);
        System.out.println("Autore: " + Autore);
        System.out.println("AnnoPubblicazione: " + AnnoPubblicazione);

    }

    public void VerificaDisponibilita() {
        if (Disponibile) {
            System.out.println("Libro Disponibile");
        } else {
            System.out.println("Libro non Disponibile");
        }

    }
}
