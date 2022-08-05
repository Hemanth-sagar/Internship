class A {
    int id;
    A(int id){
        this.id=id;
    }
    void method(){
        System.out.println("method");
    }
}
class Main {
    public static void main(String[] args) {
        //Accessing outside the class
        A ob = new A(1);//works well
        System.out.println(ob.id);//works well
        ob.method();
    }
}
