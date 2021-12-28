package ImperativeFunctions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        //regular way:
        greetCustomer(new Customer("Maria", "9999"));

        //using consumer functional interface:
        greetCustomerConsumer.accept(new Customer("Maria", "9999"));

        //using biconsumer functional interface:

        greetCustomerV2.accept(new Customer("Maria", "9999"), false);
    }

    static Consumer<Customer> greetCustomerConsumer = c -> {
        System.out.println("Hello"+c.customerName+"Thank you for registering your phone:"+c.customerPhoneNumber);
    };

    static void greetCustomer(Customer c){
        System.out.println("Hello"+c.customerName+"Thank you for registering your phone:"+c.customerPhoneNumber);
    }

    static BiConsumer<Customer, Boolean> greetCustomerV2 = (c, showPhoneNumber) ->{
        System.out.println("Hello"+c.customerName+"Thank you for registering your phone:"
                +(showPhoneNumber ? c.customerPhoneNumber : "********"));
    };

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
