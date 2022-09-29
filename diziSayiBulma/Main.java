public class Main{

    public static void main(String[] args) {
        
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8};

        int aranacak = 5;
        int kontrolcu = 0;

        for (int i = 0; i < sayilar.length; i++) {


            
            if(aranacak == sayilar[i]){
                kontrolcu++;
            }            
        }
        if(kontrolcu>0){
            System.out.println("Bu sayı dizide vardır");
        }
        else System.out.println("Bu sayı dizide yoktur");
    }
}