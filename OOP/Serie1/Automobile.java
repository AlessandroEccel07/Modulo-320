import java.time.LocalDate;
import java.util.Scanner;

public class Automobile {
    public String targa;
    public int anno;
    public String marca;
    public String modello;
    public Boolean elettrica;
    public Boolean parcheggiata;
    LocalDate dataAttuale = LocalDate.now();

    public Automobile() {
        targa = "";
        anno = 0;
        marca = "";
        modello = "";
        elettrica = false;
        parcheggiata = false;
    }

    public Automobile(String xtarga, Integer xanno, String xmarca, String xmodello, Boolean xelettrica, Boolean xparcheggiata) {
        targa = xtarga;
        anno = xanno;
        marca = xmarca;
        modello = xmodello;
        elettrica = xelettrica;
        parcheggiata = xparcheggiata;
    }

    public void stampaInfo() {
        System.out.println("Targa: " + targa + "Marca: " + marca + "Modello: " + modello + "Anno: " + anno + "Elettrica: " + elettrica + "Parcheggiata: " + parcheggiata);

    }

    public void entraGarage() {
        parcheggiata = true;
        System.out.println("Auto " + marca + ", targata " + targa + " è parcheggiata");

    }

    public void esciGarage() {
        parcheggiata = false;
        System.out.println("Auto " + marca + ", targata " + targa + " è uscita");

    }

    public boolean isStorica() {
        int annoNow = dataAttuale.getYear();
        if (annoNow >= anno + 25) {
            return true;
        } else {
            return false;
        }
    }

    public void createAuto() {
        Scanner intarga = new Scanner(System.in);
        System.out.print("Inserisci la targa: ");
        String targa = intarga.nextLine();

        Scanner inanno = new Scanner(System.in);
        System.out.print("Inserisci la anno: ");
        int anno = Integer.parseInt(inanno.nextLine());

        Scanner inmarca = new Scanner(System.in);
        System.out.print("Inserisci la marca: ");
        String marca = inmarca.nextLine();

        Scanner inmodello = new Scanner(System.in);
        System.out.print("Inserisci la modello: ");
        String modello = inmodello.nextLine();

        Scanner inelettrica = new Scanner(System.in);
        System.out.print("Inserisci se é elettrica: ");
        Boolean numero = Boolean.parseBoolean(inelettrica.nextLine());

    }
}

