package com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.InventoryDetail;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRefList;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PurchaseRequisitionItem implements Serializable {
   private Long line;
   private RecordRef item;
   private String vendorName;
   private RecordRef poVendor;
   private Double quantity;
   private RecordRef units;
   private String serialNumbers;
   private InventoryDetail inventoryDetail;
   private String description;
   private Double estimatedRate;
   private Double estimatedAmount;
   private String rate;
   private Double amount;
   private RecordRef taxCode;
   private Double taxRate1;
   private Double taxRate2;
   private Double grossAmt;
   private CustomFieldList options;
   private RecordRef department;
   private RecordRef _class;
   private RecordRef customer;
   private Boolean isBillable;
   private RecordRefList linkedOrderList;
   private String linkedOrderStatus;
   private Calendar expectedReceiptDate;
   private Boolean isClosed;
   private Boolean expandItemGroup;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PurchaseRequisitionItem.class, true);

   public PurchaseRequisitionItem() {
      super();
   }

   public PurchaseRequisitionItem(Long line, RecordRef item, String vendorName, RecordRef poVendor, Double quantity, RecordRef units, String serialNumbers, InventoryDetail inventoryDetail, String description, Double estimatedRate, Double estimatedAmount, String rate, Double amount, RecordRef taxCode, Double taxRate1, Double taxRate2, Double grossAmt, CustomFieldList options, RecordRef department, RecordRef _class, RecordRef customer, Boolean isBillable, RecordRefList linkedOrderList, String linkedOrderStatus, Calendar expectedReceiptDate, Boolean isClosed, Boolean expandItemGroup) {
      super();
      this.line = line;
      this.item = item;
      this.vendorName = vendorName;
      this.poVendor = poVendor;
      this.quantity = quantity;
      this.units = units;
      this.serialNumbers = serialNumbers;
      this.inventoryDetail = inventoryDetail;
      this.description = description;
      this.estimatedRate = estimatedRate;
      this.estimatedAmount = estimatedAmount;
      this.rate = rate;
      this.amount = amount;
      this.taxCode = taxCode;
      this.taxRate1 = taxRate1;
      this.taxRate2 = taxRate2;
      this.grossAmt = grossAmt;
      this.options = options;
      this.department = department;
      this._class = _class;
      this.customer = customer;
      this.isBillable = isBillable;
      this.linkedOrderList = linkedOrderList;
      this.linkedOrderStatus = linkedOrderStatus;
      this.expectedReceiptDate = expectedReceiptDate;
      this.isClosed = isClosed;
      this.expandItemGroup = expandItemGroup;
   }

   public Long getLine() {
      return this.line;
   }

   public void setLine(Long line) {
      this.line = line;
   }

   public RecordRef getItem() {
      return this.item;
   }

   public void setItem(RecordRef item) {
      this.item = item;
   }

   public String getVendorName() {
      return this.vendorName;
   }

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public RecordRef getPoVendor() {
      return this.poVendor;
   }

   public void setPoVendor(RecordRef poVendor) {
      this.poVendor = poVendor;
   }

   public Double getQuantity() {
      return this.quantity;
   }

   public void setQuantity(Double quantity) {
      this.quantity = quantity;
   }

   public RecordRef getUnits() {
      return this.units;
   }

   public void setUnits(RecordRef units) {
      this.units = units;
   }

   public String getSerialNumbers() {
      return this.serialNumbers;
   }

   public void setSerialNumbers(String serialNumbers) {
      this.serialNumbers = serialNumbers;
   }

   public InventoryDetail getInventoryDetail() {
      return this.inventoryDetail;
   }

   public void setInventoryDetail(InventoryDetail inventoryDetail) {
      this.inventoryDetail = inventoryDetail;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Double getEstimatedRate() {
      return this.estimatedRate;
   }

   public void setEstimatedRate(Double estimatedRate) {
      this.estimatedRate = estimatedRate;
   }

   public Double getEstimatedAmount() {
      return this.estimatedAmount;
   }

   public void setEstimatedAmount(Double estimatedAmount) {
      this.estimatedAmount = estimatedAmount;
   }

   public String getRate() {
      return this.rate;
   }

   public void setRate(String rate) {
      this.rate = rate;
   }

   public Double getAmount() {
      return this.amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public RecordRef getTaxCode() {
      return this.taxCode;
   }

   public void setTaxCode(RecordRef taxCode) {
      this.taxCode = taxCode;
   }

   public Double getTaxRate1() {
      return this.taxRate1;
   }

   public void setTaxRate1(Double taxRate1) {
      this.taxRate1 = taxRate1;
   }

   public Double getTaxRate2() {
      return this.taxRate2;
   }

   public void setTaxRate2(Double taxRate2) {
      this.taxRate2 = taxRate2;
   }

   public Double getGrossAmt() {
      return this.grossAmt;
   }

   public void setGrossAmt(Double grossAmt) {
      this.grossAmt = grossAmt;
   }

   public CustomFieldList getOptions() {
      return this.options;
   }

   public void setOptions(CustomFieldList options) {
      this.options = options;
   }

   public RecordRef getDepartment() {
      return this.department;
   }

   public void setDepartment(RecordRef department) {
      this.department = department;
   }

   public RecordRef get_class() {
      return this._class;
   }

   public void set_class(RecordRef _class) {
      this._class = _class;
   }

   public RecordRef getCustomer() {
      return this.customer;
   }

   public void setCustomer(RecordRef customer) {
      this.customer = customer;
   }

   public Boolean getIsBillable() {
      return this.isBillable;
   }

   public void setIsBillable(Boolean isBillable) {
      this.isBillable = isBillable;
   }

   public RecordRefList getLinkedOrderList() {
      return this.linkedOrderList;
   }

   public void setLinkedOrderList(RecordRefList linkedOrderList) {
      this.linkedOrderList = linkedOrderList;
   }

   public String getLinkedOrderStatus() {
      return this.linkedOrderStatus;
   }

   public void setLinkedOrderStatus(String linkedOrderStatus) {
      this.linkedOrderStatus = linkedOrderStatus;
   }

   public Calendar getExpectedReceiptDate() {
      return this.expectedReceiptDate;
   }

   public void setExpectedReceiptDate(Calendar expectedReceiptDate) {
      this.expectedReceiptDate = expectedReceiptDate;
   }

   public Boolean getIsClosed() {
      return this.isClosed;
   }

   public void setIsClosed(Boolean isClosed) {
      this.isClosed = isClosed;
   }

   public Boolean getExpandItemGroup() {
      return this.expandItemGroup;
   }

   public void setExpandItemGroup(Boolean expandItemGroup) {
      this.expandItemGroup = expandItemGroup;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PurchaseRequisitionItem)) {
         return false;
      } else {
         PurchaseRequisitionItem other = (PurchaseRequisitionItem)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.poVendor == null && other.getPoVendor() == null || this.poVendor != null && this.poVendor.equals(other.getPoVendor())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.estimatedRate == null && other.getEstimatedRate() == null || this.estimatedRate != null && this.estimatedRate.equals(other.getEstimatedRate())) && (this.estimatedAmount == null && other.getEstimatedAmount() == null || this.estimatedAmount != null && this.estimatedAmount.equals(other.getEstimatedAmount())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && this.isBillable.equals(other.getIsBillable())) && (this.linkedOrderList == null && other.getLinkedOrderList() == null || this.linkedOrderList != null && this.linkedOrderList.equals(other.getLinkedOrderList())) && (this.linkedOrderStatus == null && other.getLinkedOrderStatus() == null || this.linkedOrderStatus != null && this.linkedOrderStatus.equals(other.getLinkedOrderStatus())) && (this.expectedReceiptDate == null && other.getExpectedReceiptDate() == null || this.expectedReceiptDate != null && this.expectedReceiptDate.equals(other.getExpectedReceiptDate())) && (this.isClosed == null && other.getIsClosed() == null || this.isClosed != null && this.isClosed.equals(other.getIsClosed())) && (this.expandItemGroup == null && other.getExpandItemGroup() == null || this.expandItemGroup != null && this.expandItemGroup.equals(other.getExpandItemGroup()));
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
         if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
         }

         if (this.getPoVendor() != null) {
            _hashCode += this.getPoVendor().hashCode();
         }

         if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
         }

         if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
         }

         if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
         }

         if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getEstimatedRate() != null) {
            _hashCode += this.getEstimatedRate().hashCode();
         }

         if (this.getEstimatedAmount() != null) {
            _hashCode += this.getEstimatedAmount().hashCode();
         }

         if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
         }

         if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
         }

         if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
         }

         if (this.getTaxRate1() != null) {
            _hashCode += this.getTaxRate1().hashCode();
         }

         if (this.getTaxRate2() != null) {
            _hashCode += this.getTaxRate2().hashCode();
         }

         if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
         }

         if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
         }

         if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
         }

         if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
         }

         if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
         }

         if (this.getIsBillable() != null) {
            _hashCode += this.getIsBillable().hashCode();
         }

         if (this.getLinkedOrderList() != null) {
            _hashCode += this.getLinkedOrderList().hashCode();
         }

         if (this.getLinkedOrderStatus() != null) {
            _hashCode += this.getLinkedOrderStatus().hashCode();
         }

         if (this.getExpectedReceiptDate() != null) {
            _hashCode += this.getExpectedReceiptDate().hashCode();
         }

         if (this.getIsClosed() != null) {
            _hashCode += this.getIsClosed().hashCode();
         }

         if (this.getExpandItemGroup() != null) {
            _hashCode += this.getExpandItemGroup().hashCode();
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
      typeDesc.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisitionItem"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("line");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "line"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vendorName");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "vendorName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("poVendor");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "poVendor"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantity");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "quantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("units");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "units"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("serialNumbers");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "serialNumbers"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("inventoryDetail");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "inventoryDetail"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryDetail"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("estimatedRate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "estimatedRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("estimatedAmount");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "estimatedAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("rate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "rate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amount");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "amount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxCode");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxRate1");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxRate1"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxRate2");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxRate2"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("grossAmt");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "grossAmt"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("options");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "options"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("department");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "department"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_class");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "class"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customer");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "customer"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isBillable");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "isBillable"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("linkedOrderList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "linkedOrderList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRefList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("linkedOrderStatus");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "linkedOrderStatus"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expectedReceiptDate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "expectedReceiptDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isClosed");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "isClosed"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expandItemGroup");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "expandItemGroup"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
