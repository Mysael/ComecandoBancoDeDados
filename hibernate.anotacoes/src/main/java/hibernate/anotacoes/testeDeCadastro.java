package hibernate.anotacoes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class testeDeCadastro {
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction().begin();
	
	Empresa empresa = new Empresa();
	empresa.setNome("FACISA");
	
	session.save(empresa);
	
	Empregado empregadoA =new Empregado();
	empregadoA.setNome("Adriano Santos");
	empregado.setEmpresa(empresa);
	
	Empregado empregadoB = new Empregado();
	empregadoB.setNome("Hamurabi Medeiros");
	empregadoB.setEmpresa(empresa);
	
	session.save(empregadoA);
	session.save(empregadoB);
	
	session.beginTrasaction().commit();
	session.close();
	
	
	
}
