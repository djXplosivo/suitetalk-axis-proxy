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

public class VendorReturnAuthorizationItem implements Serializable {
   private RecordRef item;
   private String vendorName;
   private Long line;
   private Long orderLine;
   private Double quantity;
   private RecordRef units;
   private InventoryDetail inventoryDetail;
   private RecordRefList serialNumbersList;
   private String description;
   private String binNumbers;
   private String rate;
   private Double amount;
   private RecordRef taxCode;
   private Double taxRate1;
   private Double taxRate2;
   private Double grossAmt;
   private Double tax1Amt;
   private CustomFieldList options;
   private RecordRef department;
   private RecordRef _class;
   private RecordRef location;
   private RecordRef customer;
   private Boolean isBillable;
   private Boolean isClosed;
   private RecordRef amortizationSched;
   private Boolean isDropShipment;
   private Double taxAmount;
   private String taxDetailsReference;
   private Calendar amortizStartDate;
   private Calendar amortizationEndDate;
   private String amortizationResidual;
   private CustomFieldList customFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(VendorReturnAuthorizationItem.class, true);

   public VendorReturnAuthorizationItem() {
      super();
   }

   public VendorReturnAuthorizationItem(RecordRef item, String vendorName, Long line, Long orderLine, Double quantity, RecordRef units, InventoryDetail inventoryDetail, RecordRefList serialNumbersList, String description, String binNumbers, String rate, Double amount, RecordRef taxCode, Double taxRate1, Double taxRate2, Double grossAmt, Double tax1Amt, CustomFieldList options, RecordRef department, RecordRef _class, RecordRef location, RecordRef customer, Boolean isBillable, Boolean isClosed, RecordRef amortizationSched, Boolean isDropShipment, Double taxAmount, String taxDetailsReference, Calendar amortizStartDate, Calendar amortizationEndDate, String amortizationResidual, CustomFieldList customFieldList) {
      super();
      this.item = item;
      this.vendorName = vendorName;
      this.line = line;
      this.orderLine = orderLine;
      this.quantity = quantity;
      this.units = units;
      this.inventoryDetail = inventoryDetail;
      this.serialNumbersList = serialNumbersList;
      this.description = description;
      this.binNumbers = binNumbers;
      this.rate = rate;
      this.amount = amount;
      this.taxCode = taxCode;
      this.taxRate1 = taxRate1;
      this.taxRate2 = taxRate2;
      this.grossAmt = grossAmt;
      this.tax1Amt = tax1Amt;
      this.options = options;
      this.department = department;
      this._class = _class;
      this.location = location;
      this.customer = customer;
      this.isBillable = isBillable;
      this.isClosed = isClosed;
      this.amortizationSched = amortizationSched;
      this.isDropShipment = isDropShipment;
      this.taxAmount = taxAmount;
      this.taxDetailsReference = taxDetailsReference;
      this.amortizStartDate = amortizStartDate;
      this.amortizationEndDate = amortizationEndDate;
      this.amortizationResidual = amortizationResidual;
      this.customFieldList = customFieldList;
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

   public Long getLine() {
      return this.line;
   }

   public void setLine(Long line) {
      this.line = line;
   }

   public Long getOrderLine() {
      return this.orderLine;
   }

   public void setOrderLine(Long orderLine) {
      this.orderLine = orderLine;
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

   public InventoryDetail getInventoryDetail() {
      return this.inventoryDetail;
   }

   public void setInventoryDetail(InventoryDetail inventoryDetail) {
      this.inventoryDetail = inventoryDetail;
   }

   public RecordRefList getSerialNumbersList() {
      return this.serialNumbersList;
   }

   public void setSerialNumbersList(RecordRefList serialNumbersList) {
      this.serialNumbersList = serialNumbersList;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getBinNumbers() {
      return this.binNumbers;
   }

   public void setBinNumbers(String binNumbers) {
      this.binNumbers = binNumbers;
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

   public Double getTax1Amt() {
      return this.tax1Amt;
   }

   public void setTax1Amt(Double tax1Amt) {
      this.tax1Amt = tax1Amt;
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

   public RecordRef getLocation() {
      return this.location;
   }

   public void setLocation(RecordRef location) {
      this.location = location;
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

   public Boolean getIsClosed() {
      return this.isClosed;
   }

   public void setIsClosed(Boolean isClosed) {
      this.isClosed = isClosed;
   }

   public RecordRef getAmortizationSched() {
      return this.amortizationSched;
   }

   public void setAmortizationSched(RecordRef amortizationSched) {
      this.amortizationSched = amortizationSched;
   }

   public Boolean getIsDropShipment() {
      return this.isDropShipment;
   }

   public void setIsDropShipment(Boolean isDropShipment) {
      this.isDropShipment = isDropShipment;
   }

   public Double getTaxAmount() {
      return this.taxAmount;
   }

   public void setTaxAmount(Double taxAmount) {
      this.taxAmount = taxAmount;
   }

   public String getTaxDetailsReference() {
      return this.taxDetailsReference;
   }

   public void setTaxDetailsReference(String taxDetailsReference) {
      this.taxDetailsReference = taxDetailsReference;
   }

   public Calendar getAmortizStartDate() {
      return this.amortizStartDate;
   }

   public void setAmortizStartDate(Calendar amortizStartDate) {
      this.amortizStartDate = amortizStartDate;
   }

   public Calendar getAmortizationEndDate() {
      return this.amortizationEndDate;
   }

   public void setAmortizationEndDate(Calendar amortizationEndDate) {
      this.amortizationEndDate = amortizationEndDate;
   }

   public String getAmortizationResidual() {
      return this.amortizationResidual;
   }

   public void setAmortizationResidual(String amortizationResidual) {
      this.amortizationResidual = amortizationResidual;
   }

   public CustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(CustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof VendorReturnAuthorizationItem)) {
         return false;
      } else {
         VendorReturnAuthorizationItem other = (VendorReturnAuthorizationItem)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.orderLine == null && other.getOrderLine() == null || this.orderLine != null && this.orderLine.equals(other.getOrderLine())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.serialNumbersList == null && other.getSerialNumbersList() == null || this.serialNumbersList != null && this.serialNumbersList.equals(other.getSerialNumbersList())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.binNumbers == null && other.getBinNumbers() == null || this.binNumbers != null && this.binNumbers.equals(other.getBinNumbers())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && this.isBillable.equals(other.getIsBillable())) && (this.isClosed == null && other.getIsClosed() == null || this.isClosed != null && this.isClosed.equals(other.getIsClosed())) && (this.amortizationSched == null && other.getAmortizationSched() == null || this.amortizationSched != null && this.amortizationSched.equals(other.getAmortizationSched())) && (this.isDropShipment == null && other.getIsDropShipment() == null || this.isDropShipment != null && this.isDropShipment.equals(other.getIsDropShipment())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.amortizStartDate == null && other.getAmortizStartDate() == null || this.amortizStartDate != null && this.amortizStartDate.equals(other.getAmortizStartDate())) && (this.amortizationEndDate == null && other.getAmortizationEndDate() == null || this.amortizationEndDate != null && this.amortizationEndDate.equals(other.getAmortizationEndDate())) && (this.amortizationResidual == null && other.getAmortizationResidual() == null || this.amortizationResidual != null && this.amortizationResidual.equals(other.getAmortizationResidual())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
         }

         if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
         }

         if (this.getOrderLine() != null) {
            _hashCode += this.getOrderLine().hashCode();
         }

         if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
         }

         if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
         }

         if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
         }

         if (this.getSerialNumbersList() != null) {
            _hashCode += this.getSerialNumbersList().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getBinNumbers() != null) {
            _hashCode += this.getBinNumbers().hashCode();
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

         if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
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

         if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
         }

         if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
         }

