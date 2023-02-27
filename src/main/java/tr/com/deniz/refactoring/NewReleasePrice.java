package tr.com.deniz.refactoring;

public class NewReleasePrice extends Price {
    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
