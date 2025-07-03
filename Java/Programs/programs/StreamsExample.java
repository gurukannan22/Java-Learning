package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,3,5,7,9,0,8);
//        intList.stream().filter(n->n%2==0).forEach(System.out::println);
//        intList.stream().map(n->n*5).forEach(System.out::println);
        fibanacci(1,20);
    }

    public static void fibanacci(int start, int limit){
        Stream.iterate(new int[]{0,1},f -> new int[]{f[1],f[0]+f[1]})
                .skip(start)
                .limit(limit)
                .map(f -> f[0])
                .forEach(System.out::println);
    }

    public static void findDuplicates(String a, String b){

    }
}
