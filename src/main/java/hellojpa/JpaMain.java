package hellojpa;

import hellojpa.domain.Member;
import hellojpa.domain.Order;
import hellojpa.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
//            Member member = new Member();
//
//            member.setId(1L);
//            member.setName("Lee");
//            em.persist(member);
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                            .getResultList();
//
//            for (Member member : result) {
//                System.out.println("member = " + member.getName());
//            }


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
