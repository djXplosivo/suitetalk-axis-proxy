package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class EntitySearchBasic extends SearchRecordBasic implements Serializable {
   private SearchStringField address;
   private SearchStringField addressee;
   private SearchStringField addressLabel;
   private SearchStringField addressPhone;
   private SearchStringField attention;
   private SearchStringField city;
   private SearchStringField comments;
   private SearchEnumMultiSelectField country;
   private SearchStringField county;
   private SearchDateField dateCreated;
   private SearchStringField email;
   private SearchStringField entityId;
   private SearchMultiSelectField externalId;
   private SearchStringField externalIdString;
   private SearchStringField fax;
   private SearchBooleanField giveAccess;
   private SearchEnumMultiSelectField globalSubscriptionStatus;
   private SearchStringField image;
   private SearchMultiSelectField internalId;
   private SearchLongField internalIdNumber;
   private SearchBooleanField isDefaultBilling;
   private SearchBooleanField isDefaultShipping;
   private SearchBooleanField isInactive;
   private SearchEnumMultiSelectField language;
   private SearchDateField lastModifiedDate;
   private SearchEnumMultiSelectField level;
   private SearchEnumMultiSelectField permission;
   private SearchStringField phone;
   private SearchStringField phoneticName;
   private SearchStringField state;
   private SearchMultiSelectField subsidiary;
   private SearchEnumMultiSelectField type;
   private SearchStringField zipCode;
   private SearchCustomFieldList customFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(EntitySearchBasic.class, true);

   public EntitySearchBasic() {
      super();
   }

   public EntitySearchBasic(SearchStringField address, SearchStringField addressee, SearchStringField addressLabel, SearchStringField addressPhone, SearchStringField attention, SearchStringField city, SearchStringField comments, SearchEnumMultiSelectField country, SearchStringField county, SearchDateField dateCreated, SearchStringField email, SearchStringField entityId, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchBooleanField giveAccess, SearchEnumMultiSelectField globalSubscriptionStatus, SearchStringField image, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDefaultBilling, SearchBooleanField isDefaultShipping, SearchBooleanField isInactive, SearchEnumMultiSelectField language, SearchDateField lastModifiedDate, SearchEnumMultiSelectField level, SearchEnumMultiSelectField permission, SearchStringField phone, SearchStringField phoneticName, SearchStringField state, SearchMultiSelectField subsidiary, SearchEnumMultiSelectField type, SearchStringField zipCode, SearchCustomFieldList customFieldList) {
      super();
      this.address = address;
      this.addressee = addressee;
      this.addressLabel = addressLabel;
      this.addressPhone = addressPhone;
      this.attention = attention;
      this.city = city;
      this.comments = comments;
      this.country = country;
      this.county = county;
      this.dateCreated = dateCreated;
      this.email = email;
      this.entityId = entityId;
      this.externalId = externalId;
      this.externalIdString = externalIdString;
      this.fax = fax;
      this.giveAccess = giveAccess;
      this.globalSubscriptionStatus = globalSubscriptionStatus;
      this.image = image;
      this.internalId = internalId;
      this.internalIdNumber = internalIdNumber;
      this.isDefaultBilling = isDefaultBilling;
      this.isDefaultShipping = isDefaultShipping;
      this.isInactive = isInactive;
      this.language = language;
      this.lastModifiedDate = lastModifiedDate;
      this.level = level;
      this.permission = permission;
      this.phone = phone;
      this.phoneticName = phoneticName;
      this.state = state;
      this.subsidiary = subsidiary;
      this.type = type;
      this.zipCode = zipCode;
      this.customFieldList = customFieldList;
   }

   public SearchStringField getAddress() {
      return this.address;
   }

   public void setAddress(SearchStringField address) {
      this.address = address;
   }

   public SearchStringField getAddressee() {
      return this.addressee;
   }

   public void setAddressee(SearchStringField addressee) {
      this.addressee = addressee;
   }

   public SearchStringField getAddressLabel() {
      return this.addressLabel;
   }

   public void setAddressLabel(SearchStringField addressLabel) {
      this.addressLabel = addressLabel;
   }

   public SearchStringField getAddressPhone() {
      return this.addressPhone;
   }

   public void setAddressPhone(SearchStringField addressPhone) {
      this.addressPhone = addressPhone;
   }

   public SearchStringField getAttention() {
      return this.attention;
   }

   public void setAttention(SearchStringField attention) {
      this.attention = attention;
   }

   public SearchStringField getCity() {
      return this.city;
   }

   public void setCity(SearchStringField city) {
      this.city = city;
   }

   public SearchStringField getComments() {
      return this.comments;
   }

   public void setComments(SearchStringField comments) {
      this.comments = comments;
   }

   public SearchEnumMultiSelectField getCountry() {
      return this.country;
   }

   public void setCountry(SearchEnumMultiSelectField country) {
      this.country = country;
   }

   public SearchStringField getCounty() {
      return this.county;
   }

   public void setCounty(SearchStringField county) {
      this.county = county;
   }

   public SearchDateField getDateCreated() {
      return this.dateCreated;
   }

   public void setDateCreated(SearchDateField dateCreated) {
      this.dateCreated = dateCreated;
   }

   public SearchStringField getEmail() {
      return this.email;
   }

   public void setEmail(SearchStringField email) {
      this.email = email;
   }

   public SearchStringField getEntityId() {
      return this.entityId;
   }

   public void setEntityId(SearchStringField entityId) {
      this.entityId = entityId;
   }

   public SearchMultiSelectField getExternalId() {
      return this.externalId;
   }

   public void setExternalId(SearchMultiSelectField externalId) {
      this.externalId = externalId;
   }

   public SearchStringField getExternalIdString() {
      return this.externalIdString;
   }

   public void setExternalIdString(SearchStringField externalIdString) {
      this.externalIdString = externalIdString;
   }

   public SearchStringField getFax() {
      return this.fax;
   }

   public void setFax(SearchStringField fax) {
      this.fax = fax;
   }

   public SearchBooleanField getGiveAccess() {
      return this.giveAccess;
   }

   public void setGiveAccess(SearchBooleanField giveAccess) {
      this.giveAccess = giveAccess;
   }

   public SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
      return this.globalSubscriptionStatus;
   }

   public void setGlobalSubscriptionStatus(SearchEnumMultiSelectField globalSubscriptionStatus) {
      this.globalSubscriptionStatus = globalSubscriptionStatus;
   }

   public SearchStringField getImage() {
      return this.image;
   }

   public void setImage(SearchStringField image) {
      this.image = image;
   }

   public SearchMultiSelectField getInternalId() {
      return this.internalId;
   }

   public void setInternalId(SearchMultiSelectField internalId) {
      this.internalId = internalId;
   }

   public SearchLongField getInternalIdNumber() {
      return this.internalIdNumber;
   }

   public void setInternalIdNumber(SearchLongField internalIdNumber) {
      this.internalIdNumber = internalIdNumber;
   }

   public SearchBooleanField getIsDefaultBilling() {
      return this.isDefaultBilling;
   }

   public void setIsDefaultBilling(SearchBooleanField isDefaultBilling) {
      this.isDefaultBilling = isDefaultBilling;
   }

   public SearchBooleanField getIsDefaultShipping() {
      return this.isDefaultShipping;
   }

   public void setIsDefaultShipping(SearchBooleanField isDefaultShipping) {
      this.isDefaultShipping = isDefaultShipping;
   }

   public SearchBooleanField getIsInactive() {
      return this.isInactive;
   }

   public void setIsInactive(SearchBooleanField isInactive) {
      this.isInactive = isInactive;
   }

   public SearchEnumMultiSelectField getLanguage() {
      return this.language;
   }

   public void setLanguage(SearchEnumMultiSelectField language) {
      this.language = language;
   }

   public SearchDateField getLastModifiedDate() {
      return this.lastModifiedDate;
   }

   public void setLastModifiedDate(SearchDateField lastModifiedDate) {
      this.lastModifiedDate = lastModifiedDate;
   }

   public SearchEnumMultiSelectField getLevel() {
      return this.level;
   }

   public void setLevel(SearchEnumMultiSelectField level) {
      this.level = level;
   }

   public SearchEnumMultiSelectField getPermission() {
      return this.permission;
   }

   public void setPermission(SearchEnumMultiSelectField permission) {
      this.permission = permission;
   }

   public SearchStringField getPhone() {
      return this.phone;
   }

   public void setPhone(SearchStringField phone) {
      this.phone = phone;
   }

   public SearchStringField getPhoneticName() {
      return this.phoneticName;
   }

   public void setPhoneticName(SearchStringField phoneticName) {
      this.phoneticName = phoneticName;
   }

   public SearchStringField getState() {
      return this.state;
   }

   public void setState(SearchStringField state) {
      this.state = state;
   }

   public SearchMultiSelectField getSubsidiary() {
      return this.subsidiary;
   }

   public void setSubsidiary(SearchMultiSelectField subsidiary) {
      this.subsidiary = subsidiary;
   }

   public SearchEnumMultiSelectField getType() {
      return this.type;
   }

   public void setType(SearchEnumMultiSelectField type) {
      this.type = type;
   }

   public SearchStringField getZipCode() {
      return this.zipCode;
   }

   public void setZipCode(SearchStringField zipCode) {
      this.zipCode = zipCode;
   }

   public SearchCustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(SearchCustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof EntitySearchBasic)) {
         return false;
      } else {
         EntitySearchBasic other = (EntitySearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && this.addressLabel.equals(other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && this.addressPhone.equals(other.getAddressPhone())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && this.isDefaultBilling.equals(other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && this.isDefaultShipping.equals(other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel())) && (this.permission == null && other.getPermission() == null || this.permission != null && this.permission.equals(other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
         if (this.getAddress() != null) {
            _hashCode += this.getAddress().hashCode();
         }

         if (this.getAddressee() != null) {
            _hashCode += this.getAddressee().hashCode();
         }

         if (this.getAddressLabel() != null) {
            _hashCode += this.getAddressLabel().hashCode();
         }

         if (this.getAddressPhone() != null) {
            _hashCode += this.getAddressPhone().hashCode();
         }

         if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
         }

         if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
         }

         if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
         }

         if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
         }

         if (this.getCounty() != null) {
            _hashCode += this.getCounty().hashCode();
         }

         if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
         }

         if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
         }

         if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
         }

         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
         }

         if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
         }

         if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
         }

         if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
         }

         if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
         }

         if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
         }

         if (this.getIsDefaultBilling() != null) {
            _hashCode += this.getIsDefaultBilling().hashCode();
         }

         if (this.getIsDefaultShipping() != null) {
            _hashCode += this.getIsDefaultShipping().hashCode();
         }

         if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
         }

         if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
         }

         if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
         }

         if (this.getLevel() != null) {
            _hashCode += this.getLevel().hashCode();
         }

         if (this.getPermission() != null) {
            _hashCode += this.getPermission().hashCode();
         }

         if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
         }

         if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
         }

         if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
         }

         if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
         }

         if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
         }

         if (this.getZipCode() != null) {
            _hashCode += this.getZipCode().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("address");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "address"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("addressee");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "addressee"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("addressLabel");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "addressLabel"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("addressPhone");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "addressPhone"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("attention");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "attention"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("city");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "city"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("comments");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "comments"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("country");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "country"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("county");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "county"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dateCreated");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "dateCreated"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("email");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "email"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("entityId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "entityId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("externalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("externalIdString");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalIdString"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("fax");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "fax"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("giveAccess");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "giveAccess"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("globalSubscriptionStatus");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("image");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "image"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalIdNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalIdNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isDefaultBilling");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "isDefaultBilling"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isDefaultShipping");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "isDefaultShipping"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isInactive");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "isInactive"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("language");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "language"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lastModifiedDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "lastModifiedDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("level");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "level"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("permission");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "permission"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("phone");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "phone"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("phoneticName");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "phoneticName"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("state");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "state"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiary");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "subsidiary"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("type");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "type"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("zipCode");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "zipCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
