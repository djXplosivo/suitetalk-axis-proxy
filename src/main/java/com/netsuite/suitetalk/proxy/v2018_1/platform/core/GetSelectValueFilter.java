package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.GetSelectValueFilterOperator;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetSelectValueFilter implements Serializable {
   private String filterValue;
   private GetSelectValueFilterOperator operator;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetSelectValueFilter.class, true);

   public GetSelectValueFilter() {
      super();
   }

   public GetSelectValueFilter(String filterValue, GetSelectValueFilterOperator operator) {
      super();
      this.filterValue = filterValue;
      this.operator = operator;
   }

   public String getFilterValue() {
      return this.filterValue;
   }

   public void setFilterValue(String filterValue) {
      this.filterValue = filterValue;
   }

   public GetSelectValueFilterOperator getOperator() {
      return this.operator;
   }

   public void setOperator(GetSelectValueFilterOperator operator) {
      this.operator = operator;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetSelectValueFilter)) {
         return false;
      } else {
         GetSelectValueFilter other = (GetSelectValueFilter)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.filterValue == null && other.getFilterValue() == null || this.filterValue != null && this.filterValue.equals(other.getFilterValue())) && (this.operator == null && other.getOperator() == null || this.operator != null && this.operator.equals(other.getOperator()));
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
         if (this.getFilterValue() != null) {
            _hashCode += this.getFilterValue().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectValueFilter"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("operator");
      attrField.setXmlName(new QName("", "operator"));
      attrField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "GetSelectValueFilterOperator"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("filterValue");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "filterValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
