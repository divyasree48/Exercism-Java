import java.util.*;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int n) {

        int t = n;
        int s = 0;
        int p = (int)Math.log10(n)+1;
        if(p == 1)return true;
        while(n!=0)
            {
                int r = n%10;
                s += (int)Math.pow(r,p);
                n = n/10;
            }
        return t == s;

    }

}
