package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
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

public class CategoryList implements Serializable {
   private RecordRef[] category;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CategoryList.class, true);

   public CategoryList() {
      super();
   }

   public CategoryList(RecordRef[] category) {
      super();
      this.category = category;
   }

   public RecordRef[] getCategory() {
      return this.category;
   }

   public void setCategory(RecordRef[] category) {
      this.category = category;
   }

   public RecordRef getCategory(int i) {
      return this.category[i];
   }

   public void setCategory(int i, RecordRef _value) {
      this.category[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CategoryList)) {
         return false;
      } else {
         CategoryList other = (CategoryList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory());
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
         if (this.getCategory() != null) {
            for(int i = 0; i < Array.getLength(this.getCategory()); ++i) {
               Object obj = Array.get(this.getCategory(), i);
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CategoryList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("category");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "category"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
