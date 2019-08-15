
import java.util.logging.Logger;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author douglas
 */
public class ExemploTratamentoExcecoes {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("ExemploDeTratamento");
        try {
            new java.io.FileInputStream("arquivo.txt");
            new ArrayList<String>().get(1);
            Float.parseFloat("Exemplo de Erro");
        } catch (IndexOutOfBoundsException ex) {
            logger.severe("Posição do array não existe");
        } catch (NumberFormatException ex) {
            logger.severe("Não foi possível converter o número");
        } catch (java.io.FileNotFoundException e) {
            logger.severe("Cadê o arquivo?");
        }
    }
}
