public class Main {
 //1
    int collegeid;
    String name;
    static int collegecode=16;
    static String collegeName="Anurag";
    Main(int collegeid,String name){
        this.collegeid=collegeid;
        this.name=name;
    }
    static void dis1(){
    //2
        Main obj = new Main(1,"hemanth");
        System.out.println(obj.collegeid);
        obj.dis3();
    }
    static void dis2(){
        Main obj = new Main(1,"hemanth");
        System.out.println(obj.name);
      //4
        obj.dis4();
    }
    void dis3(){
    //3
        System.out.println(collegecode);
        Main.dis3();
    }
    void dis4(){
        System.out.println(collegeName);
      //5
        Main.dis4();
    }
    public static void main(String[] args) {
        Main obj = new Main(1,"hemanth");
        //6
        System.out.println(obj.collegeid+" "+obj.name+" "+ collegecode +" "+Main.collegeName);
        //7
       obj.dis3();
       obj.dis4();
       Main.dis1();
       Main.dis2();
    }
}
