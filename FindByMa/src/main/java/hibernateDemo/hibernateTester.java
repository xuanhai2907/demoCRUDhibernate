
package hibernateDemo;

import java.util.List;
import models.MonHoc;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author window
 */
public class hibernateTester {
    public static void main(String[] args) {
        //select all 
//        Session session = HibernateUtils.getFACTORY().openSession();
//        Query query = session.createQuery("From MonHoc ");// truy vấn trên entity(HQL)
//        List<MonHoc> list = query.getResultList();
//        list.forEach(c -> System.out.printf("%d - %s\n", c.getMaMon(), c.getTenMon()));
//        
        //thêm
//        MonHoc mh = new MonHoc();
//        mh.setTenMon("Lap trinh java 3");
//
//        Transaction transaction = null;
//        try (Session session = HibernateUtils.getFACTORY().openSession()) {
//            transaction = session.beginTransaction();
//            session.save(mh);
//            transaction.commit();
//        } catch (Exception e) {
//        }

        //sửa
//        Transaction transaction = null;
//        try (Session session = HibernateUtils.getFACTORY().openSession()) {
//            transaction = session.beginTransaction();
//            MonHoc mh = new MonHoc(5, "hi");
//            session.saveOrUpdate(mh);
//            transaction.commit();
//        }

        //xóa
//        MonHoc mh = new MonHoc();
//        mh.setMaMon(5);
//        Transaction transaction = null;
//        try (Session session = HibernateUtils.getFACTORY().openSession()) {
//            transaction = session.beginTransaction();
//            session.delete(mh);
//            transaction.commit();
//        }
          //getById
        MonHoc m = new MonHoc();
        try (Session session = HibernateUtils.getFACTORY().openSession()) {
            m = session.get(MonHoc.class, 1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(m + "");
    }
}
