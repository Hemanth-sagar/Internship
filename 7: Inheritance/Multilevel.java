class A{
    String id;
    int val=1;
    public A(String id) {
        this.id = id;
    }

    void m(){
        System.out.println("overridden A");
    }
    void m1(){
        System.out.println("A m1");
    }
    void m2(){
        System.out.println("A m2");
    }
}
class B extends A{
    String id1;
    int val=2;
    public B(String id, String id1) {
        super(id);
        this.id1 = id1;
    }
    @Override
    void m(){
        //to call parent method
        super.m();
        System.out.println("overridden B");
    }
    void m3(){
        System.out.println("B m1");
    }
    void m4(){
        System.out.println("B m2");
    }
}
class C extends B{
    String id2;
    int val=3;
    public C(String id, String id1, String id2) {
        super(id, id1);
        this.id2 = id2;
    }

    @Override void m(){
        System.out.println("overridden C");
    }
    void m5(){
        System.out.println("C m1");
    }
    void m6(){
        System.out.println("C m2");
    }

}

//Driver class
class Main{
    public static void main(String[] args) {
        //class first
        A ob1=new A("1");
        //methods
        ob1.m();
        ob1.m1();
        ob1.m2();
        System.out.println(ob1.val);

        //class second
        B ob2=new B("1","2");
        //overridden method
        ob2.m();
        //class methods
        ob2.m3();
        ob2.m4();
        System.out.println(ob2.val);

        //class third
        C ob3 = new C("1","2","3");
        //overridden methods
        ob3.m();
        //class methods
        ob3.m5();
        ob3.m6();
        System.out.println(ob3.val);

    }
}
