package PadraoSingleton.ConfiguracaoLogSingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    // Instância única (Singleton)
    private static Logger instance;

    // Formatter para data/hora
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Construtor privado
    private Logger() {}

    // Método para obter a instância única
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }


    //public static Logger get

    // Método de log
    public void log(LogLevel level, String message) {
        String formattedMessage = formatMessage(level, message);
        System.out.println(formattedMessage);
    }

    // Formatação da mensagem
    private String formatMessage(LogLevel level, String message) {
        String timestamp = LocalDateTime.now().format(formatter);

        switch (level) {
            case INFO:
                return String.format("[%s] [INFO ]: %s", timestamp, message);
            case DEBUG:
                return String.format("[%s] [DEBUG]: %s", timestamp, message);
            case WARN:
                return String.format("[%s] [WARN ]: %s", timestamp, message);
            case ERROR:
                return String.format("[%s] [ERROR]: %s", timestamp, message);
            default:
                return String.format("[%s] [UNKN ]: %s", timestamp, message);
        }
    }
}
