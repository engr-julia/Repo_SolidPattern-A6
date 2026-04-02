public class AudioBook implements ILibraryResource {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowed audiobook: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}