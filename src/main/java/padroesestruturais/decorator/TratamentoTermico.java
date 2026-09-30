package padroesestruturais.decorator;

public class TratamentoTermico extends EtapaProducaoDecorator {

    public TratamentoTermico(Produto produto) {
        super(produto);
    }

    public float getPercentualCusto() {
        return 10.0f;
    }

    public String getNomeEtapa() {
        return "Tratamento Térmico";
    }
}
