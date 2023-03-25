package evilnumber;
import java.util.*;
public class EvilNumber {

    int N;
    int num;
    int count;
    
    EvilNumber(){
        num = 0;
        count = 0;
    }
    
    void input(){
        System.out.println("Enter a positive number");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }
    
    void convert(){
        int N2 = N;
        int n3;
        while(N>0){
            n3 = N%2;
            num = num*10 + n3;
            N = N/2;
        }
        System.out.println("Binary equivalent: " + num);
    }
    
    void freq(){
        String str = Integer.toString(num);
        int len = str.length();
        for(int i = 0; i < len; i++){
            if('1' == str.charAt(i)){
                count++;
            }
        }
    }
    
    void display(){
        if(count % 2 == 0)
            System.out.println("Evil Number");
        else
            System.out.println("Not an Evil Number");
    }
    public static void main(String[] args) {
        EvilNumber ob = new EvilNumber();
        ob.input();
        ob.convert();
        ob.freq();
        ob.display();
    }
    
}
