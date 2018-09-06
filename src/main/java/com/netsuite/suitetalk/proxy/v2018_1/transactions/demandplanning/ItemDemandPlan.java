package com.netsuite.suitetalk.proxy.v2018_1.transactions.demandplanning;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.demandplanning.types.DemandPlanCalendarType;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.demandplanning.types.DemandPlanMonth;
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

public class ItemDemandPlan extends Record implements Serializable {
   private RecordRef customForm;
   private RecordRef subsidiary;
   private RecordRef location;
   private RecordRef item;
   private RecordRef units;
   private String memo;
   private Long year;
   private DemandPlanMonth month;
   private Calendar startDate;
   private Calendar endDate;
   private DemandPlanCalendarType demandPlanCalendarType;
   private DemandPlanMatrix demandPlanMatrix;
   private CustomFieldList customFieldList;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemDemandPlan.class, true);

   public ItemDemandPlan() {
      super();
   }

   public ItemDemandPlan(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef subsidiary, RecordRef location, RecordRef item, RecordRef units, String memo, Long year, DemandPlanMonth month, Calendar startDate, Calendar endDate, DemandPlanCalendarType demandPlanCalendarType, DemandPlanMatrix demandPlanMatrix, CustomFieldList customFieldList) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.customForm = customForm;
      this.subsidiary = subsidiary;
      this.location = location;
      this.item = item;
      this.units = units;
      this.memo = memo;
      this.year = year;
      this.month = month;
      this.startDate = startDate;
      this.endDate = endDate;
      this.demandPlanCalendarType = demandPlanCalendarType;
      this.demandPlanMatrix = demandPlanMatrix;
      this.customFieldList = customFieldList;
   }

   public RecordRef getCustomForm() {
      return this.customForm;
   }

   public void setCustomForm(RecordRef customForm) {
      this.customForm = customForm;
   }

   public RecordRef getSubsidiary() {
      return this.subsidiary;
   }

   public void setSubsidiary(RecordRef subsidiary) {
      this.subsidiary = subsidiary;
   }

   public RecordRef getLocation() {
      return this.location;
   }

   public void setLocation(RecordRef location) {
      this.location = location;
   }

   public RecordRef getItem() {
      return this.item;
   }

   public void setItem(RecordRef item) {
      this.item = item;
   }

   public RecordRef getUnits() {
      return this.units;
   }

   public void setUnits(RecordRef units) {
      this.units = units;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public Long getYear() {
      return this.year;
   }

   public void setYear(Long year) {
      this.year = year;
   }

   public DemandPlanMonth getMonth() {
      return this.month;
   }

   public void setMonth(DemandPlanMonth month) {
      this.month = month;
   }

   public Calendar getStartDate() {
      return this.startDate;
   }

   public void setStartDate(Calendar startDate) {
      this.startDate = startDate;
   }

   public Calendar getEndDate() {
      return this.endDate;
   }

   public void setEndDate(Calendar endDate) {
      this.endDate = endDate;
   }

   public DemandPlanCalendarType getDemandPlanCalendarType() {
      return this.demandPlanCalendarType;
   }

   public void setDemandPlanCalendarType(DemandPlanCalendarType demandPlanCalendarType) {
      this.demandPlanCalendarType = demandPlanCalendarType;
   }

   public DemandPlanMatrix getDemandPlanMatrix() {
      return this.demandPlanMatrix;
   }

   public void setDemandPlanMatrix(DemandPlanMatrix demandPlanMatrix) {
      this.demandPlanMatrix = demandPlanMatrix;
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
      if (!(obj instanceof ItemDemandPlan)) {
         return false;
      } else {
         ItemDemandPlan other = (ItemDemandPlan)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.year == null && other.getYear() == null || this.year != null && this.year.equals(other.getYear())) && (this.month == null && other.getMonth() == null || this.month != null && this.month.equals(other.getMonth())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.demandPlanCalendarType == null && other.getDemandPlanCalendarType() == null || this.demandPlanCalendarType != null && this.demandPlanCalendarType.equals(other.getDemandPlanCalendarType())) && (this.demandPlanMatrix == null && other.getDemandPlanMatrix() == null || this.demandPlanMatrix != null && this.demandPlanMatrix.equals(other.getDemandPlanMatrix())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
         if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
         }

         if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
         }

         if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getYear() != null) {
            _hashCode += this.getYear().hashCode();
         }

         if (this.getMonth() != null) {
            _hashCode += this.getMonth().hashCode();
         }

         if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
         }

         if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
         }

         if (this.getDemandPlanCalendarType() != null) {
            _hashCode += this.getDemandPlanCalendarType().hashCode();
         }

         if (this.getDemandPlanMatrix() != null) {
            _hashCode += this.getDemandPlanMatrix().hashCode();
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
      typeDesc.setXmlType(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemDemandPlan"));
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
      elemField.setFieldName("customForm");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "customForm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiary");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "subsidiary"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("units");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "units"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("year");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "year"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("month");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "month"));
      elemField.setXmlType(new QName("urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlanMonth"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("startDate");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "startDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("endDate");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "endDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("demandPlanCalendarType");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "demandPlanCalendarType"));
      elemField.setXmlType(new QName("urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlanCalendarType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("demandPlanMatrix");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "demandPlanMatrix"));
      elemField.setXmlType(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlanMatrix"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
