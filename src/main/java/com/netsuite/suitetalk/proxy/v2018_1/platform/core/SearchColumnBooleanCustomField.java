package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SearchColumnBooleanCustomField extends SearchColumnCustomField implements Serializable {
   private Boolean searchValue;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SearchColumnBooleanCustomField.class, true);

   public SearchColumnBooleanCustomField() {
      super();
   }

   public SearchColumnBooleanCustomField(String internalId, String scriptId, String customLabel, Boolean searchValue) {
      super(internalId, scriptId, customLabel);
      this.searchValue = searchValue;
   }

   public Boolean getSearchValue() {
      return this.searchValue;
   }

   public void setSearchValue(Boolean searchValue) {
      this.searchValue = searchValue;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SearchColumnBooleanCustomField)) {
         return false;
      } else {
         SearchColumnBooleanCustomField other = (SearchColumnBooleanCustomField)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.searchValue == null && other.getSearchValue() == null || this.searchValue != null && this.searchValue.equals(other.getSearchValue()));
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
         if (this.getSearchValue() != null) {
            _hashCode += this.getSearchValue().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanCustomField"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("searchValue");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
