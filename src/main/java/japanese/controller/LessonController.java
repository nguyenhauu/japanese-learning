package japanese.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import japanese.dao.LessonDAO;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    private final LessonDAO lessonDAO;

    public LessonController(LessonDAO lessonDAO) {
        this.lessonDAO = lessonDAO;
    }

    @GetMapping
    public List<LessonDAO> getAllLesson() {
        return lessonDAO.getAllLessonDAO();
    }

    @PostMapping
    public LessonDAO addLesson(@RequestBody LessonDAO lesson) {
        return lessonDAO.addLesson(lesson);
    }

    @PutMapping("/{id}")
    public LessonDAO updateLesson(@PathVariable Long id, @RequestBody LessonDAO lesson) {
        lesson.setId(id);
        return lessonDAO.updateLesson(lesson);
    }

    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable Long id) {
        lessonDAO.deleteLesson(id);
    }
}