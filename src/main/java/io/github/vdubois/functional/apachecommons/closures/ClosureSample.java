package io.github.vdubois.functional.apachecommons.closures;

import io.github.vdubois.functional.apachecommons.common.Customer;
import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Exemple de fonction fermée qui modifié l'état d'un objet
 *
 * @author Vincent Dubois
 */
public class ClosureSample {

    public static void main(String[] args) {
        List<Customer> customers = new LinkedList<Customer>();
        customers.add(new Customer("Toto", 24, "Manchester"));
        customers.add(new Customer("Tata", 28, "London"));
        customers.add(new Customer("Titi", 15, "Liverpool"));
        CollectionUtils.forAllDo(customers, new Closure() {
            @Override
            public void execute(Object input) {
                Customer customer = (Customer) input;
                customer.setCity("Pessac");
            }
        });
        System.out.println(customers);
    }
}
