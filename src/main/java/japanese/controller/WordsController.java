package japanese.controller;

import java.util.List;

import org.hibernate.jdbc.Work;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import japanese.dao.WordsDAO;

@RestController
@RequestMapping("/word")
public class WordsController {

    private final WordsDAO wordDAO;

    public WordsController(WordsDAO wordDAO) {
        this.wordDAO = wordDAO;
    }

    @GetMapping
    public List<WordsDAO> getAllWord() {
        return wordDAO.getAllWord();
    }

    @PostMapping
    public WordsDAO addWord(@RequestBody Work word) {
        return wordDAO.addWord(word);
    }

    @PutMapping("/{id}")
    public WordsDAO updateWord(@PathVariable Long id, @RequestBody WordsDAO word) {
        word.setId(id);
        return wordDAO.updateWord(word);
    }

    @DeleteMapping("/{id}")
    public void deleteWord(@PathVariable Long id) {
        wordDAO.deleteWord(id);
    }
}

