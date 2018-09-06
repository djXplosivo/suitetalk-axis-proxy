package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

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

public class LandedCostDataList implements Serializable {
   private LandedCostData[] landedCostData;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(LandedCostDataList.class, true);

   public LandedCostDataList() {
      super();
   }

   public LandedCostDataList(LandedCostData[] landedCostData, boolean replaceAll) {
      super();
      this.landedCostData = landedCostData;
      this.replaceAll = replaceAll;
   }

   public LandedCostData[] getLandedCostData() {
      return this.landedCostData;
   }

   public void setLandedCostData(LandedCostData[] landedCostData) {
      this.landedCostData = landedCostData;
   }

   public LandedCostData getLandedCostData(int i) {
      return this.landedCostData[i];
   }

   public void setLandedCostData(int i, LandedCostData _value) {
      this.landedCostData[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof LandedCostDataList)) {
         return false;
      } else {
         LandedCostDataList other = (LandedCostDataList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.landedCostData == null && other.getLandedCostData() == null || this.landedCostData != null && Arrays.equals(this.landedCostData, other.getLandedCostData())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getLandedCostData() != null) {
            for(int i = 0; i < Array.getLength(this.getLandedCostData()); ++i) {
               Object obj = Array.get(this.getLandedCostData(), i);
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCostDataList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("landedCostData");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "landedCostData"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCostData"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
