package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecordBasic;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GroupMemberSearchBasic extends SearchRecordBasic implements Serializable {
   private RecordRef groupId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GroupMemberSearchBasic.class, true);

   public GroupMemberSearchBasic() {
      super();
   }

   public GroupMemberSearchBasic(RecordRef groupId) {
      super();
      this.groupId = groupId;
   }

   public RecordRef getGroupId() {
      return this.groupId;
   }

   public void setGroupId(RecordRef groupId) {
      this.groupId = groupId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GroupMemberSearchBasic)) {
         return false;
      } else {
         GroupMemberSearchBasic other = (GroupMemberSearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.groupId == null && other.getGroupId() == null || this.groupId != null && this.groupId.equals(other.getGroupId()));
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
         if (this.getGroupId() != null) {
            _hashCode += this.getGroupId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "GroupMemberSearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("groupId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "groupId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
