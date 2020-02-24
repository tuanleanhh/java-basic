package From1to28;//Gioi thieu string Builder:

public class b16StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Le "); //chen string
        stringBuilder.append("Tuan");
        stringBuilder.insert(3, "Anh ");

        //String name = stringBuilder.toString();
        String name = stringBuilder.toString();
        stringBuilder.replace(0,2,"LE");
        name = stringBuilder.toString();
        System.out.println(name);

    }
}
