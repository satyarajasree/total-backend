package com.rajasreeit.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PunchActivityDTO {

    private String date;
    private boolean punchInImagePresent;
    private boolean punchOutImagePresent;

    public PunchActivityDTO(String date, boolean punchInImagePresent, boolean punchOutImagePresent) {
        this.date = date;
        this.punchInImagePresent = punchInImagePresent;
        this.punchOutImagePresent = punchOutImagePresent;
    }
}