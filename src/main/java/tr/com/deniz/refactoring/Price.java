package tr.com.deniz.refactoring;

public abstract class Price {
    abstract double getCharge(int daysRented);
    abstract int getPriceCode();

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
