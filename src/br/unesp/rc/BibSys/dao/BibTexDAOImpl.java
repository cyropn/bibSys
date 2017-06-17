package br.unesp.rc.BibSys.dao;

import br.unesp.rc.BibSys.beans.BibTex;
import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta classe é a implementação dos métodos do interface BibTexDAO. 
 * Este métodos tem por objetivo a manipulação de arquivo, comoler, criar 
 * e fazer uma atualização.
 * 
 * @author cyro
 * @see BibTexDAOImpl
 */
public class BibTexDAOImpl implements BibTexDAO{
    
    public BibTexDAOImpl(){      
    }
    
    /**
     * Retorna uma lista de bibTex que podem ser manipuladas pelos métodos da 
     * classe bibTexManager.
     * 
     * @param path  caminha absoluto do arquivo a ser lido
     * @return      lista de bibTex que podem ser manipuladas pelos métodos
     */
   /* public List<> read(String path){
        return null;
    }*/
    
   /**
     * Retorna se obteve sucesso em salvar a string desejada no arquivo
     * 
     * @param bibTex    string a ser salva em um arquivo .bib
     * @return          verdadeiro se salvou ou falso se ocorreu algum erro
     */
    public boolean create(String bibTex, File file) {
        boolean b = false;
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(bibTex);
            fw.flush();
            b = true;
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return b;
    }
    
    /**
     * Retorna se obteve sucesso em realizar um update no arquivo, que 
     * consiste em apagar todo o conteudo antigo e salvar a nova string que
     * será seu novo conteudo.
     * 
     * @param bibTex    nova string que deve ser inserida no arquivo 
     * @return          verdadeiro se o update foi realizado com sucesso, 
     *                  caso contrario retorna falso.
     */
    public boolean update(String bibTex, File file){
        boolean b = false;
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(bibTex);
            fw.flush();
            b = true;
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return b;
    }
}
