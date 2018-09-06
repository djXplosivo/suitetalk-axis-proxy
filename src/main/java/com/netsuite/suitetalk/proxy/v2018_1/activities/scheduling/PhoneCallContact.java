package com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;

public class PhoneCallContact implements Serializable {
   private RecordRef company;
   private RecordRef contact;
   private String phone;
   private String email;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PhoneCallContact.class, true);

   public PhoneCallContact() {
      super();
   }

   public PhoneCallContact(RecordRef company, RecordRef contact, String phone, String email) {
      super();
      this.company = company;
      this.contact = contact;
      this.phone = phone;
      this.email = email;
   }

   public RecordRef getCompany() {
      return this.company;
   }

   public void setCompany(RecordRef company) {
      this.company = company;
   }

   public RecordRef getContact() {
      return this.contact;
   }

   public void setContact(RecordRef contact) {
      this.contact = contact;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PhoneCallContact)) {
         return false;
      } else {
         PhoneCallContact other = (PhoneCallContact)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.company == null && other.getCompany() == null || this.company != null && this.company.equals(other.getCompany())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail()));
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
         if (this.getCompany() != null) {
            _hashCode += this.getCompany().hashCode();
         }

         if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
         }

         if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
         }

         if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
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
      typeDesc.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallContact"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("company");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "company"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contact");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "contact"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("phone");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "phone"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("email");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "email"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
