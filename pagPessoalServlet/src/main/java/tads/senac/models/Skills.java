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
public class Skills {
    private String titulo;
    private String skills;

    public Skills(String titulo, String skills) {
        this.titulo = titulo;
        this.skills = skills;
    }

    public Skills() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
    
    
}
