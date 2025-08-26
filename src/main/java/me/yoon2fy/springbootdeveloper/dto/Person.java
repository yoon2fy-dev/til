package me.yoon2fy.springbootdeveloper.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Person {
    private Long id;
    private String name;
    private int age;
    private List<String> hobbies;
}
