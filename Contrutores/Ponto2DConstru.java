public class Ponto2DConstru{
    private double x;
    private double y;

    //Construtor
    public Ponto2DConstru (double x, double y){
        this.x = x;
        this.y = y;
    }

    // Gettes
  public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    // X e Y está no eixo
    private boolean isEixoX() {
        if (x == 0.0) {
            return true;
        } else
            return false;
    }

    private boolean isEixoY() {
        if (y == 0.0) {
            return true;
        } else
            return false;
    }

    public boolean isEixo() {
        if (isEixoX() && isEixoY()) {
            return true;
        } else {
            return false;
        }
    }

    public int quadrante() {
        if (isEixo()) {
            return 0;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x < 0 && y > 0) {
            return 2;
        } else
            return 4;
    }

    public double distancia(Ponto2DConstru a, Ponto2DConstru b) {
        double distancia;
        if (a.isEixo() && b.isEixo()) {
            return 0;
        } else {
            distancia = (double)Math.sqrt(((a.getX() - b.getX()) * (a.getX() - b.getX())) + 
            ((a.getY() - b.getY()) * (a.getY() - b.getY())));
            return distancia;
        }
    }
}