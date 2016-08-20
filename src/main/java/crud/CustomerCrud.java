package crud;

import entities.CustomersEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hovercat on 12.08.16.
 */
public class CustomerCrud {

    public static Integer addCustomer(CustomersEntity customer) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer custNum = null;

        try {
            tx = session.beginTransaction();
            custNum = (Integer) session.save(customer);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return custNum;
    }

    public static void updateCustomer(CustomersEntity customer) {

        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(customer);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

    }

    public static void deleteCustomer(int custNum) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            CustomersEntity cust = (CustomersEntity) session.load(CustomersEntity.class, custNum);
            session.delete(cust);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }


    public static List<CustomersEntity> getAllCust() {
        List<CustomersEntity> cust = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            cust = session.createQuery("from CustomersEntity").list();
            for (CustomersEntity entity : cust) {
                System.out.println(entity.getCompany());
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return cust;
    }


    public static CustomersEntity getCustById(int custNum) {
        CustomersEntity cust = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from CustomersEntity where custNum = :custNum";
            Query query = session.createQuery(queryString);
            query.setInteger("custNum", custNum);
            cust = (CustomersEntity) query.uniqueResult();
            System.out.println(cust.getCompany());
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return cust;
    }
}