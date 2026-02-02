package org.example;

import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.partial.ThriftMetadata;
import org.apache.thrift.partial.ThriftMetadata.ThriftContainer;
import org.apache.thrift.transport.TTransportException;

public class ANDPatial extends ThriftContainer{


    public ANDPatial(ThriftMetadata.ThriftObject parent, TFieldIdEnum fieldId, FieldMetaData data) throws TTransportException {
        super(parent, fieldId, data);





    }

    @Override
    public boolean hasUnion() {
        return false;
    }

    @Override
    protected void toPrettyString(StringBuilder sb, int level) {
        sb.append("A");
    }
}
