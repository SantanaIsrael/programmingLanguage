public class Ponto2D{
    private double X;
    private double Y;

    //Construtor
    public Ponto2D(double x, double y){
        X = x;
        Y = y;
    }

    // Gettes
  public double getX(){
        return X;
    }

    public double getY() {
        return Y;
    }

    // X e Y está no eixo
    private boolean isEixoX() {
        if (X == 0.0) {
            return true;
        } else
            return false;
    }

    private boolean isEixoY() {
        if (Y == 0.0) {
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
        } else if (X > 0 && Y > 0) {
            return 1;
        } else if (X < 0 && Y < 0) {
            return 3;
        } else if (X < 0 && Y > 0) {
            return 2;
        } else
            return 4;
    }

    public double distancia(Ponto2D b) {
        double distancia;
        if (isEixo() && b.isEixo()) {
            return 0;
        } else {
            distancia = (double)Math.sqrt(((X - b.getX()) * (X - b.getX())) + 
            ((Y - b.getY()) * (Y - b.getY())));
            return distancia;
        }
    }
}