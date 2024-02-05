public class HTag extends Tag{
    private byte number;
    public HTag(int hnum) {
        number = (byte) hnum;
        this.setNumber(number);

    }
    public HTag(String text, int hnum) {
        this(hnum);
        super.setText(text);
    }
    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = (byte) number;
        this.settagName("h" + number);
    }

    public void setNumber(int number) {
        this.setNumber((byte)number);
    }

    @java.lang.Override
    public String toString() {
        String s = super.toString();
        return s + "HTag{" +
                "number=" + number +
                '}';
    }
}
