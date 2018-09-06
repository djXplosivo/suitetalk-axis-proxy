package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InventoryDetail extends Record implements Serializable {
   private InventoryAssignmentList inventoryAssignmentList;
   private RecordRef customForm;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InventoryDetail.class, true);

   public InventoryDetail() {
      super();
   }

   public InventoryDetail(NullField nullFieldList, InventoryAssignmentList inventoryAssignmentList, RecordRef customForm) {
      super(nullFieldList);
      this.inventoryAssignmentList = inventoryAssignmentList;
      this.customForm = customForm;
   }

   public InventoryAssignmentList getInventoryAssignmentList() {
      return this.inventoryAssignmentList;
   }

   public void setInventoryAssignmentList(InventoryAssignmentList inventoryAssignmentList) {
      this.inventoryAssignmentList = inventoryAssignmentList;
   }

   public RecordRef getCustomForm() {
      return this.customForm;
   }

   public void setCustomForm(RecordRef customForm) {
      this.customForm = customForm;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InventoryDetail)) {
         return false;
      } else {
         InventoryDetail other = (InventoryDetail)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.inventoryAssignmentList == null && other.getInventoryAssignmentList() == null || this.inventoryAssignmentList != null && this.inventoryAssignmentList.equals(other.getInventoryAssignmentList())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm()));
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
         if (this.getInventoryAssignmentList() != null) {
            _hashCode += this.getInventoryAssignmentList().hashCode();
         }

         if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryDetail"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("inventoryAssignmentList");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "inventoryAssignmentList"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryAssignmentList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customForm");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "customForm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
