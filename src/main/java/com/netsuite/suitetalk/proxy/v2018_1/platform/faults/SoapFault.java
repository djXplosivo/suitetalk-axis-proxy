package com.netsuite.suitetalk.proxy.v2018_1.platform.faults;

import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.types.FaultCodeType;
import java.io.IOException;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.AxisFault;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.xml.sax.Attributes;

public class SoapFault extends AxisFault implements Serializable {
   private FaultCodeType code;
   private String message1;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SoapFault.class, true);

   public SoapFault() {
      super();
   }

   public SoapFault(FaultCodeType code, String message1) {
      super();
      this.code = code;
      this.message1 = message1;
   }

   public FaultCodeType getCode() {
      return this.code;
   }

   public void setCode(FaultCodeType code) {
      this.code = code;
   }

   public String getMessage1() {
      return this.message1;
   }

   public void setMessage1(String message1) {
      this.message1 = message1;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SoapFault)) {
         return false;
      } else {
         SoapFault other = (SoapFault)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.code == null && other.getCode() == null || this.code != null && this.code.equals(other.getCode())) && (this.message1 == null && other.getMessage1() == null || this.message1 != null && this.message1.equals(other.getMessage1()));
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
         if (this.getCode() != null) {
            _hashCode += this.getCode().hashCode();
         }

         if (this.getMessage1() != null) {
            _hashCode += this.getMessage1().hashCode();
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

   public void writeDetails(QName qname, SerializationContext context) throws IOException {
      context.serialize(qname, (Attributes)null, this);
   }

   static {
      typeDesc.setXmlType(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "SoapFault"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("code");
      elemField.setXmlName(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "code"));
      elemField.setXmlType(new QName("urn:types.faults_2018_1.platform.webservices.netsuite.com", "FaultCodeType"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("message1");
      elemField.setXmlName(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "message"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
