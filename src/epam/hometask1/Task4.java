package epam.hometask1;

public class Task4 {
    public static void main(String[] args) {
        int a = 99, b = 9;
        System.out.println("lin:" + cgd(a,b));
        System.out.println("rec:" + recCgd(a,b));
    }

    private static int recCgd(int a, int b){
//        System.out.println(a+" -- "+b);

        if (a == 0 || b == 0)
            return a|b;

        if (a==1 || (b==1))
            return 1;

        if (((a|b)&1)==0)
            return  recCgd(a>>1, b>>1)<<1;

        if (((a|(~b))&1)==0)
            return  recCgd(a>>1, b);

        if ((((~a)|b)&1)==0)
            return  recCgd(a, b>>1);

        if (((a&b)&1) == 1 && (b>=a))
            return  recCgd((b-a)>>1, a);

        if (((a&b)&1) == 1 && (b<a))
            return  recCgd((a-b)>>1, b);

        return 0;
    }

    private static int cgd(int a, int b){
        int shift;

        if (a == 0 || b == 0)
            return a|b;

        for (shift = 0; ((a|b)&1)==0; shift++){
            a>>=1;
            b>>=1;
        }

        while ((a & 1) == 0)
            a >>= 1;

        do {
            while ((b & 1) == 0)
                b >>= 1;

            if (a < b)
                b -= a;
            else {
                int diff = a - b;
                a = b;
                b = diff;
            }
            b >>= 1;
        } while (b != 0);

        return a << shift;
    }
}
