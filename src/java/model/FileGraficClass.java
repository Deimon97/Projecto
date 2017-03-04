/*
 * Class generathe the files grafic
 */
package model;

/**
 *
 * @author Kevin Casanova 
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
