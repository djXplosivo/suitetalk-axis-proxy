package com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.InboundShipmentSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TransactionSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.VendorSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
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

public class InboundShipmentSearch extends SearchRecord implements Serializable {
   private InboundShipmentSearchBasic basic;
   private ItemSearchBasic itemJoin;
   private TransactionSearchBasic itemReceiptJoin;
   private TransactionSearchBasic purchaseOrderJoin;
   private VendorSearchBasic vendorJoin;
   private CustomSearchJoin[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InboundShipmentSearch.class, true);

   public InboundShipmentSearch() {
      super();
   }

   public InboundShipmentSearch(InboundShipmentSearchBasic basic, ItemSearchBasic itemJoin, TransactionSearchBasic itemReceiptJoin, TransactionSearchBasic purchaseOrderJoin, VendorSearchBasic vendorJoin, CustomSearchJoin[] customSearchJoin) {
      super();
      this.basic = basic;
      this.itemJoin = itemJoin;
      this.itemReceiptJoin = itemReceiptJoin;
      this.purchaseOrderJoin = purchaseOrderJoin;
      this.vendorJoin = vendorJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public InboundShipmentSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(InboundShipmentSearchBasic basic) {
      this.basic = basic;
   }

   public ItemSearchBasic getItemJoin() {
      return this.itemJoin;
   }

   public void setItemJoin(ItemSearchBasic itemJoin) {
      this.itemJoin = itemJoin;
   }

   public TransactionSearchBasic getItemReceiptJoin() {
      return this.itemReceiptJoin;
   }

   public void setItemReceiptJoin(TransactionSearchBasic itemReceiptJoin) {
      this.itemReceiptJoin = itemReceiptJoin;
   }

   public TransactionSearchBasic getPurchaseOrderJoin() {
      return this.purchaseOrderJoin;
   }

   public void setPurchaseOrderJoin(TransactionSearchBasic purchaseOrderJoin) {
      this.purchaseOrderJoin = purchaseOrderJoin;
   }

   public VendorSearchBasic getVendorJoin() {
      return this.vendorJoin;
   }

   public void setVendorJoin(VendorSearchBasic vendorJoin) {
      this.vendorJoin = vendorJoin;
   }

   public CustomSearchJoin[] getCustomSearchJoin() {
      return this.customSearchJoin;
   }

   public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
      this.customSearchJoin = customSearchJoin;
   }

   public CustomSearchJoin getCustomSearchJoin(int i) {
      return this.customSearchJoin[i];
   }

   public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
      this.customSearchJoin[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InboundShipmentSearch)) {
         return false;
      } else {
         InboundShipmentSearch other = (InboundShipmentSearch)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.itemJoin == null && other.getItemJoin() == null || this.itemJoin != null && this.itemJoin.equals(other.getItemJoin())) && (this.itemReceiptJoin == null && other.getItemReceiptJoin() == null || this.itemReceiptJoin != null && this.itemReceiptJoin.equals(other.getItemReceiptJoin())) && (this.purchaseOrderJoin == null && other.getPurchaseOrderJoin() == null || this.purchaseOrderJoin != null && this.purchaseOrderJoin.equals(other.getPurchaseOrderJoin())) && (this.vendorJoin == null && other.getVendorJoin() == null || this.vendorJoin != null && this.vendorJoin.equals(other.getVendorJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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

         if (this.getItemJoin() != null) {
            _hashCode += this.getItemJoin().hashCode();
         }

         if (this.getItemReceiptJoin() != null) {
            _hashCode += this.getItemReceiptJoin().hashCode();
         }

         if (this.getPurchaseOrderJoin() != null) {
            _hashCode += this.getPurchaseOrderJoin().hashCode();
         }

         if (this.getVendorJoin() != null) {
            _hashCode += this.getVendorJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InboundShipmentSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemJoin");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "itemJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemReceiptJoin");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "itemReceiptJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseOrderJoin");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "purchaseOrderJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vendorJoin");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "vendorJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
