package General;

public class Print1To10 {

public static void main(String[] args) {
    print(10);
}

private static void print(int n) {
    if(n > 1) {
        print(n-1);
    }
    System.out.println(n);
}


}
