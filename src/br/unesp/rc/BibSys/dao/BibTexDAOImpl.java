package br.unesp.rc.BibSys.dao;

import java.awt.List;

public class BibTexDAOImpl {
    /**
     * Retorna uma lista de bibTex que podem ser manipuladas pelos métodos da 
     * classe bibTexManager.
     * @param path  caminha absoluto do arquivo a ser lido
     * @return      lista de bibTex que podem ser manipuladas pelos métodos
     */
    public List<BibTex> read(String path){
        return null;
    }
    
    /**
     * Retorna se o arquivo salvou a string a ser salva 
     * @param bibTex    string a ser salva em um arquivo .bib
     * @return          verdadeiro se salvou ou falso se ocorreu algum erro
     */
    public boolean create(String bibTex){
        return false;
    }
    
    /**
     * Retorna se o update no arquivo foi realizado com sucesso
     * @param bibTex    nova string que deve ser inserida no arquivo 
     * @return          verdadeiro se o update foi realizado com sucesso, 
     *                  caso contrario retorna falso.
     */
    public boolean update(String bibTex){
        return false;
    }
}
