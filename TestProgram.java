public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Julia");

        ILibraryResource book = new Book("Data Structures");
        ILibraryResource journal = new Journal("AI Research");
        ILibraryResource audioBook = new AudioBook("Effective Java Audio");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(audioBook);
    }
}