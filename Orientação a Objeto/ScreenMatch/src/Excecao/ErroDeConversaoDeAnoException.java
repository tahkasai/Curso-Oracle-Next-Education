package Excecao;

// Todas as exceções no java, são filhas de Throwable. Mas se utilizarmos ele no extends, iremos fazer com que seja obrigatório a utilização do try-catch, por isso, trocamos para o RunTimeException (classificado como uncheck), pois elas não são checadas durante o tempo de execução
public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
