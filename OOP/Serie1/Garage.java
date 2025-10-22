public class Garage {
    public String nome;
    public Automobile[] posti = new Automobile[5];

    public Garage(String nome) {
        this.nome = nome;
    }

    // Aggiunge un'auto nel primo posto libero
    public void aggiungiAuto(Automobile a) {
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] == null) {
                posti[i] = a;
                a.entraGarage();
                System.out.println("Auto aggiunta nel posto " + i);
                return;
            }
        }
        System.out.println("Garage pieno, impossibile aggiungere l'auto.");
    }

    // Rimuove l'auto con la targa specificata
    public void rimuoviAuto(String targa) {
        int idx = cercaAuto(targa);
        if (idx != -1) {
            posti[idx].esciGarage();
            posti[idx] = null;
            System.out.println("Auto rimossa dal garage.");
        } else {
            System.out.println("Auto con targa " + targa + " non trovata.");
        }
    }

    // Mostra tutte le auto parcheggiate nel garage
    public void mostraAuto() {
        System.out.println("Elenco auto nel garage " + nome + ":");
        for (Automobile a : posti) {
            if (a != null) {
                a.stampaInfo();
            }
        }
    }

    // Conta quante auto elettriche ci sono
    public int contaElettriche() {
        int count = 0;
        for (Automobile a : posti) {
            if (a != null && a.elettrica) {
                count++;
            }
        }
        return count;
    }

    // Cerca un'auto per targa, ritorna l'indice o -1 se non trovata
    public int cercaAuto(String targa) {
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null && posti[i].targa.equalsIgnoreCase(targa)) {
                return i;
            }
        }
        return -1;
    }
}