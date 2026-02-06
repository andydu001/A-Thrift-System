package org.example;

import org.apache.thrift.TBaseAsyncProcessor;

import org.apache.thrift.TException;

import org.apache.thrift.protocol.TProtocol;

import java.util.Map;

public class TbaseAsync extends TBaseAsyncProcessor {
    public TbaseAsync(Object iface, Map processMap, TProtocol in , TProtocol  ou) throws TException {
        super(iface, processMap);

        process(in,ou);


    }


}
