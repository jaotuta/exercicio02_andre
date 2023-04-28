import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger logger;
    FileHandler fh;


    //Verifica se o arquivo de log j� existe, sen�o o cria
    public Log(String nome_arquivo) throws IOException {
        File f = new File(nome_arquivo);
        if (!f.exists()) {
            f.createNewFile();
        }

        //A classe FileHandler est� presente no pacote java.util.logging
        //e foi especificamente projetada e configurada para lidar com o log impresso usando a inst�ncia logger.
        //O construtor FileHandler inicializa o manipulador para gravar as informa��es no nome de arquivo fornecido.
        fh = new FileHandler(nome_arquivo, true); //cria o arquivo
        logger = Logger.getLogger("Teste Log"); //nome do logger
        logger.addHandler(fh);  //adiciona o conte�do no arquivo
        //O m�todo addHandler mapeia um manipulador de arquivo para receber as mensagens de registro no arquivo.

        /*A inst�ncia SimpleFormatter � iniciada; a classe tamb�m est� presente no pacote java.util.logging.
         * O formatador permite o privil�gio de autoformatar os logs usando a propriedade logging.SimpleFormatter.format.
         * Esta propriedade permite que as mensagens de log estejam em um formato definido e, portanto, mantendo a uniformidade.
         */
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter); //O setFormatter � uma fun��o que define um formatador na inst�ncia do logger.

    }
}
