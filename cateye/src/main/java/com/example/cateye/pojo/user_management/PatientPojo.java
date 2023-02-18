package com.example.cateye.pojo.user_management;



import com.example.cateye.entity.user_management.Patient;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PatientPojo {

    private Integer id;

    @NotEmpty(message = "Email can't be empty")
    private String email;

    @NotEmpty(message = "Fname can't be empty")
    private String fname;
    @NotEmpty(message = "lname can't be empty")
    private String lname;

    @NotEmpty(message = "Mobile Number can't be empty")
    private String mobile_no;
    @NotEmpty(message = "dob can't be empty")
    private String dob;
    @NotEmpty(message = "doctor can't be empty")
    private String doc;

    @NotEmpty(message = "treatment can't be empty")
    private String treatment;



    public PatientPojo(Patient patient){
        this.id=patient.getId();
        this.email=patient.getEmail();
        this.fname=patient.getFname();
        this.mobile_no=patient.getMobileNo();
        this.dob= patient.getDob();
        this.doc= patient.getDoc();
        this.treatment= patient.getTreatment();
        this.lname = patient.getLname();
    }
}
