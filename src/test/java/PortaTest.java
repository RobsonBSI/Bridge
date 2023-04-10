import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortaTest {
    @Test
    void PortaAluninio(){
        TipoMaterial tipo= new Aluminio();
        Porta porta= new Porta( 100.0f);
        porta.setTipo(tipo);
        porta.setTamanho(2.5f);
        assertEquals ( 1050.0f , porta.calcularProduto(), 0.01f );

    }
    @Test
    void PortaVidro(){
        TipoMaterial tipo= new Vidro();
        Porta porta= new Porta( 50.0f);
        porta.setTipo(tipo);
        porta.setTamanho(2.5f);
        assertEquals ( 1175.0f , porta.calcularProduto(), 0.01f );

    }
    @Test
    void PortaMadeira(){
        TipoMaterial tipo= new Madeira();
        Porta porta= new Porta( 100.0f);
        porta.setTipo(tipo);
        porta.setTamanho(2.5f);
        assertEquals ( 1350.0f , porta.calcularProduto(), 0.01f );

    }
}