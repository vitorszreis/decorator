package padroesestruturais.decorator;

public class Usinagem extends EtapaProducaoDecorator {

    public Usinagem(Produto produto) {
        super(produto);
    }

    public float getPercentualCusto() {
        return 20.0f;
    }

    public String getNomeEtapa() {
        return "Usinagem";
    }
}
