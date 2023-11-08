package japanese.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "words")
public class words {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;
    private String mean;
    private String example;

    public words() {
    }

    public words(String word, String mean, String example) {
        this.word = word;
        this.mean = mean;
        this.example = example;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", word=" + word + ", mean=" + mean + ", example=" + example + "]";
    }
}
