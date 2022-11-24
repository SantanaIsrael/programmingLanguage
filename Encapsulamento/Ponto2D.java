public class Ponto2D {
    private double x;
    private double y;

    // Gettes
  public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Setter
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
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

    public float distancia(Ponto2D a, Ponto2D b) {
        float distancia;
        if (a.isEixo() && b.isEixo()) {
            return 0;
        } else {
            distancia = (float) Math.sqrt(((a.x - b.x) * (a.x - b.x)) + ((a.y - b.y) * (a.y - b.y)));
            return distancia;
        }
    }
}
