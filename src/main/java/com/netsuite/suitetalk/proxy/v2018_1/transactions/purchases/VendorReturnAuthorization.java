package com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.Address;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TaxDetailsList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.IntercoStatus;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases.types.VendorReturnAuthorizationOrderStatus;
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

public class VendorReturnAuthorization extends Record implements Serializable {
   private Calendar createdDate;
   private Calendar lastModifiedDate;
   private RecordRef nexus;
   private RecordRef subsidiaryTaxRegNum;
   private Boolean taxRegOverride;
   private Boolean taxDetailsOverride;
   private RecordRef customForm;
   private String tranId;
   private RecordRef createdFrom;
   private RecordRef entity;
   private VendorReturnAuthorizationOrderStatus orderStatus;
   private Calendar tranDate;
   private Double userTotal;
   private RecordRef currency;
   private String currencyName;
   private Address billingAddress;
   private RecordRef billAddressList;
   private String memo;
   private Double exchangeRate;
   private RecordRef entityTaxRegNum;
   private Double userTaxTotal;
   private RecordRef department;
   private RecordRef _class;
   private RecordRef location;
   private RecordRef subsidiary;
   private RecordRef intercoTransaction;
   private IntercoStatus intercoStatus;
   private VendorReturnAuthorizationExpenseList expenseList;
   private VendorReturnAuthorizationItemList itemList;
   private AccountingBookDetailList accountingBookDetailList;
   private TaxDetailsList taxDetailsList;
   private CustomFieldList customFieldList;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(VendorReturnAuthorization.class, true);

   public VendorReturnAuthorization() {
      super();
   }

