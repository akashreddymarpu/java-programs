import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if((a>=b)&&(a>=c))
        System.out.println(a+" greater than "+b+", "+c);
        else if((b>a)&&(b>c))
        System.out.println(b+" greater than "+a+" ,"+c);
        else if ((c>=a)&&(c>=b))
        System.out.println(c+" greater than "+a+" ,"+b);
    }
}
