package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomizationRef;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomSearchRowBasic implements Serializable {
   private CustomizationRef customizationRef;
   private SearchRowBasic searchRowBasic;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomSearchRowBasic.class, true);

   public CustomSearchRowBasic() {
      super();
   }

   public CustomSearchRowBasic(CustomizationRef customizationRef, SearchRowBasic searchRowBasic) {
      super();
      this.customizationRef = customizationRef;
      this.searchRowBasic = searchRowBasic;
   }

   public CustomizationRef getCustomizationRef() {
      return this.customizationRef;
   }

   public void setCustomizationRef(CustomizationRef customizationRef) {
      this.customizationRef = customizationRef;
   }

   public SearchRowBasic getSearchRowBasic() {
      return this.searchRowBasic;
   }

   public void setSearchRowBasic(SearchRowBasic searchRowBasic) {
      this.searchRowBasic = searchRowBasic;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomSearchRowBasic)) {
         return false;
      } else {
         CustomSearchRowBasic other = (CustomSearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.customizationRef == null && other.getCustomizationRef() == null || this.customizationRef != null && this.customizationRef.equals(other.getCustomizationRef())) && (this.searchRowBasic == null && other.getSearchRowBasic() == null || this.searchRowBasic != null && this.searchRowBasic.equals(other.getSearchRowBasic()));
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
         if (this.getCustomizationRef() != null) {
            _hashCode += this.getCustomizationRef().hashCode();
         }

         if (this.getSearchRowBasic() != null) {
            _hashCode += this.getSearchRowBasic().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("customizationRef");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "customizationRef"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomizationRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchRowBasic");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "searchRowBasic"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRowBasic"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
