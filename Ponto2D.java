public class Ponto2D {
    private float x;
    private float y;

    // Gettes
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Settes
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
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
