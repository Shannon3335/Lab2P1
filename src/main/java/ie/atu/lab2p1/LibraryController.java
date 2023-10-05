package ie.atu.lab2p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService){
        this.libraryService = libraryService;
    }
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        libraryService.addBook(book);
        return book;
    }
}
