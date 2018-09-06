package com.netsuite.suitetalk.proxy.v2018_1.transactions.bank;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.LandedCostSummary;
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

public class CheckLandedCostList implements Serializable {
   private LandedCostSummary[] landedCost;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CheckLandedCostList.class, true);

   public CheckLandedCostList() {
      super();
   }

   public CheckLandedCostList(LandedCostSummary[] landedCost, boolean replaceAll) {
      super();
      this.landedCost = landedCost;
      this.replaceAll = replaceAll;
   }

   public LandedCostSummary[] getLandedCost() {
      return this.landedCost;
   }

   public void setLandedCost(LandedCostSummary[] landedCost) {
      this.landedCost = landedCost;
   }

   public LandedCostSummary getLandedCost(int i) {
      return this.landedCost[i];
   }

   public void setLandedCost(int i, LandedCostSummary _value) {
      this.landedCost[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CheckLandedCostList)) {
         return false;
      } else {
         CheckLandedCostList other = (CheckLandedCostList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.landedCost == null && other.getLandedCost() == null || this.landedCost != null && Arrays.equals(this.landedCost, other.getLandedCost())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getLandedCost() != null) {
            for(int i = 0; i < Array.getLength(this.getLandedCost()); ++i) {
               Object obj = Array.get(this.getLandedCost(), i);
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
      typeDesc.setXmlType(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "CheckLandedCostList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("landedCost");
      elemField.setXmlName(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "landedCost"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCostSummary"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
