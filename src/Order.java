public class Order {
    private int productId;
    private String productName;
    private int productQuantity;

    Order(int productId, String productName, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    @Override
    public boolean equals(Object o) {
        Order ord = (Order) o;
        return this.productId == ord.productId;
    }

    @Override
    public int hashCode() {
        return this.productId;
    }
    public String toString() {
        return "{ID=" + productId + "} " + productName + "  " + productQuantity+" sztuk";
    }


}
