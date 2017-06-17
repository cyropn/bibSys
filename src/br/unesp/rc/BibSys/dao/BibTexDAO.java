package br.unesp.rc.BibSys.dao;

public interface BibTexDAO {
    
    public List<BibTex> read(String path);
    
    public boolean create(String bibTex);
    
    public boolean update(String bibTex);
    
}
