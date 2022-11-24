public class Circulo {
    private double x, y, raio;

    public Circulo(Double x, Double y, Double raio) {
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

    public String printCircle(){
        String result;
        result = "Perimetro " + perimetro();
        result += "Area " + area();
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

    public boolean isInnerPoint(Ponto2DConstru ponto) {
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