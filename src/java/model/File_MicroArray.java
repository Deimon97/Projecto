/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author projecto
 */
public class File_MicroArray {
    private String name;
    private int size;
    private String author;
    private  String contentFasta;
    private int id;

    public File_MicroArray(String name, int size, String author, String contentFasta, int id) {
        this.name = name;
        this.size = size;
        this.author = author;
        this.contentFasta = contentFasta;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
