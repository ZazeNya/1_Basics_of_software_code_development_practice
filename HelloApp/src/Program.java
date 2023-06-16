import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Practice 1
        //Line program
        //1
        /*
        System.out.println("Input a: ");
        int a=in.nextInt();
        System.out.println("Input b: ");
        int b=in.nextInt();
        System.out.println("Input c: ");
        int c=in.nextInt();
        double z=((a-3)*b/2)+c;
        System.out.println(z);
         */

        //2
        /*
        System.out.println("Input a: ");
        int a=in.nextInt();
        System.out.println("Input b: ");
        int b=in.nextInt();
        System.out.println("Input c: ");
        int c=in.nextInt();
        System.out.println((b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2));
         */

        //3
        /*
        System.out.println("Input x in radians: ");
        double x=in.nextDouble();
        System.out.println("Input y in radians: ");
        double y=in.nextDouble();
        System.out.println((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        */

        //4
        /*
        System.out.println("Input x: ");
        double x=in.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
        */

        //5
        /*
        System.out.println("Input x: ");
        int x=in.nextInt();
        int h=x/3600;
        int m=x/60%60;
        int s=x%60;
        System.out.printf("Часы " + h + " Минуты " + m + " Секунды " + s);
        */

        //6
        /*
        System.out.println("Input x: ");
        double x=in.nextDouble();
        System.out.println("Input y: ");
        double y=in.nextDouble();
        boolean f=(x>-4 && x<4 && y<=0 && y>-3 && x*x+Math.pow((y+1),2)>0.25) || (x>-2 && x<2 && y>=0 && y<4);
        System.out.println(f);
         */

        //Branching
        //1
        /*
        System.out.println("Input x: ");
        double x=in.nextDouble();
        System.out.println("Input y: ");
        double y=in.nextDouble();
        if (x+y<180) {
            System.out.println("yes there is such a triangle");
            if (x == 90 || y == 90 || 180 - x - y == 90)
                System.out.println("the triangle is rectangular");
        }
        else
            System.out.println("no there is no such a triangle");
         */

        //2
        /*
        System.out.println("Input a: ");
        int a=in.nextInt();
        System.out.println("Input b: ");
        int b=in.nextInt();
        System.out.println("Input c: ");
        int c=in.nextInt();
        System.out.println("Input d: ");
        int d=in.nextInt();
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
         */

        //3
        /*
        System.out.println("Input x1: ");
        int x1=in.nextInt();
        System.out.println("Input y1: ");
        int y1=in.nextInt();

        System.out.println("Input x2: ");
        int x2=in.nextInt();
        System.out.println("Input y2: ");
        int y2=in.nextInt();

        System.out.println("Input x3: ");
        int x3=in.nextInt();
        System.out.println("Input y3: ");
        int y3=in.nextInt();

        if ((x3-x1)*(y2-y1) == (y3-y1)*(x2-x1))
            System.out.println("yes");
        else
            System.out.println("no");
         */

        //4
/*
        System.out.println("Input a: ");
        double a=in.nextDouble();
        System.out.println("Input b: ");
        double b=in.nextDouble();

        System.out.println("Input x: ");
        double x=in.nextDouble();
        System.out.println("Input y: ");
        double y=in.nextDouble();
        System.out.println("Input y: ");
        double z=in.nextDouble();

        if(a>x && b>y || a>y && b>x || a>y && b>z || a>z && b>y || a>x && b>z || a>z && b> x)
            System.out.println("yes");
        else
            System.out.println("no");

 */

        //5
/*
        System.out.println("Input x: ");
        double x=in.nextDouble();
        if (x<=3)
            System.out.println(x*x-3*x+9);
        if (x>3)
            System.out.println(1/(Math.pow(x,3)+6));
 */

        //cycles
        //1
        /*
        System.out.println("Input a: ");
        int a=in.nextInt();

        int n=0;
        for(int i=1; i<=a; i++)
            n+=i;
        System.out.println(n);
         */

        //2
        /*
        System.out.println("Input a: ");
        int a=in.nextInt();
        System.out.println("Input b: ");
        int b=in.nextInt();
        System.out.println("Input h: ");
        int h=in.nextInt();
        for (int i=a; i<=b; i+=h)
        {
            if(i>2)
                System.out.println(i);
            else if (i<=2)
                System.out.println(-i);
        }
         */

        //3
        /*
        int k=0;
        for (int i=1; i<=100; i++)
            k+=Math.pow(i,2);
        System.out.println(k);
         */

        //4
        /*
        int k=1;
        for (int i=1; i<=200; i++)
            k*=Math.pow(i,2);
        System.out.println(k);
        */

        //5
        /*
        System.out.println("Input e: ");
        double e=in.nextDouble();
        int j=0, i=0, k=0;
        while(i!=3)
        {
            j++;
            if(Math.abs(1/Math.pow(2,j)+1/Math.pow(3,j))>=e)
            {
                i++;
                k+=Math.abs(1/Math.pow(2,j)+1/Math.pow(3,j));
            }
        }
        System.out.println(k);
         */

        //6
/*
                System.out.print("ASCII символы и коды:\n № символ OCT  HEX\n");
                for (int i = 33; i < 256; i++) {
                    char ch = (char) i;
                    String tempOct = Integer.toOctalString(i);
                    String tempHex = Integer.toHexString(i);
                    System.out.printf("%03d %3s %5s %4s%n", i, ch, tempOct, tempHex);
                }
 */

        //7
        /*
        System.out.print("Введите натуральное число m = ");
        int M = in.nextInt();
        System.out.print("Введите натуральное число n = ");
        int N = in.nextInt();
        int count;
        for (int i = M; i <= N; i++) {
            System.out.print("Для числа " + i + " будут следующие делители - ");
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
            if (count == 0) {
                if (i == 1) {
                    System.out.println("делители отсутствуют (кроме 1)");
                } else {
                    System.out.println("делители отсутствуют (кроме 1 и " + i + ")");
                }
            } else {
                System.out.println();
            }
        }

         */

        //8
        System.out.print("Введите натуральное число = ");
        int num1=in.nextInt();
        System.out.print("Введите еще одно натуральное число = ");
        int num2=in.nextInt();
        char[] charArray1 = Integer.toString(num1).toCharArray(); //преобразуем число A в массив символов
        char[] charArray2 = Integer.toString(num2).toCharArray(); //преобразуем число B в массив символов
        int[] arrayA = new int[charArray1.length]; //массив цифр числа А, количество цифр в числе А равно длине массива символов
        int[] arrayB = new int[charArray2.length]; //массив цифр числа В, количество цифр в числе В равно длине массива символов
        System.out.print("Число " + num1 + " состоит из цифр: ");
        for (int i = 0; i < charArray1.length; i++) {
            arrayA[i] = Character.getNumericValue(charArray1[i]);
            System.out.print(arrayA[i] + " ");
        }
        System.out.print("\nЧисло " + num2 + " состоит из цифр: ");
        for (int i = 0; i < charArray2.length; i++) {
            arrayB[i] = Character.getNumericValue(charArray2[i]);
            System.out.print(arrayB[i] + " ");
        }



    }
}

