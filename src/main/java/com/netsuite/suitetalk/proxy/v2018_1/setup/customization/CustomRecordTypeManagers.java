package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecordTypeManagers implements Serializable {
   private RecordRef managerEmp;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeManagers.class, true);

   public CustomRecordTypeManagers() {
      super();
   }

   public CustomRecordTypeManagers(RecordRef managerEmp) {
      super();
      this.managerEmp = managerEmp;
   }

   public RecordRef getManagerEmp() {
      return this.managerEmp;
   }

   public void setManagerEmp(RecordRef managerEmp) {
      this.managerEmp = managerEmp;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomRecordTypeManagers)) {
         return false;
      } else {
         CustomRecordTypeManagers other = (CustomRecordTypeManagers)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.managerEmp == null && other.getManagerEmp() == null || this.managerEmp != null && this.managerEmp.equals(other.getManagerEmp());
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
         if (this.getManagerEmp() != null) {
            _hashCode += this.getManagerEmp().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeManagers"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("managerEmp");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "managerEmp"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
