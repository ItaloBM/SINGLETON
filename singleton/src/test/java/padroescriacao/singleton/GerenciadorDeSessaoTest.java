package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenciadorDeSessaoTest {

    @Test
    void deveRetornarAMesmaInstancia() {
        GerenciadorDeSessao sessao1 = GerenciadorDeSessao.getInstancia();
        GerenciadorDeSessao sessao2 = GerenciadorDeSessao.getInstancia();

        assertEquals(sessao1, sessao2);
    }

    @Test
    void deveRetornarUsuarioLogado() {
        GerenciadorDeSessao.getInstancia().setUsuarioLogado("JoaoSilva");
        assertEquals("JoaoSilva", GerenciadorDeSessao.getInstancia().getUsuarioLogado());
    }

    @Test
    void deveRetornarTokenAcesso() {
        GerenciadorDeSessao.getInstancia().setTokenAcesso("abc-123-xyz");
        assertEquals("abc-123-xyz", GerenciadorDeSessao.getInstancia().getTokenAcesso());
    }
}