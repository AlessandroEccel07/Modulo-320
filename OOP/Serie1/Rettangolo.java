public class Rettangolo {
    public double latoMaggiore;
    public double latoMinore;
    public double area() {
        return latoMaggiore * latoMinore;
    }
    public double perimetro() {
        return latoMaggiore*2 + latoMinore*2;
    }
    public void disegno(){
        for(int i = 0; i<(int)latoMaggiore; i++){
            for(int j = 0; j<(int)latoMinore; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
