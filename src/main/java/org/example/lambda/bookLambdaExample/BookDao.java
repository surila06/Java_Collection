package org.example.lambda.bookLambdaExample;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks()
    {
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book(1,"IKIGAI",750));
        bookList.add(new Book(2,"SECRET",896));
        bookList.add(new Book(3,"HAPPINESS",1527));
        bookList.add(new Book(4,"THE PIVOT YEAR",1000));
        return bookList;


    }
}
