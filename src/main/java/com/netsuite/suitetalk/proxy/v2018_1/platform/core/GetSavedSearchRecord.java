package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.SearchRecordType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetSavedSearchRecord implements Serializable {
   private SearchRecordType searchType;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetSavedSearchRecord.class, true);

   public GetSavedSearchRecord() {
      super();
   }

   public GetSavedSearchRecord(SearchRecordType searchType) {
      super();
      this.searchType = searchType;
   }

   public SearchRecordType getSearchType() {
      return this.searchType;
   }

   public void setSearchType(SearchRecordType searchType) {
      this.searchType = searchType;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetSavedSearchRecord)) {
         return false;
      } else {
         GetSavedSearchRecord other = (GetSavedSearchRecord)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.searchType == null && other.getSearchType() == null || this.searchType != null && this.searchType.equals(other.getSearchType());
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
         if (this.getSearchType() != null) {
            _hashCode += this.getSearchType().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSavedSearchRecord"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("searchType");
      attrField.setXmlName(new QName("", "searchType"));
      attrField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchRecordType"));
      typeDesc.addFieldDesc(attrField);
   }
}
