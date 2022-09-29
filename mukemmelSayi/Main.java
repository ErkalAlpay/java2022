public class Main{

    public static void main(String[] args) {
        
        int number = 6;
        int kontrolcu = 0;

        for (int i = 1; i < number; i++) {

            
            if(number%i == 0){
                kontrolcu = kontrolcu + i;
            }
            
        }

        if (kontrolcu == number) {System.out.println("Mükemmel Sayıdır");}
        else System.out.println("Mükemmel Sayı Değildir");
}
}