package screenmatch.excecao;

public class ErroDeConversaoDeAnoExcpetion extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoExcpetion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
