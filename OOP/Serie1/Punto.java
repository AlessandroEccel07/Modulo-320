public class Punto {
    public double x;
    public double y;
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public Punto() {
        this.x = 1;
        this.y = 1;

    }
    public double calcolaDistanza() {
        return Math.sqrt(Math.pow(Math.abs(this.x), 2) + Math.pow(Math.abs(this.y), 2));
    }
    public String determinaQuadrante(){
        if (x>0 && y>0) {
            return "\t¦\n" +
                    "  \t¦ x\n" +
                    "----¦----\n" +
                    "  \t¦ \n" +
                    "\t¦";
        }else if (x>0 && y<0) {
            return "\t¦\n" +
                    "  \t¦ \n" +
                    "----¦----\n" +
                    "  \t¦ x\n" +
                    "\t¦";
        }else if (x<0 && y>0) {
            return "\t¦\n" +
                    "  x\t¦ \n" +
                    "----¦----\n" +
                    "  \t¦ \n" +
                    "\t¦";
        }else if (x<0 && y<0) {
            return "\t¦\n" +
                    "  \t¦ \n" +
                    "----¦----\n" +
                    "  x\t¦ \n" +
                    "\t¦";
        }return " ";
    }
    public String toString(){
        System.out.println("Distanza: "+calcolaDistanza());
        System.out.println(determinaQuadrante());
        System.out.println("("+x+";"+y+")");
        return " ";
    }
}
