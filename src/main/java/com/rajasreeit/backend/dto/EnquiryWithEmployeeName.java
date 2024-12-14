package com.rajasreeit.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnquiryWithEmployeeName {
    private int id;
    private String title;
    private String message;
    private String employeeName;
}
