package org.example;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.*;

import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class HIOZ extends TFileProcessor{
    public HIOZ(TProcessor processor, TProtocolFactory protocolFactory, TFileTransport inputTransport, TTransport outputTransport) throws FileNotFoundException, TTransportException {
        super(processor, protocolFactory, inputTransport, outputTransport);


        new TPD_WI(new SaslClient() {
            @Override
            public String getMechanismName() {
                return "GSSS";
            }

            @Override
            public boolean hasInitialResponse() {
                return false;
            }

            @Override
            public byte[] evaluateChallenge(byte[] challenge) throws SaslException {
                return new byte[0];
            }

            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public byte[] unwrap(byte[] incoming, int offset, int len) throws SaslException {
                return new byte[0];
            }

            @Override
            public byte[] wrap(byte[] outgoing, int offset, int len) throws SaslException {
                return new byte[0];
            }

            @Override
            public Object getNegotiatedProperty(String propName) {
                return null;
            }

            @Override
            public void dispose() throws SaslException {

            }
        }, new TIOStreamTransport(new FileOutputStream("C:\\Users\\andyd\\OneDrive\\Documents\\code-DESKTOP-83VUJUN.txt")));


    }
}
