package com.netsuite.suitetalk.proxy.v2018_1.lists.support;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class IssueVersion implements Serializable {
   private Boolean primary;
   private RecordRef version;
   private RecordRef build;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(IssueVersion.class, true);

   public IssueVersion() {
      super();
   }

   public IssueVersion(Boolean primary, RecordRef version, RecordRef build) {
      super();
      this.primary = primary;
      this.version = version;
      this.build = build;
   }

   public Boolean getPrimary() {
      return this.primary;
   }

   public void setPrimary(Boolean primary) {
      this.primary = primary;
   }

   public RecordRef getVersion() {
      return this.version;
   }

   public void setVersion(RecordRef version) {
      this.version = version;
   }

   public RecordRef getBuild() {
      return this.build;
   }

   public void setBuild(RecordRef build) {
      this.build = build;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof IssueVersion)) {
         return false;
      } else {
         IssueVersion other = (IssueVersion)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.primary == null && other.getPrimary() == null || this.primary != null && this.primary.equals(other.getPrimary())) && (this.version == null && other.getVersion() == null || this.version != null && this.version.equals(other.getVersion())) && (this.build == null && other.getBuild() == null || this.build != null && this.build.equals(other.getBuild()));
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
         if (this.getPrimary() != null) {
            _hashCode += this.getPrimary().hashCode();
         }

         if (this.getVersion() != null) {
            _hashCode += this.getVersion().hashCode();
         }

         if (this.getBuild() != null) {
            _hashCode += this.getBuild().hashCode();
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
      typeDesc.setXmlType(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueVersion"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("primary");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "primary"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("version");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "version"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("build");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "build"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
