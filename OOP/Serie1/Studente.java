public class Studente {
    public String Nome;
    public int Eta;
    public String Corso;
    public Boolean isPromosso;

    public Studente() {
        Corso = "NomeCorso";
        isPromosso = true;
        Eta=0;
        Nome="Nome";

    }

    public Studente(String xNome, int xEta, String xCorso, Boolean xisPromosso) {
        Nome = xNome;
        Eta = xEta;
        Corso = xCorso;
        isPromosso = xisPromosso;
    }

    public void saluta() {
        System.out.println("Ciao " + Nome + " del corso " + Corso);

    }

    public void VerificaPromosso() {
        if (isPromosso) {
            System.out.println("Sei Promosso");
        } else {
            System.out.println("Sei Bocciato");
        }

    }
}
