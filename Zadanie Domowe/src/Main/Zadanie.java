package Main;

public class Zadanie {

    public static void main(String[] args) {

        System.out.println("Witaj!");

        String[] months = new String[] {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};
        for(int index = 0; index < months.length; index++) {
            System.out.println(months[index]);
        }
        System.out.println("Miesiące mające wiecej niz 4 litery to:");
        for(int index = 0; index < months.length; index++){
            if(months[index].length() >= 4) {
                System.out.println(months[index]);
            }
        }

    }


}
