package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CampaignSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ContactSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.FileSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.MessageSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.MseSubsidiarySearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.NoteSearchBasic;
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

public class VendorSearch extends SearchRecord implements Serializable {
   private VendorSearchBasic basic;
   private AccountSearchBasic accountJoin;
   private CampaignSearchBasic campaignResponseJoin;
   private ContactSearchBasic contactJoin;
   private ContactSearchBasic contactPrimaryJoin;
   private AccountSearchBasic expAccountJoin;
   private FileSearchBasic fileJoin;
   private MessageSearchBasic messagesJoin;
   private MessageSearchBasic messagesFromJoin;
   private MessageSearchBasic messagesToJoin;
   private MseSubsidiarySearchBasic mseSubsidiaryJoin;
   private EmployeeSearchBasic timeApproverJoin;
   private TransactionSearchBasic transactionJoin;
   private EmployeeSearchBasic userJoin;
   private NoteSearchBasic userNotesJoin;
   private CustomSearchJoin[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(VendorSearch.class, true);

   public VendorSearch() {
      super();
   }

   public VendorSearch(VendorSearchBasic basic, AccountSearchBasic accountJoin, CampaignSearchBasic campaignResponseJoin, ContactSearchBasic contactJoin, ContactSearchBasic contactPrimaryJoin, AccountSearchBasic expAccountJoin, FileSearchBasic fileJoin, MessageSearchBasic messagesJoin, MessageSearchBasic messagesFromJoin, MessageSearchBasic messagesToJoin, MseSubsidiarySearchBasic mseSubsidiaryJoin, EmployeeSearchBasic timeApproverJoin, TransactionSearchBasic transactionJoin, EmployeeSearchBasic userJoin, NoteSearchBasic userNotesJoin, CustomSearchJoin[] customSearchJoin) {
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

   public VendorSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(VendorSearchBasic basic) {
      this.basic = basic;
   }

   public AccountSearchBasic getAccountJoin() {
      return this.accountJoin;
   }

   public void setAccountJoin(AccountSearchBasic accountJoin) {
      this.accountJoin = accountJoin;
   }

   public CampaignSearchBasic getCampaignResponseJoin() {
      return this.campaignResponseJoin;
   }

   public void setCampaignResponseJoin(CampaignSearchBasic campaignResponseJoin) {
      this.campaignResponseJoin = campaignResponseJoin;
   }

   public ContactSearchBasic getContactJoin() {
      return this.contactJoin;
   }

   public void setContactJoin(ContactSearchBasic contactJoin) {
      this.contactJoin = contactJoin;
   }

   public ContactSearchBasic getContactPrimaryJoin() {
      return this.contactPrimaryJoin;
   }

   public void setContactPrimaryJoin(ContactSearchBasic contactPrimaryJoin) {
      this.contactPrimaryJoin = contactPrimaryJoin;
   }

   public AccountSearchBasic getExpAccountJoin() {
      return this.expAccountJoin;
   }

   public void setExpAccountJoin(AccountSearchBasic expAccountJoin) {
      this.expAccountJoin = expAccountJoin;
   }

   public FileSearchBasic getFileJoin() {
      return this.fileJoin;
   }

   public void setFileJoin(FileSearchBasic fileJoin) {
      this.fileJoin = fileJoin;
   }

   public MessageSearchBasic getMessagesJoin() {
      return this.messagesJoin;
   }

   public void setMessagesJoin(MessageSearchBasic messagesJoin) {
      this.messagesJoin = messagesJoin;
   }

   public MessageSearchBasic getMessagesFromJoin() {
      return this.messagesFromJoin;
   }

   public void setMessagesFromJoin(MessageSearchBasic messagesFromJoin) {
      this.messagesFromJoin = messagesFromJoin;
   }

   public MessageSearchBasic getMessagesToJoin() {
      return this.messagesToJoin;
   }

   public void setMessagesToJoin(MessageSearchBasic messagesToJoin) {
      this.messagesToJoin = messagesToJoin;
   }

   public MseSubsidiarySearchBasic getMseSubsidiaryJoin() {
      return this.mseSubsidiaryJoin;
   }

   public void setMseSubsidiaryJoin(MseSubsidiarySearchBasic mseSubsidiaryJoin) {
      this.mseSubsidiaryJoin = mseSubsidiaryJoin;
   }

   public EmployeeSearchBasic getTimeApproverJoin() {
      return this.timeApproverJoin;
   }

   public void setTimeApproverJoin(EmployeeSearchBasic timeApproverJoin) {
      this.timeApproverJoin = timeApproverJoin;
   }

   public TransactionSearchBasic getTransactionJoin() {
      return this.transactionJoin;
   }

   public void setTransactionJoin(TransactionSearchBasic transactionJoin) {
      this.transactionJoin = transactionJoin;
   }

   public EmployeeSearchBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchBasic userJoin) {
      this.userJoin = userJoin;
   }

   public NoteSearchBasic getUserNotesJoin() {
      return this.userNotesJoin;
   }

   public void setUserNotesJoin(NoteSearchBasic userNotesJoin) {
      this.userNotesJoin = userNotesJoin;
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
      if (!(obj instanceof VendorSearch)) {
         return false;
      } else {
         VendorSearch other = (VendorSearch)obj;
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "accountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("campaignResponseJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "campaignResponseJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contactJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "contactJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contactPrimaryJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expAccountJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "expAccountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("fileJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "fileJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FileSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("messagesJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "messagesJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("messagesFromJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "messagesFromJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("messagesToJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "messagesToJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("mseSubsidiaryJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "mseSubsidiaryJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MseSubsidiarySearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("timeApproverJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "timeApproverJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "transactionJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userNotesJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "userNotesJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