         if (this.getIsBillable() != null) {
            _hashCode += this.getIsBillable().hashCode();
         }

         if (this.getIsClosed() != null) {
            _hashCode += this.getIsClosed().hashCode();
         }

         if (this.getAmortizationSched() != null) {
            _hashCode += this.getAmortizationSched().hashCode();
         }

         if (this.getIsDropShipment() != null) {
            _hashCode += this.getIsDropShipment().hashCode();
         }

         if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
         }

         if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
         }

         if (this.getAmortizStartDate() != null) {
            _hashCode += this.getAmortizStartDate().hashCode();
         }

         if (this.getAmortizationEndDate() != null) {
            _hashCode += this.getAmortizationEndDate().hashCode();
         }

         if (this.getAmortizationResidual() != null) {
            _hashCode += this.getAmortizationResidual().hashCode();
         }

         if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationItem"));
      ElementDesc elemField = new ElementDesc();
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
      elemField.setFieldName("line");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "line"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("orderLine");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "orderLine"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
      elemField.setFieldName("inventoryDetail");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "inventoryDetail"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryDetail"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("serialNumbersList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "serialNumbersList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRefList"));
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
      elemField.setFieldName("binNumbers");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "binNumbers"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
      elemField.setFieldName("tax1Amt");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "tax1Amt"));
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
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "location"));
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
      elemField.setFieldName("isClosed");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "isClosed"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amortizationSched");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "amortizationSched"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isDropShipment");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "isDropShipment"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxAmount");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxDetailsReference");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amortizStartDate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "amortizStartDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amortizationEndDate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "amortizationEndDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amortizationResidual");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "amortizationResidual"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
