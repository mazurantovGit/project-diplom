package com.floor.web.utils;

import lombok.Getter;

public class Constants {

    public enum StatusService {
        ACTIVE("ACTIVE"), NOT_ACTIVE("NOT_ACTIVE");

        @Getter
        private String value;

        StatusService(String value) {
            this.value = value;
        }
    }

    public enum Request {}
}
