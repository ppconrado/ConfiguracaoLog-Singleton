package PadraoSingleton;

public class App {

    public static void main(String[] args) throws Exception {


        ConfiguracaoSingleton c = ConfiguracaoSingleton.getInstance();


        System.out.println("Autor:" + c.getAutor());

        System.out.println("URL: " + ConfiguracaoSingleton.getInstance().getUrlBanco());
    }
}
