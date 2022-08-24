
package repositories;

import java.util.List;
import models.MonHoc;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MonHocRepository {
    private final SessionFactory session = HibernateUtils.getFACTORY();
    
    public List<MonHoc> getAll(){
        try {
            Session session1 = HibernateUtils.getFACTORY().openSession();
            Query query = session1.createQuery("From MonHoc");// truy vấn trên entity(HQL)
            List<MonHoc> list = query.getResultList();
            return list;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    public MonHoc findByMa(int maMon){
        MonHoc m = new MonHoc();
        try (Session session = HibernateUtils.getFACTORY().openSession()) {
            m = session.get(MonHoc.class, maMon);
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
        return  m;
    }
    public boolean delete(MonHoc mon){
            Transaction transaction = null;
        try (Session session = HibernateUtils.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(mon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            session.getCurrentSession().getTransaction().rollback();
            return false;
            
        }
    }
    public boolean save(MonHoc mon){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(mon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }
    public boolean update(MonHoc mon){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(mon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }
}
