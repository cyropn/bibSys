package br.unesp.rc.BibSys.beans;

import java.awt.List;
import java.net.URL;

/**
 * Esta classe é a abstração de um valor de uma chave para um BibTex. 
 * Os BibTex podem possuir diversos campos, dependendo de seu tipo. Estes
 * campos geralmente têm os seguintes valores: String, inteiros, lista de
 * strings ou um URL. Desta forma é possível salvar todas as chaves de um 
 * BibTex, mesmo sem conhecer quais as chaves ele possui.
 * 
 * @author filipe
 */
public class BibTexElement {
    /**
     * Possíveis tipos que um BibTexElement pode assumir
     */
    public enum ObjType {
        STRING,
        INTEGER,
        LIST,
        URL,
    }
    
    private final ObjType type;
    private final Object value;
    
    /**
     * Cria um BibTexElement a partir de uma String.
     * 
     * @param   s   String que determina o valor do BibTexElement.
     */
    public BibTexElement(String s) {
        value = s;
        type = ObjType.STRING;
    }
    
    /**
     * Cria um BibTexElement a partir de um Integer.
     * 
     * @param   i   Integer que determina o valor do BibTexElement.
     */
    public BibTexElement(Integer i) {
        value = i;
        type = ObjType.INTEGER;
    }
    
    /**
     * Cria um BibTexElement a partir de um Integer.
     * 
     * @param   i   Integer que determina o valor do BibTexElement.
     */
    public BibTexElement(List l) {
        value = l;
        type = ObjType.LIST;
    }
    
    /**
     * Cria um BibTexElement a partir de um URL.
     * 
     * @param   u   URL que determina o valor do BibTexElement.
     */
    public BibTexElement(URL u) {
        value = u;
        type = ObjType.URL;
    }
    
    /**
     * Retorna o tipo do BibTexElement.
     * 
     * @return  Tipo do BibTexElement
     */
    public ObjType getType() {
        return type;
    }
    
    /**
     * Retorna se o BibTexElement é uma String.
     * 
     * @return  True se o BibTexElement é uma String
     */
    public boolean isString() {
        return type == ObjType.STRING;
    }
    
    /**
     * Retorna se o BibTexElement é um Integer.
     * 
     * @return  True se o BibTexElement é um inteiro.
     */
    public boolean isInteger() {
        return type == ObjType.INTEGER;
    }
    
    /**
     * Retorna se o BibTexElement é uma lista.
     * 
     * @return  True se o BibTexElement é uma lista.
     */
    public boolean isList() {
        return type == ObjType.LIST;
    }
    
    /**
     * Retorna se o BibTexElement é um URL.
     * 
     * @return  True se o BibTexElement é um URL.
     */
    public boolean isURL() {
        return type == ObjType.URL;
    }
    
    /**
     * Retorna o valor do BibTexElement.
     * 
     * @return   O objeto referente ao valor deste BibTexElement.
     *           Pode ser List, Integer, URL ou String.
     */
    public Object getValue() {
        return value;
    }
}