   public VendorReturnAuthorization(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Boolean taxDetailsOverride, RecordRef customForm, String tranId, RecordRef createdFrom, RecordRef entity, VendorReturnAuthorizationOrderStatus orderStatus, Calendar tranDate, Double userTotal, RecordRef currency, String currencyName, Address billingAddress, RecordRef billAddressList, String memo, Double exchangeRate, RecordRef entityTaxRegNum, Double userTaxTotal, RecordRef department, RecordRef _class, RecordRef location, RecordRef subsidiary, RecordRef intercoTransaction, IntercoStatus intercoStatus, VendorReturnAuthorizationExpenseList expenseList, VendorReturnAuthorizationItemList itemList, AccountingBookDetailList accountingBookDetailList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.createdDate = createdDate;
      this.lastModifiedDate = lastModifiedDate;
      this.nexus = nexus;
      this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
      this.taxRegOverride = taxRegOverride;
      this.taxDetailsOverride = taxDetailsOverride;
      this.customForm = customForm;
      this.tranId = tranId;
      this.createdFrom = createdFrom;
      this.entity = entity;
      this.orderStatus = orderStatus;
      this.tranDate = tranDate;
      this.userTotal = userTotal;
      this.currency = currency;
      this.currencyName = currencyName;
      this.billingAddress = billingAddress;
      this.billAddressList = billAddressList;
      this.memo = memo;
      this.exchangeRate = exchangeRate;
      this.entityTaxRegNum = entityTaxRegNum;
      this.userTaxTotal = userTaxTotal;
      this.department = department;
      this._class = _class;
      this.location = location;
      this.subsidiary = subsidiary;
      this.intercoTransaction = intercoTransaction;
      this.intercoStatus = intercoStatus;
      this.expenseList = expenseList;
      this.itemList = itemList;
      this.accountingBookDetailList = accountingBookDetailList;
      this.taxDetailsList = taxDetailsList;
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

   public RecordRef getNexus() {
      return this.nexus;
   }

   public void setNexus(RecordRef nexus) {
      this.nexus = nexus;
   }

   public RecordRef getSubsidiaryTaxRegNum() {
      return this.subsidiaryTaxRegNum;
   }

   public void setSubsidiaryTaxRegNum(RecordRef subsidiaryTaxRegNum) {
      this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
   }

   public Boolean getTaxRegOverride() {
      return this.taxRegOverride;
   }

   public void setTaxRegOverride(Boolean taxRegOverride) {
      this.taxRegOverride = taxRegOverride;
   }

   public Boolean getTaxDetailsOverride() {
      return this.taxDetailsOverride;
   }

   public void setTaxDetailsOverride(Boolean taxDetailsOverride) {
      this.taxDetailsOverride = taxDetailsOverride;
   }

   public RecordRef getCustomForm() {
      return this.customForm;
   }

   public void setCustomForm(RecordRef customForm) {
      this.customForm = customForm;
   }

   public String getTranId() {
      return this.tranId;
   }

   public void setTranId(String tranId) {
      this.tranId = tranId;
   }

   public RecordRef getCreatedFrom() {
      return this.createdFrom;
   }

   public void setCreatedFrom(RecordRef createdFrom) {
      this.createdFrom = createdFrom;
   }

   public RecordRef getEntity() {
      return this.entity;
   }

   public void setEntity(RecordRef entity) {
      this.entity = entity;
   }

   public VendorReturnAuthorizationOrderStatus getOrderStatus() {
      return this.orderStatus;
   }

   public void setOrderStatus(VendorReturnAuthorizationOrderStatus orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Calendar getTranDate() {
      return this.tranDate;
   }

   public void setTranDate(Calendar tranDate) {
      this.tranDate = tranDate;
   }

   public Double getUserTotal() {
      return this.userTotal;
   }

   public void setUserTotal(Double userTotal) {
      this.userTotal = userTotal;
   }

   public RecordRef getCurrency() {
      return this.currency;
   }

   public void setCurrency(RecordRef currency) {
      this.currency = currency;
   }

   public String getCurrencyName() {
      return this.currencyName;
   }

   public void setCurrencyName(String currencyName) {
      this.currencyName = currencyName;
   }

   public Address getBillingAddress() {
      return this.billingAddress;
   }

   public void setBillingAddress(Address billingAddress) {
      this.billingAddress = billingAddress;
   }

   public RecordRef getBillAddressList() {
      return this.billAddressList;
   }

   public void setBillAddressList(RecordRef billAddressList) {
      this.billAddressList = billAddressList;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public Double getExchangeRate() {
      return this.exchangeRate;
   }

   public void setExchangeRate(Double exchangeRate) {
      this.exchangeRate = exchangeRate;
   }

   public RecordRef getEntityTaxRegNum() {
      return this.entityTaxRegNum;
   }

   public void setEntityTaxRegNum(RecordRef entityTaxRegNum) {
      this.entityTaxRegNum = entityTaxRegNum;
   }

   public Double getUserTaxTotal() {
      return this.userTaxTotal;
   }

   public void setUserTaxTotal(Double userTaxTotal) {
      this.userTaxTotal = userTaxTotal;
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

   public RecordRef getSubsidiary() {
      return this.subsidiary;
   }

   public void setSubsidiary(RecordRef subsidiary) {
      this.subsidiary = subsidiary;
   }

   public RecordRef getIntercoTransaction() {
      return this.intercoTransaction;
   }

   public void setIntercoTransaction(RecordRef intercoTransaction) {
      this.intercoTransaction = intercoTransaction;
   }

   public IntercoStatus getIntercoStatus() {
      return this.intercoStatus;
   }

   public void setIntercoStatus(IntercoStatus intercoStatus) {
      this.intercoStatus = intercoStatus;
   }

   public VendorReturnAuthorizationExpenseList getExpenseList() {
      return this.expenseList;
   }

   public void setExpenseList(VendorReturnAuthorizationExpenseList expenseList) {
      this.expenseList = expenseList;
   }

   public VendorReturnAuthorizationItemList getItemList() {
      return this.itemList;
   }

   public void setItemList(VendorReturnAuthorizationItemList itemList) {
      this.itemList = itemList;
   }

   public AccountingBookDetailList getAccountingBookDetailList() {
      return this.accountingBookDetailList;
   }

   public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
      this.accountingBookDetailList = accountingBookDetailList;
   }

   public TaxDetailsList getTaxDetailsList() {
      return this.taxDetailsList;
   }

   public void setTaxDetailsList(TaxDetailsList taxDetailsList) {
      this.taxDetailsList = taxDetailsList;
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
      if (!(obj instanceof VendorReturnAuthorization)) {
         return false;
      } else {
         VendorReturnAuthorization other = (VendorReturnAuthorization)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.orderStatus == null && other.getOrderStatus() == null || this.orderStatus != null && this.orderStatus.equals(other.getOrderStatus())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.userTotal == null && other.getUserTotal() == null || this.userTotal != null && this.userTotal.equals(other.getUserTotal())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.userTaxTotal == null && other.getUserTaxTotal() == null || this.userTaxTotal != null && this.userTaxTotal.equals(other.getUserTaxTotal())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.intercoTransaction == null && other.getIntercoTransaction() == null || this.intercoTransaction != null && this.intercoTransaction.equals(other.getIntercoTransaction())) && (this.intercoStatus == null && other.getIntercoStatus() == null || this.intercoStatus != null && this.intercoStatus.equals(other.getIntercoStatus())) && (this.expenseList == null && other.getExpenseList() == null || this.expenseList != null && this.expenseList.equals(other.getExpenseList())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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

         if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
         }

         if (this.getSubsidiaryTaxRegNum() != null) {
            _hashCode += this.getSubsidiaryTaxRegNum().hashCode();
         }

         if (this.getTaxRegOverride() != null) {
            _hashCode += this.getTaxRegOverride().hashCode();
         }

         if (this.getTaxDetailsOverride() != null) {
            _hashCode += this.getTaxDetailsOverride().hashCode();
         }

         if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
         }

         if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
         }

         if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
         }

         if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
         }

