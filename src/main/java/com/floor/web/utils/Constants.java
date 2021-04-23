package com.floor.web.utils;

import lombok.Getter;

public class Constants {

    /*
    Статусы заказа(Активно, Не активно)
     */
    public enum StatusProduct {
        ACTIVE("ACTIVE"), NOT_ACTIVE("NOT_ACTIVE");

        @Getter
        private String value;

        StatusProduct(String value) {
            this.value = value;
        }
    }

    /*
    Статусы заказа(В ожидании, Выполнено, Отменено)
     */
    public enum StatusBid {
        AWAITING("AWAITING"), DONE("DONE"), CANCELED("CANCELED");

        @Getter
        private String value;

        StatusBid(String value) {
            this.value = value;
        }
    }
}
