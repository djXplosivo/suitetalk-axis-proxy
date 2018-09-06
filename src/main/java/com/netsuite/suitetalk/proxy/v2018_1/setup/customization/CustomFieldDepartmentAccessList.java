package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomFieldDepartmentAccessList implements Serializable {
   private CustomFieldDepartmentAccess[] deptAccess;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomFieldDepartmentAccessList.class, true);

   public CustomFieldDepartmentAccessList() {
      super();
   }

   public CustomFieldDepartmentAccessList(CustomFieldDepartmentAccess[] deptAccess, boolean replaceAll) {
      super();
      this.deptAccess = deptAccess;
      this.replaceAll = replaceAll;
   }

   public CustomFieldDepartmentAccess[] getDeptAccess() {
      return this.deptAccess;
   }

   public void setDeptAccess(CustomFieldDepartmentAccess[] deptAccess) {
      this.deptAccess = deptAccess;
   }

   public CustomFieldDepartmentAccess getDeptAccess(int i) {
      return this.deptAccess[i];
   }

   public void setDeptAccess(int i, CustomFieldDepartmentAccess _value) {
      this.deptAccess[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomFieldDepartmentAccessList)) {
         return false;
      } else {
         CustomFieldDepartmentAccessList other = (CustomFieldDepartmentAccessList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.deptAccess == null && other.getDeptAccess() == null || this.deptAccess != null && Arrays.equals(this.deptAccess, other.getDeptAccess())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getDeptAccess() != null) {
            for(int i = 0; i < Array.getLength(this.getDeptAccess()); ++i) {
               Object obj = Array.get(this.getDeptAccess(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         _hashCode += (this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("deptAccess");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "deptAccess"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccess"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