         if (this.getOrderStatus() != null) {
            _hashCode += this.getOrderStatus().hashCode();
         }

         if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
         }

         if (this.getUserTotal() != null) {
            _hashCode += this.getUserTotal().hashCode();
         }

         if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
         }

         if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
         }

         if (this.getBillingAddress() != null) {
            _hashCode += this.getBillingAddress().hashCode();
         }

         if (this.getBillAddressList() != null) {
            _hashCode += this.getBillAddressList().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
         }

         if (this.getEntityTaxRegNum() != null) {
            _hashCode += this.getEntityTaxRegNum().hashCode();
         }

         if (this.getUserTaxTotal() != null) {
            _hashCode += this.getUserTaxTotal().hashCode();
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

         if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
         }

         if (this.getIntercoTransaction() != null) {
            _hashCode += this.getIntercoTransaction().hashCode();
         }

         if (this.getIntercoStatus() != null) {
            _hashCode += this.getIntercoStatus().hashCode();
         }

         if (this.getExpenseList() != null) {
            _hashCode += this.getExpenseList().hashCode();
         }

         if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
         }

         if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
         }

         if (this.getTaxDetailsList() != null) {
            _hashCode += this.getTaxDetailsList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorization"));
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
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "createdDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lastModifiedDate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("nexus");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "nexus"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiaryTaxRegNum");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxRegOverride");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxRegOverride"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxDetailsOverride");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customForm");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "customForm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("tranId");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "tranId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("createdFrom");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "createdFrom"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("entity");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "entity"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("orderStatus");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "orderStatus"));
      elemField.setXmlType(new QName("urn:types.purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationOrderStatus"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("tranDate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "tranDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userTotal");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "userTotal"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("currency");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "currency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("currencyName");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "currencyName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billingAddress");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "billingAddress"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "Address"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billAddressList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "billAddressList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
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
      elemField.setFieldName("exchangeRate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "exchangeRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("entityTaxRegNum");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userTaxTotal");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "userTaxTotal"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
      elemField.setFieldName("subsidiary");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "subsidiary"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("intercoTransaction");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "intercoTransaction"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("intercoStatus");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "intercoStatus"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "IntercoStatus"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expenseList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "expenseList"));
      elemField.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationExpenseList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "itemList"));
      elemField.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationItemList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountingBookDetailList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxDetailsList");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "taxDetailsList"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxDetailsList"));
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
