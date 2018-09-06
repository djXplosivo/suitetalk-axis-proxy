package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class WsRoleList implements Serializable {
   private WsRole[] wsRole;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(WsRoleList.class, true);

   public WsRoleList() {
      super();
   }

   public WsRoleList(WsRole[] wsRole) {
      super();
      this.wsRole = wsRole;
   }

   public WsRole[] getWsRole() {
      return this.wsRole;
   }

   public void setWsRole(WsRole[] wsRole) {
      this.wsRole = wsRole;
   }

   public WsRole getWsRole(int i) {
      return this.wsRole[i];
   }

   public void setWsRole(int i, WsRole _value) {
      this.wsRole[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof WsRoleList)) {
         return false;
      } else {
         WsRoleList other = (WsRoleList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.wsRole == null && other.getWsRole() == null || this.wsRole != null && Arrays.equals(this.wsRole, other.getWsRole());
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
         if (this.getWsRole() != null) {
            for(int i = 0; i < Array.getLength(this.getWsRole()); ++i) {
               Object obj = Array.get(this.getWsRole(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "WsRoleList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("wsRole");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "wsRole"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "WsRole"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
