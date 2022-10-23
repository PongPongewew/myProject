package com.example.model;

public class BookVer {
    private String bookName, bookAuthor, bookPage;
    private int bookImage, bookStar,bookFavorite;

    public BookVer(String bookName, String bookAuthor, String bookPage, int bookImage, int bookStar, int bookFavorite) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPage = bookPage;
        this.bookImage = bookImage;
        this.bookStar = bookStar;
        this.bookFavorite = bookFavorite;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPage() {
        return bookPage;
    }

    public void setBookPage(String bookPage) {
        this.bookPage = bookPage;
    }

    public int getBookImage() {
        return bookImage;
    }

    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
    }

    public int getBookStar() {
        return bookStar;
    }

    public void setBookStar(int bookStar) {
        this.bookStar = bookStar;
    }

    public int getBookFavorite() {
        return bookFavorite;
    }

    public void setBookFavorite(int bookFavorite) {
        this.bookFavorite = bookFavorite;
    }
}


