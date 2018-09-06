package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AsyncGetListResult extends AsyncResult implements Serializable {
   private ReadResponseList readResponseList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AsyncGetListResult.class, true);

   public AsyncGetListResult() {
      super();
   }

   public AsyncGetListResult(ReadResponseList readResponseList) {
      super();
      this.readResponseList = readResponseList;
   }

   public ReadResponseList getReadResponseList() {
      return this.readResponseList;
   }

   public void setReadResponseList(ReadResponseList readResponseList) {
      this.readResponseList = readResponseList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AsyncGetListResult)) {
         return false;
      } else {
         AsyncGetListResult other = (AsyncGetListResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.readResponseList == null && other.getReadResponseList() == null || this.readResponseList != null && this.readResponseList.equals(other.getReadResponseList()));
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
         if (this.getReadResponseList() != null) {
            _hashCode += this.getReadResponseList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncGetListResult"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("readResponseList");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "readResponseList"));
      elemField.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponseList"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
