package com.kremogen;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Иван", "iva@mail.ru", 'М');
        author1.setEmail("ivan@mail.ru");
        System.out.println("Имя: " + author1.getName() + "\nEmail: " + author1.getEmail() + "\nПол: " + author1.getGender());
    }
}
