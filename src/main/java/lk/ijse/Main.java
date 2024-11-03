package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

    /*    Customer customer = new Customer();
        customer.setName("Jack");
        customer.setAddress("colombo");*/

/*Manage State
        session.save(customer);*/

  /*  database state
        Customer customer = session.get(Customer.class, 1);
        customer.setName("Vishan");
*/



        /*
        detach state
        Customer customer = session.get(Customer.class, 1);
        session.detach(customer);
        customer.setName("Chathu");
*/


        /*
        detach eke thina ek manager state(merge) ekt genalla save kra(meken updtae wenne real obj eke nemei clone ekak)
        Customer customer = session.get(Customer.class, 1);
        session.detach(customer);
        session.merge(customer);
        customer.setName("Chathu");
        */




   /*
    detach ek update un real obj eke
    Customer customer = session.get(Customer.class, 1);
        session.detach(customer);
        session.update(customer);
        customer.setName("Chathu");
*/

        Customer customer1 = session.get(Customer.class, 1);
        System.out.println(customer1);


        Customer customer2 = session.get(Customer.class, 1);
        System.out.println(customer2);

        transaction.commit();
        session.close();
        }
    }
