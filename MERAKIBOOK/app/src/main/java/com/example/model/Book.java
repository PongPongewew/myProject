package com.example.model;

public class Book {
    private String bookName, bookAuthor;
    private int Category, bookImage, Description;

    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCategory() {
        return Category;
    }
    public void setCategory(int category) {
        Category = category;
    }

    public int getBookImage() {
        return bookImage;
    }
    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
    }

    public int getDescription() {
        return Description;
    }
    public void setDescription(int description) {
        Description = description;
    }


    public Book(String bookName,String bookAuthor, int category, int bookImage, int description) {
        this.bookName = bookName;
        this.bookAuthor= bookAuthor;
        Category = category;
        this.bookImage = bookImage;
        Description = description;
    }
}
