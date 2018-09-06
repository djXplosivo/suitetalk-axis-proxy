package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CampaignSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ContactSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.MessageSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.MseSubsidiarySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.VendorSearchRowBasic;
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

public class VendorSearchRow extends SearchRow implements Serializable {
   private VendorSearchRowBasic basic;
   private AccountSearchRowBasic accountJoin;
   private CampaignSearchRowBasic campaignResponseJoin;
   private ContactSearchRowBasic contactJoin;
   private ContactSearchRowBasic contactPrimaryJoin;
   private AccountSearchRowBasic expAccountJoin;
   private FileSearchRowBasic fileJoin;
   private MessageSearchRowBasic messagesJoin;
   private MessageSearchRowBasic messagesFromJoin;
   private MessageSearchRowBasic messagesToJoin;
   private MseSubsidiarySearchRowBasic mseSubsidiaryJoin;
   private EmployeeSearchRowBasic timeApproverJoin;
   private TransactionSearchRowBasic transactionJoin;
   private EmployeeSearchRowBasic userJoin;
   private NoteSearchRowBasic userNotesJoin;
   private CustomSearchRowBasic[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(VendorSearchRow.class, true);

   public VendorSearchRow() {
      super();
   }

   public VendorSearchRow(VendorSearchRowBasic basic, AccountSearchRowBasic accountJoin, CampaignSearchRowBasic campaignResponseJoin, ContactSearchRowBasic contactJoin, ContactSearchRowBasic contactPrimaryJoin, AccountSearchRowBasic expAccountJoin, FileSearchRowBasic fileJoin, MessageSearchRowBasic messagesJoin, MessageSearchRowBasic messagesFromJoin, MessageSearchRowBasic messagesToJoin, MseSubsidiarySearchRowBasic mseSubsidiaryJoin, EmployeeSearchRowBasic timeApproverJoin, TransactionSearchRowBasic transactionJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, CustomSearchRowBasic[] customSearchJoin) {
      super();
      this.basic = basic;
      this.accountJoin = accountJoin;
      this.campaignResponseJoin = campaignResponseJoin;
      this.contactJoin = contactJoin;
      this.contactPrimaryJoin = contactPrimaryJoin;
      this.expAccountJoin = expAccountJoin;
      this.fileJoin = fileJoin;
      this.messagesJoin = messagesJoin;
      this.messagesFromJoin = messagesFromJoin;
      this.messagesToJoin = messagesToJoin;
      this.mseSubsidiaryJoin = mseSubsidiaryJoin;
      this.timeApproverJoin = timeApproverJoin;
      this.transactionJoin = transactionJoin;
      this.userJoin = userJoin;
      this.userNotesJoin = userNotesJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public VendorSearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(VendorSearchRowBasic basic) {
      this.basic = basic;
   }

   public AccountSearchRowBasic getAccountJoin() {
      return this.accountJoin;
   }

   public void setAccountJoin(AccountSearchRowBasic accountJoin) {
      this.accountJoin = accountJoin;
   }

   public CampaignSearchRowBasic getCampaignResponseJoin() {
      return this.campaignResponseJoin;
   }

   public void setCampaignResponseJoin(CampaignSearchRowBasic campaignResponseJoin) {
      this.campaignResponseJoin = campaignResponseJoin;
   }

   public ContactSearchRowBasic getContactJoin() {
      return this.contactJoin;
   }

   public void setContactJoin(ContactSearchRowBasic contactJoin) {
      this.contactJoin = contactJoin;
   }

   public ContactSearchRowBasic getContactPrimaryJoin() {
      return this.contactPrimaryJoin;
   }

   public void setContactPrimaryJoin(ContactSearchRowBasic contactPrimaryJoin) {
      this.contactPrimaryJoin = contactPrimaryJoin;
   }

   public AccountSearchRowBasic getExpAccountJoin() {
      return this.expAccountJoin;
   }

   public void setExpAccountJoin(AccountSearchRowBasic expAccountJoin) {
      this.expAccountJoin = expAccountJoin;
   }

   public FileSearchRowBasic getFileJoin() {
      return this.fileJoin;
   }

   public void setFileJoin(FileSearchRowBasic fileJoin) {
      this.fileJoin = fileJoin;
   }

   public MessageSearchRowBasic getMessagesJoin() {
      return this.messagesJoin;
   }

   public void setMessagesJoin(MessageSearchRowBasic messagesJoin) {
      this.messagesJoin = messagesJoin;
   }

   public MessageSearchRowBasic getMessagesFromJoin() {
      return this.messagesFromJoin;
   }

   public void setMessagesFromJoin(MessageSearchRowBasic messagesFromJoin) {
      this.messagesFromJoin = messagesFromJoin;
   }

   public MessageSearchRowBasic getMessagesToJoin() {
      return this.messagesToJoin;
   }

   public void setMessagesToJoin(MessageSearchRowBasic messagesToJoin) {
      this.messagesToJoin = messagesToJoin;
   }

   public MseSubsidiarySearchRowBasic getMseSubsidiaryJoin() {
      return this.mseSubsidiaryJoin;
   }

   public void setMseSubsidiaryJoin(MseSubsidiarySearchRowBasic mseSubsidiaryJoin) {
      this.mseSubsidiaryJoin = mseSubsidiaryJoin;
   }

   public EmployeeSearchRowBasic getTimeApproverJoin() {
      return this.timeApproverJoin;
   }

   public void setTimeApproverJoin(EmployeeSearchRowBasic timeApproverJoin) {
      this.timeApproverJoin = timeApproverJoin;
   }

   public TransactionSearchRowBasic getTransactionJoin() {
      return this.transactionJoin;
   }

   public void setTransactionJoin(TransactionSearchRowBasic transactionJoin) {
      this.transactionJoin = transactionJoin;
   }

   public EmployeeSearchRowBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchRowBasic userJoin) {
      this.userJoin = userJoin;
   }

   public NoteSearchRowBasic getUserNotesJoin() {
      return this.userNotesJoin;
   }

   public void setUserNotesJoin(NoteSearchRowBasic userNotesJoin) {
      this.userNotesJoin = userNotesJoin;
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
      if (!(obj instanceof VendorSearchRow)) {
         return false;
      } else {
         VendorSearchRow other = (VendorSearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.accountJoin == null && other.getAccountJoin() == null || this.accountJoin != null && this.accountJoin.equals(other.getAccountJoin())) && (this.campaignResponseJoin == null && other.getCampaignResponseJoin() == null || this.campaignResponseJoin != null && this.campaignResponseJoin.equals(other.getCampaignResponseJoin())) && (this.contactJoin == null && other.getContactJoin() == null || this.contactJoin != null && this.contactJoin.equals(other.getContactJoin())) && (this.contactPrimaryJoin == null && other.getContactPrimaryJoin() == null || this.contactPrimaryJoin != null && this.contactPrimaryJoin.equals(other.getContactPrimaryJoin())) && (this.expAccountJoin == null && other.getExpAccountJoin() == null || this.expAccountJoin != null && this.expAccountJoin.equals(other.getExpAccountJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.messagesJoin == null && other.getMessagesJoin() == null || this.messagesJoin != null && this.messagesJoin.equals(other.getMessagesJoin())) && (this.messagesFromJoin == null && other.getMessagesFromJoin() == null || this.messagesFromJoin != null && this.messagesFromJoin.equals(other.getMessagesFromJoin())) && (this.messagesToJoin == null && other.getMessagesToJoin() == null || this.messagesToJoin != null && this.messagesToJoin.equals(other.getMessagesToJoin())) && (this.mseSubsidiaryJoin == null && other.getMseSubsidiaryJoin() == null || this.mseSubsidiaryJoin != null && this.mseSubsidiaryJoin.equals(other.getMseSubsidiaryJoin())) && (this.timeApproverJoin == null && other.getTimeApproverJoin() == null || this.timeApproverJoin != null && this.timeApproverJoin.equals(other.getTimeApproverJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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

         if (this.getAccountJoin() != null) {
            _hashCode += this.getAccountJoin().hashCode();
         }

         if (this.getCampaignResponseJoin() != null) {
            _hashCode += this.getCampaignResponseJoin().hashCode();
         }

         if (this.getContactJoin() != null) {
            _hashCode += this.getContactJoin().hashCode();
         }

         if (this.getContactPrimaryJoin() != null) {
            _hashCode += this.getContactPrimaryJoin().hashCode();
         }

         if (this.getExpAccountJoin() != null) {
            _hashCode += this.getExpAccountJoin().hashCode();
         }

         if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
         }

         if (this.getMessagesJoin() != null) {
            _hashCode += this.getMessagesJoin().hashCode();
         }

         if (this.getMessagesFromJoin() != null) {
            _hashCode += this.getMessagesFromJoin().hashCode();
         }

         if (this.getMessagesToJoin() != null) {
            _hashCode += this.getMessagesToJoin().hashCode();
         }

         if (this.getMseSubsidiaryJoin() != null) {
            _hashCode += this.getMseSubsidiaryJoin().hashCode();
         }

         if (this.getTimeApproverJoin() != null) {
            _hashCode += this.getTimeApproverJoin().hashCode();
         }

         if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
         }

         if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
         }

         if (this.getUserNotesJoin() != null) {
            _hashCode += this.getUserNotesJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorSearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "accountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("campaignResponseJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "campaignResponseJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contactJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "contactJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contactPrimaryJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expAccountJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "expAccountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("fileJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "fileJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("messagesJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "messagesJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("messagesFromJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "messagesFromJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("messagesToJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "messagesToJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("mseSubsidiaryJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "mseSubsidiaryJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MseSubsidiarySearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("timeApproverJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "timeApproverJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "transactionJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userNotesJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "userNotesJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
