package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecordBasic;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CurrencyRateSearchBasic extends SearchRecordBasic implements Serializable {
   private SearchMultiSelectField baseCurrency;
   private SearchDateField effectiveDate;
   private SearchDoubleField exchangeRate;
   private SearchMultiSelectField internalId;
   private SearchLongField internalIdNumber;
   private SearchMultiSelectField transactionCurrency;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CurrencyRateSearchBasic.class, true);

   public CurrencyRateSearchBasic() {
      super();
   }

   public CurrencyRateSearchBasic(SearchMultiSelectField baseCurrency, SearchDateField effectiveDate, SearchDoubleField exchangeRate, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField transactionCurrency) {
      super();
      this.baseCurrency = baseCurrency;
      this.effectiveDate = effectiveDate;
      this.exchangeRate = exchangeRate;
      this.internalId = internalId;
      this.internalIdNumber = internalIdNumber;
      this.transactionCurrency = transactionCurrency;
   }

   public SearchMultiSelectField getBaseCurrency() {
      return this.baseCurrency;
   }

   public void setBaseCurrency(SearchMultiSelectField baseCurrency) {
      this.baseCurrency = baseCurrency;
   }

   public SearchDateField getEffectiveDate() {
      return this.effectiveDate;
   }

   public void setEffectiveDate(SearchDateField effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public SearchDoubleField getExchangeRate() {
      return this.exchangeRate;
   }

   public void setExchangeRate(SearchDoubleField exchangeRate) {
      this.exchangeRate = exchangeRate;
   }

   public SearchMultiSelectField getInternalId() {
      return this.internalId;
   }

   public void setInternalId(SearchMultiSelectField internalId) {
      this.internalId = internalId;
   }

   public SearchLongField getInternalIdNumber() {
      return this.internalIdNumber;
   }

   public void setInternalIdNumber(SearchLongField internalIdNumber) {
      this.internalIdNumber = internalIdNumber;
   }

   public SearchMultiSelectField getTransactionCurrency() {
      return this.transactionCurrency;
   }

   public void setTransactionCurrency(SearchMultiSelectField transactionCurrency) {
      this.transactionCurrency = transactionCurrency;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CurrencyRateSearchBasic)) {
         return false;
      } else {
         CurrencyRateSearchBasic other = (CurrencyRateSearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.baseCurrency == null && other.getBaseCurrency() == null || this.baseCurrency != null && this.baseCurrency.equals(other.getBaseCurrency())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.transactionCurrency == null && other.getTransactionCurrency() == null || this.transactionCurrency != null && this.transactionCurrency.equals(other.getTransactionCurrency()));
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

         if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
         }

         if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
         }

         if (this.getTransactionCurrency() != null) {
            _hashCode += this.getTransactionCurrency().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CurrencyRateSearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("baseCurrency");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "baseCurrency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("effectiveDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "effectiveDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("exchangeRate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "exchangeRate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalIdNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalIdNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionCurrency");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "transactionCurrency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
