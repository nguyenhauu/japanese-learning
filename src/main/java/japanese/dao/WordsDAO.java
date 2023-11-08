package japanese.dao;

import java.util.List;

import org.hibernate.jdbc.Work;

public interface WordsDAO {

    public List<WordsDAO> getWordss();
    public void saveLesson(WordsDAO theWords);
	public List<WordsDAO> getAllWord();
	public WordsDAO addWord(Work word);
	public void setId(Long id);
	public WordsDAO updateWord(WordsDAO word);
	public void deleteWord(Long id);

}
