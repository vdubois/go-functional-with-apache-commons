package io.github.vdubois.functional.apachecommons.predicates;

import io.github.vdubois.functional.apachecommons.common.Customer;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.PredicateUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Exemple de test d'existence d'un élément par prédicat
 *
 * @author Vincent Dubois
 */
public class ExistsSample {

    public static void main(String[] args) {
        List<Customer> customers = new LinkedList<Customer>();
        customers.add(new Customer("Toto", 24, "Manchester"));
        customers.add(new Customer("Tata", 28, "London"));
        customers.add(new Customer("Titi", 15, "Liverpool"));
        System.out.println(CollectionUtils.exists(customers, PredicateUtils.notPredicate(new Predicate() {
            public boolean evaluate(Object object) {
                return ((Customer) object).getAge() > 28;
            }
        })));
    }
}
