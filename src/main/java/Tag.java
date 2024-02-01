import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Tag {
    private String id;
    private String tagName;
    private String text;
    private List<Tag> children;
    private String color = ""; //#ff0000 = red

    public Tag(){
        children = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }
public void setColor(int red, int green, int blue){
        String r = Integer.toHexString(red);
        String g = Integer.toHexString(green);
        String b = Integer.toHexString(blue);
        this.setColor("#" + r + g + b);
    }
    public static String rgbToColorString(int red, int green, int blue){
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0,blue));
        String colorString = String.format("#%02X%02X%02X", red, green, blue);
        return colorString;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Tag> getChildren() {
        return children;
    }

    public void setChildren(List<Tag> children) {
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTagname() {
        return tagName;
    }

    public void settagName(String tagName) {
        this.tagName = tagName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @java.lang.Override
    public String toString() {
        return "Tag{" +
                "id='" + id + '\'' +
                ", tagName='" + tagName + '\'' +
                ", text='" + text + '\'' + " children=" + this.children.size() +
                '}';
    }

    public String toHtmlStringNoChildren(){
        String s1 = "<" + tagName + ">";
        s1 = s1 + text;
        String s2 = "<" + tagName + "/>";
        return s1 + s2;
    }
    public String toHtmlString(){
        String s1 = "<" + tagName + ">";
        if (this.getColor().length() > 0){
            s1 = "<" + tagName+ " style=" + '"' + "background-color:" + color + '"' + ">";
        } else {
        s1 = "<" + tagName + ">";
        }

       for (Tag tag: children){
          String child = tag.toHtmlString();
          s1 = s1 + (char) 10 + child;
       }
        String s2 = text + "<" + tagName + "/>";
        return s1 + s2;
    }
    public String toHtmlStringFile(String fileName){
        String outputFile = fileName;
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(this.toHtmlString());
            writer.close();
        } catch (Exception msg){
            System.out.println(msg.getMessage());
        }
        return fileName;
    }

}
