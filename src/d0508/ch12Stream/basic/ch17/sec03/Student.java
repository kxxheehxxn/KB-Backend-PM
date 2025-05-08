package d0508.ch12Stream.basic.ch17.sec03;


import lombok.Data;

@Data
public class Student {
    private String name;
    private int score;
    public Student (String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() { return name; }
    public int getScore() { return score; }
}