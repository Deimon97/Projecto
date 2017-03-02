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
public class FileGraficClass {
    private int idFileMicroArray;
    private int idGrafic;
    private String nameFileMicroArray;

    public FileGraficClass(int idFileMicroArray, int idGrafic, String nameFileMicroArray) {
        this.idFileMicroArray = idFileMicroArray;
        this.idGrafic = idGrafic;
        this.nameFileMicroArray = nameFileMicroArray;
    }

    public int getIdFileMicroArray() {
        return idFileMicroArray;
    }

    public void setIdFileMicroArray(int idFileMicroArray) {
        this.idFileMicroArray = idFileMicroArray;
    }

    public int getIdGrafic() {
        return idGrafic;
    }

    public void setIdGrafic(int idGrafic) {
        this.idGrafic = idGrafic;
    }

    public String getNameFileMicroArray() {
        return nameFileMicroArray;
    }

    public void setNameFileMicroArray(String nameFileMicroArray) {
        this.nameFileMicroArray = nameFileMicroArray;
    }
    
    
}
