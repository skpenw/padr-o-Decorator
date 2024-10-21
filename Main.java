public class Main {
    public static void main(String[] args) {
        Moto minhaMoto = new MotoBasica();
        System.out.println(minhaMoto.getDescricao() + " - Preço: R$" + minhaMoto.getPreco());

        minhaMoto = new EscapeEsportivo(minhaMoto);
        System.out.println(minhaMoto.getDescricao() + " - Preço: R$" + minhaMoto.getPreco());
    }
}
