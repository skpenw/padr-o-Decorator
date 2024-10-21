public abstract class MotoDecorator implements Moto {
    protected Moto moto;

    public MotoDecorator(Moto moto) {
        this.moto = moto;
    }
}
