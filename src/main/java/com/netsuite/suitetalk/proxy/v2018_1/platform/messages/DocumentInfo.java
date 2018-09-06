package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DocumentInfo implements Serializable {
   private String nsId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DocumentInfo.class, true);

   public DocumentInfo() {
      super();
   }

   public DocumentInfo(String nsId) {
      super();
      this.nsId = nsId;
   }

   public String getNsId() {
      return this.nsId;
   }

   public void setNsId(String nsId) {
      this.nsId = nsId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DocumentInfo)) {
         return false;
      } else {
         DocumentInfo other = (DocumentInfo)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.nsId == null && other.getNsId() == null || this.nsId != null && this.nsId.equals(other.getNsId());
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
         if (this.getNsId() != null) {
            _hashCode += this.getNsId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "DocumentInfo"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("nsId");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "nsId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
