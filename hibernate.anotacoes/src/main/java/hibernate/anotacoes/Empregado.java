package hibernate.anotacoes;

import javax.persistence.*;

@Entity
@Table (name = "empregados")
public class Empregado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_empregado")
	private int id;
	private String nome;
	
	@ManyToOne
	@JoinColumn (name = "id_empresa")
	private Empresa empresa;
	
	public Empresa getEmpresa(){
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa){
		this.empresa = empresa;
	}
	
	public int getEmpregadoId(){
		return id;
	}
	
	
}
