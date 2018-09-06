package com.netsuite.suitetalk.proxy.v2018_1.lists.supplychain;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ManufacturingOperationTaskSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRow;
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

public class ManufacturingOperationTaskSearchRow extends SearchRow implements Serializable {
   private ManufacturingOperationTaskSearchRowBasic basic;
   private ManufacturingOperationTaskSearchRowBasic predecessorJoin;
   private EmployeeSearchRowBasic userJoin;
   private TransactionSearchRowBasic workOrderJoin;
   private CustomSearchRowBasic[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ManufacturingOperationTaskSearchRow.class, true);

   public ManufacturingOperationTaskSearchRow() {
      super();
   }

   public ManufacturingOperationTaskSearchRow(ManufacturingOperationTaskSearchRowBasic basic, ManufacturingOperationTaskSearchRowBasic predecessorJoin, EmployeeSearchRowBasic userJoin, TransactionSearchRowBasic workOrderJoin, CustomSearchRowBasic[] customSearchJoin) {
      super();
      this.basic = basic;
      this.predecessorJoin = predecessorJoin;
      this.userJoin = userJoin;
      this.workOrderJoin = workOrderJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public ManufacturingOperationTaskSearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(ManufacturingOperationTaskSearchRowBasic basic) {
      this.basic = basic;
   }

   public ManufacturingOperationTaskSearchRowBasic getPredecessorJoin() {
      return this.predecessorJoin;
   }

   public void setPredecessorJoin(ManufacturingOperationTaskSearchRowBasic predecessorJoin) {
      this.predecessorJoin = predecessorJoin;
   }

   public EmployeeSearchRowBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchRowBasic userJoin) {
      this.userJoin = userJoin;
   }

   public TransactionSearchRowBasic getWorkOrderJoin() {
      return this.workOrderJoin;
   }

   public void setWorkOrderJoin(TransactionSearchRowBasic workOrderJoin) {
      this.workOrderJoin = workOrderJoin;
   }

   public CustomSearchRowBasic[] getCustomSearchJoin() {
      return this.customSearchJoin;
   }

   public void setCustomSearchJoin(CustomSearchRowBasic[] customSearchJoin) {
      this.customSearchJoin = customSearchJoin;
   }

   public CustomSearchRowBasic getCustomSearchJoin(int i) {
      return this.customSearchJoin[i];
   }

   public void setCustomSearchJoin(int i, CustomSearchRowBasic _value) {
      this.customSearchJoin[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ManufacturingOperationTaskSearchRow)) {
         return false;
      } else {
         ManufacturingOperationTaskSearchRow other = (ManufacturingOperationTaskSearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.predecessorJoin == null && other.getPredecessorJoin() == null || this.predecessorJoin != null && this.predecessorJoin.equals(other.getPredecessorJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.workOrderJoin == null && other.getWorkOrderJoin() == null || this.workOrderJoin != null && this.workOrderJoin.equals(other.getWorkOrderJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
         if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
         }

         if (this.getPredecessorJoin() != null) {
            _hashCode += this.getPredecessorJoin().hashCode();
         }

         if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
         }

         if (this.getWorkOrderJoin() != null) {
            _hashCode += this.getWorkOrderJoin().hashCode();
         }

         if (this.getCustomSearchJoin() != null) {
            for(int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
               Object obj = Array.get(this.getCustomSearchJoin(), i);
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
      typeDesc.setXmlType(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskSearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("predecessorJoin");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "predecessorJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("workOrderJoin");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "workOrderJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
