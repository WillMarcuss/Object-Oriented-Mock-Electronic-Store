public class Laptop extends PC{
    private double screenSize;
    public Laptop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage, double screenSize){
        super(price,quantity,cpuSpeed,ram,ssd,storage);
        this.screenSize = screenSize;
    }

    public String toString(){
        if(getSsd() == true) {
           return ". "+screenSize+" inch Laptop PC with "+getCpuSpeed()+"ghz CPU, "+getRam()+" RAM, "+getStorage()+"GB SSD drive";
        }
        return ". "+screenSize+" inch Laptop PC with "+getCpuSpeed()+"ghz CPU, "+getRam()+" RAM, "+getStorage()+"GB HDD drive";
    }


}
