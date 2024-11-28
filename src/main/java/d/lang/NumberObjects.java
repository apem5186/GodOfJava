package d.lang;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects sample = new NumberObjects();
        sample.parseLong("r1234");
        sample.printOtherBase(1024);
    }

    public long parseLong(String data) {
        long retLong = -1;
        try {
            return Long.parseLong(data);
        } catch (NumberFormatException ne) {
            System.out.print(data + " is not number.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retLong;
    }

    public void printOtherBase(long value) {
        System.out.println("Original : " + value);
        System.out.println("Binary : " + Long.toBinaryString(value));
        System.out.println("Hex : " + Long.toHexString(value));
        System.out.println("Octal : " + Long.toOctalString(value));
    }
}
