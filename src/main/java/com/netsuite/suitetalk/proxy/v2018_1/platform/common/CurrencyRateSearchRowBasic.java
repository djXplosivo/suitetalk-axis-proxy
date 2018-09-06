package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CurrencyRateSearchRowBasic extends SearchRowBasic implements Serializable {
   private SearchColumnSelectField[] baseCurrency;
   private SearchColumnDateField[] effectiveDate;
   private SearchColumnDoubleField[] exchangeRate;
   private SearchColumnSelectField[] internalId;
   private SearchColumnSelectField[] transactionCurrency;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CurrencyRateSearchRowBasic.class, true);

   public CurrencyRateSearchRowBasic() {
      super();
   }

   public CurrencyRateSearchRowBasic(SearchColumnSelectField[] baseCurrency, SearchColumnDateField[] effectiveDate, SearchColumnDoubleField[] exchangeRate, SearchColumnSelectField[] internalId, SearchColumnSelectField[] transactionCurrency) {
      super();
      this.baseCurrency = baseCurrency;
      this.effectiveDate = effectiveDate;
      this.exchangeRate = exchangeRate;
      this.internalId = internalId;
      this.transactionCurrency = transactionCurrency;
   }

   public SearchColumnSelectField[] getBaseCurrency() {
      return this.baseCurrency;
   }

   public void setBaseCurrency(SearchColumnSelectField[] baseCurrency) {
      this.baseCurrency = baseCurrency;
   }

   public SearchColumnSelectField getBaseCurrency(int i) {
      return this.baseCurrency[i];
   }

   public void setBaseCurrency(int i, SearchColumnSelectField _value) {
      this.baseCurrency[i] = _value;
   }

   public SearchColumnDateField[] getEffectiveDate() {
      return this.effectiveDate;
   }

   public void setEffectiveDate(SearchColumnDateField[] effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public SearchColumnDateField getEffectiveDate(int i) {
      return this.effectiveDate[i];
   }

   public void setEffectiveDate(int i, SearchColumnDateField _value) {
      this.effectiveDate[i] = _value;
   }

   public SearchColumnDoubleField[] getExchangeRate() {
      return this.exchangeRate;
   }

   public void setExchangeRate(SearchColumnDoubleField[] exchangeRate) {
      this.exchangeRate = exchangeRate;
   }

   public SearchColumnDoubleField getExchangeRate(int i) {
      return this.exchangeRate[i];
   }

   public void setExchangeRate(int i, SearchColumnDoubleField _value) {
      this.exchangeRate[i] = _value;
   }

   public SearchColumnSelectField[] getInternalId() {
      return this.internalId;
   }

   public void setInternalId(SearchColumnSelectField[] internalId) {
      this.internalId = internalId;
   }

   public SearchColumnSelectField getInternalId(int i) {
      return this.internalId[i];
   }

   public void setInternalId(int i, SearchColumnSelectField _value) {
      this.internalId[i] = _value;
   }

   public SearchColumnSelectField[] getTransactionCurrency() {
      return this.transactionCurrency;
   }

   public void setTransactionCurrency(SearchColumnSelectField[] transactionCurrency) {
      this.transactionCurrency = transactionCurrency;
   }

   public SearchColumnSelectField getTransactionCurrency(int i) {
      return this.transactionCurrency[i];
   }

   public void setTransactionCurrency(int i, SearchColumnSelectField _value) {
      this.transactionCurrency[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CurrencyRateSearchRowBasic)) {
         return false;
      } else {
         CurrencyRateSearchRowBasic other = (CurrencyRateSearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.baseCurrency == null && other.getBaseCurrency() == null || this.baseCurrency != null && Arrays.equals(this.baseCurrency, other.getBaseCurrency())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && Arrays.equals(this.effectiveDate, other.getEffectiveDate())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && Arrays.equals(this.exchangeRate, other.getExchangeRate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.transactionCurrency == null && other.getTransactionCurrency() == null || this.transactionCurrency != null && Arrays.equals(this.transactionCurrency, other.getTransactionCurrency()));
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
         int i;
         Object obj;
         if (this.getBaseCurrency() != null) {
            for(i = 0; i < Array.getLength(this.getBaseCurrency()); ++i) {
               obj = Array.get(this.getBaseCurrency(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getEffectiveDate() != null) {
            for(i = 0; i < Array.getLength(this.getEffectiveDate()); ++i) {
               obj = Array.get(this.getEffectiveDate(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getExchangeRate() != null) {
            for(i = 0; i < Array.getLength(this.getExchangeRate()); ++i) {
               obj = Array.get(this.getExchangeRate(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getInternalId() != null) {
            for(i = 0; i < Array.getLength(this.getInternalId()); ++i) {
               obj = Array.get(this.getInternalId(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getTransactionCurrency() != null) {
            for(i = 0; i < Array.getLength(this.getTransactionCurrency()); ++i) {
               obj = Array.get(this.getTransactionCurrency(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CurrencyRateSearchRowBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("baseCurrency");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "baseCurrency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("effectiveDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "effectiveDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("exchangeRate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "exchangeRate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionCurrency");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "transactionCurrency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
