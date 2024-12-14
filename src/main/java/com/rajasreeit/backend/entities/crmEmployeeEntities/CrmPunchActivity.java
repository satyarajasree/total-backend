package com.rajasreeit.backend.entities.crmEmployeeEntities;

import com.rajasreeit.backend.entities.CrmEmployee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CrmPunchActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private CrmEmployee crmEmployee;

    private String date;

    private String timeOfPunchIn;
    private String timeOfPunchOut;

    @Lob
    private byte[] punchInImage;  // Store punch-in image as a LOB
    @Lob
    private byte[] punchOutImage;  // Store punch-out image as a LOB

    // Login time (calculated field)

    private long loginTime; // Time difference in seconds


    public void calculateLoginTime() {
        if (timeOfPunchIn != null && timeOfPunchOut != null) {
            LocalTime punchIn = LocalTime.parse(timeOfPunchIn);
            LocalTime punchOut = LocalTime.parse(timeOfPunchOut);
            Duration duration = Duration.between(punchIn, punchOut);
            this.loginTime = duration.getSeconds();  // Store the time difference in seconds
        }
    }

}
