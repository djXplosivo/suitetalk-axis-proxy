package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomListSearchAdvanced extends SearchRecord implements Serializable {
   private CustomListSearch criteria;
   private CustomListSearchRow columns;
   private String savedSearchId;
   private String savedSearchScriptId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomListSearchAdvanced.class, true);

   public CustomListSearchAdvanced() {
      super();
   }

   public CustomListSearchAdvanced(String savedSearchId, String savedSearchScriptId, CustomListSearch criteria, CustomListSearchRow columns) {
      super();
      this.savedSearchId = savedSearchId;
      this.savedSearchScriptId = savedSearchScriptId;
      this.criteria = criteria;
      this.columns = columns;
   }

   public CustomListSearch getCriteria() {
      return this.criteria;
   }

   public void setCriteria(CustomListSearch criteria) {
      this.criteria = criteria;
   }

   public CustomListSearchRow getColumns() {
      return this.columns;
   }

   public void setColumns(CustomListSearchRow columns) {
      this.columns = columns;
   }

   public String getSavedSearchId() {
      return this.savedSearchId;
   }

   public void setSavedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
   }

   public String getSavedSearchScriptId() {
      return this.savedSearchScriptId;
   }

   public void setSavedSearchScriptId(String savedSearchScriptId) {
      this.savedSearchScriptId = savedSearchScriptId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomListSearchAdvanced)) {
         return false;
      } else {
         CustomListSearchAdvanced other = (CustomListSearchAdvanced)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.criteria == null && other.getCriteria() == null || this.criteria != null && this.criteria.equals(other.getCriteria())) && (this.columns == null && other.getColumns() == null || this.columns != null && this.columns.equals(other.getColumns())) && (this.savedSearchId == null && other.getSavedSearchId() == null || this.savedSearchId != null && this.savedSearchId.equals(other.getSavedSearchId())) && (this.savedSearchScriptId == null && other.getSavedSearchScriptId() == null || this.savedSearchScriptId != null && this.savedSearchScriptId.equals(other.getSavedSearchScriptId()));
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
         if (this.getCriteria() != null) {
            _hashCode += this.getCriteria().hashCode();
         }

         if (this.getColumns() != null) {
            _hashCode += this.getColumns().hashCode();
         }

         if (this.getSavedSearchId() != null) {
            _hashCode += this.getSavedSearchId().hashCode();
         }

         if (this.getSavedSearchScriptId() != null) {
            _hashCode += this.getSavedSearchScriptId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListSearchAdvanced"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("savedSearchId");
      attrField.setXmlName(new QName("", "savedSearchId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      attrField = new AttributeDesc();
      attrField.setFieldName("savedSearchScriptId");
      attrField.setXmlName(new QName("", "savedSearchScriptId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("criteria");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "criteria"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListSearch"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("columns");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "columns"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListSearchRow"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
