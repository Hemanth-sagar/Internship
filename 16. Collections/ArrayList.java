import java.util.*;

class Main {
    public static void main(String[] args) {
      
        //Accessing outside the class
        ArrayList<String> list = new ArrayList<>();
        //Scanner class for input
        Scanner sc = new Scanner(System.in);

        //Adding an elements to the ArrayList
        for(int i = 0;i < 10 ;i++){
            String temp = sc.nextLine();
            list.add(temp);
        }

        //Print the list
        System.out.println(list);

        //Iterating element
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Add at particular index
        list.add(1,"Hemanth");
        System.out.println(list);

        //Remove at particular index and particular object
        list.remove("Hemanth");
        list.remove(1);
        System.out.println(list);

        //Update the element
        list.set(0,"new");
        System.out.println(list);

        //Check the element at particular index
        int idx = 3;
        String check = "e";
        System.out.println(list.indexOf(check)==idx);

        //Element at particular index
        System.out.println(list.get(1));

        //Size of the list
        System.out.println(list.size());

        //Element present in list or not
        String check2="a";
        System.out.println(list.contains(check2));

        //Remove all the elements of an array list
        list.clear();
        System.out.println(list);

    }
}
