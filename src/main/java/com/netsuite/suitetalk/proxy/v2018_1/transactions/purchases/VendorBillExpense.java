package com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases;

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

public class VendorBillExpense implements Serializable {
   private Long orderDoc;
   private Long orderLine;
   private Long line;
   private RecordRef category;
   private RecordRef account;
   private Double amount;
   private Double taxAmount;
   private Double tax1Amt;
   private String memo;
   private Double grossAmt;
   private String taxDetailsReference;
   private RecordRef department;
   private RecordRef _class;
   private RecordRef location;
   private RecordRef customer;
   private Boolean isBillable;
   private RecordRef projectTask;
   private RecordRef taxCode;
   private Double taxRate1;
   private Double taxRate2;
   private RecordRef amortizationSched;
   private Calendar amortizStartDate;
   private Calendar amortizationEndDate;
   private String amortizationResidual;
   private CustomFieldList customFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(VendorBillExpense.class, true);

   public VendorBillExpense() {
      super();
   }

   public VendorBillExpense(Long orderDoc, Long orderLine, Long line, RecordRef category, RecordRef account, Double amount, Double taxAmount, Double tax1Amt, String memo, Double grossAmt, String taxDetailsReference, RecordRef department, RecordRef _class, RecordRef location, RecordRef customer, Boolean isBillable, RecordRef projectTask, RecordRef taxCode, Double taxRate1, Double taxRate2, RecordRef amortizationSched, Calendar amortizStartDate, Calendar amortizationEndDate, String amortizationResidual, CustomFieldList customFieldList) {
      super();
      this.orderDoc = orderDoc;
      this.orderLine = orderLine;
      this.line = line;
      this.category = category;
      this.account = account;
      this.amount = amount;
      this.taxAmount = taxAmount;
      this.tax1Amt = tax1Amt;
      this.memo = memo;
      this.grossAmt = grossAmt;
      this.taxDetailsReference = taxDetailsReference;
      this.department = department;
      this._class = _class;
      this.location = location;
      this.customer = customer;
      this.isBillable = isBillable;
      this.projectTask = projectTask;
      this.taxCode = taxCode;
      this.taxRate1 = taxRate1;
      this.taxRate2 = taxRate2;
      this.amortizationSched = amortizationSched;
      this.amortizStartDate = amortizStartDate;
      this.amortizationEndDate = amortizationEndDate;
      this.amortizationResidual = amortizationResidual;
      this.customFieldList = customFieldList;
   }

   public Long getOrderDoc() {
      return this.orderDoc;
   }

   public void setOrderDoc(Long orderDoc) {
      this.orderDoc = orderDoc;
   }

   public Long getOrderLine() {
      return this.orderLine;
   }

   public void setOrderLine(Long orderLine) {
      this.orderLine = orderLine;
   }

   public Long getLine() {
      return this.line;
   }

   public void setLine(Long line) {
      this.line = line;
   }

   public RecordRef getCategory() {
      return this.category;
   }

   public void setCategory(RecordRef category) {
      this.category = category;
   }

   public RecordRef getAccount() {
      return this.account;
   }

   public void setAccount(RecordRef account) {
      this.account = account;
   }

   public Double getAmount() {
      return this.amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public Double getTaxAmount() {
      return this.taxAmount;
   }

   public void setTaxAmount(Double taxAmount) {
      this.taxAmount = taxAmount;
   }

   public Double getTax1Amt() {
      return this.tax1Amt;
   }

   public void setTax1Amt(Double tax1Amt) {
      this.tax1Amt = tax1Amt;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public Double getGrossAmt() {
      return this.grossAmt;
   }

   public void setGrossAmt(Double grossAmt) {
      this.grossAmt = grossAmt;
   }

   public String getTaxDetailsReference() {
      return this.taxDetailsReference;
   }

   public void setTaxDetailsReference(String taxDetailsReference) {
      this.taxDetailsReference = taxDetailsReference;
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

   public RecordRef getProjectTask() {
      return this.projectTask;
   }

   public void setProjectTask(RecordRef projectTask) {
      this.projectTask = projectTask;
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

   public RecordRef getAmortizationSched() {
      return this.amortizationSched;
   }

   public void setAmortizationSched(RecordRef amortizationSched) {
      this.amortizationSched = amortizationSched;
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
      if (!(obj instanceof VendorBillExpense)) {
         return false;
      } else {
         VendorBillExpense other = (VendorBillExpense)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.orderDoc == null && other.getOrderDoc() == null || this.orderDoc != null && this.orderDoc.equals(other.getOrderDoc())) && (this.orderLine == null && other.getOrderLine() == null || this.orderLine != null && this.orderLine.equals(other.getOrderLine())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && this.isBillable.equals(other.getIsBillable())) && (this.projectTask == null && other.getProjectTask() == null || this.projectTask != null && this.projectTask.equals(other.getProjectTask())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.amortizationSched == null && other.getAmortizationSched() == null || this.amortizationSched != null && this.amortizationSched.equals(other.getAmortizationSched())) && (this.amortizStartDate == null && other.getAmortizStartDate() == null || this.amortizStartDate != null && this.amortizStartDate.equals(other.getAmortizStartDate())) && (this.amortizationEndDate == null && other.getAmortizationEndDate() == null || this.amortizationEndDate != null && this.amortizationEndDate.equals(other.getAmortizationEndDate())) && (this.amortizationResidual == null && other.getAmortizationResidual() == null || this.amortizationResidual != null && this.amortizationResidual.equals(other.getAmortizationResidual())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
         if (this.getOrderDoc() != null) {
            _hashCode += this.getOrderDoc().hashCode();
         }

         if (this.getOrderLine() != null) {
            _hashCode += this.getOrderLine().hashCode();
         }

         if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
         }

         if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
         }

         if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
         }

         if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
         }

         if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
         }

         if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
         }

         if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
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

         if (this.getProjectTask() != null) {
            _hashCode += this.getProjectTask().hashCode();
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

         if (this.getAmortizationSched() != null) {
            _hashCode += this.getAmortizationSched().hashCode();
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
      typeDesc.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorBillExpense"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("orderDoc");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "orderDoc"));
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
      elemField.setFieldName("line");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "line"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("category");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "category"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("account");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "account"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
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
      elemField.setFieldName("taxAmount");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxAmount"));
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
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
      elemField.setFieldName("taxDetailsReference");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
      elemField.setFieldName("projectTask");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "projectTask"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
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
      elemField.setFieldName("amortizationSched");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "amortizationSched"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
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
