public class Main {
    static class circuit {
        ////////////////////////// class of the circuit to account area and circumference
        int raduis;
        void areacir()
        {
            System.out.println(3.14*raduis*raduis);
        }
        void circumcir()
        {
            System.out.println(2*3.14*raduis);

        }
    }
   static class triangle {
       ////////////////////////// class of the triangle to account area and circumference
        float l1,l2,l3;
        float height ;
        void areatri()
        {
            System.out.println(0.5*l3*height);
        }
        void circumtri()
        {
            System.out.println(l1+l2+l3);
        }

    }

    public static void main(String[] args) {
        ////////////////////////// class of the main program to account area and circumference
        triangle a=new triangle();
        a.l1=2;
        a.l2=3;
        a.l3=4;
        a.height=5;
        System.out.println("area of triangle : ");
        a.areatri();
        System.out.println("circumferencecir of triangle : ");
        a.circumtri();
        circuit b=new circuit();
        b.raduis=6;
        System.out.println("area of circuit : ");
        b.areacir();
        System.out.println("circumferencecir of circuit : ");
        b.circumcir();
    }
}