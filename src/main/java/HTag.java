public class HTag extends Tag{
    private byte number;
    public HTag(int hnum) {
        number = (byte) hnum;
        this.setTagname("h" + number);
    }
    public byte getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = (byte) number;
    }

    @java.lang.Override
    public String toString() {
        String s = super.toString();
        return s + "HTag{" +
                "number=" + number +
                '}';
    }
}
