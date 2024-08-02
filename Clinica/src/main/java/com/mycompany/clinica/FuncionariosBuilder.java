/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;


public class FuncionariosBuilder {

    private String nome;
    private String telefone;
    private String endereço;
    private String cpf;
    private double salario;

    public FuncionariosBuilder() {
    }

    public FuncionariosBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public FuncionariosBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public FuncionariosBuilder setEndereço(String endereço) {
        this.endereço = endereço;
        return this;
    }

    public FuncionariosBuilder setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public FuncionariosBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    public Funcionarios createFuncionarios() {
        return new Funcionarios(nome, telefone, endereço, cpf, salario);
    }
    
}
