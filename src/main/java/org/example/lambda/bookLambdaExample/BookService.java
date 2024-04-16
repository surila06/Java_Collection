package org.example.lambda.bookLambdaExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort()
    {
       List<Book> bookList = new BookDao().getBooks();
        //Collections.sort(bookList, (book1, book2)-> book1.getName().compareTo(book2.getName()));
        Collections.sort(bookList, Comparator.comparing(Book::getName).reversed());
        return bookList;



    }

    public static void main(String[] args)
    {
        List<Book> bookList=new BookService().getBooksInSort();


        for(Book book:bookList)
        {
            System.out.println("Book Id: "+book.getId()+" Book Name: "+book.getName()+" Book No Of Pages: "+book.getPages());
        }
    }
}

class MyComparator implements Comparator<Book>
{

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getPages()- o1.getPages();
    }
}
