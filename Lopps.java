/*
using the integer's creating the series of
input:
get a,b,c 3-integers

output :
(a+2^0.b),(a+2^0.b+2^1.b),......,(a+2^0.b+2^1.b+....+2^c-1.b)

*/




import java.util.*;
//import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            for(int j=0;j<n;j++){
            
                sum+=(int)+(Math.pow(2,j))*b;
                System.out.printf("%d ",sum);
            } System.out.println();
        }
        in.close();
    }
}
