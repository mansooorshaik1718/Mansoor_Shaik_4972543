package com.mansoor;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public BookRepository(){
        System.out.println("Inside Book Repository ! ");
    }
}
