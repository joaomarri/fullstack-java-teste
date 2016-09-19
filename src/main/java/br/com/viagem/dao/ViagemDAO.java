package br.com.viagem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.viagem.model.Viagem;

/**
 * Classe padrao DAO para a peristencia dos dados das viagens
 * @author joaopaulo
 *
 */
@Repository
public class ViagemDAO {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void persistViagens(List<Viagem> viagens) {
		Session session = getCurrentSession();
		for (Viagem viagem : viagens) {
			session.saveOrUpdate(viagem);
		}
	}

}
