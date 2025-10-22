import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage("Garage Centrale");
        Scanner input = new Scanner(System.in);

        System.out.print("Quante auto vuoi inserire? ");
        int numeroAuto = Integer.parseInt(input.nextLine());

        for (int i = 0; i < numeroAuto; i++) {
            System.out.println("Inserisci i dati per l'auto #" + (i + 1));
            Automobile a = createAuto(input);
            garage.aggiungiAuto(a);
        }

        // Mostro tutte le auto
        garage.mostraAuto();

        // Stampo quante sono elettriche
        System.out.println("Numero di auto elettriche: " + garage.contaElettriche());

        // Stampo quali sono storiche
        System.out.println("Auto storiche:");
        for (Automobile a : garage.posti) {
            if (a != null && a.isStorica()) {
                a.stampaInfo();
            }
        }

        // Esempio di ricerca auto per targa
        System.out.print("Inserisci la targa da cercare: ");
        String targaRicerca = input.nextLine();

        int indice = garage.cercaAuto(targaRicerca);
        if (indice != -1) {
            System.out.println("Auto trovata al posto " + indice + ":");
            garage.posti[indice].stampaInfo();
        } else {
            System.out.println("Auto con targa " + targaRicerca + " non trovata.");
        }

        input.close();
    }

    // Metodo per creare un'auto leggendo da input
    public static Automobile createAuto(Scanner input) {
        System.out.print("Inserisci la targa: ");
        String targa = input.nextLine();

        System.out.print("Inserisci l'anno: ");
        int anno = Integer.parseInt(input.nextLine());

        System.out.print("Inserisci la marca: ");
        String marca = input.nextLine();

        System.out.print("Inserisci il modello: ");
        String modello = input.nextLine();

        System.out.print("L'auto è elettrica? (true/false): ");
        boolean elettrica = Boolean.parseBoolean(input.nextLine());

        // Per impostare parcheggiata a false di default
        boolean parcheggiata = false;

        return new Automobile(targa, anno, marca, modello, elettrica, parcheggiata);
    }
}