package padroesestruturais.decorator;

public class PecaBruta implements Produto {

    public float custoProducao;

    public PecaBruta() {
    }

    public PecaBruta(float custoProducao) {
        this.custoProducao = custoProducao;
    }

    public float getCustoProducao() {
        return custoProducao;
    }

    public String getRoteiro() {
        return "Peça Bruta";
    }

}
