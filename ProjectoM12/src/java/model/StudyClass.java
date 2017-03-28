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
public class StudyClass {
    private int id;
    private String name;
    private String file_id;
    private String file_name;

    public StudyClass(int id, String name, String file_id, String file_name) {
        this.id = id;
        this.name = name;
        this.file_id = file_id;
        this.file_name = file_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
    
    
}
