package com.cinchfinancial.controller;

import akka.actor.UntypedActor;

import java.io.Serializable;

/**
 * Created by jbhambhani on 4/20/16.
 */
abstract class GraphVector implements Serializable {

    private String flowNodeName;
    private DataNode flowResult;

    public GraphVector(String flowNodeName) {
        this.flowNodeName = flowNodeName;
        this.flowResult = null;
    }



    public String getFlowNodeName() {
        return flowNodeName;
    }

    public void setFlowNodeName(String flowNodeName) {
        this.flowNodeName = flowNodeName;
    }

    public DataNode getFlowResult() {
        return flowResult;
    }

    public void setFlowResult(DataNode flowResult) {
        this.flowResult = flowResult;
    }
}
