package d0507.collection.ch15.sec05.exercise;

public class Student implements Comparable<Student>{
    int id;
    String name;
    String email;
    String git;

    public Student(int id, String name, String email, String git) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.git = git;
    }

    @Override
    public int compareTo(Student s){
        if(this.id < s.id) return -1;
        else if(this.id == s.id) return 0;
        else return 1;
    }
}
