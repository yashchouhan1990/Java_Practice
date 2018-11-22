package conceptual_programs;


class t3 {

    int x;

 double y;

    void add(int a , int b) {

        x = a + b;

    }

    void add(double c , double d){

        y = c + d;

    }

    void overload() {

        this.x = 0;

        this.y = 0;

    }        

}    

class Overload_methods {

    public static void main(String args[])

    {

        t3 obj = new t3();   

        int a = 2;

        double b = 3.2;

        obj.add(a, a);

        obj.add(b, b);

        System.out.println(obj.x + " " + obj.y);     

    }

}