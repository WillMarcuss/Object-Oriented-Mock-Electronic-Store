public class Fridge extends Appliance{
    private boolean hasFreezer;
    public Fridge(double price, int quantity,int wattage, String color,String brand,boolean hasFreezer){
        super(price,quantity, wattage, color, brand);
        this.hasFreezer = hasFreezer;

    }
    public String toString(){
        if (hasFreezer == true){
            return ". "+getBrand()+" Fridge with Freezer ("+getColor()+", "+getWattage()+" watts) ("+getPrice()+" dollars each, "+getStockQuantity()+" in stock, "+getSoldQuantity()+" sold)";
        }
        return ". "+getBrand()+" Fridge ("+getColor()+", "+getWattage()+" watts) ("+getPrice()+" dollars each, "+getStockQuantity()+" in stock, "+getSoldQuantity()+" sold)";

    }
}
