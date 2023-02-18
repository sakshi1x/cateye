package com.example.cateye.controller;

import com.example.cateye.entity.user_management.Patient;
import com.example.cateye.pojo.user_management.DoctorPojo;
import com.example.cateye.pojo.user_management.PatientPojo;
import com.example.cateye.pojo.user_management.UserPojo;
import com.example.cateye.repo.user_management.DoctorRepo;
import com.example.cateye.services.user_management.DoctorService;
import com.example.cateye.entity.user_management.Doctor;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
//@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorService doctorService;


    @GetMapping("/listtt")
    public String getUSerList(Model model) {
        List<Doctor> doctors= doctorService.fetchAll();


        model.addAttribute("doctorList", doctors);

//

        return "user_list";}

    @GetMapping("/doctor_input")
    public String createUser(Model model
    ){
        model.addAttribute("patient",new PatientPojo());
        return "doctor_input";
    }

    @PostMapping("/savee")
    public String saveUser(@Valid DoctorPojo doctorPojo){
        doctorService.saveUser(doctorPojo);
        return "redirect:/listtt";
    }

//    @GetMapping("/editt/{id}")
//    public String editUser(@PathVariable("id") Integer id, Model model){
//        Doctor doctor = doctorService.fetchbyId(id);
//        model.addAttribute("user", new DoctorPojo(doctor));
//        return "doctor_list";
//    }
//    @GetMapping("/deletee/{id}")
//    public String deleteuser(@PathVariable("id") Integer id){
//        doctorService.deleteById(id);
//        return "redirect:/listtt";
//    }
}




