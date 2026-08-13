package com.springBook.readingList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ReadingListController {

    private final ReadingListRepository readingListRepository;

    // Inject the repository to access and persist reading list data.
    public ReadingListController(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    // Handles GET requests and retrieves the reader's books from the database.
    @GetMapping("/{reader}")
    public String readersBooks(
            @PathVariable String reader,
            Model model) {

        List<Book> readingList =
                readingListRepository.findByReader(reader);

        // Make the retrieved books available to the Thymeleaf view.
        model.addAttribute("books", readingList);

        return "readingList";
    }

    // Handles POST requests for adding a new book to the reader's list.
    @PostMapping("/{reader}")
    public String addToReadingList(
            @PathVariable String reader,
            Book book) {

        book.setReader(reader);
        readingListRepository.save(book);

        // Redirect to the reader's list so the newly added book is displayed.
        return "redirect:/" + reader;
    }
}