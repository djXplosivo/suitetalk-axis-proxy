package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AsyncDeleteListResult extends AsyncResult implements Serializable {
   private WriteResponseList writeResponseList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AsyncDeleteListResult.class, true);

   public AsyncDeleteListResult() {
      super();
   }

   public AsyncDeleteListResult(WriteResponseList writeResponseList) {
      super();
      this.writeResponseList = writeResponseList;
   }

   public WriteResponseList getWriteResponseList() {
      return this.writeResponseList;
   }

   public void setWriteResponseList(WriteResponseList writeResponseList) {
      this.writeResponseList = writeResponseList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AsyncDeleteListResult)) {
         return false;
      } else {
         AsyncDeleteListResult other = (AsyncDeleteListResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.writeResponseList == null && other.getWriteResponseList() == null || this.writeResponseList != null && this.writeResponseList.equals(other.getWriteResponseList()));
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
         if (this.getWriteResponseList() != null) {
            _hashCode += this.getWriteResponseList().hashCode();
         }

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

   static {
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncDeleteListResult"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("writeResponseList");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponseList"));
      elemField.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
