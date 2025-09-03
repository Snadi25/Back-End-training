package viikkoharjoitus2.kotitehtavat.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import viikkoharjoitus2.kotitehtavat.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    public static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("Aku", "Ankka"));
        students.add(new Student("Iines", "Ankka"));
        students.add(new Student("Hannu", "Hanhi"));
    }

    @GetMapping("/hello2")
    public String showStudents(Model model) {
        model.addAttribute("students", students);
        return "students";
    }

}
