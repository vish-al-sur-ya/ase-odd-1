package com.collegelibrary.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleDataConfig {
    @Bean
    CommandLineRunner loadSampleBooks(BookRepository repository) {
        return args -> {
            if (repository.findAll().isEmpty()) {
                repository.save(new Book("Clean Code", "Robert C. Martin", "9780132350884", "Programming", "A practical guide to writing readable, maintainable code.", "A-12", 4));
                repository.save(new Book("The Alchemist", "Paulo Coelho", "9780062315007", "Fiction", "A student's journey of dreams, courage, and discovery.", "B-04", 3));
                repository.save(new Book("Introduction to Algorithms", "Thomas H. Cormen", "9780262046305", "Computer Science", "A classic reference for algorithm design and analysis.", "C-21", 2));
                repository.save(new Book("Atomic Habits", "James Clear", "9780735211292", "Self Development", "Small changes that build remarkable results over time.", "D-08", 5));
                repository.save(new Book("Effective Java", "Joshua Bloch", "9780134685991", "Programming", "Best practices for modern Java development.", "A-13", 3));
                repository.save(new Book("Head First Java", "Kathy Sierra", "9780596009205", "Programming", "A visual introduction to Java programming.", "A-14", 4));
                repository.save(new Book("Python Crash Course", "Eric Matthes", "9781593279288", "Programming", "A hands-on introduction to Python.", "A-15", 3));
                repository.save(new Book("Eloquent JavaScript", "Marijn Haverbeke", "9781593279509", "Programming", "Modern JavaScript explained through practical examples.", "A-16", 2));
                repository.save(new Book("Database System Concepts", "Abraham Silberschatz", "9780078022159", "Computer Science", "Core concepts of database systems.", "C-22", 3));
                repository.save(new Book("Computer Networks", "Andrew S. Tanenbaum", "9780132126953", "Computer Science", "An introduction to computer networking.", "C-23", 2));
                repository.save(new Book("Operating System Concepts", "Abraham Silberschatz", "9781119456339", "Computer Science", "Fundamentals of operating systems.", "C-24", 3));
                repository.save(new Book("Artificial Intelligence", "Stuart Russell", "9780134610993", "Computer Science", "A modern introduction to artificial intelligence.", "C-25", 2));
                repository.save(new Book("The Pragmatic Programmer", "Andrew Hunt", "9780135957059", "Software Engineering", "Practical advice for software professionals.", "A-17", 4));
                repository.save(new Book("Software Engineering", "Ian Sommerville", "9780133943030", "Software Engineering", "Software process, design, and project management.", "A-18", 3));
                repository.save(new Book("Design Patterns", "Erich Gamma", "9780201633610", "Software Engineering", "Reusable solutions for object-oriented design.", "A-19", 2));
                repository.save(new Book("You Don't Know JS", "Kyle Simpson", "9781491904244", "Web Development", "A deep guide to JavaScript language concepts.", "B-10", 3));
                repository.save(new Book("Learning React", "Alex Banks", "9781492051725", "Web Development", "Build interactive web interfaces with React.", "B-11", 3));
                repository.save(new Book("HTML and CSS", "Jon Duckett", "9781118008188", "Web Development", "A visual guide to web page structure and styling.", "B-12", 4));
                repository.save(new Book("The Design of Everyday Things", "Don Norman", "9780465050659", "Design", "How thoughtful design improves everyday experiences.", "D-09", 2));
                repository.save(new Book("Don't Make Me Think", "Steve Krug", "9780321965516", "Design", "A guide to web usability.", "D-10", 3));
                repository.save(new Book("The Art of War", "Sun Tzu", "9781599869773", "History", "A classic text on strategy and leadership.", "E-01", 2));
                repository.save(new Book("Sapiens", "Yuval Noah Harari", "9780062316097", "History", "A brief history of humankind.", "E-02", 3));
                repository.save(new Book("Wings of Fire", "A. P. J. Abdul Kalam", "9788173711466", "Biography", "The inspiring autobiography of India's former president.", "E-03", 4));
                repository.save(new Book("The Diary of a Young Girl", "Anne Frank", "9780553296983", "Biography", "The diary of Anne Frank during World War II.", "E-04", 2));
                repository.save(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "9781612680194", "Finance", "Lessons about money and financial independence.", "D-11", 3));
                repository.save(new Book("Think and Grow Rich", "Napoleon Hill", "9781585424337", "Self Development", "Classic principles for personal achievement.", "D-12", 2));
                repository.save(new Book("The 7 Habits of Highly Effective People", "Stephen Covey", "9781982137274", "Self Development", "A framework for personal and professional growth.", "D-13", 3));
                repository.save(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Fiction", "A landmark novel about justice and compassion.", "B-05", 2));
                repository.save(new Book("1984", "George Orwell", "9780451524935", "Fiction", "A powerful novel about surveillance and freedom.", "B-06", 3));
                repository.save(new Book("Pride and Prejudice", "Jane Austen", "9780141439518", "Fiction", "A beloved novel of manners and relationships.", "B-07", 2));
            }
        };
    }
}
