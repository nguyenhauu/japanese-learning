package japanese.dao;

import java.util.List;

public interface LessonDAO {

    public List<LessonDAO> getLessons();
    public void saveLesson(LessonDAO theLesson);
	public List<LessonDAO> getAllLessonDAO();
	public LessonDAO addLesson(LessonDAO lesson);
	public void setId(Long id);
	public LessonDAO updateLesson(LessonDAO lesson);
	public void deleteLesson(Long id);

}
