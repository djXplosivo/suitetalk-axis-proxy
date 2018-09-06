package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomerGroupPricing implements Serializable {
   private RecordRef group;
   private RecordRef level;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomerGroupPricing.class, true);

   public CustomerGroupPricing() {
      super();
   }

   public CustomerGroupPricing(RecordRef group, RecordRef level) {
      super();
      this.group = group;
      this.level = level;
   }

   public RecordRef getGroup() {
      return this.group;
   }

   public void setGroup(RecordRef group) {
      this.group = group;
   }

   public RecordRef getLevel() {
      return this.level;
   }

   public void setLevel(RecordRef level) {
      this.level = level;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomerGroupPricing)) {
         return false;
      } else {
         CustomerGroupPricing other = (CustomerGroupPricing)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel()));
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
         if (this.getGroup() != null) {
            _hashCode += this.getGroup().hashCode();
         }

         if (this.getLevel() != null) {
            _hashCode += this.getLevel().hashCode();
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerGroupPricing"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("group");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "group"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("level");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "level"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
