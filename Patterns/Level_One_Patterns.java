package Patterns;

public class Level_One_Patterns {
    public static void main(String[] args) {
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
           int k =1;
          for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

         for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // print patterns in reverse order

          for(int i = 1 ; i<=5 ; i++){
            for(int j = 5 ; j>=i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

          for(int i = 5 ; i>=1; i--){
            for(int j = 5 ; j>=i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
