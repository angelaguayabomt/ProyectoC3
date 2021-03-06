/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author angys
 */
@Entity
@Table(name="computer")
/**
 * Entidad Computer
 */
public class Computer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * Atributos ID
     */
    private Integer idComputer;
    /**
     * Atributos brand
     */
    private String brand;  
    /**
     * Atributos year
     */
    private Integer year; 
    /**
     * Atributos name
     */
    private String name;
    /**
     * Atributos description
     */
    private String description;
    /**
     * Relación entre computer y category
     */
    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties("category")
    private Category category;

    public Integer getIdComputer() {
        return idComputer;
    }

    public void setIdComputer(Integer idComputer) {
        this.idComputer = idComputer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
 
    
}



