package io.github.vdubois.functional.apachecommons.transformers;

import io.github.vdubois.functional.apachecommons.common.Customer;
import io.github.vdubois.functional.apachecommons.common.CustomerDecorator;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;

import java.util.LinkedList;
import java.util.List;

/**
 * Exemple de transformation de liste
 *
 * @author Vincent Dubois
 */
public class TransformSample {

    public static void main(String[] args) {
        List<Customer> customers = new LinkedList<Customer>();
        customers.add(new Customer("Toto", 24, "Manchester"));
        customers.add(new Customer("Tata", 28, "London"));
        customers.add(new Customer("Titi", 15, "Liverpool"));
        List<Customer> transformedCustomers = (List<Customer>) CollectionUtils.collect(customers, new Transformer() {
            @Override
            public Object transform(Object input) {
                return new CustomerDecorator((Customer) input);
            }
        });
        System.out.println(transformedCustomers);
    }
}
