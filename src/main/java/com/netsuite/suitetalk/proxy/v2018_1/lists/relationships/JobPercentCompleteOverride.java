package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class JobPercentCompleteOverride implements Serializable {
   private RecordRef period;
   private Double percent;
   private String comments;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(JobPercentCompleteOverride.class, true);

   public JobPercentCompleteOverride() {
      super();
   }

   public JobPercentCompleteOverride(RecordRef period, Double percent, String comments) {
      super();
      this.period = period;
      this.percent = percent;
      this.comments = comments;
   }

   public RecordRef getPeriod() {
      return this.period;
   }

   public void setPeriod(RecordRef period) {
      this.period = period;
   }

   public Double getPercent() {
      return this.percent;
   }

   public void setPercent(Double percent) {
      this.percent = percent;
   }

   public String getComments() {
      return this.comments;
   }

   public void setComments(String comments) {
      this.comments = comments;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof JobPercentCompleteOverride)) {
         return false;
      } else {
         JobPercentCompleteOverride other = (JobPercentCompleteOverride)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.period == null && other.getPeriod() == null || this.period != null && this.period.equals(other.getPeriod())) && (this.percent == null && other.getPercent() == null || this.percent != null && this.percent.equals(other.getPercent())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments()));
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
         if (this.getPeriod() != null) {
            _hashCode += this.getPeriod().hashCode();
         }

         if (this.getPercent() != null) {
            _hashCode += this.getPercent().hashCode();
         }

         if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobPercentCompleteOverride"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("period");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "period"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("percent");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "percent"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("comments");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "comments"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
