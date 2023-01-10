public abstract class veiculo implements moveVeiculo {
    private String placa;
    private double posisao;

    public veiculo(String placa){
        this.placa = placa;
        move(0);
    }

    public String toString(){
        return "A placa " + placa + "\n" + "esta na posisao: " + posisao;
    }

    public void move (double distancia){
        posisao = distancia;
    }
}