package com.cinchfinancial.controller;

import akka.actor.UntypedActor;

/**
 * Created by jbhambhani on 4/30/16.
 */
public class WorkerActor extends UntypedActor{

    public void onReceive(Object message){

        if (message instanceof FlowVector) {
            FlowVector flowNode = (FlowVector) message;
            if (flowNode.checkDependencies()) {
                flowNode.calculate();
            }
        }

    }
}
