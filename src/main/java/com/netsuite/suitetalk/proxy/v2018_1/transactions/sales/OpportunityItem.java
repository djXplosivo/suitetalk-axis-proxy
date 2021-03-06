package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.ItemCostEstimateType;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class OpportunityItem implements Serializable {
   private RecordRef job;
   private RecordRef item;
   private Long line;
   private Double quantityAvailable;
   private Double quantityOnHand;
   private Double quantity;
   private RecordRef units;
   private String description;
   private RecordRef price;
   private String rate;
   private Double amount;
   private Double altSalesAmt;
   private Long revRecTermInMonths;
   private CustomFieldList options;
   private Boolean fromJob;
   private RecordRef department;
   private Boolean isEstimate;
   private RecordRef location;
   private RecordRef _class;
   private ItemCostEstimateType costEstimateType;
   private Double costEstimate;
   private Double taxAmount;
   private String taxDetailsReference;
   private Double grossAmt;
   private Double tax1Amt;
   private RecordRef taxCode;
   private Double taxRate1;
   private Double taxRate2;
   private Calendar expectedShipDate;
   private RecordRef subscription;
   private CustomFieldList customFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(OpportunityItem.class, true);

   public OpportunityItem() {
      super();
   }

   public OpportunityItem(RecordRef job, RecordRef item, Long line, Double quantityAvailable, Double quantityOnHand, Double quantity, RecordRef units, String description, RecordRef price, String rate, Double amount, Double altSalesAmt, Long revRecTermInMonths, CustomFieldList options, Boolean fromJob, RecordRef department, Boolean isEstimate, RecordRef location, RecordRef _class, ItemCostEstimateType costEstimateType, Double costEstimate, Double taxAmount, String taxDetailsReference, Double grossAmt, Double tax1Amt, RecordRef taxCode, Double taxRate1, Double taxRate2, Calendar expectedShipDate, RecordRef subscription, CustomFieldList customFieldList) {
      super();
      this.job = job;
      this.item = item;
      this.line = line;
      this.quantityAvailable = quantityAvailable;
      this.quantityOnHand = quantityOnHand;
      this.quantity = quantity;
      this.units = units;
      this.description = description;
      this.price = price;
      this.rate = rate;
      this.amount = amount;
      this.altSalesAmt = altSalesAmt;
      this.revRecTermInMonths = revRecTermInMonths;
      this.options = options;
      this.fromJob = fromJob;
      this.department = department;
      this.isEstimate = isEstimate;
      this.location = location;
      this._class = _class;
      this.costEstimateType = costEstimateType;
      this.costEstimate = costEstimate;
      this.taxAmount = taxAmount;
      this.taxDetailsReference = taxDetailsReference;
      this.grossAmt = grossAmt;
      this.tax1Amt = tax1Amt;
      this.taxCode = taxCode;
      this.taxRate1 = taxRate1;
      this.taxRate2 = taxRate2;
      this.expectedShipDate = expectedShipDate;
      this.subscription = subscription;
      this.customFieldList = customFieldList;
   }

   public RecordRef getJob() {
      return this.job;
   }

   public void setJob(RecordRef job) {
      this.job = job;
   }

   public RecordRef getItem() {
      return this.item;
   }

   public void setItem(RecordRef item) {
      this.item = item;
   }

   public Long getLine() {
      return this.line;
   }

   public void setLine(Long line) {
      this.line = line;
   }

   public Double getQuantityAvailable() {
      return this.quantityAvailable;
   }

   public void setQuantityAvailable(Double quantityAvailable) {
      this.quantityAvailable = quantityAvailable;
   }

   public Double getQuantityOnHand() {
      return this.quantityOnHand;
   }

   public void setQuantityOnHand(Double quantityOnHand) {
      this.quantityOnHand = quantityOnHand;
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

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public RecordRef getPrice() {
      return this.price;
   }

   public void setPrice(RecordRef price) {
      this.price = price;
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

   public Double getAltSalesAmt() {
      return this.altSalesAmt;
   }

   public void setAltSalesAmt(Double altSalesAmt) {
      this.altSalesAmt = altSalesAmt;
   }

   public Long getRevRecTermInMonths() {
      return this.revRecTermInMonths;
   }

   public void setRevRecTermInMonths(Long revRecTermInMonths) {
      this.revRecTermInMonths = revRecTermInMonths;
   }

   public CustomFieldList getOptions() {
      return this.options;
   }

   public void setOptions(CustomFieldList options) {
      this.options = options;
   }

   public Boolean getFromJob() {
      return this.fromJob;
   }

   public void setFromJob(Boolean fromJob) {
      this.fromJob = fromJob;
   }

   public RecordRef getDepartment() {
      return this.department;
   }

   public void setDepartment(RecordRef department) {
      this.department = department;
   }

   public Boolean getIsEstimate() {
      return this.isEstimate;
   }

   public void setIsEstimate(Boolean isEstimate) {
      this.isEstimate = isEstimate;
   }

   public RecordRef getLocation() {
      return this.location;
   }

   public void setLocation(RecordRef location) {
      this.location = location;
   }

   public RecordRef get_class() {
      return this._class;
   }

   public void set_class(RecordRef _class) {
      this._class = _class;
   }

   public ItemCostEstimateType getCostEstimateType() {
      return this.costEstimateType;
   }

   public void setCostEstimateType(ItemCostEstimateType costEstimateType) {
      this.costEstimateType = costEstimateType;
   }

   public Double getCostEstimate() {
      return this.costEstimate;
   }

   public void setCostEstimate(Double costEstimate) {
      this.costEstimate = costEstimate;
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

   public Calendar getExpectedShipDate() {
      return this.expectedShipDate;
   }

   public void setExpectedShipDate(Calendar expectedShipDate) {
      this.expectedShipDate = expectedShipDate;
   }

   public RecordRef getSubscription() {
      return this.subscription;
   }

   public void setSubscription(RecordRef subscription) {
      this.subscription = subscription;
   }

   public CustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(CustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof OpportunityItem)) {
         return false;
      } else {
         OpportunityItem other = (OpportunityItem)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.altSalesAmt == null && other.getAltSalesAmt() == null || this.altSalesAmt != null && this.altSalesAmt.equals(other.getAltSalesAmt())) && (this.revRecTermInMonths == null && other.getRevRecTermInMonths() == null || this.revRecTermInMonths != null && this.revRecTermInMonths.equals(other.getRevRecTermInMonths())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.fromJob == null && other.getFromJob() == null || this.fromJob != null && this.fromJob.equals(other.getFromJob())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.isEstimate == null && other.getIsEstimate() == null || this.isEstimate != null && this.isEstimate.equals(other.getIsEstimate())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.expectedShipDate == null && other.getExpectedShipDate() == null || this.expectedShipDate != null && this.expectedShipDate.equals(other.getExpectedShipDate())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && this.subscription.equals(other.getSubscription())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
         if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
         }

         if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
         }

         if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
         }

         if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
         }

         if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getPrice() != null) {
            _hashCode += this.getPrice().hashCode();
         }

         if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
         }

         if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
         }

         if (this.getAltSalesAmt() != null) {
            _hashCode += this.getAltSalesAmt().hashCode();
         }

         if (this.getRevRecTermInMonths() != null) {
            _hashCode += this.getRevRecTermInMonths().hashCode();
         }

         if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
         }

         if (this.getFromJob() != null) {
            _hashCode += this.getFromJob().hashCode();
         }

         if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
         }

         if (this.getIsEstimate() != null) {
            _hashCode += this.getIsEstimate().hashCode();
         }

         if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
         }

         if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
         }

         if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
         }

         if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
         }

         if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
         }

         if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
         }

         if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
         }

         if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
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

         if (this.getExpectedShipDate() != null) {
            _hashCode += this.getExpectedShipDate().hashCode();
         }

         if (this.getSubscription() != null) {
            _hashCode += this.getSubscription().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunityItem"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("job");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "job"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("line");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "line"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityAvailable");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "quantityAvailable"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityOnHand");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "quantityOnHand"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantity");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "quantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("units");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "units"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("price");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "price"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("rate");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "rate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amount");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "amount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("altSalesAmt");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "altSalesAmt"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revRecTermInMonths");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "revRecTermInMonths"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("options");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "options"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("fromJob");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "fromJob"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("department");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "department"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isEstimate");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "isEstimate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_class");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "class"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("costEstimateType");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "costEstimateType"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("costEstimate");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "costEstimate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxAmount");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "taxAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxDetailsReference");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("grossAmt");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "grossAmt"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("tax1Amt");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "tax1Amt"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxCode");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "taxCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxRate1");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "taxRate1"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxRate2");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "taxRate2"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expectedShipDate");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "expectedShipDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subscription");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "subscription"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
