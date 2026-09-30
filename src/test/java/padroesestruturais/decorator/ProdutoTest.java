package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    private static final float DELTA = 0.001f;

    @Test
    void deveRetornarCustoProducaoPecaBruta() {
        Produto produto = new PecaBruta(1000.0f);

        assertEquals(1000.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarCustoProducaoComUsinagem() {
        Produto produto = new Usinagem(new PecaBruta(1000.0f));

        assertEquals(1200.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarCustoProducaoComTratamentoTermico() {
        Produto produto = new TratamentoTermico(new PecaBruta(1000.0f));

        assertEquals(1100.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarCustoProducaoComPintura() {
        Produto produto = new Pintura(new PecaBruta(1000.0f));

        assertEquals(1050.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarCustoProducaoComUsinagemMaisTratamentoTermico() {
        Produto produto = new TratamentoTermico(new Usinagem(new PecaBruta(1000.0f)));

        assertEquals(1320.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarCustoProducaoComUsinagemMaisPintura() {
        Produto produto = new Pintura(new Usinagem(new PecaBruta(1000.0f)));

        assertEquals(1260.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarCustoProducaoComTratamentoTermicoMaisPintura() {
        Produto produto = new Pintura(new TratamentoTermico(new PecaBruta(1000.0f)));

        assertEquals(1155.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarCustoProducaoComUsinagemMaisTratamentoTermicoMaisPintura() {
        Produto produto = new Pintura(new TratamentoTermico(new Usinagem(new PecaBruta(1000.0f))));

        assertEquals(1386.0f, produto.getCustoProducao(), DELTA);
    }

    @Test
    void deveRetornarRoteiroPecaBruta() {
        Produto produto = new PecaBruta();

        assertEquals("Peça Bruta", produto.getRoteiro());
    }

    @Test
    void deveRetornarRoteiroComUsinagem() {
        Produto produto = new Usinagem(new PecaBruta());

        assertEquals("Peça Bruta/Usinagem", produto.getRoteiro());
    }

    @Test
    void deveRetornarRoteiroComTratamentoTermico() {
        Produto produto = new TratamentoTermico(new PecaBruta());

        assertEquals("Peça Bruta/Tratamento Térmico", produto.getRoteiro());
    }

    @Test
    void deveRetornarRoteiroComPintura() {
        Produto produto = new Pintura(new PecaBruta());

        assertEquals("Peça Bruta/Pintura", produto.getRoteiro());
    }

    @Test
    void deveRetornarRoteiroComUsinagemMaisTratamentoTermico() {
        Produto produto = new TratamentoTermico(new Usinagem(new PecaBruta()));

        assertEquals("Peça Bruta/Usinagem/Tratamento Térmico", produto.getRoteiro());
    }

    @Test
    void deveRetornarRoteiroComUsinagemMaisPintura() {
        Produto produto = new Pintura(new Usinagem(new PecaBruta()));

        assertEquals("Peça Bruta/Usinagem/Pintura", produto.getRoteiro());
    }

    @Test
    void deveRetornarRoteiroComTratamentoTermicoMaisPintura() {
        Produto produto = new Pintura(new TratamentoTermico(new PecaBruta()));

        assertEquals("Peça Bruta/Tratamento Térmico/Pintura", produto.getRoteiro());
    }

    @Test
    void deveRetornarRoteiroComUsinagemMaisTratamentoTermicoMaisPintura() {
        Produto produto = new Pintura(new TratamentoTermico(new Usinagem(new PecaBruta())));

        assertEquals("Peça Bruta/Usinagem/Tratamento Térmico/Pintura", produto.getRoteiro());
    }

}
