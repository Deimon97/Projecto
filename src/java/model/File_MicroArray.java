/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kevin Casanova
 */
public class File_MicroArray extends Files {
    private int size;
    private String author;
    private  String contentFasta;

    public File_MicroArray(int id, String name, String type, int size, String author, String contentFasta) {
        super(id, name, type);
        this.size=size;
        this.author=author;
        this.contentFasta=contentFasta;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContentFasta() {
        return contentFasta;
    }

    public void setContentFasta(String contentFasta) {
        this.contentFasta = contentFasta;
    }

    
    
    
    /**
     * Validate the file is format correct
     * @param rute
     * @return 
     */
    public boolean ValidationFile(String rute){
        return true;
    }
    
    /**
     * Tractament the file
     * @param file
     * @return 
     */
    public File_MicroArray tractament (File_MicroArray file){
        return file;
    }
}
