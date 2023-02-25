package tr.com.deniz.refactoring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void statements() {
        Customer customer = new Customer("deniz");
        Rental rental1 = new Rental(new Movie("Romantic", Movie.NEW_RELEASE), 10);
        Rental rental2 = new Rental(new Movie("Red Kid", Movie.CHILDREN), 13);
        Rental rental3 = new Rental(new Movie("Inception", Movie.REGULAR), 5);
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        assertEquals(customer.statements(), "Record for deniz\n" +
                "\tRomantic\t30.0\n" +
                "\tRed Kid\t16.5\n" +
                "\tInception\t6.5\n" +
                "Amount owed is 53.0\n" +
                "You earned 4 frequent renter points");
    }
}