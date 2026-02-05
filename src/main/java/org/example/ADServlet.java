package org.example;

import org.apache.thrift.ProcessFunction;

import org.apache.thrift.TBase;

import org.apache.thrift.TException;



public class ADServlet extends ProcessFunction{


    public ADServlet(String methodName) {
        super(methodName);

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

        return TbaseZ.getInstance().deepCopy();
    }

}
