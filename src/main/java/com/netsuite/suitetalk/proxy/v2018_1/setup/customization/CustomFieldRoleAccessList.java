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

public class CustomFieldRoleAccessList implements Serializable {
   private CustomFieldRoleAccess[] roleAccess;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomFieldRoleAccessList.class, true);

   public CustomFieldRoleAccessList() {
      super();
   }

   public CustomFieldRoleAccessList(CustomFieldRoleAccess[] roleAccess, boolean replaceAll) {
      super();
      this.roleAccess = roleAccess;
      this.replaceAll = replaceAll;
   }

   public CustomFieldRoleAccess[] getRoleAccess() {
      return this.roleAccess;
   }

   public void setRoleAccess(CustomFieldRoleAccess[] roleAccess) {
      this.roleAccess = roleAccess;
   }

   public CustomFieldRoleAccess getRoleAccess(int i) {
      return this.roleAccess[i];
   }

   public void setRoleAccess(int i, CustomFieldRoleAccess _value) {
      this.roleAccess[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomFieldRoleAccessList)) {
         return false;
      } else {
         CustomFieldRoleAccessList other = (CustomFieldRoleAccessList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.roleAccess == null && other.getRoleAccess() == null || this.roleAccess != null && Arrays.equals(this.roleAccess, other.getRoleAccess())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getRoleAccess() != null) {
            for(int i = 0; i < Array.getLength(this.getRoleAccess()); ++i) {
               Object obj = Array.get(this.getRoleAccess(), i);
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldRoleAccessList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("roleAccess");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "roleAccess"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldRoleAccess"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
