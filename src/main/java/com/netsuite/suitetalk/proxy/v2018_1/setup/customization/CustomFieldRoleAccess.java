package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationAccessLevel;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationSearchLevel;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomFieldRoleAccess implements Serializable {
   private RecordRef role;
   private CustomizationAccessLevel accessLevel;
   private CustomizationSearchLevel searchLevel;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomFieldRoleAccess.class, true);

   public CustomFieldRoleAccess() {
      super();
   }

   public CustomFieldRoleAccess(RecordRef role, CustomizationAccessLevel accessLevel, CustomizationSearchLevel searchLevel) {
      super();
      this.role = role;
      this.accessLevel = accessLevel;
      this.searchLevel = searchLevel;
   }

   public RecordRef getRole() {
      return this.role;
   }

   public void setRole(RecordRef role) {
      this.role = role;
   }

   public CustomizationAccessLevel getAccessLevel() {
      return this.accessLevel;
   }

   public void setAccessLevel(CustomizationAccessLevel accessLevel) {
      this.accessLevel = accessLevel;
   }

   public CustomizationSearchLevel getSearchLevel() {
      return this.searchLevel;
   }

   public void setSearchLevel(CustomizationSearchLevel searchLevel) {
      this.searchLevel = searchLevel;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomFieldRoleAccess)) {
         return false;
      } else {
         CustomFieldRoleAccess other = (CustomFieldRoleAccess)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.role == null && other.getRole() == null || this.role != null && this.role.equals(other.getRole())) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && this.accessLevel.equals(other.getAccessLevel())) && (this.searchLevel == null && other.getSearchLevel() == null || this.searchLevel != null && this.searchLevel.equals(other.getSearchLevel()));
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
         if (this.getRole() != null) {
            _hashCode += this.getRole().hashCode();
         }

         if (this.getAccessLevel() != null) {
            _hashCode += this.getAccessLevel().hashCode();
         }

         if (this.getSearchLevel() != null) {
            _hashCode += this.getSearchLevel().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldRoleAccess"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("role");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "role"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accessLevel");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "accessLevel"));
      elemField.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchLevel");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "searchLevel"));
      elemField.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
