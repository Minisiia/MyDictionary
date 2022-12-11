package my_dictionary;

public class Main {
    public static void main(String[] args) {
        MyDictionary <String,Integer> myDictionary = new MyDictionary<>();
        myDictionary.add("Milk", 20);
        myDictionary.add("Coffee", 30);
        myDictionary.add("Water", 10);
        for (int i = 0; i < myDictionary.size(); i++) {
            System.out.println(myDictionary.getPair(i));
        }

        MyDictionary <Character,Boolean> myDictionary2 = new MyDictionary<>();
        myDictionary2.add('a', true);
        myDictionary2.add('b', false);
        myDictionary2.add('c', true);
        for (int i = 0; i < myDictionary2.size(); i++) {
            System.out.println(myDictionary2.getPair(i));
        }


    }
}
