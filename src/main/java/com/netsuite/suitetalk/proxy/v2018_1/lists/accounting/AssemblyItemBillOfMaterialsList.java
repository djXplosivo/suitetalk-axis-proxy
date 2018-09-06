package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

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

public class AssemblyItemBillOfMaterialsList implements Serializable {
   private AssemblyItemBillOfMaterials[] assemblyItemBillOfMaterials;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AssemblyItemBillOfMaterialsList.class, true);

   public AssemblyItemBillOfMaterialsList() {
      super();
   }

   public AssemblyItemBillOfMaterialsList(AssemblyItemBillOfMaterials[] assemblyItemBillOfMaterials, boolean replaceAll) {
      super();
      this.assemblyItemBillOfMaterials = assemblyItemBillOfMaterials;
      this.replaceAll = replaceAll;
   }

   public AssemblyItemBillOfMaterials[] getAssemblyItemBillOfMaterials() {
      return this.assemblyItemBillOfMaterials;
   }

   public void setAssemblyItemBillOfMaterials(AssemblyItemBillOfMaterials[] assemblyItemBillOfMaterials) {
      this.assemblyItemBillOfMaterials = assemblyItemBillOfMaterials;
   }

   public AssemblyItemBillOfMaterials getAssemblyItemBillOfMaterials(int i) {
      return this.assemblyItemBillOfMaterials[i];
   }

   public void setAssemblyItemBillOfMaterials(int i, AssemblyItemBillOfMaterials _value) {
      this.assemblyItemBillOfMaterials[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AssemblyItemBillOfMaterialsList)) {
         return false;
      } else {
         AssemblyItemBillOfMaterialsList other = (AssemblyItemBillOfMaterialsList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.assemblyItemBillOfMaterials == null && other.getAssemblyItemBillOfMaterials() == null || this.assemblyItemBillOfMaterials != null && Arrays.equals(this.assemblyItemBillOfMaterials, other.getAssemblyItemBillOfMaterials())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getAssemblyItemBillOfMaterials() != null) {
            for(int i = 0; i < Array.getLength(this.getAssemblyItemBillOfMaterials()); ++i) {
               Object obj = Array.get(this.getAssemblyItemBillOfMaterials(), i);
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AssemblyItemBillOfMaterialsList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("assemblyItemBillOfMaterials");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "assemblyItemBillOfMaterials"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AssemblyItemBillOfMaterials"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
