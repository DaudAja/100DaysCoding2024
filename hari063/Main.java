package hari063;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        
        while(i <= 10){
            if(i % 3 == 0 ){
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
    }
}
