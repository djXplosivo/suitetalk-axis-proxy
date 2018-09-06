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

public class TaxTypeNexusesTax implements Serializable {
   private RecordRef nexus;
   private String description;
   private RecordRef saleTaxAcct;
   private RecordRef purchTaxAcct;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(TaxTypeNexusesTax.class, true);

   public TaxTypeNexusesTax() {
      super();
   }

   public TaxTypeNexusesTax(RecordRef nexus, String description, RecordRef saleTaxAcct, RecordRef purchTaxAcct) {
      super();
      this.nexus = nexus;
      this.description = description;
      this.saleTaxAcct = saleTaxAcct;
      this.purchTaxAcct = purchTaxAcct;
   }

   public RecordRef getNexus() {
      return this.nexus;
   }

   public void setNexus(RecordRef nexus) {
      this.nexus = nexus;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public RecordRef getSaleTaxAcct() {
      return this.saleTaxAcct;
   }

   public void setSaleTaxAcct(RecordRef saleTaxAcct) {
      this.saleTaxAcct = saleTaxAcct;
   }

   public RecordRef getPurchTaxAcct() {
      return this.purchTaxAcct;
   }

   public void setPurchTaxAcct(RecordRef purchTaxAcct) {
      this.purchTaxAcct = purchTaxAcct;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof TaxTypeNexusesTax)) {
         return false;
      } else {
         TaxTypeNexusesTax other = (TaxTypeNexusesTax)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.saleTaxAcct == null && other.getSaleTaxAcct() == null || this.saleTaxAcct != null && this.saleTaxAcct.equals(other.getSaleTaxAcct())) && (this.purchTaxAcct == null && other.getPurchTaxAcct() == null || this.purchTaxAcct != null && this.purchTaxAcct.equals(other.getPurchTaxAcct()));
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
         if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getSaleTaxAcct() != null) {
            _hashCode += this.getSaleTaxAcct().hashCode();
         }

         if (this.getPurchTaxAcct() != null) {
            _hashCode += this.getPurchTaxAcct().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeNexusesTax"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("nexus");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "nexus"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("saleTaxAcct");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "saleTaxAcct"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchTaxAcct");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "purchTaxAcct"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
