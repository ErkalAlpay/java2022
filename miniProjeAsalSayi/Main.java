public class Main {
    
    public static void main(String[] args) {
        
        int a = 27;
        

        int kontrolcu = 0;
        
        for (int i = 2; i < a; i++) {

            
            int b = a%i;
            if(b == 0){
               System.out.println("Sayı Asal Değildir");
               kontrolcu++;
               break;
            }
            
           }
           if(kontrolcu == 0){System.out.println("Sayı Asaldır");}

    }
}
