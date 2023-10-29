package Other_important_question;



public class Vehicle {
    int car;
    int bike;
    int truck;
    int revenue;

    public Vehicle(int car, int bike, int truck) {
        this.car = car;
        this.bike = bike;
        this.truck = truck;
    }
    
    int calc(){
        revenue = 100*bike+250*car+500*truck;
        return revenue;
    }
    
    int maxRevenue(int a[]){
        java.util.Arrays.sort(a);
        return a[a.length-1];
    }
    
    public static void main(String[] args) {
        int a[] =new int[4];
        Vehicle v1 = new Vehicle(17, 26, 38);
        int first = v1.calc();
        a[0] = first;
        
        Vehicle v2 = new Vehicle(12, 222, 35);
        int second = v2.calc();
        a[1] = second;
        
        Vehicle v3 = new Vehicle(13, 24, 33);
        int third = v3.calc();
        a[2] = third;
        
        System.out.println("Max revenue is:"+v3.maxRevenue(a));
        
    }
}





