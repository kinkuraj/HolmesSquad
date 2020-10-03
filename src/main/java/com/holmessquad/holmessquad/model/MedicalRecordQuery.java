package com.holmessquad.holmessquad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Setter
@Getter
@NoArgsConstructor
public class MedicalRecordQuery {

    private DateRange dateRange;

    private String hospitalName;

    private String patientName;

    private String doctorName;

    private String illnessDescription;
}
