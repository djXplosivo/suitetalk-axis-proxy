package com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling;

import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PhoneCallContactList implements Serializable {
   private PhoneCallContact[] contact;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PhoneCallContactList.class, true);

   public PhoneCallContactList() {
      super();
   }

   public PhoneCallContactList(PhoneCallContact[] contact, boolean replaceAll) {
      super();
      this.contact = contact;
      this.replaceAll = replaceAll;
   }

   public PhoneCallContact[] getContact() {
      return this.contact;
   }

   public void setContact(PhoneCallContact[] contact) {
      this.contact = contact;
   }

   public PhoneCallContact getContact(int i) {
      return this.contact[i];
   }

   public void setContact(int i, PhoneCallContact _value) {
      this.contact[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PhoneCallContactList)) {
         return false;
      } else {
         PhoneCallContactList other = (PhoneCallContactList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.contact == null && other.getContact() == null || this.contact != null && Arrays.equals(this.contact, other.getContact())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getContact() != null) {
            for(int i = 0; i < Array.getLength(this.getContact()); ++i) {
               Object obj = Array.get(this.getContact(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         _hashCode += (this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
      typeDesc.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallContactList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("contact");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "contact"));
      elemField.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallContact"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
