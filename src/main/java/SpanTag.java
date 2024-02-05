public class SpanTag extends Tag {
    public SpanTag(){
        this.settagName("p");
    }

    public SpanTag(String text){
        this();
        super.setText(text);
    }
    public boolean hasLineShift(){
        return false;
    }
}
