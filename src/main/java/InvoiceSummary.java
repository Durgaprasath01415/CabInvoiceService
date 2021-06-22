public class InvoiceSummary {
    private final int numberOfRides;
    private final double totalFare;
    private final double avgFare;

    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare/this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgFare, avgFare) == 0;
    }

    @Override
    public String toString() {
        return "InvoiceSummary{" +
                "numOfRides=" + numberOfRides +
                ", totalFare=" + totalFare +
                ", avgFare=" + avgFare +
                '}';
    }
}