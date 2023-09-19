import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollection {
    // changing collection into stream
    public static void main(String[] args) {


        Collection<String> list = Arrays.asList("a", "b", "c");
        Stream<String> collectionStream = list.stream();

        // stream of Array. Array is the part of stream.

        Stream<String> streamofarray = Stream.of("a", "b", "c");

        // create stream of existing array
        String[] array = new String[]{"a", "b", "c"};

        String[] array1 = new String[]{"Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda"};

        String[] arr = new String[]{"a", "b", "c"};

        Stream<Serializable> arrString = Arrays.stream(array, 1, 3);

       System.out.println("Is Empty List:" + arrString.collect(Collectors.toList()));

     //   System.out.println("Is Empty List:"+arrString.collect(Collectors.toSet()));

     //   System.out.println("Is Empty List:"+arrString.);

    }



}
