package com.mycompany.maratonajsf.model;

import java.io.Serializable;

import javax.inject.Named;

import com.mycompany.maratonajsf.model.enums.Turno;

@Named
public class Estudante implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String nome = "Leonardo";
	
	private String sobrenome = "Vilasboas";
	
	private double nota1 = 20;
	
	private double nota2;
	
	private double nota3;
	
	private Turno turno = Turno.MATUTINO;
	
	public Turno getTurno() {
		return turno;
	}
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
}
