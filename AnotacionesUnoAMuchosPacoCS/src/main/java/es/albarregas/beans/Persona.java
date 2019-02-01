/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

/**
 *
 * @author paco
 */
@Entity
@Table(name = "personas1aM")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long idPersona;

    @Column(name = "nombre", length = 20)
    private String nombre;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name="idDePersona")
    @OrderColumn (name = "orden")
    private List<Libro> libros = new ArrayList<Libro>();

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

}
