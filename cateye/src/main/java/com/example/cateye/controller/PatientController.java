package com.example.cateye.controller;
import com.example.cateye.entity.user_management.User;
import com.example.cateye.pojo.user_management.PatientPojo;
import com.example.cateye.repo.user_management.PatientRepo;
import com.example.cateye.services.user_management.PatientService;
import com.example.cateye.entity.user_management.Patient;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
//@RequestMapping("/patient")
public class PatientController {
    private final PatientService patientService;
    @GetMapping("/listt")
    public String getUSerList(Model model) {
        List<Patient> patients = patientService.fetchAll();


        model.addAttribute("patientList", patients);

//

        return "doctor_list";
    }

//    @GetMapping("/listt")
//    public String getUserist(Model model){
//        List<Patient> patient =patientService.fetchAll();
//        model.addAttribute("patientlist",patient);
//        return "doctor_list";
//    }

    @GetMapping("/dashboard")
    public String createUser(Model model
    ){
        model.addAttribute("patient",new PatientPojo());
        return "dashboard";
    }

    @PostMapping("/sav")
    public String saveUser(@Valid PatientPojo patientPojo){
        patientService.saveUser(patientPojo);
        return "redirect:/listt";
    }

//    @GetMapping("/edi/{id}")
//    public String editUser(@PathVariable("id") Integer id, Model model){
//        Patient patient = patientService.fetchbyId(id);
//        model.addAttribute("patient", new PatientPojo(patient));
//        return "dashboard";
//    }
//    @GetMapping("/delet/{id}")
//    public String deleteuser(@PathVariable("id") Integer id){
//        patientService.deleteById(id);
//        return "redirect:/listt";
//    }
}




