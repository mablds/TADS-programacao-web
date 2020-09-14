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
public class Educacao {
    private String instituicao;
    private String periodo;
    private String curso;
    private String descricao;

    public Educacao(String instituicao, String periodo, String curso, String descricao) {
        this.instituicao = instituicao;
        this.periodo = periodo;
        this.curso = curso;
        this.descricao = descricao;
    }

    public Educacao() {
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
