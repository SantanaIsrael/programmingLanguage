public class Ponto2D {
    private float x;
    private float y;

    //Construtor
    public Ponto2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Ponto2D(){
        this(0,0);
    }
    
    // Gettes
    public float getX() {
        return x;
    }

    public float getY() {
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

    private boolean isEixo() {
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

    public float distancia(Ponto2D a) {

        if (a.isEixo() && isEixo()) {
            return 0;
        } else {
            return (float) Math.sqrt(((a.x - x) * (a.x - x)) + ((a.y - y) * (a.y - y)));
        }
    }

    public float distancia() {
        if (isEixoX() && isEixoY()){
            return 0;
        } else {
            return (float)Math.sqrt((x-y) * (x-y));
        }
    }

    public float distancia(float x, float y){
        return (x == 0 && y == 0) ? 0 : (float)Math.sqrt((x-y) * (x-y));
    }
}
