package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Alexander", "Pushkin");
        Author tolstoy = new Author("Lev", "Tolstoy");
        System.out.println(pushkin.toString());
        System.out.println(tolstoy.toString());

        Book  skazkaOTsareSaltane = new Book(pushkin, "Сказка о царе Салтане", 1945);
        Book voinaIMir = new Book(tolstoy, "Война и мир", 1890);
        System.out.println(skazkaOTsareSaltane.toString());
        System.out.println(voinaIMir.toString());

        System.out.println(skazkaOTsareSaltane.equals(voinaIMir));
        System.out.println(pushkin.equals(tolstoy));
        System.out.println(pushkin.hashCode()==tolstoy.hashCode());
        System.out.println(skazkaOTsareSaltane.equals(voinaIMir));



        System.out.println("//HARD");

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book(stephenKing,"The Stand",  1976);
        Book theStand2 = new Book(stephenKing,"The Stand",  1976);
        Book warAndPeace = new Book(levTolstoy,"War and Peace",  1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(theStand);
        System.out.println(warAndPeace);

    }



}


