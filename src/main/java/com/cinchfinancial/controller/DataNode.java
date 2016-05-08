package com.cinchfinancial.controller;

import java.io.Serializable;

/**
 * Created by jbhambhani on 4/20/16.
 */
public class DataNode implements Serializable{

    private String dataNodeName;
    private DataNode result;

    public DataNode () {

    }
    public DataNode (String dataNodeName) {

        this.dataNodeName = dataNodeName;
    }

    public String getDataNodeName() {
        return dataNodeName;
    }

    public void setDataNodeName(String dataNodeName) {
        this.dataNodeName = dataNodeName;
    }

    public DataNode getResult() {
        return result;
    }

    public void setResult(DataNode result) {
        this.result = result;
    }
}
