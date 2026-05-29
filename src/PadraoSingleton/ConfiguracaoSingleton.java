package PadraoSingleton;

public class ConfiguracaoSingleton {


    private String autor = "fabio";

    private String urlBanco = "10.0.0.55";

    private Double margemErroFinanceiro = 0.05;

    private static ConfiguracaoSingleton instance;

    private ConfiguracaoSingleton() {


    }

    public static ConfiguracaoSingleton getIstance() {

        if (instance == null) {

            instance = new ConfiguracaoSingleton();


        }

        return instance;
    }

    public String getAutor() {
        return autor;
    }

}
