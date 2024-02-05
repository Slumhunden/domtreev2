import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Tag> tags = new HashSet<>();
        HTag htag = new HTag("hej", 1);
        tags.add(htag);
        System.out.println(tags.size());
        tags.add(htag);
        System.out.println(tags.size());
        boolean ct = tags.contains(htag);
        HTag htag2 = new HTag("hej", 1);
        htag2.setId(htag.getId());
        tags.add(htag2);

        for (Tag tag : tags) {
            System.out.println(tag);
            System.out.println(tags.size());
        }
    }
}