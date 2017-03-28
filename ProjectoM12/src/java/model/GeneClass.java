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
public class GeneClass {
    private int id;
    private String name;
    private  String gene_id;
    private String gene_symbol;
    private String description;
    private String organism;

    public GeneClass(int id, String name, String gene_id, String gene_symbol, String description, String organism) {
        this.id = id;
        this.name = name;
        this.gene_id = gene_id;
        this.gene_symbol = gene_symbol;
        this.description = description;
        this.organism = organism;
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

    public String getGene_id() {
        return gene_id;
    }

    public void setGene_id(String gene_id) {
        this.gene_id = gene_id;
    }

    public String getGene_symbol() {
        return gene_symbol;
    }

    public void setGene_symbol(String gene_symbol) {
        this.gene_symbol = gene_symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganism() {
        return organism;
    }

    public void setOrganism(String organism) {
        this.organism = organism;
    }
    
    
}
