package task_140223HW;


public class HW5 {
    public static void main(String[] args) {
        //AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
        //**ДОБАВИТЬ ПРОВЕРКУ
        String s = "AAASSDDFFRRTGGBNHYUUU";
        System.out.println(getNewString(s));
    }

    public static String getNewString(String s) {

        char[] chr = s.toCharArray();
        for (int i = 0; i < chr.length - 1; i++) {
            if (Character.isDigit(chr[i])) {
                System.out.println("Invalid character entered: ");
                break;
            } else {
                System.out.print((s.lastIndexOf(chr[i]) - s.indexOf(chr[i]) + 1) + "" + chr[i]);
                i += (s.lastIndexOf(chr[i]) - s.indexOf(chr[i]));
            }
        }
        return "";
    }
}

