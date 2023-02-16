import java.util.Scanner;

public class ElectronicStore {
    private final int MAX_PRODUCTS = 10;
    private String name;
    private double revenue;
    private  int i;
    private Products[] products;
    private int UC;

    public ElectronicStore(String name){
        this.name = name;
        revenue = 0;
        products = new Products[MAX_PRODUCTS];
        i = 0;
        UC = -1;
    }
    public String getName(){
        return name;
    }

    public boolean addProduct(Products p){
       if(i != MAX_PRODUCTS){
           products[i] = p;
           i++;
           return true;
       }
       return false;
    }

    public boolean sellProducts(){
        printStock();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of product: ");
        int userChoice = sc.nextInt();
        System.out.println("Enter Quantity: ");
        int Quantity = sc.nextInt();

        return sellProducts(userChoice,Quantity);
    }
    private boolean isValid(int product, int quantity, Products[] arr){
        if(product>=0 && product <10){
            return quantity > 0;
        }
        return false;
    }
    boolean sellProducts(int item, int amount){
        if(isValid(item,amount, products)){
            if(products[item] != null){
                revenue += products[item].sellUnits(amount);
                return true;
            }
        }
        return false;
    }
    public double getRevenue(){
        return revenue;
    }
    public void printStock(){
        for (int j = 0; j<products.length;j++){
            if (products[j] != null) {
                System.out.println(j+""+products[j]);
            }
        }
    }





}
