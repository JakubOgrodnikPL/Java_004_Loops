public class Main {
    public static void main(String[] args) {
        int a=5;
        while(a>0){
            System.out.println("a = :" + a);
            a--;
        }

        do {
            a++;
            System.out.println("a = :" + a);
        } while(a<7);

        for(int i=0; i<10; i++){
            a += 1;
            System.out.println("i= " + i);
            System.out.println("a= " + a);
        }
    }
}