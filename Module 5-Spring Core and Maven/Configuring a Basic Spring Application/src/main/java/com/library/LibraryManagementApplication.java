package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
import com.library.repository.BookRepository;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve standalone BookService bean
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.listBooks();

        // Retrieve standalone BookRepository bean
        BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
        System.out.println("BookRepository bean loaded successfully: " + (bookRepository != null));
    }
}
