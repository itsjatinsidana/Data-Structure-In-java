package Array_Examples;

public class Superior_Array {
    public static void main(String[] args) {
      //  int a[] ={2,1,8,4,7,4,2,4,2,1};
      int a[] = {7,9,5,2,8,7};
        int i ;
        int count =0;
        for(i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                count ++;
            }
        }
        System.out.println(count);

    }
}
