package com.netsuite.suitetalk.proxy.v2018_1.lists.employees;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class EmployeeRoles implements Serializable {
   private RecordRef selectedRole;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(EmployeeRoles.class, true);

   public EmployeeRoles() {
      super();
   }

   public EmployeeRoles(RecordRef selectedRole) {
      super();
      this.selectedRole = selectedRole;
   }

   public RecordRef getSelectedRole() {
      return this.selectedRole;
   }

   public void setSelectedRole(RecordRef selectedRole) {
      this.selectedRole = selectedRole;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof EmployeeRoles)) {
         return false;
      } else {
         EmployeeRoles other = (EmployeeRoles)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.selectedRole == null && other.getSelectedRole() == null || this.selectedRole != null && this.selectedRole.equals(other.getSelectedRole());
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
         if (this.getSelectedRole() != null) {
            _hashCode += this.getSelectedRole().hashCode();
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeRoles"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("selectedRole");
      elemField.setXmlName(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "selectedRole"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
