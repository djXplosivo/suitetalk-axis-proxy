package com.netsuite.suitetalk.proxy.v2018_1.lists.employees;

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

public class EmployeeDeductionList implements Serializable {
   private EmployeeDeduction[] employeeDeduction;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(EmployeeDeductionList.class, true);

   public EmployeeDeductionList() {
      super();
   }

   public EmployeeDeductionList(EmployeeDeduction[] employeeDeduction, boolean replaceAll) {
      super();
      this.employeeDeduction = employeeDeduction;
      this.replaceAll = replaceAll;
   }

   public EmployeeDeduction[] getEmployeeDeduction() {
      return this.employeeDeduction;
   }

   public void setEmployeeDeduction(EmployeeDeduction[] employeeDeduction) {
      this.employeeDeduction = employeeDeduction;
   }

   public EmployeeDeduction getEmployeeDeduction(int i) {
      return this.employeeDeduction[i];
   }

   public void setEmployeeDeduction(int i, EmployeeDeduction _value) {
      this.employeeDeduction[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof EmployeeDeductionList)) {
         return false;
      } else {
         EmployeeDeductionList other = (EmployeeDeductionList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.employeeDeduction == null && other.getEmployeeDeduction() == null || this.employeeDeduction != null && Arrays.equals(this.employeeDeduction, other.getEmployeeDeduction())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getEmployeeDeduction() != null) {
            for(int i = 0; i < Array.getLength(this.getEmployeeDeduction()); ++i) {
               Object obj = Array.get(this.getEmployeeDeduction(), i);
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeDeductionList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("employeeDeduction");
      elemField.setXmlName(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "employeeDeduction"));
      elemField.setXmlType(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeDeduction"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
