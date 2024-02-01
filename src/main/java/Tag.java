public abstract class Tag {
    private String id;
    private String Tagname;
    private String text;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTagname() {
        return Tagname;
    }

    public void setTagname(String tagname) {
        Tagname = tagname;
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
                ", Tagname='" + Tagname + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
