public abstract class Products {
    private double price;
    private int stockQuantity;
    private int soldQuantity;
    private int counter;
    public Products(double price, int quantity){
        this.price = price;
        stockQuantity = quantity;
        counter = -1;
    }
    public double sellUnits(int amount){
        if(amount>stockQuantity){
            return 0;
        }
        else {
            stockQuantity -= amount;
            soldQuantity += amount;
            return amount * price;
        }

    }

    public double getPrice(){
        return price;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
    public int getSoldQuantity(){
        return soldQuantity;
    }
}
