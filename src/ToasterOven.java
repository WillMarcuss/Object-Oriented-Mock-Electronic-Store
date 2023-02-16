public class ToasterOven extends Appliance{
    private boolean convection;
    public ToasterOven(double price, int quantity,int wattage, String color,String brand,boolean convection){
        super(price,quantity, wattage, color, brand);
        this.convection= convection;
    }

    public String toString(){
        if(convection == true){
            return ". "+getBrand()+" Toaster with convection ("+getColor()+", "+getWattage()+" watts) ("+getPrice()+" dollars each, "+getStockQuantity()+" in stock, "+getSoldQuantity()+" sold)";
        }
        return ". "+getBrand()+" Toaster ("+getColor()+", "+getWattage()+" watts) ("+getPrice()+" dollars each, "+getStockQuantity()+" in stock, "+getSoldQuantity()+" sold)";

    }
}
