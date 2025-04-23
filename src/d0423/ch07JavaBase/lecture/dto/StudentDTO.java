package d0423.ch07JavaBase.lecture.dto;

import lombok.*;

//DTO : data transfer object
//-> 데이터 전달용 객체
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor // final, notnull 이 붙은 필드가 있으면 이 필드만 초기화 시키는 생성자
//

public class StudentDTO {
    private String name;
    private int age;
    private String email;


    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
