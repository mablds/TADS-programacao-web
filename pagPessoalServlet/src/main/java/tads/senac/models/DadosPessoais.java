/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tads.senac.models;

import java.time.LocalDate;


/**
 *
 * @author Marcelo
 */
public class DadosPessoais {
    private String nome;
    private String img;
    private String email;
    private String cargo;
    private String telefone;
    private LocalDate dataNascto;
    private String github;
    private String sourcerer;
    private String linkedin;

    public DadosPessoais() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImg() {
        return img;
    }
    
    public void setImg(String img) {
        this.img = img;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataNascto() {
        return dataNascto;
    }

    public void setDataNascto(LocalDate dataNascto) {
        this.dataNascto = dataNascto;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getSourcerer() {
        return sourcerer;
    }

    public void setSourcerer(String sourcerer) {
        this.sourcerer = sourcerer;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
