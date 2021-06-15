package reluareCurs17;


public class NewJava {
    public static void main(String[] args) {
        System.out.println(processString("inghetata", word -> word.toUpperCase()));
        System.out.println(processString("inghetata", String::toUpperCase));
        System.out.println(processString("inghetata", String::trim));

        System.out.println(processString("inghetata", word -> "&" + word + "^"));

        System.out.println(processString("inghetata", word -> "000000" + word + "--------" ));
    }

//    private static String processStringStar(String word) {
//        // citire din fisier
//        // validari
//        return "&" + word + "^";
//    }


    private static String processString(String word, NewWordDecorator wordDecorator) {
        return wordDecorator.decorate(word);
    }
}

interface NewWordDecorator {
    String decorate(String word);
}


