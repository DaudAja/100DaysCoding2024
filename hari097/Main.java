package hari097;

public class Main {
    public static boolean adalahPrima(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void cetakPrima(int n) {
        for (int i = 2; i <= n; i++) {
            if(adalahPrima(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 10;
        cetakPrima(n);
    }
}
