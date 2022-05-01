public class FiboPattern {
    public static void main(String[] args) {
        int num;
        num = 9426;
        if (num>=1000&&num<=9999) {
            // System.out.println("working..");
            int max=-100 ,min= 5603,maxp=0,minp=0,i=1;
            //[3,2,5,4]
            int copy = num;

            int d;
            while (num!=0) {
                d = num%10;
                if (d>max) {
                    max = d;
                    maxp = i;
                }
                if (d<min) {
                    min = d;
                    minp = i;
                }
                i++;
                num/=10;
            }
            num = copy;
            i =1;
            int r =0,rev=0;
            //reverse
            while (num!=0) {
                d  = num%10;
                rev=rev*10+d;
                num/=10;
            }
            num = rev;
            while (num!=0) {
                d = num%10;
                if (i==(5-maxp)) {
                    r = r*10+min;
                }else if(i==(5-minp))
                {
                    r = r*10+max;
                }
                else
                {
                    r = r*10+d;
                }
                i++;
                num/=10;
            }
            System.out.println(r);



        } else {
            System.out.println("Try again...");
        }
        // System.out.println("working..");
    }
}
