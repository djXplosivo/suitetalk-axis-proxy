package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.BaseRef;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Status;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class WriteResponse implements Serializable {
   private Status status;
   private BaseRef baseRef;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(WriteResponse.class, true);

   public WriteResponse() {
      super();
   }

   public WriteResponse(Status status, BaseRef baseRef) {
      super();
      this.status = status;
      this.baseRef = baseRef;
   }

   public Status getStatus() {
      return this.status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public BaseRef getBaseRef() {
      return this.baseRef;
   }

   public void setBaseRef(BaseRef baseRef) {
      this.baseRef = baseRef;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof WriteResponse)) {
         return false;
      } else {
         WriteResponse other = (WriteResponse)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.baseRef == null && other.getBaseRef() == null || this.baseRef != null && this.baseRef.equals(other.getBaseRef()));
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

         if (this.getBaseRef() != null) {
            _hashCode += this.getBaseRef().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("baseRef");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "baseRef"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
