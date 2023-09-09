package Accenture_Question;

public class Smallest_Element_Array {
    public static void main(String[] args) {
        int a[] = {5,10,20,2,6,1};
    
        smallestElement(a);

    }
    static void smallestElement(int a[]){
        int i;
        int min = a[0];
        for(i=0;i<a.length;i++){
            if(min>=a[i]){
min = a[i];
            }
            
        }
        System.out.println("mininmum element in array is " + min);
    }
}
