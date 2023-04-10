import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JanelaTest {
    @Test
    void JanelaAluninio(){
        TipoMaterial tipo= new Aluminio();
        Janela janela= new Janela( 100.0f);
        janela.setTipo(tipo);
        janela.setTamanho(2);
        assertEquals ( 860.0f , janela.calcularProduto(), 0.01f );

    }
    @Test
    void JanelaVidro(){
        TipoMaterial tipo= new Vidro();
        Janela janela= new Janela( 50.0f);
        janela.setTipo(tipo);
        janela.setTamanho(2);
        assertEquals ( 950.0f , janela.calcularProduto(), 0.01f );

    }
    @Test
    void JanelaMadeira(){
        TipoMaterial tipo= new Madeira();
        Janela janela= new Janela( 100.0f);
        janela.setTipo(tipo);
        janela.setTamanho(2);
        assertEquals ( 1100.0f , janela.calcularProduto(), 0.01f );

    }
}