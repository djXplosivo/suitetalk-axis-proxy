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

public class LotNumberedAssemblyItemBillOfMaterialsList implements Serializable {
   private LotNumberedAssemblyItemBillOfMaterials[] lotNumberedAssemblyItemBillOfMaterials;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(LotNumberedAssemblyItemBillOfMaterialsList.class, true);

   public LotNumberedAssemblyItemBillOfMaterialsList() {
      super();
   }

   public LotNumberedAssemblyItemBillOfMaterialsList(LotNumberedAssemblyItemBillOfMaterials[] lotNumberedAssemblyItemBillOfMaterials, boolean replaceAll) {
      super();
      this.lotNumberedAssemblyItemBillOfMaterials = lotNumberedAssemblyItemBillOfMaterials;
      this.replaceAll = replaceAll;
   }

   public LotNumberedAssemblyItemBillOfMaterials[] getLotNumberedAssemblyItemBillOfMaterials() {
      return this.lotNumberedAssemblyItemBillOfMaterials;
   }

   public void setLotNumberedAssemblyItemBillOfMaterials(LotNumberedAssemblyItemBillOfMaterials[] lotNumberedAssemblyItemBillOfMaterials) {
      this.lotNumberedAssemblyItemBillOfMaterials = lotNumberedAssemblyItemBillOfMaterials;
   }

   public LotNumberedAssemblyItemBillOfMaterials getLotNumberedAssemblyItemBillOfMaterials(int i) {
      return this.lotNumberedAssemblyItemBillOfMaterials[i];
   }

   public void setLotNumberedAssemblyItemBillOfMaterials(int i, LotNumberedAssemblyItemBillOfMaterials _value) {
      this.lotNumberedAssemblyItemBillOfMaterials[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof LotNumberedAssemblyItemBillOfMaterialsList)) {
         return false;
      } else {
         LotNumberedAssemblyItemBillOfMaterialsList other = (LotNumberedAssemblyItemBillOfMaterialsList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.lotNumberedAssemblyItemBillOfMaterials == null && other.getLotNumberedAssemblyItemBillOfMaterials() == null || this.lotNumberedAssemblyItemBillOfMaterials != null && Arrays.equals(this.lotNumberedAssemblyItemBillOfMaterials, other.getLotNumberedAssemblyItemBillOfMaterials())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getLotNumberedAssemblyItemBillOfMaterials() != null) {
            for(int i = 0; i < Array.getLength(this.getLotNumberedAssemblyItemBillOfMaterials()); ++i) {
               Object obj = Array.get(this.getLotNumberedAssemblyItemBillOfMaterials(), i);
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedAssemblyItemBillOfMaterialsList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("lotNumberedAssemblyItemBillOfMaterials");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "lotNumberedAssemblyItemBillOfMaterials"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedAssemblyItemBillOfMaterials"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
