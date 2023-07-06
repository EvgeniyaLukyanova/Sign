package ru.gazprom.gptrans.signatury.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum LogOperations implements EnumClass<String> {

    REQUEST_LIST_DOCUMENTS("Запрос списка документов"),
    REQUEST_GET_INFO("Запрос получения информации о документе"),
    ECP_REQUEST("Запрос проведения ЭЦП"),
    EXCEPTION("Исключение"),
    RESPONSE_LIST_DOCUMENTS("Ответ на запрос списка документов"),
    RESPONSE_GET_INFO("Ответ на зпрос получения информации о документе"),
    ECP_RESPONSE("Ответ на запрос проведения ЭЦП");

    private String id;

    LogOperations(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static LogOperations fromId(String id) {
        for (LogOperations at : LogOperations.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}