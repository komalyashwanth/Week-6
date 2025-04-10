
class vehicle{
    String company;
    String model;
    String fuel;
    int capacity;
    void displayInfo(String company,String model,String fuel,int capacity){
        System.out.println("The details of vehicle: ");
        this.company=company;
        this.model=model;
        this.fuel=fuel;
        this.capacity=capacity;
    }
}

class car extends vehicle{
    
    void displayInfo(String company,String model,String fuel,int capacity){
        System.out.println("Company: "+company);
        System.out.println("Model: "+model);
        System.out.println("Fuel: "+fuel);
        System.out.println("Capacity: "+capacity);
    }
}
class poly1{
    public static void main(String[] args){
        car car1=new car();
        car1.displayInfo("Audi","Model","Diesel",4);
    }
}
