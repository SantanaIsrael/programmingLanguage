public class Circulo {
    private float x, y, raio;

    //Construtor
    public Circulo(float x, float y, float raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo (float raio){
        this.raio = raio;
    }

    //Validação
    private boolean validaCirculo() {
        if (raio > 0) {
            return true;
        } else
            return false;
    }

    public String toString(){
        String result;
        result = "Perimetro " + perimetro() + "\n" + "Area " + area();
        return result;

    }
    public float area() {
        if (validaCirculo()) {
            return (float) (2 * 3.14 * (raio * raio));
        } else
            System.out.println("Erro: raio menor que zero.");
            return 0;
    }

    public float perimetro() {
        return (float) (2 * 3.14 * raio);
    }

    public boolean isInnerPoint(Ponto2D ponto) {
        if(area() > ponto.getY() || area() > ponto.getX()){
            return true;
        }else
            return false;
    }

    public boolean isBiggerThan (Circulo circulo){
        if (this.area() > circulo.area()) {
            return true;
        }else
            return false;
    }
}