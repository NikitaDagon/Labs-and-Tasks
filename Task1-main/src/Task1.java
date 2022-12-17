import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
         Scanner num1 = new Scanner(System.in);
         System.out.print("Write first: ");
         int i = num1.nextInt();
         Scanner num2 = new Scanner(System.in);
         System.out.print("Write second: ");
         int c = num2.nextInt();
         System.out.println(i % c);
     }

     public static void task2(String[] args) {
         Scanner num1 = new Scanner(System.in);
         System.out.print("Write first: ");
         int horde = num1.nextInt();
         Scanner num2 = new Scanner(System.in);
         System.out.print("Write second:");
         int high = num2.nextInt();
         System.out.println((0.5 * horde) * high);
     }

     public static void task3(String[] args) {
         Scanner num1 = new Scanner(System.in);
         System.out.print("Write chicken: ");
         int chicken = num1.nextInt();
         Scanner num2 = new Scanner(System.in);
         System.out.print("Write cows:");
         int cows = num2.nextInt();
         Scanner num3 = new Scanner(System.in);
         System.out.print("Write cows:");
         int pigs = num3.nextInt();
         System.out.println(chicken * 2 + cows * 4 + pigs * 4);
     }

     public static String task5(String[] args) {
         Scanner num1 = new Scanner(System.in);
         System.out.print("Write first:");
         int first = num1.nextInt();
         Scanner num2 = new Scanner(System.in);
         System.out.print("Write second:");
         int second = num2.nextInt();
         Scanner num3 = new Scanner(System.in);
         System.out.print("Write third:");
         int third = num3.nextInt();
         if (first + second == third) {
             return ("+");
         } else {
             if (first - second == third) {
                 return ("-");
             } else {
                 if (first * second == third) {
                     return "*";
                 } else {
                     if (first / second == third) {
                         return ("/");
                     } else {
                         return ("none");
                     }
                 }
             }
         }
     }

     public static void task4(String[] args) {
         Scanner num1 = new Scanner(System.in);
         System.out.print("Write first:");
         double prob = num1.nextDouble();
         Scanner num2 = new Scanner(System.in);
         System.out.print("Write second:");
         double prize = num2.nextDouble();
         Scanner num3 = new Scanner(System.in);
         System.out.print("Write third:");
         double pay = num3.nextDouble();
         if (prob * prize > pay) {
             System.out.print("True:");
         } else {
             System.out.print("None:");
         }
     }

     public static int task6(String[] args) {
         Scanner ch = new Scanner(System.in);
         System.out.println("Write symbol");
         String word = ch.next();
         char c = word.charAt(0);
         return ((int) c);
     }

     public static int task7(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Write number ");
         int o = in.nextInt();
         int x = 0;
         while (o > 0) {
             x = x + o;
             o = o - 1;
         }
         return (x);
     }

     public static int task8(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Write side: ");
         int d1 = in.nextInt();
         int d2 = in.nextInt();
         int dl = d1 + d2 - 1;
         return (dl);
     }

     public static int SumCubes(int[] args) {
         int sum = 0;
         for (int i : args) {
             sum += i * i * i;
         }
         return sum;

         public static boolean task10(String[]args);
         {
             {
                 Scanner in = new Scanner(System.in);
                 System.out.println("input int's ");
                 int f1 = in.nextInt();
                 int f2 = in.nextInt();
                 int f3 = in.nextInt();
                 in.close();
                 if ((f1 * f2) % f3 == 0) {
                     return 1;
                 } else {
                     return 0;
                 }
             }
         }
     }
 }

