package Beans;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class VideoGameDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("videoGameMVC");
	
	public void insertGame(VideoGame gameToAdd){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(gameToAdd);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<VideoGame> getAllGames() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select g from VideoGame g";
		TypedQuery<VideoGame> typedQuery = em.createQuery(q, VideoGame.class);
		List<VideoGame> all = typedQuery.getResultList();
		return all;
	}
}
