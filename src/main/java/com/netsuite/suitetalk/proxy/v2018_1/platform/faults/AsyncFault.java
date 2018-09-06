package com.netsuite.suitetalk.proxy.v2018_1.platform.faults;

import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.types.FaultCodeType;
import java.io.IOException;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.xml.sax.Attributes;

public class AsyncFault extends SoapFault implements Serializable {
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AsyncFault.class, true);

   public AsyncFault() {
      super();
   }

   public AsyncFault(FaultCodeType code, String message1) {
      super(code, message1);
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AsyncFault)) {
         return false;
      } else {
         AsyncFault other = (AsyncFault)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj);
            this.__equalsCalc = null;
            return _equals;
         }
      }
   }

   public synchronized int hashCode() {
      if (this.__hashCodeCalc) {
         return 0;
      } else {
         this.__hashCodeCalc = true;
         int _hashCode = super.hashCode();
         this.__hashCodeCalc = false;
         return _hashCode;
      }
   }

   public static TypeDesc getTypeDesc() {
      return typeDesc;
   }

   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanSerializer(_javaType, _xmlType, typeDesc);
   }

   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanDeserializer(_javaType, _xmlType, typeDesc);
   }

   public void writeDetails(QName qname, SerializationContext context) throws IOException {
      context.serialize(qname, (Attributes)null, this);
   }

   static {
      typeDesc.setXmlType(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "AsyncFault"));
   }
}
