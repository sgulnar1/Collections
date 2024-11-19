public class Main {
    public static void main(String[] args) {
        String text = "java.lang.String[][] Main.person";
        Integer[] avargeScore = new Integer[100];

        System.out.println(text.indexOf("Main"));
        System.out.println(text.charAt(26));
        int baslangicnoqtesi = text.indexOf("person");

        System.out.println(text.substring(baslangicnoqtesi));
//        if (baslangicnoqtesi != -1) {
//            for (int a = baslangicnoqtesi; a < baslangicnoqtesi + "person".length(); a++) {
//                System.out.print(text.charAt(a));
//            }
//            System.out.println();
//        } else {
//            System.out.println("error");
//        }

    }
}

