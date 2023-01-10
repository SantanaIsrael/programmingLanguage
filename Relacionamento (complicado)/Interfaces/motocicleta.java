public class motocicleta extends veiculo{
    public motocicleta (String placa){
        super(placa);
    }
    
    @Override
    public void move(double distancia){
        super.move(distancia);
    }

    @Override
    public String toString() {
        return super.toString() + " da motocicleta.";
    }
}