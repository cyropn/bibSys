package br.unesp.rc.BibSys.dao;

public interface BibTexDAO {
   
    /**
     * Retorna uma lista de bibTex que podem ser manipuladas pelos métodos da 
     * classe bibTexManager.
     * 
     * @param path  caminha absoluto do arquivo a ser lido
     * @return      lista de bibTex que podem ser manipuladas pelos métodos
     */
    public List<BibTex> read(String path);
    
    /**
     * Retorna se obteve sucesso em salvar a string desejada no arquivo
     * 
     * @param bibTex    string a ser salva em um arquivo .bib
     * @return          verdadeiro se salvou ou falso se ocorreu algum erro
     */
    public boolean create(String bibTex);
    
    /**
     * Retorna se obteve sucesso em realizar um update no arquivo, que 
     * consiste em apagar todo o conteudo antigo e salvar a nova string que
     * será seu novo conteudo.
     * 
     * @param bibTex    nova string que deve ser inserida no arquivo 
     * @return          verdadeiro se o update foi realizado com sucesso, 
     *                  caso contrario retorna falso.
     */
    public boolean update(String bibTex);
    
}
