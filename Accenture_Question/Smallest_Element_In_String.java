package Accenture_Question;

public class Smallest_Element_In_String {
    public static void main(String[] args) {
        String s = "fbn";
    
        smallestElement(s);

    }
    static void smallestElement(String s){
        char a[] = s.toCharArray();
        int min = a[0];
        for(int i =0;i<a.length;i++){
            if(min>=a[i]){
                min = a[i];

            }
           
        }
         System.out.println(Character.toString(min));
    }
}
