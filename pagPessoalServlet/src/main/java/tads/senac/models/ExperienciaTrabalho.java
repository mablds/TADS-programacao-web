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
public class ExperienciaTrabalho {
    private String cargo;
    private String empresa;
    private String periodo;
    private String descricaoTrabalho;

    public ExperienciaTrabalho(String cargo, String empresa, String periodo, String descricaoTrabalho) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.periodo = periodo;
        this.descricaoTrabalho = descricaoTrabalho;
    }

    public ExperienciaTrabalho() {
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescricaoTrabalho() {
        return descricaoTrabalho;
    }

    public void setDescricaoTrabalho(String descricaoTrabalho) {
        this.descricaoTrabalho = descricaoTrabalho;
    }
    
    
}
