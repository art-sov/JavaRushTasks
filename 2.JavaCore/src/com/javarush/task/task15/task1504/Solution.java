package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора — название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }
    public static class MarkTwainBook extends Book{
        private String title = "Tom Sawyer";
        public MarkTwainBook (String title){
            super("Mark Twain");
            this.title = title;
        }
        public MarkTwainBook getBook(){
            return this;
        }

        public String getTitle(){
            return title;
        }
    }

    public static class AgathaChristieBook extends Book{
        private String title = "Hercule Poirot";
        public AgathaChristieBook (String title){
            super("Agatha Christie");
            this.title = title;
        }
        public AgathaChristieBook getBook(){
            return this;
        }
        public String getTitle(){
            return title;
        }

    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            if(author.equals("Agatha Christie"))
                return agathaChristieOutput;

            else if(author.equals("Mark Twain"))
                return markTwainOutput;
            else return null;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
