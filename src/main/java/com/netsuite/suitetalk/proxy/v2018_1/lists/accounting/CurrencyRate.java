package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CurrencyRate extends Record implements Serializable {
   private RecordRef baseCurrency;
   private RecordRef transactionCurrency;
   private Double exchangeRate;
   private Calendar effectiveDate;
   private String internalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CurrencyRate.class, true);

   public CurrencyRate() {
      super();
   }

   public CurrencyRate(NullField nullFieldList, String internalId, RecordRef baseCurrency, RecordRef transactionCurrency, Double exchangeRate, Calendar effectiveDate) {
      super(nullFieldList);
      this.internalId = internalId;
      this.baseCurrency = baseCurrency;
      this.transactionCurrency = transactionCurrency;
      this.exchangeRate = exchangeRate;
      this.effectiveDate = effectiveDate;
   }

   public RecordRef getBaseCurrency() {
      return this.baseCurrency;
   }

   public void setBaseCurrency(RecordRef baseCurrency) {
      this.baseCurrency = baseCurrency;
   }

   public RecordRef getTransactionCurrency() {
      return this.transactionCurrency;
   }

   public void setTransactionCurrency(RecordRef transactionCurrency) {
      this.transactionCurrency = transactionCurrency;
   }

   public Double getExchangeRate() {
      return this.exchangeRate;
   }

   public void setExchangeRate(Double exchangeRate) {
      this.exchangeRate = exchangeRate;
   }

   public Calendar getEffectiveDate() {
      return this.effectiveDate;
   }

   public void setEffectiveDate(Calendar effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CurrencyRate)) {
         return false;
      } else {
         CurrencyRate other = (CurrencyRate)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.baseCurrency == null && other.getBaseCurrency() == null || this.baseCurrency != null && this.baseCurrency.equals(other.getBaseCurrency())) && (this.transactionCurrency == null && other.getTransactionCurrency() == null || this.transactionCurrency != null && this.transactionCurrency.equals(other.getTransactionCurrency())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
         if (this.getBaseCurrency() != null) {
            _hashCode += this.getBaseCurrency().hashCode();
         }

         if (this.getTransactionCurrency() != null) {
            _hashCode += this.getTransactionCurrency().hashCode();
         }

         if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
         }

         if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CurrencyRate"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("internalId");
      attrField.setXmlName(new QName("", "internalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("baseCurrency");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "baseCurrency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionCurrency");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "transactionCurrency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("exchangeRate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "exchangeRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("effectiveDate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "effectiveDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
