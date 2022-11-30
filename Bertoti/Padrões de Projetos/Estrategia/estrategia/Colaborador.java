package br.jose.santos.estrategia;

import br.jose.santos.estrategia.Bonificacao;

public class Colaborador {
	
   private String nome;
   private double salario;
   private Premio premio; //composi��o
   
   
   
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public Premio getPremio() {
	return premio;
}
public void setPremio(Premio premio) {
	this.premio = premio;
}

}
