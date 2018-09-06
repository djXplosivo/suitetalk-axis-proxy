package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecordBasic;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AssemblyItemBomSearchBasic extends SearchRecordBasic implements Serializable {
   private SearchMultiSelectField assembly;
   private SearchMultiSelectField billOfMaterials;
   private SearchBooleanField _default;
   private SearchMultiSelectField locations;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AssemblyItemBomSearchBasic.class, true);

   public AssemblyItemBomSearchBasic() {
      super();
   }

   public AssemblyItemBomSearchBasic(SearchMultiSelectField assembly, SearchMultiSelectField billOfMaterials, SearchBooleanField _default, SearchMultiSelectField locations) {
      super();
      this.assembly = assembly;
      this.billOfMaterials = billOfMaterials;
      this._default = _default;
      this.locations = locations;
   }

   public SearchMultiSelectField getAssembly() {
      return this.assembly;
   }

   public void setAssembly(SearchMultiSelectField assembly) {
      this.assembly = assembly;
   }

   public SearchMultiSelectField getBillOfMaterials() {
      return this.billOfMaterials;
   }

   public void setBillOfMaterials(SearchMultiSelectField billOfMaterials) {
      this.billOfMaterials = billOfMaterials;
   }

   public SearchBooleanField get_default() {
      return this._default;
   }

   public void set_default(SearchBooleanField _default) {
      this._default = _default;
   }

   public SearchMultiSelectField getLocations() {
      return this.locations;
   }

   public void setLocations(SearchMultiSelectField locations) {
      this.locations = locations;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AssemblyItemBomSearchBasic)) {
         return false;
      } else {
         AssemblyItemBomSearchBasic other = (AssemblyItemBomSearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.assembly == null && other.getAssembly() == null || this.assembly != null && this.assembly.equals(other.getAssembly())) && (this.billOfMaterials == null && other.getBillOfMaterials() == null || this.billOfMaterials != null && this.billOfMaterials.equals(other.getBillOfMaterials())) && (this._default == null && other.get_default() == null || this._default != null && this._default.equals(other.get_default())) && (this.locations == null && other.getLocations() == null || this.locations != null && this.locations.equals(other.getLocations()));
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
         if (this.getAssembly() != null) {
            _hashCode += this.getAssembly().hashCode();
         }

         if (this.getBillOfMaterials() != null) {
            _hashCode += this.getBillOfMaterials().hashCode();
         }

         if (this.get_default() != null) {
            _hashCode += this.get_default().hashCode();
         }

         if (this.getLocations() != null) {
            _hashCode += this.getLocations().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("assembly");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "assembly"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billOfMaterials");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "billOfMaterials"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_default");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "default"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("locations");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "locations"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
