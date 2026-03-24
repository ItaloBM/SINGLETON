package sempadrao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenciadorDeSessaoTest {

    @Test
    void deveCriarInstanciasDiferentesOQueERuimParaSessao() {
        // Sem o Singleton, o sistema permite instanciar várias vezes
        GerenciadorDeSessao sessao1 = new GerenciadorDeSessao();
        GerenciadorDeSessao sessao2 = new GerenciadorDeSessao();

        // Colocamos o usuário na sessão 1
        sessao1.setUsuarioLogado("JoaoSilva");

        // O assertNotEquals verifica que sessao1 e sessao2 são espaços de memória diferentes
        assertNotEquals(sessao1, sessao2);

        // A sessão 2 não sabe quem é o usuário, pois é uma instância diferente (retorna null)
        assertNull(sessao2.getUsuarioLogado());
    }
}