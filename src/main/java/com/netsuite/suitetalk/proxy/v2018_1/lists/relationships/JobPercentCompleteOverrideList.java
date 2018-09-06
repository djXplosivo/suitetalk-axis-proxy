package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

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

public class JobPercentCompleteOverrideList implements Serializable {
   private JobPercentCompleteOverride[] jobPercentCompleteOverride;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(JobPercentCompleteOverrideList.class, true);

   public JobPercentCompleteOverrideList() {
      super();
   }

   public JobPercentCompleteOverrideList(JobPercentCompleteOverride[] jobPercentCompleteOverride, boolean replaceAll) {
      super();
      this.jobPercentCompleteOverride = jobPercentCompleteOverride;
      this.replaceAll = replaceAll;
   }

   public JobPercentCompleteOverride[] getJobPercentCompleteOverride() {
      return this.jobPercentCompleteOverride;
   }

   public void setJobPercentCompleteOverride(JobPercentCompleteOverride[] jobPercentCompleteOverride) {
      this.jobPercentCompleteOverride = jobPercentCompleteOverride;
   }

   public JobPercentCompleteOverride getJobPercentCompleteOverride(int i) {
      return this.jobPercentCompleteOverride[i];
   }

   public void setJobPercentCompleteOverride(int i, JobPercentCompleteOverride _value) {
      this.jobPercentCompleteOverride[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof JobPercentCompleteOverrideList)) {
         return false;
      } else {
         JobPercentCompleteOverrideList other = (JobPercentCompleteOverrideList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.jobPercentCompleteOverride == null && other.getJobPercentCompleteOverride() == null || this.jobPercentCompleteOverride != null && Arrays.equals(this.jobPercentCompleteOverride, other.getJobPercentCompleteOverride())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getJobPercentCompleteOverride() != null) {
            for(int i = 0; i < Array.getLength(this.getJobPercentCompleteOverride()); ++i) {
               Object obj = Array.get(this.getJobPercentCompleteOverride(), i);
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobPercentCompleteOverrideList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("jobPercentCompleteOverride");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "jobPercentCompleteOverride"));
      elemField.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobPercentCompleteOverride"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
