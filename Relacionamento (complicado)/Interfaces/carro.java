public class carro extends veiculo {
    protected boolean marchaRe = false;

    public carro(String placa) {
        super(placa);
    }

    public void engataRe() {
        marchaRe = true;
    }

    public void desengataRe() {
        marchaRe = false;
    }

    @Override
    public void move(double distancia) {
        if (!marchaRe)
            super.move(distancia);
        else
            super.move(distancia - 32.5);
    }

    @Override
    public String toString() {
        return super.toString() + " do carro.";
    }
}