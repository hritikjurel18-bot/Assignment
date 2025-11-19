import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int e=0,o=0;
        for(int i=0;i<5;i++){
            int x=sc.nextInt();
            if(x%2==0) e++; else o++;
        }
        System.out.println(e+" "+o);
    }
}
