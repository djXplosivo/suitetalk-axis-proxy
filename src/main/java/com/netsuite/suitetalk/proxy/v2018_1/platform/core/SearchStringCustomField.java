package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.SearchStringFieldOperator;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SearchStringCustomField extends SearchCustomField implements Serializable {
   private String searchValue;
   private SearchStringFieldOperator operator;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SearchStringCustomField.class, true);

   public SearchStringCustomField() {
      super();
   }

   public SearchStringCustomField(String internalId, String scriptId, SearchStringFieldOperator operator, String searchValue) {
      super(internalId, scriptId);
      this.operator = operator;
      this.searchValue = searchValue;
   }

   public String getSearchValue() {
      return this.searchValue;
   }

   public void setSearchValue(String searchValue) {
      this.searchValue = searchValue;
   }

   public SearchStringFieldOperator getOperator() {
      return this.operator;
   }

   public void setOperator(SearchStringFieldOperator operator) {
      this.operator = operator;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SearchStringCustomField)) {
         return false;
      } else {
         SearchStringCustomField other = (SearchStringCustomField)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.searchValue == null && other.getSearchValue() == null || this.searchValue != null && this.searchValue.equals(other.getSearchValue())) && (this.operator == null && other.getOperator() == null || this.operator != null && this.operator.equals(other.getOperator()));
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringCustomField"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("operator");
      attrField.setXmlName(new QName("", "operator"));
      attrField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchStringFieldOperator"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("searchValue");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
