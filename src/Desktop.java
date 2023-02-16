public class Desktop extends PC{
    private String profile;

    public Desktop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage, String profile){
        super(price, quantity, cpuSpeed,  ram,  ssd,  storage);
        this.profile = profile;
    }

    public String toString(){
        if(getSsd() == true) {
            return ". "+profile+" Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB SSD drive. ("+getPrice()+" dollars each, "+getStockQuantity()+" in stock, "+getSoldQuantity()+" sold)";
        }
        return ". "+profile+" Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB HDD drive. ("+getPrice()+" dollars each, "+getStockQuantity()+" in stock, "+getSoldQuantity()+" sold)";

    }
}
