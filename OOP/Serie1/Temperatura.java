public class Temperatura {

    public double celsius;
    public Temperatura(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Errore: temperatura sotto lo zero assoluto!");
            this.celsius = 273.15;
        } else {
            this.celsius = celsius;
        }
    }
    public Temperatura() {
        this.celsius  = ;

    }
    public String stato() {
        if (celsius < 10) {
            return "Freddo";
        }else if (celsius < 25 && celsius > 10) {
            return "Temperato";
        }else {
            return "Caldo";
        }
    }
    public double inFahrenheit(){
        return (this.celsius*9/5) + 32;
    }
    public double inKelvin(){
        return this.celsius+273.15;
    }
    public double generaTemperatura(){
        double min = -273.15;
        double max = 5000.99;
        double valoreCasuale = min + Math.random() * (max - min);
        return Math.round(valoreCasuale * 100.0) / 100.0;
    }
    public String toString(){
        System.out.println("Temperatura in Celsius: "+this.celsius);
        System.out.println("Stato: "+ stato());
        System.out.println("In Fahrenheit: "+ inFahrenheit());
        System.out.println("In Kelvin: "+ inKelvin());

        return " ";
    }
}
