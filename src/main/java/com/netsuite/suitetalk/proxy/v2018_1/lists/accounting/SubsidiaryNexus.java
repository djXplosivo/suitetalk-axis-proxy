package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SubsidiaryNexus implements Serializable {
   private RecordRef nexusId;
   private String country;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SubsidiaryNexus.class, true);

   public SubsidiaryNexus() {
      super();
   }

   public SubsidiaryNexus(RecordRef nexusId, String country) {
      super();
      this.nexusId = nexusId;
      this.country = country;
   }

   public RecordRef getNexusId() {
      return this.nexusId;
   }

   public void setNexusId(RecordRef nexusId) {
      this.nexusId = nexusId;
   }

   public String getCountry() {
      return this.country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SubsidiaryNexus)) {
         return false;
      } else {
         SubsidiaryNexus other = (SubsidiaryNexus)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.nexusId == null && other.getNexusId() == null || this.nexusId != null && this.nexusId.equals(other.getNexusId())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry()));
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
         if (this.getNexusId() != null) {
            _hashCode += this.getNexusId().hashCode();
         }

         if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryNexus"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("nexusId");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "nexusId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("country");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "country"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
