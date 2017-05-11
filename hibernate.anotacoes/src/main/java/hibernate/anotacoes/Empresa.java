package hibernate.anotacoes;

import java.util.List;

import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;



public class Empresa {
	
	@Id
	@Column(name = "id_empresa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String nome;
	
	@OneToMany(mappedBy = "empresa")
	private List<Empregado> empregados;
	
	public int getEmpresaId(){
		return id;
	}
	private void setEmpresaId (int empresaId){
		this.id = empresaId;
	}
	public String getNome(){
		return nome;
	}
	
	
	
	
	
	
}
