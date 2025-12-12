package Q10_4;

public class WrappedBook implements Book {
    private final WrappableBook wrappedBook;
    public WrappedBook(WrappableBook wrappedBook) {
        this.wrappedBook = wrappedBook;
    }
    
}
