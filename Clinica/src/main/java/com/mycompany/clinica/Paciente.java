/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

/**
 *
 * @author diogo
 */
public class Paciente{
    private String nome;
private String telefone;
private String endereço;
private String cpf;
private String nascimento;
private String profissão;

 public Paciente( String nome,String telefone,String endereço, String cpf, String nascimento, String profissão){
     
      this.nome = nome;
    this. telefone = telefone;
    this.endereço = endereço;
    this.cpf = cpf;
    this.nascimento = nascimento;
    this.profissão = profissão;
 }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereço
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the profissão
     */
    public String getProfissão() {
        return profissão;
    }

    /**
     * @param profissão the profissão to set
     */
    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }
    
    
}
