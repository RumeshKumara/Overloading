public class A {
   static void any(){
       int a = 4;
       int b = 8;
       int c = a + b;
       System.out.println(c);
    }
   static int any(int x){
       x = 3+7+6;
       return x;
    }
   static void any(int y, String z){
        y = 13;
        z = " Java";
       System.out.println(y + z);
    }

    public static void main(String[] args) {
       any();
       any(6, "python");
        System.out.println(any(8));

    }
}
