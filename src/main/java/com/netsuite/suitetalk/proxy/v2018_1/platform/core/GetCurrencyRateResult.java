package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetCurrencyRateResult implements Serializable {
   private Status status;
   private CurrencyRateList currencyRateList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetCurrencyRateResult.class, true);

   public GetCurrencyRateResult() {
      super();
   }

   public GetCurrencyRateResult(Status status, CurrencyRateList currencyRateList) {
      super();
      this.status = status;
      this.currencyRateList = currencyRateList;
   }

   public Status getStatus() {
      return this.status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public CurrencyRateList getCurrencyRateList() {
      return this.currencyRateList;
   }

   public void setCurrencyRateList(CurrencyRateList currencyRateList) {
      this.currencyRateList = currencyRateList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetCurrencyRateResult)) {
         return false;
      } else {
         GetCurrencyRateResult other = (GetCurrencyRateResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.currencyRateList == null && other.getCurrencyRateList() == null || this.currencyRateList != null && this.currencyRateList.equals(other.getCurrencyRateList()));
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
         if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
         }

         if (this.getCurrencyRateList() != null) {
            _hashCode += this.getCurrencyRateList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetCurrencyRateResult"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("currencyRateList");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "currencyRateList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CurrencyRateList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
