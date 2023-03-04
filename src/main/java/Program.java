import skywayentity.Skyway;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class Program {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Skyway stroke = new Skyway();
            //stroke.setRound(2);//
            stroke.setHole1(4);
            stroke.setHole2(4);
            stroke.setHole3(4);
            stroke.setHole4(4);
            stroke.setHole5(5);
            stroke.setHole6(3);
            stroke.setHole7(5);
            stroke.setHole8(3);
            stroke.setHole9(4);
            entityManager.persist(stroke);

            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }


}
