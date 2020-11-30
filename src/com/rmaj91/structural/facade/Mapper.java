package com.rmaj91.structural.facade;

public class Mapper {

    public String mapResult(String result) {
        System.out.println("Mapping result");
        return "mappedResult";
    }

    public String createSql(String data) {
        System.out.println("CreatingSql");
        return "query";
    }
}
