package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationAccessLevel;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationDisplayType;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationDynamicDefault;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationFieldType;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationSearchLevel;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CrmCustomField extends CustomFieldType implements Serializable {
   private String label;
   private RecordRef owner;
   private String description;
   private RecordRef selectRecordType;
   private Boolean storeValue;
   private Boolean showInList;
   private Boolean globalSearch;
   private Boolean isParent;
   private RecordRef insertBefore;
   private RecordRef subtab;
   private CustomizationDisplayType displayType;
   private Long displayWidth;
   private Long displayHeight;
   private String help;
   private RecordRef parentSubtab;
   private String linkText;
   private Boolean isMandatory;
   private Boolean checkSpelling;
   private Long maxLength;
   private Double minValue;
   private Double maxValue;
   private Boolean defaultChecked;
   private String defaultValue;
   private Boolean isFormula;
   private RecordRef defaultSelection;
   private CustomizationDynamicDefault dynamicDefault;
   private RecordRef searchDefault;
   private RecordRef searchCompareField;
   private RecordRef sourceList;
   private RecordRef sourceFrom;
   private RecordRef sourceFilterBy;
   private Boolean appliesToTask;
   private Boolean appliesToMfgProjectTask;
   private Boolean appliesToProjectTask;
   private Boolean appliesToPhoneCall;
   private Boolean appliesToEvent;
   private Boolean appliesToCase;
   private Boolean appliesToCampaign;
   private Boolean appliesPerKeyword;
   private Boolean appliesToSolution;
   private Boolean appliesToIssue;
   private Boolean availableExternally;
   private Boolean availableToSso;
   private Boolean showIssueChanges;
   private CrmCustomFieldFilterList filterList;
   private CustomizationAccessLevel accessLevel;
   private CustomizationSearchLevel searchLevel;
   private CustomFieldRoleAccessList roleAccessList;
   private CustomFieldDepartmentAccessList deptAccessList;
   private CustomFieldSubAccessList subAccessList;
   private CustomFieldTranslationsList translationsList;
   private String internalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CrmCustomField.class, true);

   public CrmCustomField() {
      super();
   }

   public CrmCustomField(NullField nullFieldList, CustomizationFieldType fieldType, String scriptId, String internalId, String label, RecordRef owner, String description, RecordRef selectRecordType, Boolean storeValue, Boolean showInList, Boolean globalSearch, Boolean isParent, RecordRef insertBefore, RecordRef subtab, CustomizationDisplayType displayType, Long displayWidth, Long displayHeight, String help, RecordRef parentSubtab, String linkText, Boolean isMandatory, Boolean checkSpelling, Long maxLength, Double minValue, Double maxValue, Boolean defaultChecked, String defaultValue, Boolean isFormula, RecordRef defaultSelection, CustomizationDynamicDefault dynamicDefault, RecordRef searchDefault, RecordRef searchCompareField, RecordRef sourceList, RecordRef sourceFrom, RecordRef sourceFilterBy, Boolean appliesToTask, Boolean appliesToMfgProjectTask, Boolean appliesToProjectTask, Boolean appliesToPhoneCall, Boolean appliesToEvent, Boolean appliesToCase, Boolean appliesToCampaign, Boolean appliesPerKeyword, Boolean appliesToSolution, Boolean appliesToIssue, Boolean availableExternally, Boolean availableToSso, Boolean showIssueChanges, CrmCustomFieldFilterList filterList, CustomizationAccessLevel accessLevel, CustomizationSearchLevel searchLevel, CustomFieldRoleAccessList roleAccessList, CustomFieldDepartmentAccessList deptAccessList, CustomFieldSubAccessList subAccessList, CustomFieldTranslationsList translationsList) {
      super(nullFieldList, fieldType, scriptId);
      this.internalId = internalId;
      this.label = label;
      this.owner = owner;
      this.description = description;
      this.selectRecordType = selectRecordType;
      this.storeValue = storeValue;
      this.showInList = showInList;
      this.globalSearch = globalSearch;
      this.isParent = isParent;
      this.insertBefore = insertBefore;
      this.subtab = subtab;
      this.displayType = displayType;
      this.displayWidth = displayWidth;
      this.displayHeight = displayHeight;
      this.help = help;
      this.parentSubtab = parentSubtab;
      this.linkText = linkText;
      this.isMandatory = isMandatory;
      this.checkSpelling = checkSpelling;
      this.maxLength = maxLength;
      this.minValue = minValue;
      this.maxValue = maxValue;
      this.defaultChecked = defaultChecked;
      this.defaultValue = defaultValue;
      this.isFormula = isFormula;
      this.defaultSelection = defaultSelection;
      this.dynamicDefault = dynamicDefault;
      this.searchDefault = searchDefault;
      this.searchCompareField = searchCompareField;
      this.sourceList = sourceList;
      this.sourceFrom = sourceFrom;
      this.sourceFilterBy = sourceFilterBy;
      this.appliesToTask = appliesToTask;
      this.appliesToMfgProjectTask = appliesToMfgProjectTask;
      this.appliesToProjectTask = appliesToProjectTask;
      this.appliesToPhoneCall = appliesToPhoneCall;
      this.appliesToEvent = appliesToEvent;
      this.appliesToCase = appliesToCase;
      this.appliesToCampaign = appliesToCampaign;
      this.appliesPerKeyword = appliesPerKeyword;
      this.appliesToSolution = appliesToSolution;
      this.appliesToIssue = appliesToIssue;
      this.availableExternally = availableExternally;
      this.availableToSso = availableToSso;
      this.showIssueChanges = showIssueChanges;
      this.filterList = filterList;
      this.accessLevel = accessLevel;
      this.searchLevel = searchLevel;
      this.roleAccessList = roleAccessList;
      this.deptAccessList = deptAccessList;
      this.subAccessList = subAccessList;
      this.translationsList = translationsList;
   }

   public String getLabel() {
      return this.label;
   }

   public void setLabel(String label) {
      this.label = label;
   }

   public RecordRef getOwner() {
      return this.owner;
   }

   public void setOwner(RecordRef owner) {
      this.owner = owner;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public RecordRef getSelectRecordType() {
      return this.selectRecordType;
   }

   public void setSelectRecordType(RecordRef selectRecordType) {
      this.selectRecordType = selectRecordType;
   }

   public Boolean getStoreValue() {
      return this.storeValue;
   }

   public void setStoreValue(Boolean storeValue) {
      this.storeValue = storeValue;
   }

   public Boolean getShowInList() {
      return this.showInList;
   }

   public void setShowInList(Boolean showInList) {
      this.showInList = showInList;
   }

   public Boolean getGlobalSearch() {
      return this.globalSearch;
   }

   public void setGlobalSearch(Boolean globalSearch) {
      this.globalSearch = globalSearch;
   }

   public Boolean getIsParent() {
      return this.isParent;
   }

   public void setIsParent(Boolean isParent) {
      this.isParent = isParent;
   }

   public RecordRef getInsertBefore() {
      return this.insertBefore;
   }

   public void setInsertBefore(RecordRef insertBefore) {
      this.insertBefore = insertBefore;
   }

   public RecordRef getSubtab() {
      return this.subtab;
   }

   public void setSubtab(RecordRef subtab) {
      this.subtab = subtab;
   }

   public CustomizationDisplayType getDisplayType() {
      return this.displayType;
   }

   public void setDisplayType(CustomizationDisplayType displayType) {
      this.displayType = displayType;
   }

   public Long getDisplayWidth() {
      return this.displayWidth;
   }

   public void setDisplayWidth(Long displayWidth) {
      this.displayWidth = displayWidth;
   }

   public Long getDisplayHeight() {
      return this.displayHeight;
   }

   public void setDisplayHeight(Long displayHeight) {
      this.displayHeight = displayHeight;
   }

   public String getHelp() {
      return this.help;
   }

   public void setHelp(String help) {
      this.help = help;
   }

   public RecordRef getParentSubtab() {
      return this.parentSubtab;
   }

   public void setParentSubtab(RecordRef parentSubtab) {
      this.parentSubtab = parentSubtab;
   }

   public String getLinkText() {
      return this.linkText;
   }

   public void setLinkText(String linkText) {
      this.linkText = linkText;
   }

   public Boolean getIsMandatory() {
      return this.isMandatory;
   }

   public void setIsMandatory(Boolean isMandatory) {
      this.isMandatory = isMandatory;
   }

   public Boolean getCheckSpelling() {
      return this.checkSpelling;
   }

   public void setCheckSpelling(Boolean checkSpelling) {
      this.checkSpelling = checkSpelling;
   }

   public Long getMaxLength() {
      return this.maxLength;
   }

   public void setMaxLength(Long maxLength) {
      this.maxLength = maxLength;
   }

   public Double getMinValue() {
      return this.minValue;
   }

   public void setMinValue(Double minValue) {
      this.minValue = minValue;
   }

   public Double getMaxValue() {
      return this.maxValue;
   }

   public void setMaxValue(Double maxValue) {
      this.maxValue = maxValue;
   }

   public Boolean getDefaultChecked() {
      return this.defaultChecked;
   }

   public void setDefaultChecked(Boolean defaultChecked) {
      this.defaultChecked = defaultChecked;
   }

   public String getDefaultValue() {
      return this.defaultValue;
   }

   public void setDefaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
   }

   public Boolean getIsFormula() {
      return this.isFormula;
   }

   public void setIsFormula(Boolean isFormula) {
      this.isFormula = isFormula;
   }

   public RecordRef getDefaultSelection() {
      return this.defaultSelection;
   }

   public void setDefaultSelection(RecordRef defaultSelection) {
      this.defaultSelection = defaultSelection;
   }

   public CustomizationDynamicDefault getDynamicDefault() {
      return this.dynamicDefault;
   }

   public void setDynamicDefault(CustomizationDynamicDefault dynamicDefault) {
      this.dynamicDefault = dynamicDefault;
   }

   public RecordRef getSearchDefault() {
      return this.searchDefault;
   }

   public void setSearchDefault(RecordRef searchDefault) {
      this.searchDefault = searchDefault;
   }

   public RecordRef getSearchCompareField() {
      return this.searchCompareField;
   }

   public void setSearchCompareField(RecordRef searchCompareField) {
      this.searchCompareField = searchCompareField;
   }

   public RecordRef getSourceList() {
      return this.sourceList;
   }

   public void setSourceList(RecordRef sourceList) {
      this.sourceList = sourceList;
   }

   public RecordRef getSourceFrom() {
      return this.sourceFrom;
   }

   public void setSourceFrom(RecordRef sourceFrom) {
      this.sourceFrom = sourceFrom;
   }

   public RecordRef getSourceFilterBy() {
      return this.sourceFilterBy;
   }

   public void setSourceFilterBy(RecordRef sourceFilterBy) {
      this.sourceFilterBy = sourceFilterBy;
   }

   public Boolean getAppliesToTask() {
      return this.appliesToTask;
   }

   public void setAppliesToTask(Boolean appliesToTask) {
      this.appliesToTask = appliesToTask;
   }

   public Boolean getAppliesToMfgProjectTask() {
      return this.appliesToMfgProjectTask;
   }

   public void setAppliesToMfgProjectTask(Boolean appliesToMfgProjectTask) {
      this.appliesToMfgProjectTask = appliesToMfgProjectTask;
   }

   public Boolean getAppliesToProjectTask() {
      return this.appliesToProjectTask;
   }

   public void setAppliesToProjectTask(Boolean appliesToProjectTask) {
      this.appliesToProjectTask = appliesToProjectTask;
   }

   public Boolean getAppliesToPhoneCall() {
      return this.appliesToPhoneCall;
   }

   public void setAppliesToPhoneCall(Boolean appliesToPhoneCall) {
      this.appliesToPhoneCall = appliesToPhoneCall;
   }

   public Boolean getAppliesToEvent() {
      return this.appliesToEvent;
   }

   public void setAppliesToEvent(Boolean appliesToEvent) {
      this.appliesToEvent = appliesToEvent;
   }

   public Boolean getAppliesToCase() {
      return this.appliesToCase;
   }

   public void setAppliesToCase(Boolean appliesToCase) {
      this.appliesToCase = appliesToCase;
   }

   public Boolean getAppliesToCampaign() {
      return this.appliesToCampaign;
   }

   public void setAppliesToCampaign(Boolean appliesToCampaign) {
      this.appliesToCampaign = appliesToCampaign;
   }

   public Boolean getAppliesPerKeyword() {
      return this.appliesPerKeyword;
   }

   public void setAppliesPerKeyword(Boolean appliesPerKeyword) {
      this.appliesPerKeyword = appliesPerKeyword;
   }

   public Boolean getAppliesToSolution() {
      return this.appliesToSolution;
   }

   public void setAppliesToSolution(Boolean appliesToSolution) {
      this.appliesToSolution = appliesToSolution;
   }

   public Boolean getAppliesToIssue() {
      return this.appliesToIssue;
   }

   public void setAppliesToIssue(Boolean appliesToIssue) {
      this.appliesToIssue = appliesToIssue;
   }

   public Boolean getAvailableExternally() {
      return this.availableExternally;
   }

   public void setAvailableExternally(Boolean availableExternally) {
      this.availableExternally = availableExternally;
   }

   public Boolean getAvailableToSso() {
      return this.availableToSso;
   }

   public void setAvailableToSso(Boolean availableToSso) {
      this.availableToSso = availableToSso;
   }

   public Boolean getShowIssueChanges() {
      return this.showIssueChanges;
   }

   public void setShowIssueChanges(Boolean showIssueChanges) {
      this.showIssueChanges = showIssueChanges;
   }

   public CrmCustomFieldFilterList getFilterList() {
      return this.filterList;
   }

   public void setFilterList(CrmCustomFieldFilterList filterList) {
      this.filterList = filterList;
   }

   public CustomizationAccessLevel getAccessLevel() {
      return this.accessLevel;
   }

   public void setAccessLevel(CustomizationAccessLevel accessLevel) {
      this.accessLevel = accessLevel;
   }

   public CustomizationSearchLevel getSearchLevel() {
      return this.searchLevel;
   }

   public void setSearchLevel(CustomizationSearchLevel searchLevel) {
      this.searchLevel = searchLevel;
   }

   public CustomFieldRoleAccessList getRoleAccessList() {
      return this.roleAccessList;
   }

   public void setRoleAccessList(CustomFieldRoleAccessList roleAccessList) {
      this.roleAccessList = roleAccessList;
   }

   public CustomFieldDepartmentAccessList getDeptAccessList() {
      return this.deptAccessList;
   }

   public void setDeptAccessList(CustomFieldDepartmentAccessList deptAccessList) {
      this.deptAccessList = deptAccessList;
   }

   public CustomFieldSubAccessList getSubAccessList() {
      return this.subAccessList;
   }

   public void setSubAccessList(CustomFieldSubAccessList subAccessList) {
      this.subAccessList = subAccessList;
   }

   public CustomFieldTranslationsList getTranslationsList() {
      return this.translationsList;
   }

   public void setTranslationsList(CustomFieldTranslationsList translationsList) {
      this.translationsList = translationsList;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CrmCustomField)) {
         return false;
      } else {
         CrmCustomField other = (CrmCustomField)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.label == null && other.getLabel() == null || this.label != null && this.label.equals(other.getLabel())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.selectRecordType == null && other.getSelectRecordType() == null || this.selectRecordType != null && this.selectRecordType.equals(other.getSelectRecordType())) && (this.storeValue == null && other.getStoreValue() == null || this.storeValue != null && this.storeValue.equals(other.getStoreValue())) && (this.showInList == null && other.getShowInList() == null || this.showInList != null && this.showInList.equals(other.getShowInList())) && (this.globalSearch == null && other.getGlobalSearch() == null || this.globalSearch != null && this.globalSearch.equals(other.getGlobalSearch())) && (this.isParent == null && other.getIsParent() == null || this.isParent != null && this.isParent.equals(other.getIsParent())) && (this.insertBefore == null && other.getInsertBefore() == null || this.insertBefore != null && this.insertBefore.equals(other.getInsertBefore())) && (this.subtab == null && other.getSubtab() == null || this.subtab != null && this.subtab.equals(other.getSubtab())) && (this.displayType == null && other.getDisplayType() == null || this.displayType != null && this.displayType.equals(other.getDisplayType())) && (this.displayWidth == null && other.getDisplayWidth() == null || this.displayWidth != null && this.displayWidth.equals(other.getDisplayWidth())) && (this.displayHeight == null && other.getDisplayHeight() == null || this.displayHeight != null && this.displayHeight.equals(other.getDisplayHeight())) && (this.help == null && other.getHelp() == null || this.help != null && this.help.equals(other.getHelp())) && (this.parentSubtab == null && other.getParentSubtab() == null || this.parentSubtab != null && this.parentSubtab.equals(other.getParentSubtab())) && (this.linkText == null && other.getLinkText() == null || this.linkText != null && this.linkText.equals(other.getLinkText())) && (this.isMandatory == null && other.getIsMandatory() == null || this.isMandatory != null && this.isMandatory.equals(other.getIsMandatory())) && (this.checkSpelling == null && other.getCheckSpelling() == null || this.checkSpelling != null && this.checkSpelling.equals(other.getCheckSpelling())) && (this.maxLength == null && other.getMaxLength() == null || this.maxLength != null && this.maxLength.equals(other.getMaxLength())) && (this.minValue == null && other.getMinValue() == null || this.minValue != null && this.minValue.equals(other.getMinValue())) && (this.maxValue == null && other.getMaxValue() == null || this.maxValue != null && this.maxValue.equals(other.getMaxValue())) && (this.defaultChecked == null && other.getDefaultChecked() == null || this.defaultChecked != null && this.defaultChecked.equals(other.getDefaultChecked())) && (this.defaultValue == null && other.getDefaultValue() == null || this.defaultValue != null && this.defaultValue.equals(other.getDefaultValue())) && (this.isFormula == null && other.getIsFormula() == null || this.isFormula != null && this.isFormula.equals(other.getIsFormula())) && (this.defaultSelection == null && other.getDefaultSelection() == null || this.defaultSelection != null && this.defaultSelection.equals(other.getDefaultSelection())) && (this.dynamicDefault == null && other.getDynamicDefault() == null || this.dynamicDefault != null && this.dynamicDefault.equals(other.getDynamicDefault())) && (this.searchDefault == null && other.getSearchDefault() == null || this.searchDefault != null && this.searchDefault.equals(other.getSearchDefault())) && (this.searchCompareField == null && other.getSearchCompareField() == null || this.searchCompareField != null && this.searchCompareField.equals(other.getSearchCompareField())) && (this.sourceList == null && other.getSourceList() == null || this.sourceList != null && this.sourceList.equals(other.getSourceList())) && (this.sourceFrom == null && other.getSourceFrom() == null || this.sourceFrom != null && this.sourceFrom.equals(other.getSourceFrom())) && (this.sourceFilterBy == null && other.getSourceFilterBy() == null || this.sourceFilterBy != null && this.sourceFilterBy.equals(other.getSourceFilterBy())) && (this.appliesToTask == null && other.getAppliesToTask() == null || this.appliesToTask != null && this.appliesToTask.equals(other.getAppliesToTask())) && (this.appliesToMfgProjectTask == null && other.getAppliesToMfgProjectTask() == null || this.appliesToMfgProjectTask != null && this.appliesToMfgProjectTask.equals(other.getAppliesToMfgProjectTask())) && (this.appliesToProjectTask == null && other.getAppliesToProjectTask() == null || this.appliesToProjectTask != null && this.appliesToProjectTask.equals(other.getAppliesToProjectTask())) && (this.appliesToPhoneCall == null && other.getAppliesToPhoneCall() == null || this.appliesToPhoneCall != null && this.appliesToPhoneCall.equals(other.getAppliesToPhoneCall())) && (this.appliesToEvent == null && other.getAppliesToEvent() == null || this.appliesToEvent != null && this.appliesToEvent.equals(other.getAppliesToEvent())) && (this.appliesToCase == null && other.getAppliesToCase() == null || this.appliesToCase != null && this.appliesToCase.equals(other.getAppliesToCase())) && (this.appliesToCampaign == null && other.getAppliesToCampaign() == null || this.appliesToCampaign != null && this.appliesToCampaign.equals(other.getAppliesToCampaign())) && (this.appliesPerKeyword == null && other.getAppliesPerKeyword() == null || this.appliesPerKeyword != null && this.appliesPerKeyword.equals(other.getAppliesPerKeyword())) && (this.appliesToSolution == null && other.getAppliesToSolution() == null || this.appliesToSolution != null && this.appliesToSolution.equals(other.getAppliesToSolution())) && (this.appliesToIssue == null && other.getAppliesToIssue() == null || this.appliesToIssue != null && this.appliesToIssue.equals(other.getAppliesToIssue())) && (this.availableExternally == null && other.getAvailableExternally() == null || this.availableExternally != null && this.availableExternally.equals(other.getAvailableExternally())) && (this.availableToSso == null && other.getAvailableToSso() == null || this.availableToSso != null && this.availableToSso.equals(other.getAvailableToSso())) && (this.showIssueChanges == null && other.getShowIssueChanges() == null || this.showIssueChanges != null && this.showIssueChanges.equals(other.getShowIssueChanges())) && (this.filterList == null && other.getFilterList() == null || this.filterList != null && this.filterList.equals(other.getFilterList())) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && this.accessLevel.equals(other.getAccessLevel())) && (this.searchLevel == null && other.getSearchLevel() == null || this.searchLevel != null && this.searchLevel.equals(other.getSearchLevel())) && (this.roleAccessList == null && other.getRoleAccessList() == null || this.roleAccessList != null && this.roleAccessList.equals(other.getRoleAccessList())) && (this.deptAccessList == null && other.getDeptAccessList() == null || this.deptAccessList != null && this.deptAccessList.equals(other.getDeptAccessList())) && (this.subAccessList == null && other.getSubAccessList() == null || this.subAccessList != null && this.subAccessList.equals(other.getSubAccessList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
         if (this.getLabel() != null) {
            _hashCode += this.getLabel().hashCode();
         }

         if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getSelectRecordType() != null) {
            _hashCode += this.getSelectRecordType().hashCode();
         }

         if (this.getStoreValue() != null) {
            _hashCode += this.getStoreValue().hashCode();
         }

         if (this.getShowInList() != null) {
            _hashCode += this.getShowInList().hashCode();
         }

         if (this.getGlobalSearch() != null) {
            _hashCode += this.getGlobalSearch().hashCode();
         }

         if (this.getIsParent() != null) {
            _hashCode += this.getIsParent().hashCode();
         }

         if (this.getInsertBefore() != null) {
            _hashCode += this.getInsertBefore().hashCode();
         }

         if (this.getSubtab() != null) {
            _hashCode += this.getSubtab().hashCode();
         }

         if (this.getDisplayType() != null) {
            _hashCode += this.getDisplayType().hashCode();
         }

         if (this.getDisplayWidth() != null) {
            _hashCode += this.getDisplayWidth().hashCode();
         }

         if (this.getDisplayHeight() != null) {
            _hashCode += this.getDisplayHeight().hashCode();
         }

         if (this.getHelp() != null) {
            _hashCode += this.getHelp().hashCode();
         }

         if (this.getParentSubtab() != null) {
            _hashCode += this.getParentSubtab().hashCode();
         }

         if (this.getLinkText() != null) {
            _hashCode += this.getLinkText().hashCode();
         }

         if (this.getIsMandatory() != null) {
            _hashCode += this.getIsMandatory().hashCode();
         }

         if (this.getCheckSpelling() != null) {
            _hashCode += this.getCheckSpelling().hashCode();
         }

         if (this.getMaxLength() != null) {
            _hashCode += this.getMaxLength().hashCode();
         }

         if (this.getMinValue() != null) {
            _hashCode += this.getMinValue().hashCode();
         }

         if (this.getMaxValue() != null) {
            _hashCode += this.getMaxValue().hashCode();
         }

         if (this.getDefaultChecked() != null) {
            _hashCode += this.getDefaultChecked().hashCode();
         }

         if (this.getDefaultValue() != null) {
            _hashCode += this.getDefaultValue().hashCode();
         }

         if (this.getIsFormula() != null) {
            _hashCode += this.getIsFormula().hashCode();
         }

         if (this.getDefaultSelection() != null) {
            _hashCode += this.getDefaultSelection().hashCode();
         }

         if (this.getDynamicDefault() != null) {
            _hashCode += this.getDynamicDefault().hashCode();
         }

         if (this.getSearchDefault() != null) {
            _hashCode += this.getSearchDefault().hashCode();
         }

         if (this.getSearchCompareField() != null) {
            _hashCode += this.getSearchCompareField().hashCode();
         }

         if (this.getSourceList() != null) {
            _hashCode += this.getSourceList().hashCode();
         }

         if (this.getSourceFrom() != null) {
            _hashCode += this.getSourceFrom().hashCode();
         }

         if (this.getSourceFilterBy() != null) {
            _hashCode += this.getSourceFilterBy().hashCode();
         }

         if (this.getAppliesToTask() != null) {
            _hashCode += this.getAppliesToTask().hashCode();
         }

         if (this.getAppliesToMfgProjectTask() != null) {
            _hashCode += this.getAppliesToMfgProjectTask().hashCode();
         }

         if (this.getAppliesToProjectTask() != null) {
            _hashCode += this.getAppliesToProjectTask().hashCode();
         }

         if (this.getAppliesToPhoneCall() != null) {
            _hashCode += this.getAppliesToPhoneCall().hashCode();
         }

         if (this.getAppliesToEvent() != null) {
            _hashCode += this.getAppliesToEvent().hashCode();
         }

         if (this.getAppliesToCase() != null) {
            _hashCode += this.getAppliesToCase().hashCode();
         }

         if (this.getAppliesToCampaign() != null) {
            _hashCode += this.getAppliesToCampaign().hashCode();
         }

         if (this.getAppliesPerKeyword() != null) {
            _hashCode += this.getAppliesPerKeyword().hashCode();
         }

         if (this.getAppliesToSolution() != null) {
            _hashCode += this.getAppliesToSolution().hashCode();
         }

         if (this.getAppliesToIssue() != null) {
            _hashCode += this.getAppliesToIssue().hashCode();
         }

         if (this.getAvailableExternally() != null) {
            _hashCode += this.getAvailableExternally().hashCode();
         }

         if (this.getAvailableToSso() != null) {
            _hashCode += this.getAvailableToSso().hashCode();
         }

         if (this.getShowIssueChanges() != null) {
            _hashCode += this.getShowIssueChanges().hashCode();
         }

         if (this.getFilterList() != null) {
            _hashCode += this.getFilterList().hashCode();
         }

         if (this.getAccessLevel() != null) {
            _hashCode += this.getAccessLevel().hashCode();
         }

         if (this.getSearchLevel() != null) {
            _hashCode += this.getSearchLevel().hashCode();
         }

         if (this.getRoleAccessList() != null) {
            _hashCode += this.getRoleAccessList().hashCode();
         }

         if (this.getDeptAccessList() != null) {
            _hashCode += this.getDeptAccessList().hashCode();
         }

         if (this.getSubAccessList() != null) {
            _hashCode += this.getSubAccessList().hashCode();
         }

         if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CrmCustomField"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("internalId");
      attrField.setXmlName(new QName("", "internalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("label");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "label"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("owner");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "owner"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("selectRecordType");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "selectRecordType"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeValue");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "storeValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("showInList");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "showInList"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("globalSearch");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "globalSearch"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isParent");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "isParent"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("insertBefore");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "insertBefore"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subtab");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "subtab"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("displayType");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "displayType"));
      elemField.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationDisplayType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("displayWidth");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "displayWidth"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("displayHeight");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "displayHeight"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("help");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "help"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("parentSubtab");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "parentSubtab"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("linkText");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "linkText"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isMandatory");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "isMandatory"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("checkSpelling");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "checkSpelling"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("maxLength");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "maxLength"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("minValue");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "minValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("maxValue");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "maxValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("defaultChecked");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "defaultChecked"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("defaultValue");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "defaultValue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isFormula");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "isFormula"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("defaultSelection");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "defaultSelection"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dynamicDefault");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "dynamicDefault"));
      elemField.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationDynamicDefault"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchDefault");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "searchDefault"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchCompareField");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "searchCompareField"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("sourceList");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "sourceList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("sourceFrom");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "sourceFrom"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("sourceFilterBy");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "sourceFilterBy"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToTask");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToTask"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToMfgProjectTask");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToMfgProjectTask"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToProjectTask");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToProjectTask"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToPhoneCall");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToPhoneCall"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToEvent");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToEvent"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToCase");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToCase"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToCampaign");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToCampaign"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesPerKeyword");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesPerKeyword"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToSolution");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToSolution"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("appliesToIssue");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "appliesToIssue"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("availableExternally");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "availableExternally"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("availableToSso");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "availableToSso"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("showIssueChanges");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "showIssueChanges"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("filterList");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "filterList"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CrmCustomFieldFilterList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accessLevel");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "accessLevel"));
      elemField.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchLevel");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "searchLevel"));
      elemField.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("roleAccessList");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "roleAccessList"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldRoleAccessList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("deptAccessList");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "deptAccessList"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subAccessList");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "subAccessList"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldSubAccessList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("translationsList");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "translationsList"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldTranslationsList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}