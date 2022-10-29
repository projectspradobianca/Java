package com.senac.loja;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Pessoa implements Colaborador {
    private String matricula;
    private double salario;

    List<NotaFiscal> notaFiscals = new ArrayList<>();

    public Vendedor(String cpf, String email, String nome, String matricula, double salario){
        super(cpf,email,nome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void adicionaVenda(NotaFiscal notaFiscal){
        this.notaFiscals.add(notaFiscal);
    }

    public double totalVendas(){
      return this.notaFiscals.stream().map(p-> p.getValorTotal()).reduce(0.0,Double::sum);
    }

    @Override
    public double calcularSalario() {
        return this.salario + this.totalVendas() * 0.05;
    }
}
