package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class LandedCost extends Record implements Serializable {
   private LandedCostDataList landedCostDataList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(LandedCost.class, true);

   public LandedCost() {
      super();
   }

   public LandedCost(NullField nullFieldList, LandedCostDataList landedCostDataList) {
      super(nullFieldList);
      this.landedCostDataList = landedCostDataList;
   }

   public LandedCostDataList getLandedCostDataList() {
      return this.landedCostDataList;
   }

   public void setLandedCostDataList(LandedCostDataList landedCostDataList) {
      this.landedCostDataList = landedCostDataList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof LandedCost)) {
         return false;
      } else {
         LandedCost other = (LandedCost)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.landedCostDataList == null && other.getLandedCostDataList() == null || this.landedCostDataList != null && this.landedCostDataList.equals(other.getLandedCostDataList()));
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
         int _hashCode = super.hashCode();
         if (this.getLandedCostDataList() != null) {
            _hashCode += this.getLandedCostDataList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCost"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("landedCostDataList");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "landedCostDataList"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCostDataList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
