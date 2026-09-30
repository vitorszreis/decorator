package padroesestruturais.decorator;

public abstract class EtapaProducaoDecorator implements Produto {

    private Produto produto;
    public String roteiro;

    public EtapaProducaoDecorator(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public abstract float getPercentualCusto();

    public float getCustoProducao() {
        return this.produto.getCustoProducao() * (1 + (this.getPercentualCusto() / 100));
    }

    public abstract String getNomeEtapa();

    public String getRoteiro() {
        return this.produto.getRoteiro() + "/" + this.getNomeEtapa();
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }
}
