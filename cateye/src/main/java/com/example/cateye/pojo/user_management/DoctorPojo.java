package com.example.cateye.pojo.user_management;


import com.example.cateye.entity.user_management.Doctor;
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

public class DoctorPojo{

    private Integer id;



    @NotEmpty(message = "Full name can't be empty")
    private String fullname;

    @NotEmpty(message = "qualification can't be empty")
    private String qualification;

    @NotEmpty(message = "feild can't be empty")
    private String feild;

    @NotEmpty(message = "time can't be empty")
    private String time;

    public DoctorPojo(Doctor doctor){
        this.id=doctor.getId();
        this.qualification=doctor.getQualification();
        this.fullname=doctor.getFullname();
        this.feild=doctor.getFeild();
        this.time=doctor.getTime();
    }
}

