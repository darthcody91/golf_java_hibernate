import skywayentity.Skyway;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        //Add scanner to get a user input of the strokes//
        Scanner userInput = new Scanner(System.in);

            System.out.println("Hole 1: ");
            int userHole1 = userInput.nextInt();
            System.out.println("Hole 2: ");
            int userHole2 = userInput.nextInt();
            System.out.println("Hole 3: ");
            int userHole3 = userInput.nextInt();
            System.out.println("Hole 4: ");
            int userHole4 = userInput.nextInt();
            System.out.println("Hole 5: ");
            int userHole5 = userInput.nextInt();
            System.out.println("Hole 6: ");
            int userHole6 = userInput.nextInt();
            System.out.println("Hole 7: ");
            int userHole7 = userInput.nextInt();
            System.out.println("Hole 8: ");
            int userHole8 = userInput.nextInt();
            System.out.println("Hole 9: ");
            int userHole9 = userInput.nextInt();



        try {
            transaction.begin();

            Skyway stroke = new Skyway();
            //stroke.setRound(2);//
            stroke.setHole1(userHole1);
            stroke.setHole2(userHole2);
            stroke.setHole3(userHole3);
            stroke.setHole4(userHole4);
            stroke.setHole5(userHole5);
            stroke.setHole6(userHole6);
            stroke.setHole7(userHole7);
            stroke.setHole8(userHole8);
            stroke.setHole9(userHole9);
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
