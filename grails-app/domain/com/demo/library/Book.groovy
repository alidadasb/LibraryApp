package com.demo.library

class Book {
    String title
    String author
    Integer numberOfCopies

    static constraints = {
        title nullable: false, blank: false, minSize: 3
        numberOfCopies nullable: false, matches: /^[0-9]+$/
    }
}
