import java.util.*;

class Main {
    public static void main(String[] args) {

        HashMap<Integer , String> hm = new HashMap<>();
        //Inserting values with keys
        hm.put(0,"a");
        hm.put(1,"b");
        hm.put(2,"c");
        hm.put(3,"d");
        hm.put(4,"e");
        hm.put(5,"f");
        hm.put(6,"g");
        hm.put(7,"h");
        hm.put(8,"i");
        hm.put(9,"j");
        System.out.println(hm);
        //value of key
        System.out.println(hm.get(0));
        //whether key present
        System.out.println(hm.containsKey(1));
        //whether value present
        System.out.println(hm.containsValue("h"));
        //checking is map empty
        System.out.println(hm.isEmpty());
        //size
        System.out.println(hm.size());
        //printing only keys
        System.out.println(hm.keySet());
        //printing only values
        System.out.println(hm.values());
        //remove specific key and value
        System.out.println(hm.remove(0,"A"));
        //cloning
        System.out.println(hm.clone());
        HashMap<Integer,String> temp = new HashMap<>();
        temp = (HashMap)hm.clone();
        System.out.println(temp);

        //Copy hash map incomplete
        HashMap<Integer,String> copy = new HashMap<>();
        for(HashMap.entry()<String,Integer> it:hm.entrySet()){

        }


    }
}
