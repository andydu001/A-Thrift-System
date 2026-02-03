package org.example;

import org.apache.thrift.ProcessFunction;

import org.apache.thrift.TBase;

import org.apache.thrift.TException;

import org.apache.thrift.protocol.TJSONProtocol;

public class ADServlet extends ProcessFunction{

    ADServlet(TJSONProtocol protocol) throws TException {

        super("main");

        process(0,protocol,null,null);

    }

    @Override
    protected boolean isOneway() {


        return true;
    }

    @Override
    public TBase getResult(Object iface, TBase args) throws TException {

        return null;
    }

    @Override
    public TBase getEmptyArgsInstance() {

        return TbaseZ.getInstance();
    }

}
