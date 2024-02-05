import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args){

        long start = System.currentTimeMillis();
        List<Tag  > tags = new LinkedList<>();
        for(int i = 1; i <= 20; i++) {
            HTag htag = new HTag(i);
            PTag ptag = new PTag("Jeg er et P tag");
            tags.add(htag);
            tags.add(ptag);
        }
        long end = System.currentTimeMillis();
        System.out.println("loop1=" + (end-start));
        System.out.println(tags.size());
        int sz = tags.size();

        Iterator<Tag> it = tags.iterator();
        while (it.hasNext()){
            Tag tag = it.next();
            if(tag instanceof HTag){
                it.remove();
            }
        }

       /*{for (int i = sz-1; i>=0; i--){
           Tag tag = tags.get(i);
           if(tag instanceof HTag){
               tags.remove(tag);
           }
       }*/
        long slet = System.currentTimeMillis();
        System.out.println("slet=" + (slet-end));
        System.out.println(tags.size());
        System.out.println(tags);
    }

}
