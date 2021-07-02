/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Agani's Gaming PC
 */
import java.util.List;
import BLL.Customer;
public class CustomerRepository extends EntMngClass implements CustomerInterface {

    @Override
    public void create(Customer p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException(("Msg \n" + e.getMessage()));
        }
    }

    @Override
    public void edit(Customer p) throws CrudFormException {
      try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException(("Msg \n" + e.getMessage()));
       }
    }

    @Override
    public void delete(Customer p) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Customer.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" +e.getMessage());
        }
    }

    @Override
    public Customer findbyID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
