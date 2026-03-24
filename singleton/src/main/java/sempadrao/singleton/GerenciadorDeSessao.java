package sempadrao.singleton;

public class GerenciadorDeSessao {

    private String usuarioLogado;
    private String tokenAcesso;

    public GerenciadorDeSessao() {
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String getTokenAcesso() {
        return tokenAcesso;
    }

    public void setTokenAcesso(String tokenAcesso) {
        this.tokenAcesso = tokenAcesso;
    }
}