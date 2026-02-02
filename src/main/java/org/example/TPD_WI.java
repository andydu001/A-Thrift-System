package org.example;
import org.apache.thrift.transport.TIOStreamTransport;
import org.apache.thrift.transport.TSaslClientTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.sasl.NegotiationStatus;

import javax.security.sasl.SaslClient;
import java.util.Arrays;

public class TPD_WI extends TSaslClientTransport{
    private static final byte[] b = new byte[0];

    TPD_WI(SaslClient saslClient, TIOStreamTransport streamTransport) throws TTransportException {
        super(saslClient,streamTransport);


        sendSaslMessage(NegotiationStatus.START,b);

        System.out.println("Message Status:\n");
    }
}
