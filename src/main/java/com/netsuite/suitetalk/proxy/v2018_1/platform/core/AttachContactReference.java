package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AttachContactReference extends AttachReference implements Serializable {
   private RecordRef contact;
   private RecordRef contactRole;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AttachContactReference.class, true);

   public AttachContactReference() {
      super();
   }

   public AttachContactReference(BaseRef attachTo, RecordRef contact, RecordRef contactRole) {
      super(attachTo);
      this.contact = contact;
      this.contactRole = contactRole;
   }

   public RecordRef getContact() {
      return this.contact;
   }

   public void setContact(RecordRef contact) {
      this.contact = contact;
   }

   public RecordRef getContactRole() {
      return this.contactRole;
   }

   public void setContactRole(RecordRef contactRole) {
      this.contactRole = contactRole;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AttachContactReference)) {
         return false;
      } else {
         AttachContactReference other = (AttachContactReference)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.contactRole == null && other.getContactRole() == null || this.contactRole != null && this.contactRole.equals(other.getContactRole()));
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
         if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
         }

         if (this.getContactRole() != null) {
            _hashCode += this.getContactRole().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AttachContactReference"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("contact");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "contact"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contactRole");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "contactRole"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
