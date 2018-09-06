package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Term extends Record implements Serializable {
   private String name;
   private Boolean dateDriven;
   private Long daysUntilNetDue;
   private Double discountPercent;
   private Long daysUntilExpiry;
   private Long dayOfMonthNetDue;
   private Long dueNextMonthIfWithinDays;
   private Double discountPercentDateDriven;
   private Long dayDiscountExpires;
   private Boolean preferred;
   private Boolean isInactive;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Term.class, true);

   public Term() {
      super();
   }

   public Term(NullField nullFieldList, String internalId, String externalId, String name, Boolean dateDriven, Long daysUntilNetDue, Double discountPercent, Long daysUntilExpiry, Long dayOfMonthNetDue, Long dueNextMonthIfWithinDays, Double discountPercentDateDriven, Long dayDiscountExpires, Boolean preferred, Boolean isInactive) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.name = name;
      this.dateDriven = dateDriven;
      this.daysUntilNetDue = daysUntilNetDue;
      this.discountPercent = discountPercent;
      this.daysUntilExpiry = daysUntilExpiry;
      this.dayOfMonthNetDue = dayOfMonthNetDue;
      this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
      this.discountPercentDateDriven = discountPercentDateDriven;
      this.dayDiscountExpires = dayDiscountExpires;
      this.preferred = preferred;
      this.isInactive = isInactive;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Boolean getDateDriven() {
      return this.dateDriven;
   }

   public void setDateDriven(Boolean dateDriven) {
      this.dateDriven = dateDriven;
   }

   public Long getDaysUntilNetDue() {
      return this.daysUntilNetDue;
   }

   public void setDaysUntilNetDue(Long daysUntilNetDue) {
      this.daysUntilNetDue = daysUntilNetDue;
   }

   public Double getDiscountPercent() {
      return this.discountPercent;
   }

   public void setDiscountPercent(Double discountPercent) {
      this.discountPercent = discountPercent;
   }

   public Long getDaysUntilExpiry() {
      return this.daysUntilExpiry;
   }

   public void setDaysUntilExpiry(Long daysUntilExpiry) {
      this.daysUntilExpiry = daysUntilExpiry;
   }

   public Long getDayOfMonthNetDue() {
      return this.dayOfMonthNetDue;
   }

   public void setDayOfMonthNetDue(Long dayOfMonthNetDue) {
      this.dayOfMonthNetDue = dayOfMonthNetDue;
   }

   public Long getDueNextMonthIfWithinDays() {
      return this.dueNextMonthIfWithinDays;
   }

   public void setDueNextMonthIfWithinDays(Long dueNextMonthIfWithinDays) {
      this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
   }

   public Double getDiscountPercentDateDriven() {
      return this.discountPercentDateDriven;
   }

   public void setDiscountPercentDateDriven(Double discountPercentDateDriven) {
      this.discountPercentDateDriven = discountPercentDateDriven;
   }

   public Long getDayDiscountExpires() {
      return this.dayDiscountExpires;
   }

   public void setDayDiscountExpires(Long dayDiscountExpires) {
      this.dayDiscountExpires = dayDiscountExpires;
   }

   public Boolean getPreferred() {
      return this.preferred;
   }

   public void setPreferred(Boolean preferred) {
      this.preferred = preferred;
   }

   public Boolean getIsInactive() {
      return this.isInactive;
   }

   public void setIsInactive(Boolean isInactive) {
      this.isInactive = isInactive;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public String getExternalId() {
      return this.externalId;
   }

   public void setExternalId(String externalId) {
      this.externalId = externalId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Term)) {
         return false;
      } else {
         Term other = (Term)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.dateDriven == null && other.getDateDriven() == null || this.dateDriven != null && this.dateDriven.equals(other.getDateDriven())) && (this.daysUntilNetDue == null && other.getDaysUntilNetDue() == null || this.daysUntilNetDue != null && this.daysUntilNetDue.equals(other.getDaysUntilNetDue())) && (this.discountPercent == null && other.getDiscountPercent() == null || this.discountPercent != null && this.discountPercent.equals(other.getDiscountPercent())) && (this.daysUntilExpiry == null && other.getDaysUntilExpiry() == null || this.daysUntilExpiry != null && this.daysUntilExpiry.equals(other.getDaysUntilExpiry())) && (this.dayOfMonthNetDue == null && other.getDayOfMonthNetDue() == null || this.dayOfMonthNetDue != null && this.dayOfMonthNetDue.equals(other.getDayOfMonthNetDue())) && (this.dueNextMonthIfWithinDays == null && other.getDueNextMonthIfWithinDays() == null || this.dueNextMonthIfWithinDays != null && this.dueNextMonthIfWithinDays.equals(other.getDueNextMonthIfWithinDays())) && (this.discountPercentDateDriven == null && other.getDiscountPercentDateDriven() == null || this.discountPercentDateDriven != null && this.discountPercentDateDriven.equals(other.getDiscountPercentDateDriven())) && (this.dayDiscountExpires == null && other.getDayDiscountExpires() == null || this.dayDiscountExpires != null && this.dayDiscountExpires.equals(other.getDayDiscountExpires())) && (this.preferred == null && other.getPreferred() == null || this.preferred != null && this.preferred.equals(other.getPreferred())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
         if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
         }

         if (this.getDateDriven() != null) {
            _hashCode += this.getDateDriven().hashCode();
         }

         if (this.getDaysUntilNetDue() != null) {
            _hashCode += this.getDaysUntilNetDue().hashCode();
         }

         if (this.getDiscountPercent() != null) {
            _hashCode += this.getDiscountPercent().hashCode();
         }

         if (this.getDaysUntilExpiry() != null) {
            _hashCode += this.getDaysUntilExpiry().hashCode();
         }

         if (this.getDayOfMonthNetDue() != null) {
            _hashCode += this.getDayOfMonthNetDue().hashCode();
         }

         if (this.getDueNextMonthIfWithinDays() != null) {
            _hashCode += this.getDueNextMonthIfWithinDays().hashCode();
         }

         if (this.getDiscountPercentDateDriven() != null) {
            _hashCode += this.getDiscountPercentDateDriven().hashCode();
         }

         if (this.getDayDiscountExpires() != null) {
            _hashCode += this.getDayDiscountExpires().hashCode();
         }

         if (this.getPreferred() != null) {
            _hashCode += this.getPreferred().hashCode();
         }

         if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Term"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("internalId");
      attrField.setXmlName(new QName("", "internalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      attrField = new AttributeDesc();
      attrField.setFieldName("externalId");
      attrField.setXmlName(new QName("", "externalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("name");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "name"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dateDriven");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "dateDriven"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("daysUntilNetDue");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "daysUntilNetDue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("discountPercent");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "discountPercent"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("daysUntilExpiry");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "daysUntilExpiry"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dayOfMonthNetDue");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "dayOfMonthNetDue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dueNextMonthIfWithinDays");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("discountPercentDateDriven");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "discountPercentDateDriven"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dayDiscountExpires");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "dayDiscountExpires"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("preferred");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "preferred"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isInactive");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isInactive"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
