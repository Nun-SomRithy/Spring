package co.istad.sbdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@RequestMapping("/student")
@Controller
public class StudentController {
    @GetMapping("/get-all")
    @ResponseBody // mean convert to jSON throw data to client
    public String getAllStudent(){
        ArrayList<String> students= new ArrayList<>();
        students.add("Thy");
        students.add("jonh");
        students.add("lilky");
        students.add("looolii");
        return students.toString();
    }
    @GetMapping("/find-by-id/{id}/gender/{gender}")
    @ResponseBody
    public String findStudentById(
            @PathVariable("id") Long studentId,
            @PathVariable("gender") String gender
    ){

        System.out.println("Id : " + studentId);
        System.out.println("gender : " + gender);
        return "id :" +studentId + "|==|  gender :"+ gender;

    }



}
