package io.github.vdubois.functional.apachecommons.predicates;

import io.github.vdubois.functional.apachecommons.common.Customer;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import java.util.LinkedList;
import java.util.List;

/**
 * Exemple de recherche d'un premier élément de liste correspondant à un prédicat
 *
 * @author Vincent Dubois
 */
public class FindFirstSample {

    public static void main(String[] args) {
        List<Customer> customers = new LinkedList<Customer>();
        customers.add(new Customer("Toto", 24, "Manchester"));
        customers.add(new Customer("Tata", 28, "London"));
        customers.add(new Customer("Titi", 15, "Liverpool"));
        Customer firstMajorCustomer = (Customer) CollectionUtils.find(customers, new Predicate() {
            public boolean evaluate(Object object) {
                return ((Customer) object).getAge() > 18;
            }
        });
        System.out.println(firstMajorCustomer);
    }
}
