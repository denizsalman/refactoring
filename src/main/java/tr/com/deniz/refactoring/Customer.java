package tr.com.deniz.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String statements() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();

            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
            totalAmount += rental.getCharge();
        }

        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";

        return result;
    }
}
