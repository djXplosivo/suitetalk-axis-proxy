package com.netsuite.suitetalk.proxy.v2018_1.transactions.employees;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ExpenseReport extends Record implements Serializable {
   private Calendar createdDate;
   private Calendar lastModifiedDate;
   private String status;
   private RecordRef customForm;
   private RecordRef account;
   private RecordRef entity;
   private RecordRef subsidiary;
   private String tranId;
   private RecordRef postingPeriod;
   private Calendar tranDate;
   private Calendar dueDate;
   private RecordRef approvalStatus;
   private Double total;
   private RecordRef nextApprover;
   private Double advance;
   private Double tax1Amt;
   private Double amount;
   private String memo;
   private Boolean complete;
   private Boolean supervisorApproval;
   private Boolean accountingApproval;
   private Boolean useMultiCurrency;
   private Double tax2Amt;
   private RecordRef department;
   private RecordRef _class;
   private RecordRef location;
   private ExpenseReportExpenseList expenseList;
   private AccountingBookDetailList accountingBookDetailList;
   private CustomFieldList customFieldList;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ExpenseReport.class, true);

   public ExpenseReport() {
      super();
   }

   public ExpenseReport(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, String status, RecordRef customForm, RecordRef account, RecordRef entity, RecordRef subsidiary, String tranId, RecordRef postingPeriod, Calendar tranDate, Calendar dueDate, RecordRef approvalStatus, Double total, RecordRef nextApprover, Double advance, Double tax1Amt, Double amount, String memo, Boolean complete, Boolean supervisorApproval, Boolean accountingApproval, Boolean useMultiCurrency, Double tax2Amt, RecordRef department, RecordRef _class, RecordRef location, ExpenseReportExpenseList expenseList, AccountingBookDetailList accountingBookDetailList, CustomFieldList customFieldList) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.createdDate = createdDate;
      this.lastModifiedDate = lastModifiedDate;
      this.status = status;
      this.customForm = customForm;
      this.account = account;
      this.entity = entity;
      this.subsidiary = subsidiary;
      this.tranId = tranId;
      this.postingPeriod = postingPeriod;
      this.tranDate = tranDate;
      this.dueDate = dueDate;
      this.approvalStatus = approvalStatus;
      this.total = total;
      this.nextApprover = nextApprover;
      this.advance = advance;
      this.tax1Amt = tax1Amt;
      this.amount = amount;
      this.memo = memo;
      this.complete = complete;
      this.supervisorApproval = supervisorApproval;
      this.accountingApproval = accountingApproval;
      this.useMultiCurrency = useMultiCurrency;
      this.tax2Amt = tax2Amt;
      this.department = department;
      this._class = _class;
      this.location = location;
      this.expenseList = expenseList;
      this.accountingBookDetailList = accountingBookDetailList;
      this.customFieldList = customFieldList;
   }

   public Calendar getCreatedDate() {
      return this.createdDate;
   }

   public void setCreatedDate(Calendar createdDate) {
      this.createdDate = createdDate;
   }

   public Calendar getLastModifiedDate() {
      return this.lastModifiedDate;
   }

   public void setLastModifiedDate(Calendar lastModifiedDate) {
      this.lastModifiedDate = lastModifiedDate;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public RecordRef getCustomForm() {
      return this.customForm;
   }

   public void setCustomForm(RecordRef customForm) {
      this.customForm = customForm;
   }

   public RecordRef getAccount() {
      return this.account;
   }

   public void setAccount(RecordRef account) {
      this.account = account;
   }

   public RecordRef getEntity() {
      return this.entity;
   }

   public void setEntity(RecordRef entity) {
      this.entity = entity;
   }

   public RecordRef getSubsidiary() {
      return this.subsidiary;
   }

   public void setSubsidiary(RecordRef subsidiary) {
      this.subsidiary = subsidiary;
   }

   public String getTranId() {
      return this.tranId;
   }

   public void setTranId(String tranId) {
      this.tranId = tranId;
   }

   public RecordRef getPostingPeriod() {
      return this.postingPeriod;
   }

   public void setPostingPeriod(RecordRef postingPeriod) {
      this.postingPeriod = postingPeriod;
   }

   public Calendar getTranDate() {
      return this.tranDate;
   }

   public void setTranDate(Calendar tranDate) {
      this.tranDate = tranDate;
   }

   public Calendar getDueDate() {
      return this.dueDate;
   }

   public void setDueDate(Calendar dueDate) {
      this.dueDate = dueDate;
   }

   public RecordRef getApprovalStatus() {
      return this.approvalStatus;
   }

   public void setApprovalStatus(RecordRef approvalStatus) {
      this.approvalStatus = approvalStatus;
   }

   public Double getTotal() {
      return this.total;
   }

   public void setTotal(Double total) {
      this.total = total;
   }

   public RecordRef getNextApprover() {
      return this.nextApprover;
   }

   public void setNextApprover(RecordRef nextApprover) {
      this.nextApprover = nextApprover;
   }

   public Double getAdvance() {
      return this.advance;
   }

   public void setAdvance(Double advance) {
      this.advance = advance;
   }

   public Double getTax1Amt() {
      return this.tax1Amt;
   }

   public void setTax1Amt(Double tax1Amt) {
      this.tax1Amt = tax1Amt;
   }

   public Double getAmount() {
      return this.amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public Boolean getComplete() {
      return this.complete;
   }

   public void setComplete(Boolean complete) {
      this.complete = complete;
   }

   public Boolean getSupervisorApproval() {
      return this.supervisorApproval;
   }

   public void setSupervisorApproval(Boolean supervisorApproval) {
      this.supervisorApproval = supervisorApproval;
   }

   public Boolean getAccountingApproval() {
      return this.accountingApproval;
   }

   public void setAccountingApproval(Boolean accountingApproval) {
      this.accountingApproval = accountingApproval;
   }

   public Boolean getUseMultiCurrency() {
      return this.useMultiCurrency;
   }

   public void setUseMultiCurrency(Boolean useMultiCurrency) {
      this.useMultiCurrency = useMultiCurrency;
   }

   public Double getTax2Amt() {
      return this.tax2Amt;
   }

   public void setTax2Amt(Double tax2Amt) {
      this.tax2Amt = tax2Amt;
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

   public ExpenseReportExpenseList getExpenseList() {
      return this.expenseList;
   }

   public void setExpenseList(ExpenseReportExpenseList expenseList) {
      this.expenseList = expenseList;
   }

   public AccountingBookDetailList getAccountingBookDetailList() {
      return this.accountingBookDetailList;
   }

   public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
      this.accountingBookDetailList = accountingBookDetailList;
   }

   public CustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(CustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public String getExternalId() {
      return this.externalId;
   }

   public void setExternalId(String externalId) {
      this.externalId = externalId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ExpenseReport)) {
         return false;
      } else {
         ExpenseReport other = (ExpenseReport)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && this.dueDate.equals(other.getDueDate())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && this.approvalStatus.equals(other.getApprovalStatus())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.nextApprover == null && other.getNextApprover() == null || this.nextApprover != null && this.nextApprover.equals(other.getNextApprover())) && (this.advance == null && other.getAdvance() == null || this.advance != null && this.advance.equals(other.getAdvance())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.complete == null && other.getComplete() == null || this.complete != null && this.complete.equals(other.getComplete())) && (this.supervisorApproval == null && other.getSupervisorApproval() == null || this.supervisorApproval != null && this.supervisorApproval.equals(other.getSupervisorApproval())) && (this.accountingApproval == null && other.getAccountingApproval() == null || this.accountingApproval != null && this.accountingApproval.equals(other.getAccountingApproval())) && (this.useMultiCurrency == null && other.getUseMultiCurrency() == null || this.useMultiCurrency != null && this.useMultiCurrency.equals(other.getUseMultiCurrency())) && (this.tax2Amt == null && other.getTax2Amt() == null || this.tax2Amt != null && this.tax2Amt.equals(other.getTax2Amt())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.expenseList == null && other.getExpenseList() == null || this.expenseList != null && this.expenseList.equals(other.getExpenseList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
         if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
         }

         if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
         }

         if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
         }

         if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
         }

         if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
         }

         if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
         }

         if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
         }

         if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
         }

         if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
         }

         if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
         }

         if (this.getDueDate() != null) {
            _hashCode += this.getDueDate().hashCode();
         }

         if (this.getApprovalStatus() != null) {
            _hashCode += this.getApprovalStatus().hashCode();
         }

         if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
         }

         if (this.getNextApprover() != null) {
            _hashCode += this.getNextApprover().hashCode();
         }

         if (this.getAdvance() != null) {
            _hashCode += this.getAdvance().hashCode();
         }

         if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
         }

         if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getComplete() != null) {
            _hashCode += this.getComplete().hashCode();
         }

         if (this.getSupervisorApproval() != null) {
            _hashCode += this.getSupervisorApproval().hashCode();
         }

         if (this.getAccountingApproval() != null) {
            _hashCode += this.getAccountingApproval().hashCode();
         }

         if (this.getUseMultiCurrency() != null) {
            _hashCode += this.getUseMultiCurrency().hashCode();
         }

         if (this.getTax2Amt() != null) {
            _hashCode += this.getTax2Amt().hashCode();
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

         if (this.getExpenseList() != null) {
            _hashCode += this.getExpenseList().hashCode();
         }

         if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
         }

         if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "ExpenseReport"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("internalId");
      attrField.setXmlName(new QName("", "internalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      attrField = new AttributeDesc();
      attrField.setFieldName("externalId");
      attrField.setXmlName(new QName("", "externalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("createdDate");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "createdDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lastModifiedDate");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customForm");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "customForm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("account");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "account"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("entity");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "entity"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiary");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "subsidiary"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("tranId");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "tranId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("postingPeriod");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "postingPeriod"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("tranDate");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "tranDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dueDate");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "dueDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("approvalStatus");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "approvalStatus"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("total");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "total"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("nextApprover");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "nextApprover"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("advance");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "advance"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("tax1Amt");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "tax1Amt"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amount");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "amount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("complete");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "complete"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("supervisorApproval");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "supervisorApproval"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountingApproval");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "accountingApproval"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("useMultiCurrency");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "useMultiCurrency"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("tax2Amt");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "tax2Amt"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("department");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "department"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_class");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "class"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expenseList");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "expenseList"));
      elemField.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "ExpenseReportExpenseList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountingBookDetailList");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
