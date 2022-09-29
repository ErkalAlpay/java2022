public class Main{

    public static void main(String[] args) {
        
        int a = 220;
        int b = 284;

        int kontrolcuA = 0;
        int kontrolcuB= 0;

        for (int i = 1; i < a; i++) {

            if(a%i == 0){
                kontrolcuB = kontrolcuB+i;
            }
            
            
        }

        for (int i = 1; i < b; i++) {
            if(b%i == 0){
                kontrolcuA = kontrolcuA+i;
            }
            
        }

        if(a==kontrolcuA & b == kontrolcuB){
            System.out.println("A ile B sayısı arkadaş sayılardır");
        }
        else System.out.println("Arkadaş sayı değildir");
        
    }
}