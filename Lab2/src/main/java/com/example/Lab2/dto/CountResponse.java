package com.example.Lab2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountResponse {
    private Long uppercaseLetters;
    private Long lowercaseLetters;
    private Long specialSigns;
    private Long numOfOccurrences;
}
