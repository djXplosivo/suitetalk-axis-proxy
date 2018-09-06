package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Status;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.WsRoleList;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;

public class SessionResponse implements Serializable {
   private Status status;
   private RecordRef userId;
   private WsRoleList wsRoleList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SessionResponse.class, true);

   public SessionResponse() {
      super();
   }

   public SessionResponse(Status status, RecordRef userId, WsRoleList wsRoleList) {
      super();
      this.status = status;
      this.userId = userId;
      this.wsRoleList = wsRoleList;
   }

   public Status getStatus() {
      return this.status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public RecordRef getUserId() {
      return this.userId;
   }

   public void setUserId(RecordRef userId) {
      this.userId = userId;
   }

   public WsRoleList getWsRoleList() {
      return this.wsRoleList;
   }

   public void setWsRoleList(WsRoleList wsRoleList) {
      this.wsRoleList = wsRoleList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SessionResponse)) {
         return false;
      } else {
         SessionResponse other = (SessionResponse)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.userId == null && other.getUserId() == null || this.userId != null && this.userId.equals(other.getUserId())) && (this.wsRoleList == null && other.getWsRoleList() == null || this.wsRoleList != null && this.wsRoleList.equals(other.getWsRoleList()));
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
         if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
         }

         if (this.getUserId() != null) {
            _hashCode += this.getUserId().hashCode();
         }

         if (this.getWsRoleList() != null) {
            _hashCode += this.getWsRoleList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userId");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "userId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("wsRoleList");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "wsRoleList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "WsRoleList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
