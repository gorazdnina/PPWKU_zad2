package com.example.Lab2.service;

import com.example.Lab2.dto.CountRequest;
import com.example.Lab2.dto.CountResponse;
import org.springframework.stereotype.Service;

@Service
public class StringService {
    public CountResponse countString(CountRequest countRequest) {
        String toCount = countRequest.getString();
        CountResponse countResponse = new CountResponse();
        for (int k = 0; k < toCount.length(); k++) {
            if (Character.isUpperCase(toCount.charAt(k))) countResponse.setUppercaseLetters(countResponse.getUppercaseLetters()+1);
            else if (Character.isLowerCase(toCount.charAt(k))) countResponse.setLowercaseLetters(countResponse.getLowercaseLetters()+1);
            else if (Character.isDigit(toCount.charAt(k))) countResponse.setDigits(countResponse.getDigits()+1);
            else if (!Character.isWhitespace(toCount.charAt(k))) countResponse.setSpecialSigns(countResponse.getSpecialSigns()+1);
        }
        countResponse.setNumOfOccurrences((long) (toCount.split(countRequest.getExpression(), -1).length-1));
        return countResponse;
    }
}
