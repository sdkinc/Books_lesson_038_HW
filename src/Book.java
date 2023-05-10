import java.util.Objects;

public class Book {

  private String name;
  private String author;

  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString(){
    return "'"+getName()+"'"+" from "+getAuthor();
  }

  @Override
  public boolean equals(Object obj) {
    if(this==obj){
      return true;
    }
    if(!(obj instanceof Book book)){
      return false;
    }
    return (this.getName().equals(book.getName()) && this.getAuthor().equals(book.getAuthor()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, author);
  }
}
