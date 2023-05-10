public class Main {

  public static void main(String[] args) {
    /*
    Создайте класс Book (книга), в конструктор которого передавайте автора и название книги.
    Переопределите сравнение книг: книги должны считаться одинаковыми,
    если совпадают и название, и автор.
     */
    String name1 = "The Hitchhiker's Guide to the Galaxy";
    String author1 = "Douglas Noel Adams";
    Book bookGreen = new Book(name1, author1);

    String name2 = "Dune";
    String author2 = "Frank Herbert";
    Book bookYellow = new Book(name2, author2);

    String name3 = "Dune";
    String author3 = "Frank Herbert";
    Book bookRed = new Book(name3, author3);

    compareTwoBookAndPrint(bookRed,bookGreen);

    compareTwoBookAndPrint(bookRed,bookYellow);

  }
  private static void compareTwoBookAndPrint(Book book1, Book book2){
    if(book1.equals(book2)){
      System.out.println(book1 + " is equal to "+ book2);
    }else {
      System.out.println(book1 + " is non-equal to "+ book2);
    }
  }
}