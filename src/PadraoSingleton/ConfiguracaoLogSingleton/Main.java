package PadraoSingleton.ConfiguracaoLogSingleton;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.log(LogLevel.INFO, "Aplicação iniciada");
        logger.log(LogLevel.DEBUG, "Variável x = 10");
        logger.log(LogLevel.WARN, "Memória quase cheia");
        logger.log(LogLevel.ERROR, "Falha ao conectar ao banco");

    }
}
