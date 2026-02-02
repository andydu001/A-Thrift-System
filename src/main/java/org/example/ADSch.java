package org.example;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClient;
import org.apache.thrift.async.TAsyncMethodCall;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TNonblockingTransport;

public class ADSch extends TAsyncMethodCall {
    protected ADSch(TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport, AsyncMethodCallback callback, boolean isOneway) {
        super(client, protocolFactory, transport, callback, isOneway);



    }

    @Override
    protected void write_args(TProtocol protocol) throws TException {
        protocol.writeString("a");

    }

    @Override
    protected Object getResult() throws Exception {
        return null;
    }
}
