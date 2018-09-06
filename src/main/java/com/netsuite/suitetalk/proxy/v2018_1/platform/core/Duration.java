package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.DurationUnit;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;

public class Duration implements Serializable {
   private double timeSpan;
   private DurationUnit unit;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Duration.class, true);

   public Duration() {
      super();
   }

   public Duration(double timeSpan, DurationUnit unit) {
      super();
      this.timeSpan = timeSpan;
      this.unit = unit;
   }

   public double getTimeSpan() {
      return this.timeSpan;
   }

   public void setTimeSpan(double timeSpan) {
      this.timeSpan = timeSpan;
   }

   public DurationUnit getUnit() {
      return this.unit;
   }

   public void setUnit(DurationUnit unit) {
      this.unit = unit;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Duration)) {
         return false;
      } else {
         Duration other = (Duration)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.timeSpan == other.getTimeSpan() && (this.unit == null && other.getUnit() == null || this.unit != null && this.unit.equals(other.getUnit()));
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
         _hashCode = _hashCode + (new Double(this.getTimeSpan())).hashCode();
         if (this.getUnit() != null) {
            _hashCode += this.getUnit().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Duration"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("timeSpan");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "timeSpan"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("unit");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "unit"));
      elemField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "DurationUnit"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
