/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tads.senac.models;

/**
 *
 * @author Marcelo
 */
public class Idioma {
    private String idioma;
    private String nivel;

    public Idioma(String idioma, String nivel) {
        this.idioma = idioma;
        this.nivel = nivel;
    }

    public Idioma() {
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
