package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.types.ItemMatrixType;
import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.types.ItemOutOfStockBehavior;
import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.types.ItemOverallQuantityPricingType;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.ItemCostEstimateType;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.SitemapPriority;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.VsoeDeferral;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.VsoePermitDiscount;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.VsoeSopGroup;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRefList;
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

public class ServiceResaleItem extends Record implements Serializable {
   private Calendar createdDate;
   private Calendar lastModifiedDate;
   private String purchaseDescription;
   private Boolean manufacturingChargeItem;
   private Double cost;
   private String costUnits;
   private RecordRef expenseAccount;
   private RecordRef intercoExpenseAccount;
   private String salesDescription;
   private Boolean includeChildren;
   private RecordRef incomeAccount;
   private RecordRef intercoIncomeAccount;
   private RecordRef taxSchedule;
   private ItemMatrixType matrixType;
   private Boolean isTaxable;
   private ItemCostEstimateType costEstimateType;
   private Double costEstimate;
   private RecordRef unitsType;
   private RecordRef purchaseUnit;
   private RecordRef saleUnit;
   private String costEstimateUnits;
   private RecordRef issueProduct;
   private RecordRef billingSchedule;
   private RecordRef deferredRevenueAccount;
   private RecordRef intercoDefRevAccount;
   private RecordRef revRecSchedule;
   private RecordRef deferralAccount;
   private RecordRef amortizationTemplate;
   private String residual;
   private Boolean deferRevRec;
   private RecordRef revenueRecognitionRule;
   private RecordRef revRecForecastRule;
   private RecordRef revenueAllocationGroup;
   private RecordRef createRevenuePlansOn;
   private Boolean directRevenuePosting;
   private Boolean contingentRevenueHandling;
   private RecordRef revReclassFXAccount;
   private Long amortizationPeriod;
   private Long minimumQuantity;
   private Boolean enforceMinQtyInternally;
   private String softDescriptor;
   private Boolean pricesIncludeTax;
   private RecordRef quantityPricingSchedule;
   private Boolean useMarginalRates;
   private ItemOverallQuantityPricingType overallQuantityPricingType;
   private Boolean isFulfillable;
   private Boolean generateAccruals;
   private RecordRef costCategory;
   private Double purchaseOrderQuantity;
   private Double purchaseOrderAmount;
   private Double purchaseOrderQuantityDiff;
   private Double receiptQuantity;
   private Double receiptAmount;
   private Double receiptQuantityDiff;
   private RecordRef pricingGroup;
   private String minimumQuantityUnits;
   private Double vsoePrice;
   private VsoeSopGroup vsoeSopGroup;
   private VsoeDeferral vsoeDeferral;
   private VsoePermitDiscount vsoePermitDiscount;
   private Boolean vsoeDelivered;
   private RecordRef itemRevenueCategory;
   private Boolean createJob;
   private String matrixItemNameTemplate;
   private String storeDisplayName;
   private RecordRef storeDisplayThumbnail;
   private RecordRef storeDisplayImage;
   private String storeDescription;
   private String storeDetailedDescription;
   private RecordRef storeItemTemplate;
   private String pageTitle;
   private String urlComponent;
   private String metaTagHtml;
   private Boolean excludeFromSitemap;
   private SitemapPriority sitemapPriority;
   private String searchKeywords;
   private Boolean isDonationItem;
   private Boolean showDefaultDonationAmount;
   private Double maxDonationAmount;
   private Boolean dontShowPrice;
   private String noPriceMessage;
   private String outOfStockMessage;
   private Boolean onSpecial;
   private ItemOutOfStockBehavior outOfStockBehavior;
   private String relatedItemsDescription;
   private String specialsDescription;
   private ServiceItemTaskTemplatesList itemTaskTemplatesList;
   private String featuredDescription;
   private RecordRef customForm;
   private String itemId;
   private String upcCode;
   private String displayName;
   private String vendorName;
   private RecordRef parent;
   private Boolean isOnline;
   private Boolean isGcoCompliant;
   private Boolean offerSupport;
   private Boolean isInactive;
   private Boolean availableToPartners;
   private RecordRef department;
   private RecordRef _class;
   private RecordRef location;
   private RecordRefList subsidiaryList;
   private String currency;
   private BillingRatesMatrix billingRatesMatrix;
   private ItemAccountingBookDetailList accountingBookDetailList;
   private ItemOptionsList itemOptionsList;
   private MatrixOptionList matrixOptionList;
   private ItemVendorList itemVendorList;
   private PricingMatrix pricingMatrix;
   private RecordRef purchaseTaxCode;
   private Double rate;
   private RecordRef salesTaxCode;
   private SiteCategoryList siteCategoryList;
   private TranslationList translationsList;
   private RecordRef vendor;
   private PresentationItemList presentationItemList;
   private CustomFieldList customFieldList;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ServiceResaleItem.class, true);

   public ServiceResaleItem() {
      super();
   }

   public ServiceResaleItem(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, String purchaseDescription, Boolean manufacturingChargeItem, Double cost, String costUnits, RecordRef expenseAccount, RecordRef intercoExpenseAccount, String salesDescription, Boolean includeChildren, RecordRef incomeAccount, RecordRef intercoIncomeAccount, RecordRef taxSchedule, ItemMatrixType matrixType, Boolean isTaxable, ItemCostEstimateType costEstimateType, Double costEstimate, RecordRef unitsType, RecordRef purchaseUnit, RecordRef saleUnit, String costEstimateUnits, RecordRef issueProduct, RecordRef billingSchedule, RecordRef deferredRevenueAccount, RecordRef intercoDefRevAccount, RecordRef revRecSchedule, RecordRef deferralAccount, RecordRef amortizationTemplate, String residual, Boolean deferRevRec, RecordRef revenueRecognitionRule, RecordRef revRecForecastRule, RecordRef revenueAllocationGroup, RecordRef createRevenuePlansOn, Boolean directRevenuePosting, Boolean contingentRevenueHandling, RecordRef revReclassFXAccount, Long amortizationPeriod, Long minimumQuantity, Boolean enforceMinQtyInternally, String softDescriptor, Boolean pricesIncludeTax, RecordRef quantityPricingSchedule, Boolean useMarginalRates, ItemOverallQuantityPricingType overallQuantityPricingType, Boolean isFulfillable, Boolean generateAccruals, RecordRef costCategory, Double purchaseOrderQuantity, Double purchaseOrderAmount, Double purchaseOrderQuantityDiff, Double receiptQuantity, Double receiptAmount, Double receiptQuantityDiff, RecordRef pricingGroup, String minimumQuantityUnits, Double vsoePrice, VsoeSopGroup vsoeSopGroup, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, RecordRef itemRevenueCategory, Boolean createJob, String matrixItemNameTemplate, String storeDisplayName, RecordRef storeDisplayThumbnail, RecordRef storeDisplayImage, String storeDescription, String storeDetailedDescription, RecordRef storeItemTemplate, String pageTitle, String urlComponent, String metaTagHtml, Boolean excludeFromSitemap, SitemapPriority sitemapPriority, String searchKeywords, Boolean isDonationItem, Boolean showDefaultDonationAmount, Double maxDonationAmount, Boolean dontShowPrice, String noPriceMessage, String outOfStockMessage, Boolean onSpecial, ItemOutOfStockBehavior outOfStockBehavior, String relatedItemsDescription, String specialsDescription, ServiceItemTaskTemplatesList itemTaskTemplatesList, String featuredDescription, RecordRef customForm, String itemId, String upcCode, String displayName, String vendorName, RecordRef parent, Boolean isOnline, Boolean isGcoCompliant, Boolean offerSupport, Boolean isInactive, Boolean availableToPartners, RecordRef department, RecordRef _class, RecordRef location, RecordRefList subsidiaryList, String currency, BillingRatesMatrix billingRatesMatrix, ItemAccountingBookDetailList accountingBookDetailList, ItemOptionsList itemOptionsList, MatrixOptionList matrixOptionList, ItemVendorList itemVendorList, PricingMatrix pricingMatrix, RecordRef purchaseTaxCode, Double rate, RecordRef salesTaxCode, SiteCategoryList siteCategoryList, TranslationList translationsList, RecordRef vendor, PresentationItemList presentationItemList, CustomFieldList customFieldList) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.createdDate = createdDate;
      this.lastModifiedDate = lastModifiedDate;
      this.purchaseDescription = purchaseDescription;
      this.manufacturingChargeItem = manufacturingChargeItem;
      this.cost = cost;
      this.costUnits = costUnits;
      this.expenseAccount = expenseAccount;
      this.intercoExpenseAccount = intercoExpenseAccount;
      this.salesDescription = salesDescription;
      this.includeChildren = includeChildren;
      this.incomeAccount = incomeAccount;
      this.intercoIncomeAccount = intercoIncomeAccount;
      this.taxSchedule = taxSchedule;
      this.matrixType = matrixType;
      this.isTaxable = isTaxable;
      this.costEstimateType = costEstimateType;
      this.costEstimate = costEstimate;
      this.unitsType = unitsType;
      this.purchaseUnit = purchaseUnit;
      this.saleUnit = saleUnit;
      this.costEstimateUnits = costEstimateUnits;
      this.issueProduct = issueProduct;
      this.billingSchedule = billingSchedule;
      this.deferredRevenueAccount = deferredRevenueAccount;
      this.intercoDefRevAccount = intercoDefRevAccount;
      this.revRecSchedule = revRecSchedule;
      this.deferralAccount = deferralAccount;
      this.amortizationTemplate = amortizationTemplate;
      this.residual = residual;
      this.deferRevRec = deferRevRec;
      this.revenueRecognitionRule = revenueRecognitionRule;
      this.revRecForecastRule = revRecForecastRule;
      this.revenueAllocationGroup = revenueAllocationGroup;
      this.createRevenuePlansOn = createRevenuePlansOn;
      this.directRevenuePosting = directRevenuePosting;
      this.contingentRevenueHandling = contingentRevenueHandling;
      this.revReclassFXAccount = revReclassFXAccount;
      this.amortizationPeriod = amortizationPeriod;
      this.minimumQuantity = minimumQuantity;
      this.enforceMinQtyInternally = enforceMinQtyInternally;
      this.softDescriptor = softDescriptor;
      this.pricesIncludeTax = pricesIncludeTax;
      this.quantityPricingSchedule = quantityPricingSchedule;
      this.useMarginalRates = useMarginalRates;
      this.overallQuantityPricingType = overallQuantityPricingType;
      this.isFulfillable = isFulfillable;
      this.generateAccruals = generateAccruals;
      this.costCategory = costCategory;
      this.purchaseOrderQuantity = purchaseOrderQuantity;
      this.purchaseOrderAmount = purchaseOrderAmount;
      this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
      this.receiptQuantity = receiptQuantity;
      this.receiptAmount = receiptAmount;
      this.receiptQuantityDiff = receiptQuantityDiff;
      this.pricingGroup = pricingGroup;
      this.minimumQuantityUnits = minimumQuantityUnits;
      this.vsoePrice = vsoePrice;
      this.vsoeSopGroup = vsoeSopGroup;
      this.vsoeDeferral = vsoeDeferral;
      this.vsoePermitDiscount = vsoePermitDiscount;
      this.vsoeDelivered = vsoeDelivered;
      this.itemRevenueCategory = itemRevenueCategory;
      this.createJob = createJob;
      this.matrixItemNameTemplate = matrixItemNameTemplate;
      this.storeDisplayName = storeDisplayName;
      this.storeDisplayThumbnail = storeDisplayThumbnail;
      this.storeDisplayImage = storeDisplayImage;
      this.storeDescription = storeDescription;
      this.storeDetailedDescription = storeDetailedDescription;
      this.storeItemTemplate = storeItemTemplate;
      this.pageTitle = pageTitle;
      this.urlComponent = urlComponent;
      this.metaTagHtml = metaTagHtml;
      this.excludeFromSitemap = excludeFromSitemap;
      this.sitemapPriority = sitemapPriority;
      this.searchKeywords = searchKeywords;
      this.isDonationItem = isDonationItem;
      this.showDefaultDonationAmount = showDefaultDonationAmount;
      this.maxDonationAmount = maxDonationAmount;
      this.dontShowPrice = dontShowPrice;
      this.noPriceMessage = noPriceMessage;
      this.outOfStockMessage = outOfStockMessage;
      this.onSpecial = onSpecial;
      this.outOfStockBehavior = outOfStockBehavior;
      this.relatedItemsDescription = relatedItemsDescription;
      this.specialsDescription = specialsDescription;
      this.itemTaskTemplatesList = itemTaskTemplatesList;
      this.featuredDescription = featuredDescription;
      this.customForm = customForm;
      this.itemId = itemId;
      this.upcCode = upcCode;
      this.displayName = displayName;
      this.vendorName = vendorName;
      this.parent = parent;
      this.isOnline = isOnline;
      this.isGcoCompliant = isGcoCompliant;
      this.offerSupport = offerSupport;
      this.isInactive = isInactive;
      this.availableToPartners = availableToPartners;
      this.department = department;
      this._class = _class;
      this.location = location;
      this.subsidiaryList = subsidiaryList;
      this.currency = currency;
      this.billingRatesMatrix = billingRatesMatrix;
      this.accountingBookDetailList = accountingBookDetailList;
      this.itemOptionsList = itemOptionsList;
      this.matrixOptionList = matrixOptionList;
      this.itemVendorList = itemVendorList;
      this.pricingMatrix = pricingMatrix;
      this.purchaseTaxCode = purchaseTaxCode;
      this.rate = rate;
      this.salesTaxCode = salesTaxCode;
      this.siteCategoryList = siteCategoryList;
      this.translationsList = translationsList;
      this.vendor = vendor;
      this.presentationItemList = presentationItemList;
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

   public String getPurchaseDescription() {
      return this.purchaseDescription;
   }

   public void setPurchaseDescription(String purchaseDescription) {
      this.purchaseDescription = purchaseDescription;
   }

   public Boolean getManufacturingChargeItem() {
      return this.manufacturingChargeItem;
   }

   public void setManufacturingChargeItem(Boolean manufacturingChargeItem) {
      this.manufacturingChargeItem = manufacturingChargeItem;
   }

   public Double getCost() {
      return this.cost;
   }

   public void setCost(Double cost) {
      this.cost = cost;
   }

   public String getCostUnits() {
      return this.costUnits;
   }

   public void setCostUnits(String costUnits) {
      this.costUnits = costUnits;
   }

   public RecordRef getExpenseAccount() {
      return this.expenseAccount;
   }

   public void setExpenseAccount(RecordRef expenseAccount) {
      this.expenseAccount = expenseAccount;
   }

   public RecordRef getIntercoExpenseAccount() {
      return this.intercoExpenseAccount;
   }

   public void setIntercoExpenseAccount(RecordRef intercoExpenseAccount) {
      this.intercoExpenseAccount = intercoExpenseAccount;
   }

   public String getSalesDescription() {
      return this.salesDescription;
   }

   public void setSalesDescription(String salesDescription) {
      this.salesDescription = salesDescription;
   }

   public Boolean getIncludeChildren() {
      return this.includeChildren;
   }

   public void setIncludeChildren(Boolean includeChildren) {
      this.includeChildren = includeChildren;
   }

   public RecordRef getIncomeAccount() {
      return this.incomeAccount;
   }

   public void setIncomeAccount(RecordRef incomeAccount) {
      this.incomeAccount = incomeAccount;
   }

   public RecordRef getIntercoIncomeAccount() {
      return this.intercoIncomeAccount;
   }

   public void setIntercoIncomeAccount(RecordRef intercoIncomeAccount) {
      this.intercoIncomeAccount = intercoIncomeAccount;
   }

   public RecordRef getTaxSchedule() {
      return this.taxSchedule;
   }

   public void setTaxSchedule(RecordRef taxSchedule) {
      this.taxSchedule = taxSchedule;
   }

   public ItemMatrixType getMatrixType() {
      return this.matrixType;
   }

   public void setMatrixType(ItemMatrixType matrixType) {
      this.matrixType = matrixType;
   }

   public Boolean getIsTaxable() {
      return this.isTaxable;
   }

   public void setIsTaxable(Boolean isTaxable) {
      this.isTaxable = isTaxable;
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

   public RecordRef getUnitsType() {
      return this.unitsType;
   }

   public void setUnitsType(RecordRef unitsType) {
      this.unitsType = unitsType;
   }

   public RecordRef getPurchaseUnit() {
      return this.purchaseUnit;
   }

   public void setPurchaseUnit(RecordRef purchaseUnit) {
      this.purchaseUnit = purchaseUnit;
   }

   public RecordRef getSaleUnit() {
      return this.saleUnit;
   }

   public void setSaleUnit(RecordRef saleUnit) {
      this.saleUnit = saleUnit;
   }

   public String getCostEstimateUnits() {
      return this.costEstimateUnits;
   }

   public void setCostEstimateUnits(String costEstimateUnits) {
      this.costEstimateUnits = costEstimateUnits;
   }

   public RecordRef getIssueProduct() {
      return this.issueProduct;
   }

   public void setIssueProduct(RecordRef issueProduct) {
      this.issueProduct = issueProduct;
   }

   public RecordRef getBillingSchedule() {
      return this.billingSchedule;
   }

   public void setBillingSchedule(RecordRef billingSchedule) {
      this.billingSchedule = billingSchedule;
   }

   public RecordRef getDeferredRevenueAccount() {
      return this.deferredRevenueAccount;
   }

   public void setDeferredRevenueAccount(RecordRef deferredRevenueAccount) {
      this.deferredRevenueAccount = deferredRevenueAccount;
   }

   public RecordRef getIntercoDefRevAccount() {
      return this.intercoDefRevAccount;
   }

   public void setIntercoDefRevAccount(RecordRef intercoDefRevAccount) {
      this.intercoDefRevAccount = intercoDefRevAccount;
   }

   public RecordRef getRevRecSchedule() {
      return this.revRecSchedule;
   }

   public void setRevRecSchedule(RecordRef revRecSchedule) {
      this.revRecSchedule = revRecSchedule;
   }

   public RecordRef getDeferralAccount() {
      return this.deferralAccount;
   }

   public void setDeferralAccount(RecordRef deferralAccount) {
      this.deferralAccount = deferralAccount;
   }

   public RecordRef getAmortizationTemplate() {
      return this.amortizationTemplate;
   }

   public void setAmortizationTemplate(RecordRef amortizationTemplate) {
      this.amortizationTemplate = amortizationTemplate;
   }

   public String getResidual() {
      return this.residual;
   }

   public void setResidual(String residual) {
      this.residual = residual;
   }

   public Boolean getDeferRevRec() {
      return this.deferRevRec;
   }

   public void setDeferRevRec(Boolean deferRevRec) {
      this.deferRevRec = deferRevRec;
   }

   public RecordRef getRevenueRecognitionRule() {
      return this.revenueRecognitionRule;
   }

   public void setRevenueRecognitionRule(RecordRef revenueRecognitionRule) {
      this.revenueRecognitionRule = revenueRecognitionRule;
   }

   public RecordRef getRevRecForecastRule() {
      return this.revRecForecastRule;
   }

   public void setRevRecForecastRule(RecordRef revRecForecastRule) {
      this.revRecForecastRule = revRecForecastRule;
   }

   public RecordRef getRevenueAllocationGroup() {
      return this.revenueAllocationGroup;
   }

   public void setRevenueAllocationGroup(RecordRef revenueAllocationGroup) {
      this.revenueAllocationGroup = revenueAllocationGroup;
   }

   public RecordRef getCreateRevenuePlansOn() {
      return this.createRevenuePlansOn;
   }

   public void setCreateRevenuePlansOn(RecordRef createRevenuePlansOn) {
      this.createRevenuePlansOn = createRevenuePlansOn;
   }

   public Boolean getDirectRevenuePosting() {
      return this.directRevenuePosting;
   }

   public void setDirectRevenuePosting(Boolean directRevenuePosting) {
      this.directRevenuePosting = directRevenuePosting;
   }

   public Boolean getContingentRevenueHandling() {
      return this.contingentRevenueHandling;
   }

   public void setContingentRevenueHandling(Boolean contingentRevenueHandling) {
      this.contingentRevenueHandling = contingentRevenueHandling;
   }

   public RecordRef getRevReclassFXAccount() {
      return this.revReclassFXAccount;
   }

   public void setRevReclassFXAccount(RecordRef revReclassFXAccount) {
      this.revReclassFXAccount = revReclassFXAccount;
   }

   public Long getAmortizationPeriod() {
      return this.amortizationPeriod;
   }

   public void setAmortizationPeriod(Long amortizationPeriod) {
      this.amortizationPeriod = amortizationPeriod;
   }

   public Long getMinimumQuantity() {
      return this.minimumQuantity;
   }

   public void setMinimumQuantity(Long minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
   }

   public Boolean getEnforceMinQtyInternally() {
      return this.enforceMinQtyInternally;
   }

   public void setEnforceMinQtyInternally(Boolean enforceMinQtyInternally) {
      this.enforceMinQtyInternally = enforceMinQtyInternally;
   }

   public String getSoftDescriptor() {
      return this.softDescriptor;
   }

   public void setSoftDescriptor(String softDescriptor) {
      this.softDescriptor = softDescriptor;
   }

   public Boolean getPricesIncludeTax() {
      return this.pricesIncludeTax;
   }

   public void setPricesIncludeTax(Boolean pricesIncludeTax) {
      this.pricesIncludeTax = pricesIncludeTax;
   }

   public RecordRef getQuantityPricingSchedule() {
      return this.quantityPricingSchedule;
   }

   public void setQuantityPricingSchedule(RecordRef quantityPricingSchedule) {
      this.quantityPricingSchedule = quantityPricingSchedule;
   }

   public Boolean getUseMarginalRates() {
      return this.useMarginalRates;
   }

   public void setUseMarginalRates(Boolean useMarginalRates) {
      this.useMarginalRates = useMarginalRates;
   }

   public ItemOverallQuantityPricingType getOverallQuantityPricingType() {
      return this.overallQuantityPricingType;
   }

   public void setOverallQuantityPricingType(ItemOverallQuantityPricingType overallQuantityPricingType) {
      this.overallQuantityPricingType = overallQuantityPricingType;
   }

   public Boolean getIsFulfillable() {
      return this.isFulfillable;
   }

   public void setIsFulfillable(Boolean isFulfillable) {
      this.isFulfillable = isFulfillable;
   }

   public Boolean getGenerateAccruals() {
      return this.generateAccruals;
   }

   public void setGenerateAccruals(Boolean generateAccruals) {
      this.generateAccruals = generateAccruals;
   }

   public RecordRef getCostCategory() {
      return this.costCategory;
   }

   public void setCostCategory(RecordRef costCategory) {
      this.costCategory = costCategory;
   }

   public Double getPurchaseOrderQuantity() {
      return this.purchaseOrderQuantity;
   }

   public void setPurchaseOrderQuantity(Double purchaseOrderQuantity) {
      this.purchaseOrderQuantity = purchaseOrderQuantity;
   }

   public Double getPurchaseOrderAmount() {
      return this.purchaseOrderAmount;
   }

   public void setPurchaseOrderAmount(Double purchaseOrderAmount) {
      this.purchaseOrderAmount = purchaseOrderAmount;
   }

   public Double getPurchaseOrderQuantityDiff() {
      return this.purchaseOrderQuantityDiff;
   }

   public void setPurchaseOrderQuantityDiff(Double purchaseOrderQuantityDiff) {
      this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
   }

   public Double getReceiptQuantity() {
      return this.receiptQuantity;
   }

   public void setReceiptQuantity(Double receiptQuantity) {
      this.receiptQuantity = receiptQuantity;
   }

   public Double getReceiptAmount() {
      return this.receiptAmount;
   }

   public void setReceiptAmount(Double receiptAmount) {
      this.receiptAmount = receiptAmount;
   }

   public Double getReceiptQuantityDiff() {
      return this.receiptQuantityDiff;
   }

   public void setReceiptQuantityDiff(Double receiptQuantityDiff) {
      this.receiptQuantityDiff = receiptQuantityDiff;
   }

   public RecordRef getPricingGroup() {
      return this.pricingGroup;
   }

   public void setPricingGroup(RecordRef pricingGroup) {
      this.pricingGroup = pricingGroup;
   }

   public String getMinimumQuantityUnits() {
      return this.minimumQuantityUnits;
   }

   public void setMinimumQuantityUnits(String minimumQuantityUnits) {
      this.minimumQuantityUnits = minimumQuantityUnits;
   }

   public Double getVsoePrice() {
      return this.vsoePrice;
   }

   public void setVsoePrice(Double vsoePrice) {
      this.vsoePrice = vsoePrice;
   }

   public VsoeSopGroup getVsoeSopGroup() {
      return this.vsoeSopGroup;
   }

   public void setVsoeSopGroup(VsoeSopGroup vsoeSopGroup) {
      this.vsoeSopGroup = vsoeSopGroup;
   }

   public VsoeDeferral getVsoeDeferral() {
      return this.vsoeDeferral;
   }

   public void setVsoeDeferral(VsoeDeferral vsoeDeferral) {
      this.vsoeDeferral = vsoeDeferral;
   }

   public VsoePermitDiscount getVsoePermitDiscount() {
      return this.vsoePermitDiscount;
   }

   public void setVsoePermitDiscount(VsoePermitDiscount vsoePermitDiscount) {
      this.vsoePermitDiscount = vsoePermitDiscount;
   }

   public Boolean getVsoeDelivered() {
      return this.vsoeDelivered;
   }

   public void setVsoeDelivered(Boolean vsoeDelivered) {
      this.vsoeDelivered = vsoeDelivered;
   }

   public RecordRef getItemRevenueCategory() {
      return this.itemRevenueCategory;
   }

   public void setItemRevenueCategory(RecordRef itemRevenueCategory) {
      this.itemRevenueCategory = itemRevenueCategory;
   }

   public Boolean getCreateJob() {
      return this.createJob;
   }

   public void setCreateJob(Boolean createJob) {
      this.createJob = createJob;
   }

   public String getMatrixItemNameTemplate() {
      return this.matrixItemNameTemplate;
   }

   public void setMatrixItemNameTemplate(String matrixItemNameTemplate) {
      this.matrixItemNameTemplate = matrixItemNameTemplate;
   }

   public String getStoreDisplayName() {
      return this.storeDisplayName;
   }

   public void setStoreDisplayName(String storeDisplayName) {
      this.storeDisplayName = storeDisplayName;
   }

   public RecordRef getStoreDisplayThumbnail() {
      return this.storeDisplayThumbnail;
   }

   public void setStoreDisplayThumbnail(RecordRef storeDisplayThumbnail) {
      this.storeDisplayThumbnail = storeDisplayThumbnail;
   }

   public RecordRef getStoreDisplayImage() {
      return this.storeDisplayImage;
   }

   public void setStoreDisplayImage(RecordRef storeDisplayImage) {
      this.storeDisplayImage = storeDisplayImage;
   }

   public String getStoreDescription() {
      return this.storeDescription;
   }

   public void setStoreDescription(String storeDescription) {
      this.storeDescription = storeDescription;
   }

   public String getStoreDetailedDescription() {
      return this.storeDetailedDescription;
   }

   public void setStoreDetailedDescription(String storeDetailedDescription) {
      this.storeDetailedDescription = storeDetailedDescription;
   }

   public RecordRef getStoreItemTemplate() {
      return this.storeItemTemplate;
   }

   public void setStoreItemTemplate(RecordRef storeItemTemplate) {
      this.storeItemTemplate = storeItemTemplate;
   }

   public String getPageTitle() {
      return this.pageTitle;
   }

   public void setPageTitle(String pageTitle) {
      this.pageTitle = pageTitle;
   }

   public String getUrlComponent() {
      return this.urlComponent;
   }

   public void setUrlComponent(String urlComponent) {
      this.urlComponent = urlComponent;
   }

   public String getMetaTagHtml() {
      return this.metaTagHtml;
   }

   public void setMetaTagHtml(String metaTagHtml) {
      this.metaTagHtml = metaTagHtml;
   }

   public Boolean getExcludeFromSitemap() {
      return this.excludeFromSitemap;
   }

   public void setExcludeFromSitemap(Boolean excludeFromSitemap) {
      this.excludeFromSitemap = excludeFromSitemap;
   }

   public SitemapPriority getSitemapPriority() {
      return this.sitemapPriority;
   }

   public void setSitemapPriority(SitemapPriority sitemapPriority) {
      this.sitemapPriority = sitemapPriority;
   }

   public String getSearchKeywords() {
      return this.searchKeywords;
   }

   public void setSearchKeywords(String searchKeywords) {
      this.searchKeywords = searchKeywords;
   }

   public Boolean getIsDonationItem() {
      return this.isDonationItem;
   }

   public void setIsDonationItem(Boolean isDonationItem) {
      this.isDonationItem = isDonationItem;
   }

   public Boolean getShowDefaultDonationAmount() {
      return this.showDefaultDonationAmount;
   }

   public void setShowDefaultDonationAmount(Boolean showDefaultDonationAmount) {
      this.showDefaultDonationAmount = showDefaultDonationAmount;
   }

   public Double getMaxDonationAmount() {
      return this.maxDonationAmount;
   }

   public void setMaxDonationAmount(Double maxDonationAmount) {
      this.maxDonationAmount = maxDonationAmount;
   }

   public Boolean getDontShowPrice() {
      return this.dontShowPrice;
   }

   public void setDontShowPrice(Boolean dontShowPrice) {
      this.dontShowPrice = dontShowPrice;
   }

   public String getNoPriceMessage() {
      return this.noPriceMessage;
   }

   public void setNoPriceMessage(String noPriceMessage) {
      this.noPriceMessage = noPriceMessage;
   }

   public String getOutOfStockMessage() {
      return this.outOfStockMessage;
   }

   public void setOutOfStockMessage(String outOfStockMessage) {
      this.outOfStockMessage = outOfStockMessage;
   }

   public Boolean getOnSpecial() {
      return this.onSpecial;
   }

   public void setOnSpecial(Boolean onSpecial) {
      this.onSpecial = onSpecial;
   }

   public ItemOutOfStockBehavior getOutOfStockBehavior() {
      return this.outOfStockBehavior;
   }

   public void setOutOfStockBehavior(ItemOutOfStockBehavior outOfStockBehavior) {
      this.outOfStockBehavior = outOfStockBehavior;
   }

   public String getRelatedItemsDescription() {
      return this.relatedItemsDescription;
   }

   public void setRelatedItemsDescription(String relatedItemsDescription) {
      this.relatedItemsDescription = relatedItemsDescription;
   }

   public String getSpecialsDescription() {
      return this.specialsDescription;
   }

   public void setSpecialsDescription(String specialsDescription) {
      this.specialsDescription = specialsDescription;
   }

   public ServiceItemTaskTemplatesList getItemTaskTemplatesList() {
      return this.itemTaskTemplatesList;
   }

   public void setItemTaskTemplatesList(ServiceItemTaskTemplatesList itemTaskTemplatesList) {
      this.itemTaskTemplatesList = itemTaskTemplatesList;
   }

   public String getFeaturedDescription() {
      return this.featuredDescription;
   }

   public void setFeaturedDescription(String featuredDescription) {
      this.featuredDescription = featuredDescription;
   }

   public RecordRef getCustomForm() {
      return this.customForm;
   }

   public void setCustomForm(RecordRef customForm) {
      this.customForm = customForm;
   }

   public String getItemId() {
      return this.itemId;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public String getUpcCode() {
      return this.upcCode;
   }

   public void setUpcCode(String upcCode) {
      this.upcCode = upcCode;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   public void setDisplayName(String displayName) {
      this.displayName = displayName;
   }

   public String getVendorName() {
      return this.vendorName;
   }

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public RecordRef getParent() {
      return this.parent;
   }

   public void setParent(RecordRef parent) {
      this.parent = parent;
   }

   public Boolean getIsOnline() {
      return this.isOnline;
   }

   public void setIsOnline(Boolean isOnline) {
      this.isOnline = isOnline;
   }

   public Boolean getIsGcoCompliant() {
      return this.isGcoCompliant;
   }

   public void setIsGcoCompliant(Boolean isGcoCompliant) {
      this.isGcoCompliant = isGcoCompliant;
   }

   public Boolean getOfferSupport() {
      return this.offerSupport;
   }

   public void setOfferSupport(Boolean offerSupport) {
      this.offerSupport = offerSupport;
   }

   public Boolean getIsInactive() {
      return this.isInactive;
   }

   public void setIsInactive(Boolean isInactive) {
      this.isInactive = isInactive;
   }

   public Boolean getAvailableToPartners() {
      return this.availableToPartners;
   }

   public void setAvailableToPartners(Boolean availableToPartners) {
      this.availableToPartners = availableToPartners;
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

   public RecordRefList getSubsidiaryList() {
      return this.subsidiaryList;
   }

   public void setSubsidiaryList(RecordRefList subsidiaryList) {
      this.subsidiaryList = subsidiaryList;
   }

   public String getCurrency() {
      return this.currency;
   }

   public void setCurrency(String currency) {
      this.currency = currency;
   }

   public BillingRatesMatrix getBillingRatesMatrix() {
      return this.billingRatesMatrix;
   }

   public void setBillingRatesMatrix(BillingRatesMatrix billingRatesMatrix) {
      this.billingRatesMatrix = billingRatesMatrix;
   }

   public ItemAccountingBookDetailList getAccountingBookDetailList() {
      return this.accountingBookDetailList;
   }

   public void setAccountingBookDetailList(ItemAccountingBookDetailList accountingBookDetailList) {
      this.accountingBookDetailList = accountingBookDetailList;
   }

   public ItemOptionsList getItemOptionsList() {
      return this.itemOptionsList;
   }

   public void setItemOptionsList(ItemOptionsList itemOptionsList) {
      this.itemOptionsList = itemOptionsList;
   }

   public MatrixOptionList getMatrixOptionList() {
      return this.matrixOptionList;
   }

   public void setMatrixOptionList(MatrixOptionList matrixOptionList) {
      this.matrixOptionList = matrixOptionList;
   }

   public ItemVendorList getItemVendorList() {
      return this.itemVendorList;
   }

   public void setItemVendorList(ItemVendorList itemVendorList) {
      this.itemVendorList = itemVendorList;
   }

   public PricingMatrix getPricingMatrix() {
      return this.pricingMatrix;
   }

   public void setPricingMatrix(PricingMatrix pricingMatrix) {
      this.pricingMatrix = pricingMatrix;
   }

   public RecordRef getPurchaseTaxCode() {
      return this.purchaseTaxCode;
   }

   public void setPurchaseTaxCode(RecordRef purchaseTaxCode) {
      this.purchaseTaxCode = purchaseTaxCode;
   }

   public Double getRate() {
      return this.rate;
   }

   public void setRate(Double rate) {
      this.rate = rate;
   }

   public RecordRef getSalesTaxCode() {
      return this.salesTaxCode;
   }

   public void setSalesTaxCode(RecordRef salesTaxCode) {
      this.salesTaxCode = salesTaxCode;
   }

   public SiteCategoryList getSiteCategoryList() {
      return this.siteCategoryList;
   }

   public void setSiteCategoryList(SiteCategoryList siteCategoryList) {
      this.siteCategoryList = siteCategoryList;
   }

   public TranslationList getTranslationsList() {
      return this.translationsList;
   }

   public void setTranslationsList(TranslationList translationsList) {
      this.translationsList = translationsList;
   }

   public RecordRef getVendor() {
      return this.vendor;
   }

   public void setVendor(RecordRef vendor) {
      this.vendor = vendor;
   }

   public PresentationItemList getPresentationItemList() {
      return this.presentationItemList;
   }

   public void setPresentationItemList(PresentationItemList presentationItemList) {
      this.presentationItemList = presentationItemList;
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
      if (!(obj instanceof ServiceResaleItem)) {
         return false;
      } else {
         ServiceResaleItem other = (ServiceResaleItem)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.purchaseDescription == null && other.getPurchaseDescription() == null || this.purchaseDescription != null && this.purchaseDescription.equals(other.getPurchaseDescription())) && (this.manufacturingChargeItem == null && other.getManufacturingChargeItem() == null || this.manufacturingChargeItem != null && this.manufacturingChargeItem.equals(other.getManufacturingChargeItem())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.costUnits == null && other.getCostUnits() == null || this.costUnits != null && this.costUnits.equals(other.getCostUnits())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && this.expenseAccount.equals(other.getExpenseAccount())) && (this.intercoExpenseAccount == null && other.getIntercoExpenseAccount() == null || this.intercoExpenseAccount != null && this.intercoExpenseAccount.equals(other.getIntercoExpenseAccount())) && (this.salesDescription == null && other.getSalesDescription() == null || this.salesDescription != null && this.salesDescription.equals(other.getSalesDescription())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.incomeAccount == null && other.getIncomeAccount() == null || this.incomeAccount != null && this.incomeAccount.equals(other.getIncomeAccount())) && (this.intercoIncomeAccount == null && other.getIntercoIncomeAccount() == null || this.intercoIncomeAccount != null && this.intercoIncomeAccount.equals(other.getIntercoIncomeAccount())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.matrixType == null && other.getMatrixType() == null || this.matrixType != null && this.matrixType.equals(other.getMatrixType())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType())) && (this.purchaseUnit == null && other.getPurchaseUnit() == null || this.purchaseUnit != null && this.purchaseUnit.equals(other.getPurchaseUnit())) && (this.saleUnit == null && other.getSaleUnit() == null || this.saleUnit != null && this.saleUnit.equals(other.getSaleUnit())) && (this.costEstimateUnits == null && other.getCostEstimateUnits() == null || this.costEstimateUnits != null && this.costEstimateUnits.equals(other.getCostEstimateUnits())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.deferredRevenueAccount == null && other.getDeferredRevenueAccount() == null || this.deferredRevenueAccount != null && this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount())) && (this.intercoDefRevAccount == null && other.getIntercoDefRevAccount() == null || this.intercoDefRevAccount != null && this.intercoDefRevAccount.equals(other.getIntercoDefRevAccount())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.deferralAccount == null && other.getDeferralAccount() == null || this.deferralAccount != null && this.deferralAccount.equals(other.getDeferralAccount())) && (this.amortizationTemplate == null && other.getAmortizationTemplate() == null || this.amortizationTemplate != null && this.amortizationTemplate.equals(other.getAmortizationTemplate())) && (this.residual == null && other.getResidual() == null || this.residual != null && this.residual.equals(other.getResidual())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.revenueAllocationGroup == null && other.getRevenueAllocationGroup() == null || this.revenueAllocationGroup != null && this.revenueAllocationGroup.equals(other.getRevenueAllocationGroup())) && (this.createRevenuePlansOn == null && other.getCreateRevenuePlansOn() == null || this.createRevenuePlansOn != null && this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn())) && (this.directRevenuePosting == null && other.getDirectRevenuePosting() == null || this.directRevenuePosting != null && this.directRevenuePosting.equals(other.getDirectRevenuePosting())) && (this.contingentRevenueHandling == null && other.getContingentRevenueHandling() == null || this.contingentRevenueHandling != null && this.contingentRevenueHandling.equals(other.getContingentRevenueHandling())) && (this.revReclassFXAccount == null && other.getRevReclassFXAccount() == null || this.revReclassFXAccount != null && this.revReclassFXAccount.equals(other.getRevReclassFXAccount())) && (this.amortizationPeriod == null && other.getAmortizationPeriod() == null || this.amortizationPeriod != null && this.amortizationPeriod.equals(other.getAmortizationPeriod())) && (this.minimumQuantity == null && other.getMinimumQuantity() == null || this.minimumQuantity != null && this.minimumQuantity.equals(other.getMinimumQuantity())) && (this.enforceMinQtyInternally == null && other.getEnforceMinQtyInternally() == null || this.enforceMinQtyInternally != null && this.enforceMinQtyInternally.equals(other.getEnforceMinQtyInternally())) && (this.softDescriptor == null && other.getSoftDescriptor() == null || this.softDescriptor != null && this.softDescriptor.equals(other.getSoftDescriptor())) && (this.pricesIncludeTax == null && other.getPricesIncludeTax() == null || this.pricesIncludeTax != null && this.pricesIncludeTax.equals(other.getPricesIncludeTax())) && (this.quantityPricingSchedule == null && other.getQuantityPricingSchedule() == null || this.quantityPricingSchedule != null && this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule())) && (this.useMarginalRates == null && other.getUseMarginalRates() == null || this.useMarginalRates != null && this.useMarginalRates.equals(other.getUseMarginalRates())) && (this.overallQuantityPricingType == null && other.getOverallQuantityPricingType() == null || this.overallQuantityPricingType != null && this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType())) && (this.isFulfillable == null && other.getIsFulfillable() == null || this.isFulfillable != null && this.isFulfillable.equals(other.getIsFulfillable())) && (this.generateAccruals == null && other.getGenerateAccruals() == null || this.generateAccruals != null && this.generateAccruals.equals(other.getGenerateAccruals())) && (this.costCategory == null && other.getCostCategory() == null || this.costCategory != null && this.costCategory.equals(other.getCostCategory())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && this.receiptQuantity.equals(other.getReceiptQuantity())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && this.receiptAmount.equals(other.getReceiptAmount())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && this.pricingGroup.equals(other.getPricingGroup())) && (this.minimumQuantityUnits == null && other.getMinimumQuantityUnits() == null || this.minimumQuantityUnits != null && this.minimumQuantityUnits.equals(other.getMinimumQuantityUnits())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && this.itemRevenueCategory.equals(other.getItemRevenueCategory())) && (this.createJob == null && other.getCreateJob() == null || this.createJob != null && this.createJob.equals(other.getCreateJob())) && (this.matrixItemNameTemplate == null && other.getMatrixItemNameTemplate() == null || this.matrixItemNameTemplate != null && this.matrixItemNameTemplate.equals(other.getMatrixItemNameTemplate())) && (this.storeDisplayName == null && other.getStoreDisplayName() == null || this.storeDisplayName != null && this.storeDisplayName.equals(other.getStoreDisplayName())) && (this.storeDisplayThumbnail == null && other.getStoreDisplayThumbnail() == null || this.storeDisplayThumbnail != null && this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail())) && (this.storeDisplayImage == null && other.getStoreDisplayImage() == null || this.storeDisplayImage != null && this.storeDisplayImage.equals(other.getStoreDisplayImage())) && (this.storeDescription == null && other.getStoreDescription() == null || this.storeDescription != null && this.storeDescription.equals(other.getStoreDescription())) && (this.storeDetailedDescription == null && other.getStoreDetailedDescription() == null || this.storeDetailedDescription != null && this.storeDetailedDescription.equals(other.getStoreDetailedDescription())) && (this.storeItemTemplate == null && other.getStoreItemTemplate() == null || this.storeItemTemplate != null && this.storeItemTemplate.equals(other.getStoreItemTemplate())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && this.pageTitle.equals(other.getPageTitle())) && (this.urlComponent == null && other.getUrlComponent() == null || this.urlComponent != null && this.urlComponent.equals(other.getUrlComponent())) && (this.metaTagHtml == null && other.getMetaTagHtml() == null || this.metaTagHtml != null && this.metaTagHtml.equals(other.getMetaTagHtml())) && (this.excludeFromSitemap == null && other.getExcludeFromSitemap() == null || this.excludeFromSitemap != null && this.excludeFromSitemap.equals(other.getExcludeFromSitemap())) && (this.sitemapPriority == null && other.getSitemapPriority() == null || this.sitemapPriority != null && this.sitemapPriority.equals(other.getSitemapPriority())) && (this.searchKeywords == null && other.getSearchKeywords() == null || this.searchKeywords != null && this.searchKeywords.equals(other.getSearchKeywords())) && (this.isDonationItem == null && other.getIsDonationItem() == null || this.isDonationItem != null && this.isDonationItem.equals(other.getIsDonationItem())) && (this.showDefaultDonationAmount == null && other.getShowDefaultDonationAmount() == null || this.showDefaultDonationAmount != null && this.showDefaultDonationAmount.equals(other.getShowDefaultDonationAmount())) && (this.maxDonationAmount == null && other.getMaxDonationAmount() == null || this.maxDonationAmount != null && this.maxDonationAmount.equals(other.getMaxDonationAmount())) && (this.dontShowPrice == null && other.getDontShowPrice() == null || this.dontShowPrice != null && this.dontShowPrice.equals(other.getDontShowPrice())) && (this.noPriceMessage == null && other.getNoPriceMessage() == null || this.noPriceMessage != null && this.noPriceMessage.equals(other.getNoPriceMessage())) && (this.outOfStockMessage == null && other.getOutOfStockMessage() == null || this.outOfStockMessage != null && this.outOfStockMessage.equals(other.getOutOfStockMessage())) && (this.onSpecial == null && other.getOnSpecial() == null || this.onSpecial != null && this.onSpecial.equals(other.getOnSpecial())) && (this.outOfStockBehavior == null && other.getOutOfStockBehavior() == null || this.outOfStockBehavior != null && this.outOfStockBehavior.equals(other.getOutOfStockBehavior())) && (this.relatedItemsDescription == null && other.getRelatedItemsDescription() == null || this.relatedItemsDescription != null && this.relatedItemsDescription.equals(other.getRelatedItemsDescription())) && (this.specialsDescription == null && other.getSpecialsDescription() == null || this.specialsDescription != null && this.specialsDescription.equals(other.getSpecialsDescription())) && (this.itemTaskTemplatesList == null && other.getItemTaskTemplatesList() == null || this.itemTaskTemplatesList != null && this.itemTaskTemplatesList.equals(other.getItemTaskTemplatesList())) && (this.featuredDescription == null && other.getFeaturedDescription() == null || this.featuredDescription != null && this.featuredDescription.equals(other.getFeaturedDescription())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.isGcoCompliant == null && other.getIsGcoCompliant() == null || this.isGcoCompliant != null && this.isGcoCompliant.equals(other.getIsGcoCompliant())) && (this.offerSupport == null && other.getOfferSupport() == null || this.offerSupport != null && this.offerSupport.equals(other.getOfferSupport())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.billingRatesMatrix == null && other.getBillingRatesMatrix() == null || this.billingRatesMatrix != null && this.billingRatesMatrix.equals(other.getBillingRatesMatrix())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.itemOptionsList == null && other.getItemOptionsList() == null || this.itemOptionsList != null && this.itemOptionsList.equals(other.getItemOptionsList())) && (this.matrixOptionList == null && other.getMatrixOptionList() == null || this.matrixOptionList != null && this.matrixOptionList.equals(other.getMatrixOptionList())) && (this.itemVendorList == null && other.getItemVendorList() == null || this.itemVendorList != null && this.itemVendorList.equals(other.getItemVendorList())) && (this.pricingMatrix == null && other.getPricingMatrix() == null || this.pricingMatrix != null && this.pricingMatrix.equals(other.getPricingMatrix())) && (this.purchaseTaxCode == null && other.getPurchaseTaxCode() == null || this.purchaseTaxCode != null && this.purchaseTaxCode.equals(other.getPurchaseTaxCode())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.salesTaxCode == null && other.getSalesTaxCode() == null || this.salesTaxCode != null && this.salesTaxCode.equals(other.getSalesTaxCode())) && (this.siteCategoryList == null && other.getSiteCategoryList() == null || this.siteCategoryList != null && this.siteCategoryList.equals(other.getSiteCategoryList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && this.vendor.equals(other.getVendor())) && (this.presentationItemList == null && other.getPresentationItemList() == null || this.presentationItemList != null && this.presentationItemList.equals(other.getPresentationItemList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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

         if (this.getPurchaseDescription() != null) {
            _hashCode += this.getPurchaseDescription().hashCode();
         }

         if (this.getManufacturingChargeItem() != null) {
            _hashCode += this.getManufacturingChargeItem().hashCode();
         }

         if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
         }

         if (this.getCostUnits() != null) {
            _hashCode += this.getCostUnits().hashCode();
         }

         if (this.getExpenseAccount() != null) {
            _hashCode += this.getExpenseAccount().hashCode();
         }

         if (this.getIntercoExpenseAccount() != null) {
            _hashCode += this.getIntercoExpenseAccount().hashCode();
         }

         if (this.getSalesDescription() != null) {
            _hashCode += this.getSalesDescription().hashCode();
         }

         if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
         }

         if (this.getIncomeAccount() != null) {
            _hashCode += this.getIncomeAccount().hashCode();
         }

         if (this.getIntercoIncomeAccount() != null) {
            _hashCode += this.getIntercoIncomeAccount().hashCode();
         }

         if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
         }

         if (this.getMatrixType() != null) {
            _hashCode += this.getMatrixType().hashCode();
         }

         if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
         }

         if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
         }

         if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
         }

         if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
         }

         if (this.getPurchaseUnit() != null) {
            _hashCode += this.getPurchaseUnit().hashCode();
         }

         if (this.getSaleUnit() != null) {
            _hashCode += this.getSaleUnit().hashCode();
         }

         if (this.getCostEstimateUnits() != null) {
            _hashCode += this.getCostEstimateUnits().hashCode();
         }

         if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
         }

         if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
         }

         if (this.getDeferredRevenueAccount() != null) {
            _hashCode += this.getDeferredRevenueAccount().hashCode();
         }

         if (this.getIntercoDefRevAccount() != null) {
            _hashCode += this.getIntercoDefRevAccount().hashCode();
         }

         if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
         }

         if (this.getDeferralAccount() != null) {
            _hashCode += this.getDeferralAccount().hashCode();
         }

         if (this.getAmortizationTemplate() != null) {
            _hashCode += this.getAmortizationTemplate().hashCode();
         }

         if (this.getResidual() != null) {
            _hashCode += this.getResidual().hashCode();
         }

         if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
         }

         if (this.getRevenueRecognitionRule() != null) {
            _hashCode += this.getRevenueRecognitionRule().hashCode();
         }

         if (this.getRevRecForecastRule() != null) {
            _hashCode += this.getRevRecForecastRule().hashCode();
         }

         if (this.getRevenueAllocationGroup() != null) {
            _hashCode += this.getRevenueAllocationGroup().hashCode();
         }

         if (this.getCreateRevenuePlansOn() != null) {
            _hashCode += this.getCreateRevenuePlansOn().hashCode();
         }

         if (this.getDirectRevenuePosting() != null) {
            _hashCode += this.getDirectRevenuePosting().hashCode();
         }

         if (this.getContingentRevenueHandling() != null) {
            _hashCode += this.getContingentRevenueHandling().hashCode();
         }

         if (this.getRevReclassFXAccount() != null) {
            _hashCode += this.getRevReclassFXAccount().hashCode();
         }

         if (this.getAmortizationPeriod() != null) {
            _hashCode += this.getAmortizationPeriod().hashCode();
         }

         if (this.getMinimumQuantity() != null) {
            _hashCode += this.getMinimumQuantity().hashCode();
         }

         if (this.getEnforceMinQtyInternally() != null) {
            _hashCode += this.getEnforceMinQtyInternally().hashCode();
         }

         if (this.getSoftDescriptor() != null) {
            _hashCode += this.getSoftDescriptor().hashCode();
         }

         if (this.getPricesIncludeTax() != null) {
            _hashCode += this.getPricesIncludeTax().hashCode();
         }

         if (this.getQuantityPricingSchedule() != null) {
            _hashCode += this.getQuantityPricingSchedule().hashCode();
         }

         if (this.getUseMarginalRates() != null) {
            _hashCode += this.getUseMarginalRates().hashCode();
         }

         if (this.getOverallQuantityPricingType() != null) {
            _hashCode += this.getOverallQuantityPricingType().hashCode();
         }

         if (this.getIsFulfillable() != null) {
            _hashCode += this.getIsFulfillable().hashCode();
         }

         if (this.getGenerateAccruals() != null) {
            _hashCode += this.getGenerateAccruals().hashCode();
         }

         if (this.getCostCategory() != null) {
            _hashCode += this.getCostCategory().hashCode();
         }

         if (this.getPurchaseOrderQuantity() != null) {
            _hashCode += this.getPurchaseOrderQuantity().hashCode();
         }

         if (this.getPurchaseOrderAmount() != null) {
            _hashCode += this.getPurchaseOrderAmount().hashCode();
         }

         if (this.getPurchaseOrderQuantityDiff() != null) {
            _hashCode += this.getPurchaseOrderQuantityDiff().hashCode();
         }

         if (this.getReceiptQuantity() != null) {
            _hashCode += this.getReceiptQuantity().hashCode();
         }

         if (this.getReceiptAmount() != null) {
            _hashCode += this.getReceiptAmount().hashCode();
         }

         if (this.getReceiptQuantityDiff() != null) {
            _hashCode += this.getReceiptQuantityDiff().hashCode();
         }

         if (this.getPricingGroup() != null) {
            _hashCode += this.getPricingGroup().hashCode();
         }

         if (this.getMinimumQuantityUnits() != null) {
            _hashCode += this.getMinimumQuantityUnits().hashCode();
         }

         if (this.getVsoePrice() != null) {
            _hashCode += this.getVsoePrice().hashCode();
         }

         if (this.getVsoeSopGroup() != null) {
            _hashCode += this.getVsoeSopGroup().hashCode();
         }

         if (this.getVsoeDeferral() != null) {
            _hashCode += this.getVsoeDeferral().hashCode();
         }

         if (this.getVsoePermitDiscount() != null) {
            _hashCode += this.getVsoePermitDiscount().hashCode();
         }

         if (this.getVsoeDelivered() != null) {
            _hashCode += this.getVsoeDelivered().hashCode();
         }

         if (this.getItemRevenueCategory() != null) {
            _hashCode += this.getItemRevenueCategory().hashCode();
         }

         if (this.getCreateJob() != null) {
            _hashCode += this.getCreateJob().hashCode();
         }

         if (this.getMatrixItemNameTemplate() != null) {
            _hashCode += this.getMatrixItemNameTemplate().hashCode();
         }

         if (this.getStoreDisplayName() != null) {
            _hashCode += this.getStoreDisplayName().hashCode();
         }

         if (this.getStoreDisplayThumbnail() != null) {
            _hashCode += this.getStoreDisplayThumbnail().hashCode();
         }

         if (this.getStoreDisplayImage() != null) {
            _hashCode += this.getStoreDisplayImage().hashCode();
         }

         if (this.getStoreDescription() != null) {
            _hashCode += this.getStoreDescription().hashCode();
         }

         if (this.getStoreDetailedDescription() != null) {
            _hashCode += this.getStoreDetailedDescription().hashCode();
         }

         if (this.getStoreItemTemplate() != null) {
            _hashCode += this.getStoreItemTemplate().hashCode();
         }

         if (this.getPageTitle() != null) {
            _hashCode += this.getPageTitle().hashCode();
         }

         if (this.getUrlComponent() != null) {
            _hashCode += this.getUrlComponent().hashCode();
         }

         if (this.getMetaTagHtml() != null) {
            _hashCode += this.getMetaTagHtml().hashCode();
         }

         if (this.getExcludeFromSitemap() != null) {
            _hashCode += this.getExcludeFromSitemap().hashCode();
         }

         if (this.getSitemapPriority() != null) {
            _hashCode += this.getSitemapPriority().hashCode();
         }

         if (this.getSearchKeywords() != null) {
            _hashCode += this.getSearchKeywords().hashCode();
         }

         if (this.getIsDonationItem() != null) {
            _hashCode += this.getIsDonationItem().hashCode();
         }

         if (this.getShowDefaultDonationAmount() != null) {
            _hashCode += this.getShowDefaultDonationAmount().hashCode();
         }

         if (this.getMaxDonationAmount() != null) {
            _hashCode += this.getMaxDonationAmount().hashCode();
         }

         if (this.getDontShowPrice() != null) {
            _hashCode += this.getDontShowPrice().hashCode();
         }

         if (this.getNoPriceMessage() != null) {
            _hashCode += this.getNoPriceMessage().hashCode();
         }

         if (this.getOutOfStockMessage() != null) {
            _hashCode += this.getOutOfStockMessage().hashCode();
         }

         if (this.getOnSpecial() != null) {
            _hashCode += this.getOnSpecial().hashCode();
         }

         if (this.getOutOfStockBehavior() != null) {
            _hashCode += this.getOutOfStockBehavior().hashCode();
         }

         if (this.getRelatedItemsDescription() != null) {
            _hashCode += this.getRelatedItemsDescription().hashCode();
         }

         if (this.getSpecialsDescription() != null) {
            _hashCode += this.getSpecialsDescription().hashCode();
         }

         if (this.getItemTaskTemplatesList() != null) {
            _hashCode += this.getItemTaskTemplatesList().hashCode();
         }

         if (this.getFeaturedDescription() != null) {
            _hashCode += this.getFeaturedDescription().hashCode();
         }

         if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
         }

         if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
         }

         if (this.getUpcCode() != null) {
            _hashCode += this.getUpcCode().hashCode();
         }

         if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
         }

         if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
         }

         if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
         }

         if (this.getIsOnline() != null) {
            _hashCode += this.getIsOnline().hashCode();
         }

         if (this.getIsGcoCompliant() != null) {
            _hashCode += this.getIsGcoCompliant().hashCode();
         }

         if (this.getOfferSupport() != null) {
            _hashCode += this.getOfferSupport().hashCode();
         }

         if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
         }

         if (this.getAvailableToPartners() != null) {
            _hashCode += this.getAvailableToPartners().hashCode();
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

         if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
         }

         if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
         }

         if (this.getBillingRatesMatrix() != null) {
            _hashCode += this.getBillingRatesMatrix().hashCode();
         }

         if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
         }

         if (this.getItemOptionsList() != null) {
            _hashCode += this.getItemOptionsList().hashCode();
         }

         if (this.getMatrixOptionList() != null) {
            _hashCode += this.getMatrixOptionList().hashCode();
         }

         if (this.getItemVendorList() != null) {
            _hashCode += this.getItemVendorList().hashCode();
         }

         if (this.getPricingMatrix() != null) {
            _hashCode += this.getPricingMatrix().hashCode();
         }

         if (this.getPurchaseTaxCode() != null) {
            _hashCode += this.getPurchaseTaxCode().hashCode();
         }

         if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
         }

         if (this.getSalesTaxCode() != null) {
            _hashCode += this.getSalesTaxCode().hashCode();
         }

         if (this.getSiteCategoryList() != null) {
            _hashCode += this.getSiteCategoryList().hashCode();
         }

         if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
         }

         if (this.getVendor() != null) {
            _hashCode += this.getVendor().hashCode();
         }

         if (this.getPresentationItemList() != null) {
            _hashCode += this.getPresentationItemList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServiceResaleItem"));
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
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "createdDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lastModifiedDate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "lastModifiedDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseDescription");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "purchaseDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("manufacturingChargeItem");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "manufacturingChargeItem"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("cost");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "cost"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("costUnits");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "costUnits"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expenseAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "expenseAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("intercoExpenseAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "intercoExpenseAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("salesDescription");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "salesDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("includeChildren");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "includeChildren"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("incomeAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "incomeAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("intercoIncomeAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "intercoIncomeAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taxSchedule");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "taxSchedule"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("matrixType");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "matrixType"));
      elemField.setXmlType(new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemMatrixType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isTaxable");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isTaxable"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("costEstimateType");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "costEstimateType"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("costEstimate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "costEstimate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("unitsType");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "unitsType"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseUnit");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "purchaseUnit"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("saleUnit");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "saleUnit"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("costEstimateUnits");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "costEstimateUnits"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("issueProduct");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "issueProduct"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billingSchedule");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "billingSchedule"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("deferredRevenueAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "deferredRevenueAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("intercoDefRevAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "intercoDefRevAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revRecSchedule");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "revRecSchedule"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("deferralAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "deferralAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amortizationTemplate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "amortizationTemplate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("residual");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "residual"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("deferRevRec");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "deferRevRec"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revenueRecognitionRule");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "revenueRecognitionRule"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revRecForecastRule");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "revRecForecastRule"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revenueAllocationGroup");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "revenueAllocationGroup"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("createRevenuePlansOn");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "createRevenuePlansOn"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("directRevenuePosting");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "directRevenuePosting"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contingentRevenueHandling");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "contingentRevenueHandling"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revReclassFXAccount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "revReclassFXAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amortizationPeriod");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "amortizationPeriod"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("minimumQuantity");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "minimumQuantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("enforceMinQtyInternally");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "enforceMinQtyInternally"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("softDescriptor");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "softDescriptor"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("pricesIncludeTax");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "pricesIncludeTax"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityPricingSchedule");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "quantityPricingSchedule"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("useMarginalRates");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "useMarginalRates"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("overallQuantityPricingType");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "overallQuantityPricingType"));
      elemField.setXmlType(new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isFulfillable");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isFulfillable"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("generateAccruals");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "generateAccruals"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("costCategory");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "costCategory"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseOrderQuantity");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "purchaseOrderQuantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseOrderAmount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "purchaseOrderAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseOrderQuantityDiff");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("receiptQuantity");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "receiptQuantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("receiptAmount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "receiptAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("receiptQuantityDiff");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "receiptQuantityDiff"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("pricingGroup");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "pricingGroup"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("minimumQuantityUnits");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "minimumQuantityUnits"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vsoePrice");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "vsoePrice"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vsoeSopGroup");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "vsoeSopGroup"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vsoeDeferral");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "vsoeDeferral"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "VsoeDeferral"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vsoePermitDiscount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "vsoePermitDiscount"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vsoeDelivered");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "vsoeDelivered"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemRevenueCategory");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "itemRevenueCategory"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("createJob");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "createJob"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("matrixItemNameTemplate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "matrixItemNameTemplate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeDisplayName");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "storeDisplayName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeDisplayThumbnail");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "storeDisplayThumbnail"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeDisplayImage");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "storeDisplayImage"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeDescription");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "storeDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeDetailedDescription");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "storeDetailedDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeItemTemplate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "storeItemTemplate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("pageTitle");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "pageTitle"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("urlComponent");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "urlComponent"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("metaTagHtml");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "metaTagHtml"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("excludeFromSitemap");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "excludeFromSitemap"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("sitemapPriority");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "sitemapPriority"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "SitemapPriority"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("searchKeywords");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "searchKeywords"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isDonationItem");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isDonationItem"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("showDefaultDonationAmount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "showDefaultDonationAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("maxDonationAmount");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "maxDonationAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dontShowPrice");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "dontShowPrice"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("noPriceMessage");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "noPriceMessage"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("outOfStockMessage");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "outOfStockMessage"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("onSpecial");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "onSpecial"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("outOfStockBehavior");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "outOfStockBehavior"));
      elemField.setXmlType(new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("relatedItemsDescription");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "relatedItemsDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("specialsDescription");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "specialsDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemTaskTemplatesList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "itemTaskTemplatesList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServiceItemTaskTemplatesList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("featuredDescription");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "featuredDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customForm");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "customForm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemId");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "itemId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("upcCode");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "upcCode"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("displayName");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "displayName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vendorName");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "vendorName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("parent");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "parent"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isOnline");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isOnline"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isGcoCompliant");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isGcoCompliant"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("offerSupport");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "offerSupport"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isInactive");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isInactive"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("availableToPartners");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "availableToPartners"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("department");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "department"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_class");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "class"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiaryList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "subsidiaryList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRefList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("currency");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "currency"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billingRatesMatrix");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "billingRatesMatrix"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingRatesMatrix"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountingBookDetailList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "accountingBookDetailList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountingBookDetailList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemOptionsList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "itemOptionsList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemOptionsList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("matrixOptionList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "matrixOptionList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "MatrixOptionList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemVendorList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "itemVendorList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemVendorList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("pricingMatrix");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "pricingMatrix"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PricingMatrix"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseTaxCode");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "purchaseTaxCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("rate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "rate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("salesTaxCode");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "salesTaxCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("siteCategoryList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "siteCategoryList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SiteCategoryList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("translationsList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "translationsList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TranslationList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vendor");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "vendor"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("presentationItemList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "presentationItemList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PresentationItemList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
