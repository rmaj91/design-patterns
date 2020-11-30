package com.rmaj91.structural.facade;

public class SqlClientImpl implements SqlClient {

    private DbDriver dbDriver;
    private Mapper mapper;

    @Override
    public String executeQuery(String data) {
        dbDriver.openConnection();
        String query = mapper.createSql(data);
        dbDriver.executeQuery(query);
        String result = dbDriver.getResult();
        String mapResult = mapper.mapResult(result);
        dbDriver.closeConnection();
        return mapResult;
    }
}
