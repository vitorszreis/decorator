package padroesestruturais.decorator;

public class Pintura extends EtapaProducaoDecorator {

    public Pintura(Produto produto) {
        super(produto);
    }

    public float getPercentualCusto() {
        return 5.0f;
    }

    public String getNomeEtapa() {
        return "Pintura";
    }
}
