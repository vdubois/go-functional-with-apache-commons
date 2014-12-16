package io.github.vdubois.functional.apachecommons.common;

/**
 * Décorateur de la classe customer
 *
 * @author Vincent Dubois
 */
public class CustomerDecorator extends Customer {

    private Customer customer;
    
    public CustomerDecorator(Customer customer) {
        super(customer.getName(), customer.getAge(), customer.getCity());
        this.customer = customer;
    }
    
    public CustomerDecorator(String name, Integer age, String city) {
        super(name, age, city);
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Integer getAge() {
        return customer.getAge();
    }

    @Override
    public String getCity() {
        return customer.getCity();
    }

    @Override
    public void setName(String name) {
        customer.setName(name);
    }

    @Override
    public void setAge(Integer age) {
        customer.setAge(age);
    }

    @Override
    public void setCity(String city) {
        customer.setCity(city);
    }

    public boolean isMajor() {
        return customer.getAge() > 18;
    }

    @Override
    public String toString() {
        return "Mon beau d\u00e9corateur : estMajeur = " + isMajor() + 
                ", CustomerDecorator{" +
                "customer=" + customer +
                '}';
    }
}
