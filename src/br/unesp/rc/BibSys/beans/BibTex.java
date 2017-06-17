package br.unesp.rc.BibSys.beans;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Esta classe é uma abstração de um BibTex.
 * Os bibTex estão em um documento. Um documento contém um ou mais BibTex.
 * Cada BibTex contém uma BibKey, uma categoria e uma série de atributos.
 * Estes atributos variam de acordo com a categoria do BibTex e de acordo com a
 * padronização. Para obtermos BibTex genéricos, os atributos de um BibTex foram
 * abstraídos como um mapa de String e BibTexElement.
 * 
 * @see BibTexElement
 * @author filipe
 */
public class BibTex {  
    private File sourceFile;
    private String category;
    private String bibKey;
    private HashMap<String, BibTexElement> attributes;
    
    /**
     * Construtor vazio para um BibTex.
     * 
     * @param   sourceFile  Arquivo no qual o BibTex está contido.
     */
    public BibTex(File sourceFile) {
        this.sourceFile = sourceFile;
        attributes = new HashMap<>();
    }
    
    /**
     * Retorna os atributos de um BibTex no formato de Map.
     * 
     * @return  Atributos do BibTex como Map<String, BibTexElement>
     */
    public Map<String, BibTexElement> getAttributes() {
        return attributes;
    }
    
    /**
     * Retorna a categoria do BibTex como uma string.
     * 
     * @return  A categoria do BibTex
     */
    public String getCategory() {
        return category;
    }

    /**
     * Retorna um File para o qual o BibTex está contido.
     * 
     * @return  O File no qual o BibTex está incluído.
     */
    public File getSourceFile() {
        return sourceFile;
    }
    
    /**
     * Retorna a BibKey de um BibTex em formato de string.
     * 
     * @return  BibKey do BibTex
     */
    public String getBibKey() {
        return bibKey;
    }
    
    /**
     * Insere uma nova entrada para um determinado atributo de um BibTex.
     * Para isto conta com uma String (chave) e um BibTexElement (value).
     * 
     * @param   key   Chave do atributo (String).
     * @param   value Valor do atributo (BibTexElement).
     */
    public void setAttribute(String key, BibTexElement value) {
        attributes.put(key, value);
    }
    
    /**
     * Altera a BibKey do BibTex.
     * 
     * @param   bibKey  Novo valor para a bibKey.
     */
    public void setBibKey(String bibKey) {
        this.bibKey = bibKey;
    }
    
    /**
     * Altera a categoria do BibTex.
     * 
     * @param   category    Novo valor da categoria do BibTex.
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
