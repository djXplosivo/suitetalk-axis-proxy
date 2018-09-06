package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.SearchDate;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.SearchDateFieldOperator;
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

public class SearchDateCustomField extends SearchCustomField implements Serializable {
   private SearchDate predefinedSearchValue;
   private Calendar searchValue;
   private Calendar searchValue2;
   private SearchDateFieldOperator operator;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SearchDateCustomField.class, true);

   public SearchDateCustomField() {
      super();
   }

   public SearchDateCustomField(String internalId, String scriptId, SearchDateFieldOperator operator, SearchDate predefinedSearchValue, Calendar searchValue, Calendar searchValue2) {
      super(internalId, scriptId);
      this.operator = operator;
      this.predefinedSearchValue = predefinedSearchValue;
      this.searchValue = searchValue;
      this.searchValue2 = searchValue2;
   }

   public SearchDate getPredefinedSearchValue() {
      return this.predefinedSearchValue;
   }

   public void setPredefinedSearchValue(SearchDate predefinedSearchValue) {
      this.predefinedSearchValue = predefinedSearchValue;
   }

   public Calendar getSearchValue() {
      return this.searchValue;
   }

   public void setSearchValue(Calendar searchValue) {
      this.searchValue = searchValue;
   }

   public Calendar getSearchValue2() {
      return this.searchValue2;
   }

   public void setSearchValue2(Calendar searchValue2) {
      this.searchValue2 = searchValue2;
   }

   public SearchDateFieldOperator getOperator() {
      return this.operator;
   }

   public void setOperator(SearchDateFieldOperator operator) {
      this.operator = operator;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SearchDateCustomField)) {
         return false;
      } else {
         SearchDateCustomField other = (SearchDateCustomField)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.predefinedSearchValue == null && other.getPredefinedSearchValue() == null || this.predefinedSearchValue != null && this.predefinedSearchValue.equals(other.getPredefinedSearchValue())) && (this.searchValue == null && other.getSearchValue() == null || this.searchValue != null && this.searchValue.equals(other.getSearchValue())) && (this.searchValue2 == null && other.getSearchValue2() == null || this.searchValue2 != null && this.searchValue2.equals(other.getSearchValue2())) && (this.operator == null && other.getOperator() == null || this.operator != null && this.operator.equals(other.getOperator()));
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
         if (this.getPredefinedSearchValue() != null) {
            _hashCode += this.getPredefinedSearchValue().hashCode();
         }

         if (this.getSearchValue() != null) {
            _hashCode += this.getSearchValue().hashCode();
         }

         if (this.getSearchValue2() != null) {
            _hashCode += this.getSearchValue2().hashCode();
         }

         if (this.getOperator() != null) {
            _hashCode += this.getOperator().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateCustomField"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("operator");
      attrField.setXmlName(new QName("", "operator"));
      attrField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchDateFieldOperator"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("predefinedSearchValue");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "predefinedSearchValue"));
      elemField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchDate"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchValue");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchValue2");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchValue2"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
