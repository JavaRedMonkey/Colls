package pasha.edu;

import java.util.*;

public class Main {
public static String getPrefix (String[] array){
    //your code here
    return null;
}
    public static boolean hasRepetitions (int[] array){
    //your code here
    return true;
}
    public static void main(String[] args) {
        int[] array = {1, 9, 6, 35, 56, 7, 1};
        String[] array2 = {"abc", "abcd", "abcde", "aba"};
        System.out.println(hasRepetitions(array));
        System.out.println("______Collections______");
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1 , 23 , 54 , 765 , 876 , 6456 , 2353 , 464 , 7 , 56 , 55)
        );

        System.out.println(list);
        System.out.println(array);
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.println(Arrays.toString(array));
        List<String> greetings = new ArrayList<>(
                Arrays.asList("Hi" , "Hello" , "Good morning" , "Good evening" , "Sup")
        );
        greetings.add("Привіт");
        greetings.add("Здоров");
        greetings.add("Buna ziua");
        greetings.add("Noroc");
        greetings.add("Cześć");
        greetings.add(2, "Shalom");
        greetings.remove( 1);
        System.out.println(greetings.get(6));
        greetings.remove("Sup");
        greetings.stream().filter(item->item.contains("Good"))
                .forEach(System.out::println);
        System.out.println(greetings);
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("abd");
        set.add("abe");
        System.out.println(set);
        Map<String, Integer> map = new HashMap<>();
        map.put("Artem", 8);
        map.put("Sasha", 9);
        map.put("David", 8);
        map.put("Max", 3);
        map.put("Denis", 7);
        map.put("Denis", 0);
        System.out.println(map);
    }
}
