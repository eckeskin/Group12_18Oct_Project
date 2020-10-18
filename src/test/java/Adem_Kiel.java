public class Adem_Kiel {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("I wohne in Kiel");
        stringBuffer.insert(stringBuffer.length(), " in Deutschland");
        System.out.println(stringBuffer);
    }
}
