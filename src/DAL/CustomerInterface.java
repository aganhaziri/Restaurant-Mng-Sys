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
public interface CustomerInterface {
    void create(Customer p)throws CrudFormException;
    void edit(Customer p) throws CrudFormException;
    void delete(Customer p) throws CrudFormException;
    List <Customer> findAll()throws CrudFormException;
    Customer findbyID(Integer ID) throws CrudFormException;
}
