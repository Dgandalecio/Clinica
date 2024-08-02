/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

/**
 *
 * @author diogo
 */
public class Medicos extends Funcionarios {
    
    private String CRM;
    private String horarioi;
    private String horariof;
    private String planos;
    private String especialidade;
    
    
    public Medicos(String nome, String telefone, String endereço, String cpf, double salario, String CRM, String horarioi, String horariof,String planos, String especialidade) {
        super(nome, telefone, endereço, cpf, salario);
        this.CRM = CRM;
        this.horariof = horariof;
        this.planos = planos;
       this.especialidade = especialidade;
        
    }

    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the horarioi
     */
    public String getHorarioi() {
        return horarioi;
    }

    /**
     * @param horarioi the horarioi to set
     */
    public void setHorarioi(String horarioi) {
        this.horarioi = horarioi;
    }

    /**
     * @return the horariof
     */
    public String getHorariof() {
        return horariof;
    }

    /**
     * @param horariof the horariof to set
     */
    public void setHorariof(String horariof) {
        this.horariof = horariof;
    }

    /**
     * @return the planos
     */
    public String getPlanos() {
        return planos;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
}
