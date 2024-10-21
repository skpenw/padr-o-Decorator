public class EscapeEsportivo extends MotoDecorator {
    public EscapeEsportivo(Moto moto) {
        super(moto);
    }

    @Override
    public String getDescricao() {
        return moto.getDescricao() + ", Escape Esportivo";
    }

    @Override
    public double getPreco() {
        return moto.getPreco() + 1200.0;
    }
}
