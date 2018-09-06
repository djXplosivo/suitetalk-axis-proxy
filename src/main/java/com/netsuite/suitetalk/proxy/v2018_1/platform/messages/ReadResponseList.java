package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Status;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ReadResponseList implements Serializable {
   private Status status;
   private ReadResponse[] readResponse;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ReadResponseList.class, true);

   public ReadResponseList() {
      super();
   }

   public ReadResponseList(Status status, ReadResponse[] readResponse) {
      super();
      this.status = status;
      this.readResponse = readResponse;
   }

   public Status getStatus() {
      return this.status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public ReadResponse[] getReadResponse() {
      return this.readResponse;
   }

   public void setReadResponse(ReadResponse[] readResponse) {
      this.readResponse = readResponse;
   }

   public ReadResponse getReadResponse(int i) {
      return this.readResponse[i];
   }

   public void setReadResponse(int i, ReadResponse _value) {
      this.readResponse[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ReadResponseList)) {
         return false;
      } else {
         ReadResponseList other = (ReadResponseList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.readResponse == null && other.getReadResponse() == null || this.readResponse != null && Arrays.equals(this.readResponse, other.getReadResponse()));
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
         int _hashCode = 1;
         if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
         }

         if (this.getReadResponse() != null) {
            for(int i = 0; i < Array.getLength(this.getReadResponse()); ++i) {
               Object obj = Array.get(this.getReadResponse(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponseList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("readResponse");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "readResponse"));
      elemField.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponse"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
