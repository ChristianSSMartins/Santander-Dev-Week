package com.project.BootcampSantander.exceptions;

import com.project.BootcampSantander.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
