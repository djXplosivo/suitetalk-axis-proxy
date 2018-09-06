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

public class WriteResponseList implements Serializable {
   private Status status;
   private WriteResponse[] writeResponse;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(WriteResponseList.class, true);

   public WriteResponseList() {
      super();
   }

   public WriteResponseList(Status status, WriteResponse[] writeResponse) {
      super();
      this.status = status;
      this.writeResponse = writeResponse;
   }

   public Status getStatus() {
      return this.status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public WriteResponse[] getWriteResponse() {
      return this.writeResponse;
   }

   public void setWriteResponse(WriteResponse[] writeResponse) {
      this.writeResponse = writeResponse;
   }

   public WriteResponse getWriteResponse(int i) {
      return this.writeResponse[i];
   }

   public void setWriteResponse(int i, WriteResponse _value) {
      this.writeResponse[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof WriteResponseList)) {
         return false;
      } else {
         WriteResponseList other = (WriteResponseList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.writeResponse == null && other.getWriteResponse() == null || this.writeResponse != null && Arrays.equals(this.writeResponse, other.getWriteResponse()));
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

         if (this.getWriteResponse() != null) {
            for(int i = 0; i < Array.getLength(this.getWriteResponse()); ++i) {
               Object obj = Array.get(this.getWriteResponse(), i);
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("writeResponse");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      elemField.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
