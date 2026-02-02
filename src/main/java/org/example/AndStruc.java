package org.example;

import org.apache.thrift.TDeserializer;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.TFieldRequirementType;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.partial.EnumCache;
import org.apache.thrift.partial.ThriftMetadata;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TIOStreamTransport;
import org.apache.thrift.transport.TTransportException;

import java.io.FileInputStream;

public class AndStruc extends TDeserializer{


    public AndStruc(TProtocolFactory protocolFactory) throws TTransportException {
        super(protocolFactory);

    }

}
