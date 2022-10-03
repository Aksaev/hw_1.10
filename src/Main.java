public class Main {

    public static void printSeparator() {
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание. Урок 1.10 Методы объектов.");
        printSeparator();

        Author author1 = new Author("Михаил", "Лермонтов");
        Book book1 = new Book("Родина", author1, 1841);
        System.out.println(book1);
        printSeparator();

        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Борис Годунов", author2, 1825);
        System.out.println(book2);
        printSeparator();

        book2.setYearPublication(2022);
        System.out.println(book2);
        printSeparator();
    }
}