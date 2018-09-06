package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ApplicationInfo implements Serializable {
   private String applicationId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ApplicationInfo.class, true);

   public ApplicationInfo() {
      super();
   }

   public ApplicationInfo(String applicationId) {
      super();
      this.applicationId = applicationId;
   }

   public String getApplicationId() {
      return this.applicationId;
   }

   public void setApplicationId(String applicationId) {
      this.applicationId = applicationId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ApplicationInfo)) {
         return false;
      } else {
         ApplicationInfo other = (ApplicationInfo)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.applicationId == null && other.getApplicationId() == null || this.applicationId != null && this.applicationId.equals(other.getApplicationId());
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
         if (this.getApplicationId() != null) {
            _hashCode += this.getApplicationId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ApplicationInfo"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("applicationId");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "applicationId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
