public class Circulo {
    private float x, y, raio;

    public Circulo(float x, float y, float raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    private boolean validaCirculo() {
        if (raio > 0) {
            return true;
        } else
            return false;
    }

    public float printCircle(){
        return perimetro();
    }
    public float area() {
        if (validaCirculo()) {
            return (float) (2 * 3.14 * (raio * raio));
        } else
            System.out.println("Erro: raio menor que zero.");
            return 0;
    }

    private float perimetro() {
        return (float) (2 * 3.14 * raio);
    }

    public boolean isInnerPoint(Ponto2D ponto) {
        if(area() > ponto.getY() || area() > ponto.getX()){
            return true;
        }else
            return false;
    }

    public boolean isBiggerThan (Circulo circulo){
        if (circulo.area() < this.area()) {
            return false;
        }else
            return true;
    }
}