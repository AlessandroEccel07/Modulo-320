public class Main {
    public static void main(String[] args) {
        Rettangolo myObj = new Rettangolo();
        myObj.latoMaggiore = 5;
        myObj.latoMinore = 5;
        System.out.println(myObj.latoMaggiore + "x" + myObj.latoMinore + " Perimetro: " + myObj.perimetro() + " Area: " + myObj.area());
        myObj.disegno();

    }
}