public class Book {
    String title;
    String author;
    int year;

    void printInfo(){
        System.out.println(title + " by " + author + " (" + year + ")");

    }
    @Override
    public boolean equals(Object obj) {
        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author) && year == other.year;
    }
}


