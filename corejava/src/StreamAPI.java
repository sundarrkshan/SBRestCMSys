import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    //Stream empty method
    //use the empty() method upon creation to avoid returning null for streams with no element:
    Stream<Stream> streamEmpty = Stream.empty();

    public Stream streamOf(List<String> list){
         return list== null|| list.isEmpty()? Stream.empty():list.stream();
    }

    public static void main(String[] args) {
        // Case 1:
        List<String> list = Arrays.asList("Sundar","Sekar","abinaya");
        //Case 2 :
        list = null;

         StreamAPI streamAPI = new StreamAPI();
                //    list = (List<String>) streamAPI.streamOf(list);
        Stream<String> listCheck =  streamAPI.streamOf(list);
        System.out.println("Is Empty List:"+listCheck.toList());
    }
}
