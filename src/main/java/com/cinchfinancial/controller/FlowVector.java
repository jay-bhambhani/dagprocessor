package com.cinchfinancial.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by jbhambhani on 4/20/16.
 */
public class FlowVector extends GraphVector {

    private String flowVectorName;
    private HashMap<String, DataNode> flowInputs;
    private Function<HashMap<String, DataNode>, DataNode> flowFunction;



    public FlowVector(String flowNodeName, HashMap<String, DataNode> flowInputs,
                      Function<HashMap<String, DataNode>, DataNode> flowFunction) {
        super(flowNodeName);
        this.flowInputs = flowInputs;
        this.flowFunction = flowFunction;

    }


    public boolean checkDependencies(){

        return this.flowInputs.entrySet().stream().map(Map.Entry::getValue)
                .map(DataNode::getResult) != null;
    }

    public void calculate() {
        DataNode dataNode = flowFunction.apply(this.flowInputs);
        setFlowResult(dataNode);
    }


    public HashMap<String, DataNode> getFlowInputs() {
        return flowInputs;
    }

    public void setFlowInputs(HashMap<String, DataNode> flowInputs) {
        this.flowInputs = flowInputs;
    }

    public Function<HashMap<String, DataNode>, DataNode> getFlowFunction() {
        return flowFunction;
    }

    public void setFlowFunction(Function<HashMap<String, DataNode>, DataNode> flowFunction) {
        this.flowFunction = flowFunction;
    }
}
