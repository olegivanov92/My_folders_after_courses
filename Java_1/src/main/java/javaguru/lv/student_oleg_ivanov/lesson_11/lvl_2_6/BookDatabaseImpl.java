package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria.SearchCriteria;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.*;
@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase {
    private static Long id = 0L;
    List<Book> books = new ArrayList<>();

    //task 6
    @Override
    public Long save(Book book) {
        book.setId(++id);
        books.add(book);
        return book.getId();
    }

    //task 7
    @Override
    public boolean delete(Long bookId) {
        Book founded = null;
        for (Book book : books) {
            if (bookId.equals(book.getId())) {
                founded = book;
            }
        }
        if (founded != null) {
            return books.remove(founded);
        }
        return false;
    }

    //task 8
    @Override
    public boolean delete(Book book) {

        Book founded = null;
        for (Book book1 : books) {
            if (book1.getAuthor().equals(book.getAuthor()) && book1.getTitle().equals(book.getTitle())) {
                founded = book1;
            }
        }
        if (founded != null) {
            return books.remove(founded);
        }
        return false;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "books=" + books +
                '}';
    }

    //task 9
    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    //task 10
    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> resultBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                resultBooks.add(book);
            }
        }
        return resultBooks;
    }

    //task 11
    @Override
    public List<Book> findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return books;
            }
        }
        return null;
    }

    //task 12
    @Override
    public int countAllBooks() {
        return books.size();
    }


    //task 13
    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));

    }

    //task 14
    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    //task 22
    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> foundedBook = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book))
                foundedBook.add(book);

        }
        return foundedBook;
    }

    //task 23
    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    //task 24
    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    //task 25
    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : books) {
            uniqueBooks.add(book);
        }
        return uniqueBooks;
    }

    @Override
    public Set<Book> findUniqueBooks(String author) {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : books) {
            if(book.getAuthor().equals(author))
            uniqueBooks.add(book);
        }
        return uniqueBooks;
    }


    //task 26
    @Override
    public boolean contains(Book book) {
        for (Book book1 : books) {
            if (book1.equals(book)) {
                return true;
            }
        }
        return false;
    }

    //task 28
    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> map = new HashMap<>();
        Set<String> uniqueAuthors = findUniqueAuthors();
        for (String author : uniqueAuthors) {
            List<Book> authorsBooks = findByAuthor(author);
            map.put(author, authorsBooks);
        }
        return map;

    }

    //task 29
    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> map = new HashMap<>();
        Set<String> uniqueAuthors = findUniqueAuthors();
        for (String author : uniqueAuthors) {
           Set<Book> authorsBooks = findUniqueBooks(author);
            map.put(author, authorsBooks.size());
        }
        return map;
    }
}





