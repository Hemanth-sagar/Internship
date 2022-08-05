import javax.sound.midi.Soundbank;

class Main {
  
    private int id;
    Main(){}
    Main(int id){
        this.id=id;
    }
    private void method(){
        System.out.println("method");
    }
    public static void main(String[] args) {
        //Accessing with in the class
        Main ob = new Main(1);//works well
        System.out.println(ob.id);//works well
        ob.method();
    }
}
class A extends Main{
    public static void main(String[] args) {
        //Accessing private members from outside class
        System.out.println(A.id);//error
        A.method();//error
    }
}
