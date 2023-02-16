public class PC extends Products{
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;

    public PC(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage){
        super(price,quantity);
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.ssd = ssd;
        this.storage = storage;
    }

    public double getCpuSpeed(){
        return cpuSpeed;
    }
    public int getRam(){
        return ram;
    }
    public boolean getSsd(){
        return ssd;
    }
    public int getStorage(){
        return storage;
    }
}
