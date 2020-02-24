package model;

public class BookReaderManagement {
    private Book book;
    private Reader reader;
    private int numOfBorrow;
    private String state; // trang thai luc muon
    private int totalOfBorrowed;

    public BookReaderManagement() {
    }

    public BookReaderManagement(Book book, Reader reader,
                                int numOfBorrow, String state, int totalOfBorrowed) {
        this.book = book;
        this.reader = reader;
        this.numOfBorrow = numOfBorrow;
        this.state = state;
        this.totalOfBorrowed = totalOfBorrowed;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotalOfBorrowed() {
        return totalOfBorrowed;
    }

    public void setTotalOfBorrowed(int totalOfBorrowed) {
        this.totalOfBorrowed = totalOfBorrowed;
    }

    @Override
    public String toString() {
        return "BookReaderManagement{" +
                "reader=" + reader.getReaderID()+
                ", readerName=" + reader.getFullName()+
                ", bookID=" + book.getBookID()+
                ", bookName=" + book.getBookName()+
                ", numOfBorrow=" + numOfBorrow +
                ", state='" + state + '\'' +
                ", totalOfBorrowed=" + totalOfBorrowed +
                '}';
    }
}
