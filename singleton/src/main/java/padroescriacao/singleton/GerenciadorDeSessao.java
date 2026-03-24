package padroescriacao.singleton;

public class GerenciadorDeSessao {

    private static GerenciadorDeSessao instancia = new GerenciadorDeSessao();
    private String usuarioLogado;
    private String tokenAcesso;

    private GerenciadorDeSessao() {
    }

    public static GerenciadorDeSessao getInstancia() {
        return instancia;
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