import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("jeg er et htag");

         HTag hTag = new HTag(1);
         hTag.setText("jeg er et h tag");

        System.out.println(hTag);
        System.out.println("git");
        System.out.println(hTag.toHtmlString());

        List<Tag> hTags = new ArrayList<>();
        for (int i = 3; i>0; i--) {
            HTag hTag2 = new HTag(5-(i % 5));
            hTag2.setText("jeg er et " + hTag2.getTagname()+ " tag");
            hTags.add(hTag2);
            for (int j=1; j<=5; j++){
                PTag ptag = new PTag();
                ptag.setText("Jeg er en Ptag indeni " + hTag2.getTagname());
                hTags.add(ptag);
            }

        }
        System.out.println(hTags.size());
        for (Tag tag: hTags) {
            System.out.println(tag.toHtmlString());
            if(tag instanceof PTag){
                System.out.println("PPPPP");
            }
        }
        BodyTag body = new BodyTag();
        body.setChildren(hTags);
        System.out.println(body);
        System.out.println(body.toHtmlString());
        body.toHtmlStringFile("index.html");

        body.setColor(255, 10, 15);
        System.out.println(body.getColor());
    }
}
