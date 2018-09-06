package com.netsuite.suitetalk.proxy.v2018_1.platform;

import com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling.*;
import com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.documents.filecabinet.*;
import com.netsuite.suitetalk.proxy.v2018_1.documents.filecabinet.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.general.communication.*;
import com.netsuite.suitetalk.proxy.v2018_1.general.communication.types.MessageMessageType;
import com.netsuite.suitetalk.proxy.v2018_1.general.communication.types.NoteDirection;
import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.CurrencyRate;
import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.SiteCategory;
import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.employees.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.employees.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.marketing.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.marketing.CampaignResponse;
import com.netsuite.suitetalk.proxy.v2018_1.lists.marketing.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.relationships.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.relationships.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.supplychain.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.supplychain.types.ManufacturingLagType;
import com.netsuite.suitetalk.proxy.v2018_1.lists.supplychain.types.ManufacturingOperationTaskPredecessorPredecessorType;
import com.netsuite.suitetalk.proxy.v2018_1.lists.supplychain.types.ManufacturingOperationTaskStatus;
import com.netsuite.suitetalk.proxy.v2018_1.lists.support.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.support.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.lists.website.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomerSalesTeam;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.types.FaultCodeType;
import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.types.StatusDetailCodeType;
import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.types.StatusDetailType;
import com.netsuite.suitetalk.proxy.v2018_1.platform.messages.*;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.*;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.bank.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.customers.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.customers.types.ChargeStage;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.customers.types.ChargeUse;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.customers.types.ReturnAuthorizationOrderStatus;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.demandplanning.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.demandplanning.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.employees.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.employees.types.TimeBillTimeType;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.financial.Budget;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.financial.BudgetSearch;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.financial.BudgetSearchAdvanced;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.financial.BudgetSearchRow;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.financial.types.BudgetBudgetType;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.general.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.inventory.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.inventory.types.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases.types.InboundShipmentShipmentStatus;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases.types.PurchaseOrderOrderStatus;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases.types.TransactionBillVarianceStatus;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases.types.VendorReturnAuthorizationOrderStatus;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.sales.*;
import com.netsuite.suitetalk.proxy.v2018_1.transactions.sales.types.*;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.FaultDesc;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.ser.*;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.encoding.SerializerFactory;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Vector;

public class NetSuiteBindingStub extends Stub implements NetSuitePortType {
   private Vector cachedSerClasses;
   private Vector cachedSerQNames;
   private Vector cachedSerFactories;
   private Vector cachedDeserFactories;
   static OperationDesc[] _operations = new OperationDesc[46];

   private static void _initOperationDesc1() {
      OperationDesc oper = new OperationDesc();
      oper.setName("login");
      ParameterDesc param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "passport"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Passport"), Passport.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse"));
      oper.setReturnClass(SessionResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "sessionResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidAccountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidAccountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidAccountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidVersionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidVersionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidVersionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[0] = oper;
      oper = new OperationDesc();
      oper.setName("ssoLogin");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ssoPassport"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SsoPassport"), SsoPassport.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse"));
      oper.setReturnClass(SessionResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "sessionResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidAccountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidAccountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidAccountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidVersionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidVersionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidVersionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[1] = oper;
      oper = new OperationDesc();
      oper.setName("mapSso");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ssoCredentials"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SsoCredentials"), SsoCredentials.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse"));
      oper.setReturnClass(SessionResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "sessionResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidAccountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidAccountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidAccountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidVersionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidVersionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidVersionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[2] = oper;
      oper = new OperationDesc();
      oper.setName("changePassword");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "changePassword"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ChangePassword"), ChangePassword.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse"));
      oper.setReturnClass(SessionResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "sessionResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidAccountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidAccountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidAccountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidVersionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidVersionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidVersionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[3] = oper;
      oper = new OperationDesc();
      oper.setName("changeEmail");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "changeEmail"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ChangeEmail"), ChangeEmail.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse"));
      oper.setReturnClass(SessionResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "sessionResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidAccountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidAccountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidAccountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidVersionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidVersionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidVersionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[4] = oper;
      oper = new OperationDesc();
      oper.setName("logout");
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse"));
      oper.setReturnClass(SessionResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "sessionResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[5] = oper;
      oper = new OperationDesc();
      oper.setName("add");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      oper.setReturnClass(WriteResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[6] = oper;
      oper = new OperationDesc();
      oper.setName("delete");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "baseRef"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"), BaseRef.class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "deletionReason"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletionReason"), DeletionReason.class, false, false);
      param.setOmittable(true);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      oper.setReturnClass(WriteResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[7] = oper;
      oper = new OperationDesc();
      oper.setName("search");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "searchRecord"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRecord"), SearchRecord.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchResult"));
      oper.setReturnClass(SearchResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[8] = oper;
      oper = new OperationDesc();
      oper.setName("searchMore");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "pageIndex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchResult"));
      oper.setReturnClass(SearchResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[9] = oper;
   }

   private static void _initOperationDesc2() {
      OperationDesc oper = new OperationDesc();
      oper.setName("searchMoreWithId");
      ParameterDesc param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "searchId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "pageIndex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchResult"));
      oper.setReturnClass(SearchResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[10] = oper;
      oper = new OperationDesc();
      oper.setName("searchNext");
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchResult"));
      oper.setReturnClass(SearchResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[11] = oper;
      oper = new OperationDesc();
      oper.setName("update");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      oper.setReturnClass(WriteResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[12] = oper;
      oper = new OperationDesc();
      oper.setName("upsert");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      oper.setReturnClass(WriteResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[13] = oper;
      oper = new OperationDesc();
      oper.setName("addList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList"));
      oper.setReturnClass(WriteResponseList.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponseList"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[14] = oper;
      oper = new OperationDesc();
      oper.setName("deleteList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "baseRef"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"), BaseRef[].class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "deletionReason"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletionReason"), DeletionReason.class, false, false);
      param.setOmittable(true);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList"));
      oper.setReturnClass(WriteResponseList.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponseList"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[15] = oper;
      oper = new OperationDesc();
      oper.setName("updateList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList"));
      oper.setReturnClass(WriteResponseList.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponseList"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[16] = oper;
      oper = new OperationDesc();
      oper.setName("upsertList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList"));
      oper.setReturnClass(WriteResponseList.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponseList"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[17] = oper;
      oper = new OperationDesc();
      oper.setName("get");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "baseRef"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"), BaseRef.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponse"));
      oper.setReturnClass(ReadResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "readResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[18] = oper;
      oper = new OperationDesc();
      oper.setName("getList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "baseRef"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"), BaseRef[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponseList"));
      oper.setReturnClass(ReadResponseList.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "readResponseList"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[19] = oper;
   }

   private static void _initOperationDesc3() {
      OperationDesc oper = new OperationDesc();
      oper.setName("getAll");
      ParameterDesc param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetAllRecord"), GetAllRecord.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetAllResult"));
      oper.setReturnClass(GetAllResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getAllResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[20] = oper;
      oper = new OperationDesc();
      oper.setName("getSavedSearch");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSavedSearchRecord"), GetSavedSearchRecord.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSavedSearchResult"));
      oper.setReturnClass(GetSavedSearchResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getSavedSearchResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[21] = oper;
      oper = new OperationDesc();
      oper.setName("getCustomizationId");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "customizationType"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomizationType"), CustomizationType.class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "includeInactives"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.TYPE, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetCustomizationIdResult"));
      oper.setReturnClass(GetCustomizationIdResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getCustomizationIdResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[22] = oper;
      oper = new OperationDesc();
      oper.setName("initialize");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "initializeRecord"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRecord"), InitializeRecord.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponse"));
      oper.setReturnClass(ReadResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "readResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[23] = oper;
      oper = new OperationDesc();
      oper.setName("initializeList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "initializeRecord"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRecord"), InitializeRecord[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponseList"));
      oper.setReturnClass(ReadResponseList.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "readResponseList"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[24] = oper;
      oper = new OperationDesc();
      oper.setName("getSelectValue");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "fieldDescription"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectValueFieldDescription"), GetSelectValueFieldDescription.class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "pageIndex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectValueResult"));
      oper.setReturnClass(GetSelectValueResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getSelectValueResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[25] = oper;
      oper = new OperationDesc();
      oper.setName("getItemAvailability");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "itemAvailabilityFilter"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ItemAvailabilityFilter"), ItemAvailabilityFilter.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetItemAvailabilityResult"));
      oper.setReturnClass(GetItemAvailabilityResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getItemAvailabilityResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[26] = oper;
      oper = new OperationDesc();
      oper.setName("getBudgetExchangeRate");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "budgetExchangeRateFilter"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BudgetExchangeRateFilter"), BudgetExchangeRateFilter.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetBudgetExchangeRateResult"));
      oper.setReturnClass(GetBudgetExchangeRateResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getBudgetExchangeRateResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[27] = oper;
      oper = new OperationDesc();
      oper.setName("getCurrencyRate");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "currencyRateFilter"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CurrencyRateFilter"), CurrencyRateFilter.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetCurrencyRateResult"));
      oper.setReturnClass(GetCurrencyRateResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getCurrencyRateResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[28] = oper;
      oper = new OperationDesc();
      oper.setName("getDataCenterUrls");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "account"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDataCenterUrlsResult"));
      oper.setReturnClass(GetDataCenterUrlsResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getDataCenterUrlsResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[29] = oper;
   }

   private static void _initOperationDesc4() {
      OperationDesc oper = new OperationDesc();
      oper.setName("getPostingTransactionSummary");
      ParameterDesc param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "fields"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "PostingTransactionSummaryField"), PostingTransactionSummaryField.class, false, false);
      param.setOmittable(true);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "filters"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "PostingTransactionSummaryFilter"), PostingTransactionSummaryFilter.class, false, false);
      param.setOmittable(true);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "pageIndex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "operationId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
      param.setOmittable(true);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetPostingTransactionSummaryResult"));
      oper.setReturnClass(GetPostingTransactionSummaryResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getPostingTransactionSummaryResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[30] = oper;
      oper = new OperationDesc();
      oper.setName("getServerTime");
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetServerTimeResult"));
      oper.setReturnClass(GetServerTimeResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getServerTimeResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[31] = oper;
      oper = new OperationDesc();
      oper.setName("attach");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "attachReference"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AttachReference"), AttachReference.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      oper.setReturnClass(WriteResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[32] = oper;
      oper = new OperationDesc();
      oper.setName("detach");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "detachReference"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DetachReference"), DetachReference.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      oper.setReturnClass(WriteResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[33] = oper;
      oper = new OperationDesc();
      oper.setName("updateInviteeStatus");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "updateInviteeStatusReference"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "UpdateInviteeStatusReference"), UpdateInviteeStatusReference.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse"));
      oper.setReturnClass(WriteResponse.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponse"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[34] = oper;
      oper = new OperationDesc();
      oper.setName("updateInviteeStatusList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "updateInviteeStatusReference"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "UpdateInviteeStatusReference"), UpdateInviteeStatusReference[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList"));
      oper.setReturnClass(WriteResponseList.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "writeResponseList"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[35] = oper;
      oper = new OperationDesc();
      oper.setName("asyncAddList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[36] = oper;
      oper = new OperationDesc();
      oper.setName("asyncUpdateList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[37] = oper;
      oper = new OperationDesc();
      oper.setName("asyncUpsertList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "record"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"), Record[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[38] = oper;
      oper = new OperationDesc();
      oper.setName("asyncDeleteList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "baseRef"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"), BaseRef[].class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "deletionReason"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletionReason"), DeletionReason.class, false, false);
      param.setOmittable(true);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[39] = oper;
   }

   private static void _initOperationDesc5() {
      OperationDesc oper = new OperationDesc();
      oper.setName("asyncGetList");
      ParameterDesc param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "baseRef"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"), BaseRef[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[40] = oper;
      oper = new OperationDesc();
      oper.setName("asyncInitializeList");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "initializeRecord"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRecord"), InitializeRecord[].class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[41] = oper;
      oper = new OperationDesc();
      oper.setName("asyncSearch");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "searchRecord"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRecord"), SearchRecord.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[42] = oper;
      oper = new OperationDesc();
      oper.setName("getAsyncResult");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "jobId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "pageIndex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncResult"));
      oper.setReturnClass(AsyncResult.class);
      oper.setReturnQName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "asyncFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.AsyncFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "AsyncFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[43] = oper;
      oper = new OperationDesc();
      oper.setName("checkAsyncStatus");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "jobId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
      oper.setReturnClass(AsyncStatusResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "asyncStatusResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "asyncFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.AsyncFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "AsyncFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[44] = oper;
      oper = new OperationDesc();
      oper.setName("getDeleted");
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getDeletedFilter"), (byte)1, new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDeletedFilter"), GetDeletedFilter.class, false, false);
      oper.addParameter(param);
      param = new ParameterDesc(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "pageIndex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
      oper.addParameter(param);
      oper.setReturnType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDeletedResult"));
      oper.setReturnClass(GetDeletedResult.class);
      oper.setReturnQName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "getDeletedResult"));
      oper.setStyle(Style.WRAPPED);
      oper.setUse(Use.LITERAL);
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "insufficientPermissionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InsufficientPermissionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidCredentialsFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidCredentialsFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededConcurrentRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededConcurrentRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRecordCountFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRecordCountFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestSizeFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestSizeFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededRequestLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededRequestLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "exceededUsageLimitFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.ExceededUsageLimitFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "unexpectedErrorFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.UnexpectedErrorFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault"), true));
      oper.addFault(new FaultDesc(new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "invalidSessionFault"), "com.netsuite.suitetalk.proxy.v2018_1.platform.faults.InvalidSessionFault", new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault"), true));
      _operations[45] = oper;
   }

   public NetSuiteBindingStub() throws AxisFault {
      this((Service)null);
   }

   public NetSuiteBindingStub(URL endpointURL, Service service) throws AxisFault {
      this(service);
      super.cachedEndpoint = endpointURL;
   }

   public NetSuiteBindingStub(Service service) throws AxisFault {
      super();
      this.cachedSerClasses = new Vector();
      this.cachedSerQNames = new Vector();
      this.cachedSerFactories = new Vector();
      this.cachedDeserFactories = new Vector();
      if (service == null) {
         super.service = new org.apache.axis.client.Service();
      } else {
         super.service = service;
      }

      ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      this.addBindings0();
      this.addBindings1();
      this.addBindings2();
      this.addBindings3();
      this.addBindings4();
      this.addBindings5();
      this.addBindings6();
      this.addBindings7();
      this.addBindings8();
      this.addBindings9();
      this.addBindings10();
      this.addBindings11();
      this.addBindings12();
      this.addBindings13();
      this.addBindings14();
      this.addBindings15();
   }

   private void addBindings0() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Account");
      this.cachedSerQNames.add(qName);
      Class cls = Account.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountingPeriod");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountingPeriodFiscalCalendars");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriodFiscalCalendars.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountingPeriodFiscalCalendarsList");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriodFiscalCalendarsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountingPeriodSearch");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriodSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountingPeriodSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriodSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountingPeriodSearchRow");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriodSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountLocalizations");
      this.cachedSerQNames.add(qName);
      cls = AccountLocalizations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountLocalizationsList");
      this.cachedSerQNames.add(qName);
      cls = AccountLocalizationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountSearch");
      this.cachedSerQNames.add(qName);
      cls = AccountSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = AccountSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AccountSearchRow");
      this.cachedSerQNames.add(qName);
      cls = AccountSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AssemblyItem");
      this.cachedSerQNames.add(qName);
      cls = AssemblyItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AssemblyItemBillOfMaterials");
      this.cachedSerQNames.add(qName);
      cls = AssemblyItemBillOfMaterials.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "AssemblyItemBillOfMaterialsList");
      this.cachedSerQNames.add(qName);
      cls = AssemblyItemBillOfMaterialsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingRates");
      this.cachedSerQNames.add(qName);
      cls = BillingRates.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingRatesMatrix");
      this.cachedSerQNames.add(qName);
      cls = BillingRatesMatrix.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingSchedule");
      this.cachedSerQNames.add(qName);
      cls = BillingSchedule.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleMilestone");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleMilestone.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleMilestoneList");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleMilestoneList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleRecurrence");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleRecurrence.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceList");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleRecurrenceList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleSearch");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleSearchRow");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Bin");
      this.cachedSerQNames.add(qName);
      cls = Bin.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BinSearch");
      this.cachedSerQNames.add(qName);
      cls = BinSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BinSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = BinSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BinSearchRow");
      this.cachedSerQNames.add(qName);
      cls = BinSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "BudgetCategory");
      this.cachedSerQNames.add(qName);
      cls = BudgetCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Classification");
      this.cachedSerQNames.add(qName);
      cls = Classification.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ClassificationSearch");
      this.cachedSerQNames.add(qName);
      cls = ClassificationSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ClassificationSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ClassificationSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ClassificationSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ClassificationSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ClassTranslation");
      this.cachedSerQNames.add(qName);
      cls = ClassTranslation.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ClassTranslationList");
      this.cachedSerQNames.add(qName);
      cls = ClassTranslationList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRate");
      this.cachedSerQNames.add(qName);
      cls = ConsolidatedExchangeRate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRateSearch");
      this.cachedSerQNames.add(qName);
      cls = ConsolidatedExchangeRateSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRateSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ConsolidatedExchangeRateSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ConsolidatedExchangeRateSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactCategory");
      this.cachedSerQNames.add(qName);
      cls = ContactCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = ContactCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ContactCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = ContactCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactRole");
      this.cachedSerQNames.add(qName);
      cls = ContactRole.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactRoleSearch");
      this.cachedSerQNames.add(qName);
      cls = ContactRoleSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactRoleSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ContactRoleSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ContactRoleSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ContactRoleSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CostCategory");
      this.cachedSerQNames.add(qName);
      cls = CostCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CostCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = CostCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CostCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CostCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CostCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = CostCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Currency");
      this.cachedSerQNames.add(qName);
      cls = Currency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CurrencyRate");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CurrencyRateSearch");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRateSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CurrencyRateSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRateSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CurrencyRateSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRateSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerCategory");
      this.cachedSerQNames.add(qName);
      cls = CustomerCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = CustomerCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CustomerCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = CustomerCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerMessage");
      this.cachedSerQNames.add(qName);
      cls = CustomerMessage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerMessageSearch");
      this.cachedSerQNames.add(qName);
      cls = CustomerMessageSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerMessageSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CustomerMessageSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "CustomerMessageSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CustomerMessageSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Department");
      this.cachedSerQNames.add(qName);
      cls = Department.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "DepartmentSearch");
      this.cachedSerQNames.add(qName);
      cls = DepartmentSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "DepartmentSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = DepartmentSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "DepartmentSearchRow");
      this.cachedSerQNames.add(qName);
      cls = DepartmentSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "DescriptionItem");
      this.cachedSerQNames.add(qName);
      cls = DescriptionItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "DiscountItem");
      this.cachedSerQNames.add(qName);
      cls = DiscountItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "DownloadItem");
      this.cachedSerQNames.add(qName);
      cls = DownloadItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ExpenseCategory");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ExpenseCategoryRates");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategoryRates.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ExpenseCategoryRatesList");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategoryRatesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ExpenseCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ExpenseCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ExpenseCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "FairValuePrice");
      this.cachedSerQNames.add(qName);
      cls = FairValuePrice.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "FairValuePriceSearch");
      this.cachedSerQNames.add(qName);
      cls = FairValuePriceSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "FairValuePriceSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = FairValuePriceSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "FairValuePriceSearchRow");
      this.cachedSerQNames.add(qName);
      cls = FairValuePriceSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificate");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificateItem");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodes");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateItemAuthCodes.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodesList");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateItemAuthCodesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificateSearch");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificateSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificateSearchRow");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GlobalAccountMapping");
      this.cachedSerQNames.add(qName);
      cls = GlobalAccountMapping.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GlobalAccountMappingSearch");
      this.cachedSerQNames.add(qName);
      cls = GlobalAccountMappingSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GlobalAccountMappingSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = GlobalAccountMappingSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GlobalAccountMappingSearchRow");
      this.cachedSerQNames.add(qName);
      cls = GlobalAccountMappingSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryItem");
      this.cachedSerQNames.add(qName);
      cls = InventoryItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryItemBinNumber");
      this.cachedSerQNames.add(qName);
      cls = InventoryItemBinNumber.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryItemBinNumberList");
      this.cachedSerQNames.add(qName);
      cls = InventoryItemBinNumberList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryItemLocations");
      this.cachedSerQNames.add(qName);
      cls = InventoryItemLocations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryItemLocationsList");
      this.cachedSerQNames.add(qName);
      cls = InventoryItemLocationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryNumber");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumber.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryNumberLocations");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberLocations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings1() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryNumberLocationsList");
      this.cachedSerQNames.add(qName);
      Class cls = InventoryNumberLocationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryNumberSearch");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryNumberSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryNumberSearchRow");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountingBookDetail");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountingBookDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountingBookDetailList");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountingBookDetailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountMapping");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountMapping.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountMappingSearch");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountMappingSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountMappingSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountMappingSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountMappingSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountMappingSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemGroup");
      this.cachedSerQNames.add(qName);
      cls = ItemGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemMember");
      this.cachedSerQNames.add(qName);
      cls = ItemMember.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemMemberList");
      this.cachedSerQNames.add(qName);
      cls = ItemMemberList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemOptionsList");
      this.cachedSerQNames.add(qName);
      cls = ItemOptionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemRevision");
      this.cachedSerQNames.add(qName);
      cls = ItemRevision.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemRevisionSearch");
      this.cachedSerQNames.add(qName);
      cls = ItemRevisionSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemRevisionSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ItemRevisionSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemRevisionSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ItemRevisionSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemSearch");
      this.cachedSerQNames.add(qName);
      cls = ItemSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ItemSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ItemSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemVendor");
      this.cachedSerQNames.add(qName);
      cls = ItemVendor.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemVendorList");
      this.cachedSerQNames.add(qName);
      cls = ItemVendorList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "KitItem");
      this.cachedSerQNames.add(qName);
      cls = KitItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LeadSource");
      this.cachedSerQNames.add(qName);
      cls = LeadSource.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Location");
      this.cachedSerQNames.add(qName);
      cls = Location.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationBusinessHours");
      this.cachedSerQNames.add(qName);
      cls = LocationBusinessHours.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationBusinessHoursList");
      this.cachedSerQNames.add(qName);
      cls = LocationBusinessHoursList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationRegions");
      this.cachedSerQNames.add(qName);
      cls = LocationRegions.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationRegionsList");
      this.cachedSerQNames.add(qName);
      cls = LocationRegionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationSearch");
      this.cachedSerQNames.add(qName);
      cls = LocationSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = LocationSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationSearchRow");
      this.cachedSerQNames.add(qName);
      cls = LocationSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedAssemblyItem");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedAssemblyItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedAssemblyItemBillOfMaterials");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedAssemblyItemBillOfMaterials.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedAssemblyItemBillOfMaterialsList");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedAssemblyItemBillOfMaterialsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedInventoryItem");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedInventoryItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedInventoryItemLocations");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedInventoryItemLocations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedInventoryItemLocationsList");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedInventoryItemLocationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedInventoryItemNumbers");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedInventoryItemNumbers.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LotNumberedInventoryItemNumbersList");
      this.cachedSerQNames.add(qName);
      cls = LotNumberedInventoryItemNumbersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "MarkupItem");
      this.cachedSerQNames.add(qName);
      cls = MarkupItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "MatrixOptionList");
      this.cachedSerQNames.add(qName);
      cls = MatrixOptionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Nexus");
      this.cachedSerQNames.add(qName);
      cls = Nexus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NexusSearch");
      this.cachedSerQNames.add(qName);
      cls = NexusSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NexusSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = NexusSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NexusSearchRow");
      this.cachedSerQNames.add(qName);
      cls = NexusSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NonInventoryPurchaseItem");
      this.cachedSerQNames.add(qName);
      cls = NonInventoryPurchaseItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NonInventoryResaleItem");
      this.cachedSerQNames.add(qName);
      cls = NonInventoryResaleItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NonInventorySaleItem");
      this.cachedSerQNames.add(qName);
      cls = NonInventorySaleItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NoteType");
      this.cachedSerQNames.add(qName);
      cls = NoteType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NoteTypeSearch");
      this.cachedSerQNames.add(qName);
      cls = NoteTypeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NoteTypeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = NoteTypeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "NoteTypeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = NoteTypeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "OtherChargePurchaseItem");
      this.cachedSerQNames.add(qName);
      cls = OtherChargePurchaseItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "OtherChargeResaleItem");
      this.cachedSerQNames.add(qName);
      cls = OtherChargeResaleItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "OtherChargeSaleItem");
      this.cachedSerQNames.add(qName);
      cls = OtherChargeSaleItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "OtherNameCategory");
      this.cachedSerQNames.add(qName);
      cls = OtherNameCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "OtherNameCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = OtherNameCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "OtherNameCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = OtherNameCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "OtherNameCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = OtherNameCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PartnerCategory");
      this.cachedSerQNames.add(qName);
      cls = PartnerCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PartnerCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = PartnerCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PartnerCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PartnerCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PartnerCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = PartnerCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentItem");
      this.cachedSerQNames.add(qName);
      cls = PaymentItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentMethod");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentMethodSearch");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethodSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentMethodSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethodSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentMethodSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethodSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentMethodVisuals");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethodVisuals.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentMethodVisualsList");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethodVisualsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PresentationItemList");
      this.cachedSerQNames.add(qName);
      cls = PresentationItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Price");
      this.cachedSerQNames.add(qName);
      cls = Price.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PriceLevel");
      this.cachedSerQNames.add(qName);
      cls = PriceLevel.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PriceLevelSearch");
      this.cachedSerQNames.add(qName);
      cls = PriceLevelSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PriceLevelSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PriceLevelSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PriceLevelSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PriceLevelSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PriceList");
      this.cachedSerQNames.add(qName);
      cls = PriceList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Pricing");
      this.cachedSerQNames.add(qName);
      cls = Pricing.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PricingGroup");
      this.cachedSerQNames.add(qName);
      cls = PricingGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PricingGroupSearch");
      this.cachedSerQNames.add(qName);
      cls = PricingGroupSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PricingGroupSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PricingGroupSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PricingGroupSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PricingGroupSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PricingMatrix");
      this.cachedSerQNames.add(qName);
      cls = PricingMatrix.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ProductFeedList");
      this.cachedSerQNames.add(qName);
      cls = ProductFeedList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Rate");
      this.cachedSerQNames.add(qName);
      cls = Rate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RateList");
      this.cachedSerQNames.add(qName);
      cls = RateList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecSchedule");
      this.cachedSerQNames.add(qName);
      cls = RevRecSchedule.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrence");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleRecurrence.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceList");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleRecurrenceList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleSearch");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleSearchRow");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecTemplate");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecTemplateRecurrence");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplateRecurrence.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecTemplateRecurrenceList");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplateRecurrenceList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecTemplateSearch");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplateSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecTemplateSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplateSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RevRecTemplateSearchRow");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplateSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings2() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesRole");
      this.cachedSerQNames.add(qName);
      Class cls = SalesRole.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesRoleSearch");
      this.cachedSerQNames.add(qName);
      cls = SalesRoleSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesRoleSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = SalesRoleSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesRoleSearchRow");
      this.cachedSerQNames.add(qName);
      cls = SalesRoleSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesTaxItem");
      this.cachedSerQNames.add(qName);
      cls = SalesTaxItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesTaxItemSearch");
      this.cachedSerQNames.add(qName);
      cls = SalesTaxItemSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesTaxItemSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = SalesTaxItemSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SalesTaxItemSearchRow");
      this.cachedSerQNames.add(qName);
      cls = SalesTaxItemSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedAssemblyItem");
      this.cachedSerQNames.add(qName);
      cls = SerializedAssemblyItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedAssemblyItemBillOfMaterials");
      this.cachedSerQNames.add(qName);
      cls = SerializedAssemblyItemBillOfMaterials.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedAssemblyItemBillOfMaterialsList");
      this.cachedSerQNames.add(qName);
      cls = SerializedAssemblyItemBillOfMaterialsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedInventoryItem");
      this.cachedSerQNames.add(qName);
      cls = SerializedInventoryItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedInventoryItemLocations");
      this.cachedSerQNames.add(qName);
      cls = SerializedInventoryItemLocations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedInventoryItemLocationsList");
      this.cachedSerQNames.add(qName);
      cls = SerializedInventoryItemLocationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedInventoryItemNumbers");
      this.cachedSerQNames.add(qName);
      cls = SerializedInventoryItemNumbers.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedInventoryItemNumbersList");
      this.cachedSerQNames.add(qName);
      cls = SerializedInventoryItemNumbersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServiceItemTaskTemplates");
      this.cachedSerQNames.add(qName);
      cls = ServiceItemTaskTemplates.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServiceItemTaskTemplatesList");
      this.cachedSerQNames.add(qName);
      cls = ServiceItemTaskTemplatesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServicePurchaseItem");
      this.cachedSerQNames.add(qName);
      cls = ServicePurchaseItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServiceResaleItem");
      this.cachedSerQNames.add(qName);
      cls = ServiceResaleItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServiceSaleItem");
      this.cachedSerQNames.add(qName);
      cls = ServiceSaleItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SiteCategory");
      this.cachedSerQNames.add(qName);
      cls = SiteCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SiteCategoryList");
      this.cachedSerQNames.add(qName);
      cls = SiteCategoryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "State");
      this.cachedSerQNames.add(qName);
      cls = State.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Subsidiary");
      this.cachedSerQNames.add(qName);
      cls = Subsidiary.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryAccountingBookDetail");
      this.cachedSerQNames.add(qName);
      cls = SubsidiaryAccountingBookDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryAccountingBookDetailList");
      this.cachedSerQNames.add(qName);
      cls = SubsidiaryAccountingBookDetailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryNexus");
      this.cachedSerQNames.add(qName);
      cls = SubsidiaryNexus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryNexusList");
      this.cachedSerQNames.add(qName);
      cls = SubsidiaryNexusList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiarySearch");
      this.cachedSerQNames.add(qName);
      cls = SubsidiarySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiarySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = SubsidiarySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiarySearchRow");
      this.cachedSerQNames.add(qName);
      cls = SubsidiarySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryTaxRegistration");
      this.cachedSerQNames.add(qName);
      cls = SubsidiaryTaxRegistration.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryTaxRegistrationList");
      this.cachedSerQNames.add(qName);
      cls = SubsidiaryTaxRegistrationList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubtotalItem");
      this.cachedSerQNames.add(qName);
      cls = SubtotalItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxAcct");
      this.cachedSerQNames.add(qName);
      cls = TaxAcct.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxGroup");
      this.cachedSerQNames.add(qName);
      cls = TaxGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxGroupSearch");
      this.cachedSerQNames.add(qName);
      cls = TaxGroupSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxGroupSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TaxGroupSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxGroupSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TaxGroupSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxGroupTaxItem");
      this.cachedSerQNames.add(qName);
      cls = TaxGroupTaxItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxGroupTaxItemList");
      this.cachedSerQNames.add(qName);
      cls = TaxGroupTaxItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxType");
      this.cachedSerQNames.add(qName);
      cls = TaxType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeNexusAccounts");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeNexusAccounts.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeNexusAccountsList");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeNexusAccountsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeNexusesTax");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeNexusesTax.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeNexusesTaxList");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeNexusesTaxList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeSearch");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TaxTypeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Term");
      this.cachedSerQNames.add(qName);
      cls = Term.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TermSearch");
      this.cachedSerQNames.add(qName);
      cls = TermSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TermSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TermSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TermSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TermSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Translation");
      this.cachedSerQNames.add(qName);
      cls = Translation.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TranslationList");
      this.cachedSerQNames.add(qName);
      cls = TranslationList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "UnitsType");
      this.cachedSerQNames.add(qName);
      cls = UnitsType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "UnitsTypeSearch");
      this.cachedSerQNames.add(qName);
      cls = UnitsTypeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "UnitsTypeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = UnitsTypeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "UnitsTypeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = UnitsTypeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "UnitsTypeUom");
      this.cachedSerQNames.add(qName);
      cls = UnitsTypeUom.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "UnitsTypeUomList");
      this.cachedSerQNames.add(qName);
      cls = UnitsTypeUomList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "VendorCategory");
      this.cachedSerQNames.add(qName);
      cls = VendorCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "VendorCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = VendorCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "VendorCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = VendorCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "VendorCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = VendorCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "WinLossReason");
      this.cachedSerQNames.add(qName);
      cls = WinLossReason.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "WinLossReasonSearch");
      this.cachedSerQNames.add(qName);
      cls = WinLossReasonSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "WinLossReasonSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = WinLossReasonSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "WinLossReasonSearchRow");
      this.cachedSerQNames.add(qName);
      cls = WinLossReasonSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "Check");
      this.cachedSerQNames.add(qName);
      cls = Check.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "CheckExpense");
      this.cachedSerQNames.add(qName);
      cls = CheckExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "CheckExpenseList");
      this.cachedSerQNames.add(qName);
      cls = CheckExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "CheckItem");
      this.cachedSerQNames.add(qName);
      cls = CheckItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "CheckItemList");
      this.cachedSerQNames.add(qName);
      cls = CheckItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "CheckLandedCostList");
      this.cachedSerQNames.add(qName);
      cls = CheckLandedCostList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "Deposit");
      this.cachedSerQNames.add(qName);
      cls = Deposit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositCashBack");
      this.cachedSerQNames.add(qName);
      cls = DepositCashBack.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositCashBackList");
      this.cachedSerQNames.add(qName);
      cls = DepositCashBackList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositOther");
      this.cachedSerQNames.add(qName);
      cls = DepositOther.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositOtherList");
      this.cachedSerQNames.add(qName);
      cls = DepositOtherList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositPayment");
      this.cachedSerQNames.add(qName);
      cls = DepositPayment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositPaymentList");
      this.cachedSerQNames.add(qName);
      cls = DepositPaymentList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingBookDetail");
      this.cachedSerQNames.add(qName);
      cls = AccountingBookDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingBookDetailList");
      this.cachedSerQNames.add(qName);
      cls = AccountingBookDetailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingPeriodSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriodSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = AccountingPeriodSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingTransactionSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = AccountingTransactionSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingTransactionSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = AccountingTransactionSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = AccountSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = AccountSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "Address");
      this.cachedSerQNames.add(qName);
      cls = Address.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AddressSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = AddressSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AddressSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = AddressSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = AssemblyItemBomSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = AssemblyItemBomSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = BillingAccountSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = BillingAccountSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BillingScheduleSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BillingScheduleSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings3() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BinSearchBasic");
      this.cachedSerQNames.add(qName);
      Class cls = BinSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BinSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = BinSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BudgetSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = BudgetSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BudgetSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = BudgetSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CampaignSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CampaignSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CampaignSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ChargeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ChargeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ChargeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ChargeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ClassificationSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ClassificationSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ClassificationSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ClassificationSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ConsolidatedExchangeRateSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ConsolidatedExchangeRateSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ContactCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ContactCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactRoleSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ContactRoleSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactRoleSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ContactRoleSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ContactSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ContactSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CostCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CostCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CostCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CostCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CouponCodeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CouponCodeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CouponCodeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CouponCodeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CurrencyRateSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRateSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CurrencyRateSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRateSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerMessageSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerMessageSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerMessageSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerMessageSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = CustomerSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerStatusSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerStatusSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerStatusSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomerStatusSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomListSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomListSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomListSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomListSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomRecordSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomRecordSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchJoin");
      this.cachedSerQNames.add(qName);
      cls = CustomSearchJoin.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = CustomSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "DepartmentSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = DepartmentSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "DepartmentSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = DepartmentSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = EmployeeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = EmployeeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EntityGroupSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = EntityGroupSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EntityGroupSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = EntityGroupSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EntitySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = EntitySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EntitySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = EntitySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ExpenseCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ExpenseCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ExpenseCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FairValuePriceSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = FairValuePriceSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FairValuePriceSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = FairValuePriceSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FileSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = FileSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FileSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = FileSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FolderSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = FolderSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FolderSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = FolderSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "GiftCertificateSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "GiftCertificateSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = GiftCertificateSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "GlobalAccountMappingSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = GlobalAccountMappingSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "GlobalAccountMappingSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = GlobalAccountMappingSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "GroupMemberSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = GroupMemberSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "HcmJobSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = HcmJobSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "HcmJobSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = HcmJobSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InboundShipmentSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InboundShipmentSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryAssignment");
      this.cachedSerQNames.add(qName);
      cls = InventoryAssignment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryAssignmentList");
      this.cachedSerQNames.add(qName);
      cls = InventoryAssignmentList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryDetail");
      this.cachedSerQNames.add(qName);
      cls = InventoryDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryDetailSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = InventoryDetailSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryDetailSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = InventoryDetailSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryNumberBinSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberBinSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryNumberBinSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberBinSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryNumberSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryNumberSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = InventoryNumberSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "IssueSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = IssueSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "IssueSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = IssueSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemAccountMappingSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountMappingSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemAccountMappingSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountMappingSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemBinNumberSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemBinNumberSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemBinNumberSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemBinNumberSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemDemandPlanSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandPlanSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemDemandPlanSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandPlanSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemRevisionSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemRevisionSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemRevisionSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSupplyPlanSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSupplyPlanSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = JobSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = JobSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobStatusSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = JobStatusSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobStatusSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = JobStatusSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobTypeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = JobTypeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobTypeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = JobTypeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCost");
      this.cachedSerQNames.add(qName);
      cls = LandedCost.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCostData");
      this.cachedSerQNames.add(qName);
      cls = LandedCostData.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCostDataList");
      this.cachedSerQNames.add(qName);
      cls = LandedCostDataList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LandedCostSummary");
      this.cachedSerQNames.add(qName);
      cls = LandedCostSummary.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LocationSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = LocationSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings4() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LocationSearchRowBasic");
      this.cachedSerQNames.add(qName);
      Class cls = LocationSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingCostTemplateSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostTemplateSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingCostTemplateSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostTemplateSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingRoutingSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingRoutingSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = MessageSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MessageSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = MessageSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MseSubsidiarySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = MseSubsidiarySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "MseSubsidiarySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = MseSubsidiarySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NexusSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = NexusSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NexusSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = NexusSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NoteSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = NoteSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NoteSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = NoteSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NoteTypeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = NoteTypeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NoteTypeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = NoteTypeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OpportunitySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = OpportunitySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = OpportunitySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = OriginatingLeadSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = OriginatingLeadSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OtherNameCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = OtherNameCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OtherNameCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = OtherNameCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PartnerCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PartnerCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PartnerCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PartnerCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "Partners");
      this.cachedSerQNames.add(qName);
      cls = Partners.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PartnerSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PartnerSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PartnerSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PaycheckSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PaycheckSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PaycheckSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PaycheckSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PaymentMethodSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethodSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PaymentMethodSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PaymentMethodSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PayrollItemSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PayrollItemSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PayrollItemSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PayrollItemSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PhoneCallSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PresentationItem");
      this.cachedSerQNames.add(qName);
      cls = PresentationItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PriceLevelSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PriceLevelSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PriceLevelSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PriceLevelSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PricingGroupSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PricingGroupSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PricingGroupSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PricingGroupSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PricingSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PricingSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PricingSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PricingSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskAssignmentSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskAssignmentSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PromotionCodeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PromotionCodeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "RecurrenceDowMaskList");
      this.cachedSerQNames.add(qName);
      cls = RecurrenceDowMaskList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocationSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ResourceAllocationSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocationSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "RevRecScheduleSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "RevRecScheduleSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "RevRecTemplateSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplateSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "RevRecTemplateSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = RevRecTemplateSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SalesRoleSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = SalesRoleSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SalesRoleSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = SalesRoleSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SalesTaxItemSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = SalesTaxItemSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SalesTaxItemSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = SalesTaxItemSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SiteCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = SiteCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SiteCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = SiteCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SolutionSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = SolutionSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SolutionSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = SolutionSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SubsidiarySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = SubsidiarySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = SubsidiarySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaskSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TaskSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaskSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TaskSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxDetails");
      this.cachedSerQNames.add(qName);
      cls = TaxDetails.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxDetailSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TaxDetailSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxDetailSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TaxDetailSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxDetailsList");
      this.cachedSerQNames.add(qName);
      cls = TaxDetailsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxGroupSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TaxGroupSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxGroupSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TaxGroupSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxTypeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaxTypeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TaxTypeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TermSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TermSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TermSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TermSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeBillSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TimeBillSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TimeBillSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeEntrySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TimeEntrySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeEntrySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TimeEntrySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeItem");
      this.cachedSerQNames.add(qName);
      cls = TimeItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeSheetSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TimeSheetSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeSheetSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TimeSheetSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TopicSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TopicSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TopicSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TopicSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = TransactionSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = TransactionSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "UnitsTypeSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = UnitsTypeSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "UnitsTypeSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = UnitsTypeSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "UsageSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = UsageSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "UsageSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = UsageSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "VendorCategorySearchBasic");
      this.cachedSerQNames.add(qName);
      cls = VendorCategorySearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "VendorCategorySearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = VendorCategorySearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "VendorSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = VendorSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "VendorSearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = VendorSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "WinLossReasonSearchBasic");
      this.cachedSerQNames.add(qName);
      cls = WinLossReasonSearchBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings5() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:common_2018_1.platform.webservices.netsuite.com", "WinLossReasonSearchRowBasic");
      this.cachedSerQNames.add(qName);
      Class cls = WinLossReasonSearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "Message");
      this.cachedSerQNames.add(qName);
      cls = Message.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "MessageMediaItemList");
      this.cachedSerQNames.add(qName);
      cls = MessageMediaItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "MessageSearch");
      this.cachedSerQNames.add(qName);
      cls = MessageSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "MessageSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = MessageSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "MessageSearchRow");
      this.cachedSerQNames.add(qName);
      cls = MessageSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "Note");
      this.cachedSerQNames.add(qName);
      cls = Note.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "NoteSearch");
      this.cachedSerQNames.add(qName);
      cls = NoteSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "NoteSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = NoteSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:communication_2018_1.general.webservices.netsuite.com", "NoteSearchRow");
      this.cachedSerQNames.add(qName);
      cls = NoteSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AsyncStatusResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncStatusResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AttachBasicReference");
      this.cachedSerQNames.add(qName);
      cls = AttachBasicReference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AttachContactReference");
      this.cachedSerQNames.add(qName);
      cls = AttachContactReference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AttachReference");
      this.cachedSerQNames.add(qName);
      cls = AttachReference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef");
      this.cachedSerQNames.add(qName);
      cls = BaseRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRefList");
      this.cachedSerQNames.add(qName);
      cls = BaseRefList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BooleanCustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = BooleanCustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BudgetExchangeRate");
      this.cachedSerQNames.add(qName);
      cls = BudgetExchangeRate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BudgetExchangeRateFilter");
      this.cachedSerQNames.add(qName);
      cls = BudgetExchangeRateFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BudgetExchangeRateList");
      this.cachedSerQNames.add(qName);
      cls = BudgetExchangeRateList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ChangeEmail");
      this.cachedSerQNames.add(qName);
      cls = ChangeEmail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ChangePassword");
      this.cachedSerQNames.add(qName);
      cls = ChangePassword.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CurrencyRate");
      this.cachedSerQNames.add(qName);
      cls = com.netsuite.suitetalk.proxy.v2018_1.platform.core.CurrencyRate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CurrencyRateFilter");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRateFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CurrencyRateList");
      this.cachedSerQNames.add(qName);
      cls = CurrencyRateList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomizationRef");
      this.cachedSerQNames.add(qName);
      cls = CustomizationRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomizationRefList");
      this.cachedSerQNames.add(qName);
      cls = CustomizationRefList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomizationType");
      this.cachedSerQNames.add(qName);
      cls = CustomizationType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomRecordRef");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomTransactionRef");
      this.cachedSerQNames.add(qName);
      cls = CustomTransactionRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DataCenterUrls");
      this.cachedSerQNames.add(qName);
      cls = DataCenterUrls.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DateCustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = DateCustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletedRecord");
      this.cachedSerQNames.add(qName);
      cls = DeletedRecord.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletedRecordList");
      this.cachedSerQNames.add(qName);
      cls = DeletedRecordList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletionReason");
      this.cachedSerQNames.add(qName);
      cls = DeletionReason.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DetachBasicReference");
      this.cachedSerQNames.add(qName);
      cls = DetachBasicReference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DetachReference");
      this.cachedSerQNames.add(qName);
      cls = DetachReference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DimensionList");
      this.cachedSerQNames.add(qName);
      cls = DimensionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DimensionRef");
      this.cachedSerQNames.add(qName);
      cls = DimensionRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DoubleCustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = DoubleCustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Duration");
      this.cachedSerQNames.add(qName);
      cls = Duration.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetAllRecord");
      this.cachedSerQNames.add(qName);
      cls = GetAllRecord.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetAllResult");
      this.cachedSerQNames.add(qName);
      cls = GetAllResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetBudgetExchangeRateResult");
      this.cachedSerQNames.add(qName);
      cls = GetBudgetExchangeRateResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetCurrencyRateResult");
      this.cachedSerQNames.add(qName);
      cls = GetCurrencyRateResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetCustomizationIdResult");
      this.cachedSerQNames.add(qName);
      cls = GetCustomizationIdResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDataCenterUrlsResult");
      this.cachedSerQNames.add(qName);
      cls = GetDataCenterUrlsResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDeletedFilter");
      this.cachedSerQNames.add(qName);
      cls = GetDeletedFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDeletedResult");
      this.cachedSerQNames.add(qName);
      cls = GetDeletedResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetItemAvailabilityResult");
      this.cachedSerQNames.add(qName);
      cls = GetItemAvailabilityResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetPostingTransactionSummaryResult");
      this.cachedSerQNames.add(qName);
      cls = GetPostingTransactionSummaryResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSavedSearchRecord");
      this.cachedSerQNames.add(qName);
      cls = GetSavedSearchRecord.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSavedSearchResult");
      this.cachedSerQNames.add(qName);
      cls = GetSavedSearchResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValue");
      this.cachedSerQNames.add(qName);
      cls = GetSelectFilterByFieldValue.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValueList");
      this.cachedSerQNames.add(qName);
      cls = GetSelectFilterByFieldValueList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectValueFieldDescription");
      this.cachedSerQNames.add(qName);
      cls = GetSelectValueFieldDescription.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectValueFilter");
      this.cachedSerQNames.add(qName);
      cls = GetSelectValueFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectValueResult");
      this.cachedSerQNames.add(qName);
      cls = GetSelectValueResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetServerTimeResult");
      this.cachedSerQNames.add(qName);
      cls = GetServerTimeResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeAuxRef");
      this.cachedSerQNames.add(qName);
      cls = InitializeAuxRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRecord");
      this.cachedSerQNames.add(qName);
      cls = InitializeRecord.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRef");
      this.cachedSerQNames.add(qName);
      cls = InitializeRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRefList");
      this.cachedSerQNames.add(qName);
      cls = InitializeRefList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ItemAvailability");
      this.cachedSerQNames.add(qName);
      cls = ItemAvailability.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ItemAvailabilityFilter");
      this.cachedSerQNames.add(qName);
      cls = ItemAvailabilityFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ItemAvailabilityList");
      this.cachedSerQNames.add(qName);
      cls = ItemAvailabilityList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ListOrRecordRef");
      this.cachedSerQNames.add(qName);
      cls = ListOrRecordRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "LongCustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = LongCustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "MultiSelectCustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = MultiSelectCustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "NullField");
      this.cachedSerQNames.add(qName);
      cls = NullField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Passport");
      this.cachedSerQNames.add(qName);
      cls = Passport.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "PostingTransactionSummary");
      this.cachedSerQNames.add(qName);
      cls = PostingTransactionSummary.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "PostingTransactionSummaryField");
      this.cachedSerQNames.add(qName);
      cls = PostingTransactionSummaryField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "PostingTransactionSummaryFilter");
      this.cachedSerQNames.add(qName);
      cls = PostingTransactionSummaryFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "PostingTransactionSummaryList");
      this.cachedSerQNames.add(qName);
      cls = PostingTransactionSummaryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record");
      this.cachedSerQNames.add(qName);
      cls = Record.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordList");
      this.cachedSerQNames.add(qName);
      cls = RecordList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef");
      this.cachedSerQNames.add(qName);
      cls = RecordRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRefList");
      this.cachedSerQNames.add(qName);
      cls = RecordRefList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchBooleanCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField");
      this.cachedSerQNames.add(qName);
      cls = SearchBooleanField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnBooleanCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnBooleanField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnCustomFieldList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDateCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnDateCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDateField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnDateField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDoubleCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnDoubleCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDoubleField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnDoubleField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnEnumMultiSelectCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnEnumMultiSelectCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnEnumSelectField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnLongCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnLongCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnLongField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnLongField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnMultiSelectCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnMultiSelectCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnSelectCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnSelectField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnStringCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings6() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField");
      this.cachedSerQNames.add(qName);
      Class cls = SearchColumnStringField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnTextNumberField");
      this.cachedSerQNames.add(qName);
      cls = SearchColumnTextNumberField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchCustomFieldList");
      this.cachedSerQNames.add(qName);
      cls = SearchCustomFieldList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchDateCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField");
      this.cachedSerQNames.add(qName);
      cls = SearchDateField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchDoubleCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField");
      this.cachedSerQNames.add(qName);
      cls = SearchDoubleField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchEnumMultiSelectCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField");
      this.cachedSerQNames.add(qName);
      cls = SearchEnumMultiSelectField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchLongCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchLongCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchLongField");
      this.cachedSerQNames.add(qName);
      cls = SearchLongField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchMultiSelectCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField");
      this.cachedSerQNames.add(qName);
      cls = SearchMultiSelectField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRecord");
      this.cachedSerQNames.add(qName);
      cls = SearchRecord.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRecordBasic");
      this.cachedSerQNames.add(qName);
      cls = SearchRecordBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchResult");
      this.cachedSerQNames.add(qName);
      cls = SearchResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRow");
      this.cachedSerQNames.add(qName);
      cls = SearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRowBasic");
      this.cachedSerQNames.add(qName);
      cls = SearchRowBasic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchRowList");
      this.cachedSerQNames.add(qName);
      cls = SearchRowList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringCustomField");
      this.cachedSerQNames.add(qName);
      cls = SearchStringCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField");
      this.cachedSerQNames.add(qName);
      cls = SearchStringField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchTextNumberField");
      this.cachedSerQNames.add(qName);
      cls = SearchTextNumberField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SelectCustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = SelectCustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SelectDimensionRef");
      this.cachedSerQNames.add(qName);
      cls = SelectDimensionRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SsoCredentials");
      this.cachedSerQNames.add(qName);
      cls = SsoCredentials.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SsoPassport");
      this.cachedSerQNames.add(qName);
      cls = SsoPassport.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status");
      this.cachedSerQNames.add(qName);
      cls = Status.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "StatusDetail");
      this.cachedSerQNames.add(qName);
      cls = StatusDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "StringCustomFieldRef");
      this.cachedSerQNames.add(qName);
      cls = StringCustomFieldRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "StringDimensionRef");
      this.cachedSerQNames.add(qName);
      cls = StringDimensionRef.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "TokenPassport");
      this.cachedSerQNames.add(qName);
      cls = TokenPassport.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "TokenPassportSignature");
      this.cachedSerQNames.add(qName);
      cls = TokenPassportSignature.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(BaseSerializerFactory.createFactory(SimpleSerializerFactory.class, cls, qName));
      this.cachedDeserFactories.add(BaseDeserializerFactory.createFactory(SimpleDeserializerFactory.class, cls, qName));
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "UpdateInviteeStatusReference");
      this.cachedSerQNames.add(qName);
      cls = UpdateInviteeStatusReference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "WsRole");
      this.cachedSerQNames.add(qName);
      cls = WsRole.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:core_2018_1.platform.webservices.netsuite.com", "WsRoleList");
      this.cachedSerQNames.add(qName);
      cls = WsRoleList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CashRefund");
      this.cachedSerQNames.add(qName);
      cls = CashRefund.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CashRefundItem");
      this.cachedSerQNames.add(qName);
      cls = CashRefundItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CashRefundItemList");
      this.cachedSerQNames.add(qName);
      cls = CashRefundItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CashRefundPartnersList");
      this.cachedSerQNames.add(qName);
      cls = CashRefundPartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CashRefundSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = CashRefundSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CashRefundSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = CashRefundSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "Charge");
      this.cachedSerQNames.add(qName);
      cls = Charge.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ChargeSearch");
      this.cachedSerQNames.add(qName);
      cls = ChargeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ChargeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ChargeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ChargeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ChargeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemo");
      this.cachedSerQNames.add(qName);
      cls = CreditMemo.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemoApply");
      this.cachedSerQNames.add(qName);
      cls = CreditMemoApply.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemoApplyList");
      this.cachedSerQNames.add(qName);
      cls = CreditMemoApplyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemoItem");
      this.cachedSerQNames.add(qName);
      cls = CreditMemoItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemoItemList");
      this.cachedSerQNames.add(qName);
      cls = CreditMemoItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemoPartnersList");
      this.cachedSerQNames.add(qName);
      cls = CreditMemoPartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemoSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = CreditMemoSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CreditMemoSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = CreditMemoSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerDeposit");
      this.cachedSerQNames.add(qName);
      cls = CustomerDeposit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerDepositApply");
      this.cachedSerQNames.add(qName);
      cls = CustomerDepositApply.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerDepositApplyList");
      this.cachedSerQNames.add(qName);
      cls = CustomerDepositApplyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPayment");
      this.cachedSerQNames.add(qName);
      cls = CustomerPayment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentApply");
      this.cachedSerQNames.add(qName);
      cls = CustomerPaymentApply.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentApplyList");
      this.cachedSerQNames.add(qName);
      cls = CustomerPaymentApplyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentCredit");
      this.cachedSerQNames.add(qName);
      cls = CustomerPaymentCredit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentCreditList");
      this.cachedSerQNames.add(qName);
      cls = CustomerPaymentCreditList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentDeposit");
      this.cachedSerQNames.add(qName);
      cls = CustomerPaymentDeposit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentDepositList");
      this.cachedSerQNames.add(qName);
      cls = CustomerPaymentDepositList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerRefund");
      this.cachedSerQNames.add(qName);
      cls = CustomerRefund.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerRefundApply");
      this.cachedSerQNames.add(qName);
      cls = CustomerRefundApply.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerRefundApplyList");
      this.cachedSerQNames.add(qName);
      cls = CustomerRefundApplyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerRefundDeposit");
      this.cachedSerQNames.add(qName);
      cls = CustomerRefundDeposit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerRefundDepositList");
      this.cachedSerQNames.add(qName);
      cls = CustomerRefundDepositList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "DepositApplication");
      this.cachedSerQNames.add(qName);
      cls = DepositApplication.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "DepositApplicationApply");
      this.cachedSerQNames.add(qName);
      cls = DepositApplicationApply.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "DepositApplicationApplyList");
      this.cachedSerQNames.add(qName);
      cls = DepositApplicationApplyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorization");
      this.cachedSerQNames.add(qName);
      cls = ReturnAuthorization.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationItem");
      this.cachedSerQNames.add(qName);
      cls = ReturnAuthorizationItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationItemList");
      this.cachedSerQNames.add(qName);
      cls = ReturnAuthorizationItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationPartnersList");
      this.cachedSerQNames.add(qName);
      cls = ReturnAuthorizationPartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = ReturnAuthorizationSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = ReturnAuthorizationSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CrmCustomField");
      this.cachedSerQNames.add(qName);
      cls = CrmCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CrmCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = CrmCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CrmCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = CrmCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccess");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldDepartmentAccess.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldDepartmentAccessList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldRoleAccess");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldRoleAccess.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldRoleAccessList");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldRoleAccessList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldSubAccess");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldSubAccess.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldSubAccessList");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldSubAccessList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldTranslations");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldTranslations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldTranslationsList");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldTranslationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldType");
      this.cachedSerQNames.add(qName);
      cls = CustomFieldType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomList");
      this.cachedSerQNames.add(qName);
      cls = CustomList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListCustomValue");
      this.cachedSerQNames.add(qName);
      cls = CustomListCustomValue.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListCustomValueList");
      this.cachedSerQNames.add(qName);
      cls = CustomListCustomValueList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListSearch");
      this.cachedSerQNames.add(qName);
      cls = CustomListSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CustomListSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CustomListSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListTranslations");
      this.cachedSerQNames.add(qName);
      cls = CustomListTranslations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomListTranslationsList");
      this.cachedSerQNames.add(qName);
      cls = CustomListTranslationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecord");
      this.cachedSerQNames.add(qName);
      cls = CustomRecord.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordCustomField");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings7() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      Class cls = CustomRecordCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordSearch");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTranslations");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTranslations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTranslationsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTranslationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordType");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeChildren");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeChildren.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeChildrenList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeChildrenList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeFieldList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeFieldList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeForms");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeForms.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeFormsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeFormsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeLinks");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeLinks.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeLinksList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeLinksList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeManagers");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeManagers.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeManagersList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeManagersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeOnlineForms");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeOnlineForms.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeOnlineFormsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeOnlineFormsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeParents");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeParents.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeParentsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeParentsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypePermissions");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypePermissions.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypePermissionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeSublists");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeSublists.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeSublistsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeSublistsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTabs");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeTabs.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTabsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeTabsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTranslations");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeTranslations.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTranslationsList");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeTranslationsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomTransaction");
      this.cachedSerQNames.add(qName);
      cls = CustomTransaction.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomTransactionLine");
      this.cachedSerQNames.add(qName);
      cls = CustomTransactionLine.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomTransactionLineList");
      this.cachedSerQNames.add(qName);
      cls = CustomTransactionLineList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "EntityCustomField");
      this.cachedSerQNames.add(qName);
      cls = EntityCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "EntityCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = EntityCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "EntityCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = EntityCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "FldFilterSelList");
      this.cachedSerQNames.add(qName);
      cls = FldFilterSelList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemCustomField");
      this.cachedSerQNames.add(qName);
      cls = ItemCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = ItemCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = ItemCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemNumberCustomField");
      this.cachedSerQNames.add(qName);
      cls = ItemNumberCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemNumberCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = ItemNumberCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemNumberCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = ItemNumberCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemOptionCustomField");
      this.cachedSerQNames.add(qName);
      cls = ItemOptionCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemOptionCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = ItemOptionCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemOptionCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = ItemOptionCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "ItemsList");
      this.cachedSerQNames.add(qName);
      cls = ItemsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "LanguageValue");
      this.cachedSerQNames.add(qName);
      cls = LanguageValue.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "LanguageValueList");
      this.cachedSerQNames.add(qName);
      cls = LanguageValueList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "OtherCustomField");
      this.cachedSerQNames.add(qName);
      cls = OtherCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "OtherCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = OtherCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "OtherCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = OtherCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "TransactionBodyCustomField");
      this.cachedSerQNames.add(qName);
      cls = TransactionBodyCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "TransactionBodyCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = TransactionBodyCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "TransactionBodyCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = TransactionBodyCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "TransactionColumnCustomField");
      this.cachedSerQNames.add(qName);
      cls = TransactionColumnCustomField.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilter");
      this.cachedSerQNames.add(qName);
      cls = TransactionColumnCustomFieldFilter.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilterList");
      this.cachedSerQNames.add(qName);
      cls = TransactionColumnCustomFieldFilterList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlan");
      this.cachedSerQNames.add(qName);
      cls = DemandPlan.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlanMatrix");
      this.cachedSerQNames.add(qName);
      cls = DemandPlanMatrix.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemDemandPlan");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandPlan.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemDemandPlanSearch");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandPlanSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemDemandPlanSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandPlanSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemDemandPlanSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandPlanSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemSupplyPlan");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlan.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemSupplyPlanOrder");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanOrder.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemSupplyPlanOrderList");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanOrderList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemSupplyPlanSearch");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemSupplyPlanSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemSupplyPlanSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "PeriodDemandPlan");
      this.cachedSerQNames.add(qName);
      cls = PeriodDemandPlan.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "PeriodDemandPlanList");
      this.cachedSerQNames.add(qName);
      cls = PeriodDemandPlanList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "Employee");
      this.cachedSerQNames.add(qName);
      cls = Employee.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeAccruedTime");
      this.cachedSerQNames.add(qName);
      cls = EmployeeAccruedTime.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeAccruedTimeList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeAccruedTimeList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeAddressbook");
      this.cachedSerQNames.add(qName);
      cls = EmployeeAddressbook.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeAddressbookList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeAddressbookList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeCompanyContribution");
      this.cachedSerQNames.add(qName);
      cls = EmployeeCompanyContribution.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeCompanyContributionList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeCompanyContributionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeDeduction");
      this.cachedSerQNames.add(qName);
      cls = EmployeeDeduction.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeDeductionList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeDeductionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeDirectDeposit");
      this.cachedSerQNames.add(qName);
      cls = EmployeeDirectDeposit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeDirectDepositList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeDirectDepositList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeEarning");
      this.cachedSerQNames.add(qName);
      cls = EmployeeEarning.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeEarningList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeEarningList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeEmergencyContact");
      this.cachedSerQNames.add(qName);
      cls = EmployeeEmergencyContact.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeEmergencyContactList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeEmergencyContactList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeHcmPosition");
      this.cachedSerQNames.add(qName);
      cls = EmployeeHcmPosition.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeHcmPositionList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeHcmPositionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeHrEducation");
      this.cachedSerQNames.add(qName);
      cls = EmployeeHrEducation.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeHrEducationList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeHrEducationList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeRates");
      this.cachedSerQNames.add(qName);
      cls = EmployeeRates.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeRatesList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeRatesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeRoles");
      this.cachedSerQNames.add(qName);
      cls = EmployeeRoles.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeRolesList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeRolesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeSearch");
      this.cachedSerQNames.add(qName);
      cls = EmployeeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = EmployeeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = EmployeeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeSubscriptions");
      this.cachedSerQNames.add(qName);
      cls = EmployeeSubscriptions.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeSubscriptionsList");
      this.cachedSerQNames.add(qName);
      cls = EmployeeSubscriptionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "HcmJob");
      this.cachedSerQNames.add(qName);
      cls = HcmJob.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings8() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "HcmJobSearch");
      this.cachedSerQNames.add(qName);
      Class cls = HcmJobSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "HcmJobSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = HcmJobSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "HcmJobSearchRow");
      this.cachedSerQNames.add(qName);
      cls = HcmJobSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "PayrollItem");
      this.cachedSerQNames.add(qName);
      cls = PayrollItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "PayrollItemSearch");
      this.cachedSerQNames.add(qName);
      cls = PayrollItemSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "PayrollItemSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PayrollItemSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "PayrollItemSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PayrollItemSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "ExpenseReport");
      this.cachedSerQNames.add(qName);
      cls = ExpenseReport.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "ExpenseReportExpense");
      this.cachedSerQNames.add(qName);
      cls = ExpenseReportExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "ExpenseReportExpenseList");
      this.cachedSerQNames.add(qName);
      cls = ExpenseReportExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "Paycheck");
      this.cachedSerQNames.add(qName);
      cls = Paycheck.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournal");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournal.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalCompanyContribution");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalCompanyContribution.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalCompanyContributionList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalCompanyContributionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalCompanyTax");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalCompanyTax.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalCompanyTaxList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalCompanyTaxList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalDeduction");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalDeduction.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalDeductionList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalDeductionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalEarning");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalEarning.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalEarningList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalEarningList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalEmployeeTax");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalEmployeeTax.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalEmployeeTaxList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckJournalEmployeeTaxList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayContrib");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayContrib.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayContribList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayContribList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayDeduct");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayDeduct.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayDeductList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayDeductList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayDisburse");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayDisburse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayDisburseList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayDisburseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayEarn");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayEarn.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayEarnList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayEarnList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayExp");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayExp.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayExpList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayExpList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayPto");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayPto.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayPtoList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayPtoList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPaySummary");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPaySummary.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPaySummaryList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPaySummaryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayTax");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayTax.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayTaxList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayTaxList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayTime");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayTime.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayTimeList");
      this.cachedSerQNames.add(qName);
      cls = PaycheckPayTimeList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckSearch");
      this.cachedSerQNames.add(qName);
      cls = PaycheckSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PaycheckSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PaycheckSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeBill");
      this.cachedSerQNames.add(qName);
      cls = TimeBill.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeBillSearch");
      this.cachedSerQNames.add(qName);
      cls = TimeBillSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeBillSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TimeBillSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeBillSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TimeBillSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeEntry");
      this.cachedSerQNames.add(qName);
      cls = TimeEntry.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeEntrySearch");
      this.cachedSerQNames.add(qName);
      cls = TimeEntrySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeEntrySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TimeEntrySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeEntrySearchRow");
      this.cachedSerQNames.add(qName);
      cls = TimeEntrySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeSheet");
      this.cachedSerQNames.add(qName);
      cls = TimeSheet.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeSheetSearch");
      this.cachedSerQNames.add(qName);
      cls = TimeSheetSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeSheetSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TimeSheetSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeSheetSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TimeSheetSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeSheetTimeGrid");
      this.cachedSerQNames.add(qName);
      cls = TimeSheetTimeGrid.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "TimeSheetTimeGridList");
      this.cachedSerQNames.add(qName);
      cls = TimeSheetTimeGridList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "AsyncFault");
      this.cachedSerQNames.add(qName);
      cls = AsyncFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededConcurrentRequestLimitFault");
      this.cachedSerQNames.add(qName);
      cls = ExceededConcurrentRequestLimitFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRecordCountFault");
      this.cachedSerQNames.add(qName);
      cls = ExceededRecordCountFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestLimitFault");
      this.cachedSerQNames.add(qName);
      cls = ExceededRequestLimitFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededRequestSizeFault");
      this.cachedSerQNames.add(qName);
      cls = ExceededRequestSizeFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "ExceededUsageLimitFault");
      this.cachedSerQNames.add(qName);
      cls = ExceededUsageLimitFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InsufficientPermissionFault");
      this.cachedSerQNames.add(qName);
      cls = InsufficientPermissionFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidAccountFault");
      this.cachedSerQNames.add(qName);
      cls = InvalidAccountFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidCredentialsFault");
      this.cachedSerQNames.add(qName);
      cls = InvalidCredentialsFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidSessionFault");
      this.cachedSerQNames.add(qName);
      cls = InvalidSessionFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "InvalidVersionFault");
      this.cachedSerQNames.add(qName);
      cls = InvalidVersionFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "SoapFault");
      this.cachedSerQNames.add(qName);
      cls = SoapFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:faults_2018_1.platform.webservices.netsuite.com", "UnexpectedErrorFault");
      this.cachedSerQNames.add(qName);
      cls = UnexpectedErrorFault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "File");
      this.cachedSerQNames.add(qName);
      cls = File.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FileSearch");
      this.cachedSerQNames.add(qName);
      cls = FileSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FileSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = FileSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FileSearchRow");
      this.cachedSerQNames.add(qName);
      cls = FileSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FileSiteCategory");
      this.cachedSerQNames.add(qName);
      cls = FileSiteCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FileSiteCategoryList");
      this.cachedSerQNames.add(qName);
      cls = FileSiteCategoryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "Folder");
      this.cachedSerQNames.add(qName);
      cls = Folder.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FolderSearch");
      this.cachedSerQNames.add(qName);
      cls = FolderSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FolderSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = FolderSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FolderSearchRow");
      this.cachedSerQNames.add(qName);
      cls = FolderSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:financial_2018_1.transactions.webservices.netsuite.com", "Budget");
      this.cachedSerQNames.add(qName);
      cls = Budget.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:financial_2018_1.transactions.webservices.netsuite.com", "BudgetSearch");
      this.cachedSerQNames.add(qName);
      cls = BudgetSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:financial_2018_1.transactions.webservices.netsuite.com", "BudgetSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = BudgetSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:financial_2018_1.transactions.webservices.netsuite.com", "BudgetSearchRow");
      this.cachedSerQNames.add(qName);
      cls = BudgetSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntry");
      this.cachedSerQNames.add(qName);
      cls = AdvInterCompanyJournalEntry.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryAccountingBookDetail");
      this.cachedSerQNames.add(qName);
      cls = AdvInterCompanyJournalEntryAccountingBookDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryAccountingBookDetailList");
      this.cachedSerQNames.add(qName);
      cls = AdvInterCompanyJournalEntryAccountingBookDetailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryLine");
      this.cachedSerQNames.add(qName);
      cls = AdvInterCompanyJournalEntryLine.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryLineList");
      this.cachedSerQNames.add(qName);
      cls = AdvInterCompanyJournalEntryLineList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntry");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyJournalEntry.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryAccountingBookDetail");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyJournalEntryAccountingBookDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryAccountingBookDetailList");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyJournalEntryAccountingBookDetailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryLine");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyJournalEntryLine.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryLineList");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyJournalEntryLineList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "JournalEntry");
      this.cachedSerQNames.add(qName);
      cls = JournalEntry.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "JournalEntryLine");
      this.cachedSerQNames.add(qName);
      cls = JournalEntryLine.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "JournalEntryLineList");
      this.cachedSerQNames.add(qName);
      cls = JournalEntryLineList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "StatisticalJournalEntry");
      this.cachedSerQNames.add(qName);
      cls = StatisticalJournalEntry.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "StatisticalJournalEntryLine");
      this.cachedSerQNames.add(qName);
      cls = StatisticalJournalEntryLine.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:general_2018_1.transactions.webservices.netsuite.com", "StatisticalJournalEntryLineList");
      this.cachedSerQNames.add(qName);
      cls = StatisticalJournalEntryLineList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings9() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "AssemblyBuild");
      this.cachedSerQNames.add(qName);
      Class cls = AssemblyBuild.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "AssemblyComponent");
      this.cachedSerQNames.add(qName);
      cls = AssemblyComponent.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "AssemblyComponentList");
      this.cachedSerQNames.add(qName);
      cls = AssemblyComponentList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "AssemblyUnbuild");
      this.cachedSerQNames.add(qName);
      cls = AssemblyUnbuild.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "BinTransfer");
      this.cachedSerQNames.add(qName);
      cls = BinTransfer.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "BinTransferInventory");
      this.cachedSerQNames.add(qName);
      cls = BinTransferInventory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "BinTransferInventoryList");
      this.cachedSerQNames.add(qName);
      cls = BinTransferInventoryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "BinWorksheet");
      this.cachedSerQNames.add(qName);
      cls = BinWorksheet.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "BinWorksheetItem");
      this.cachedSerQNames.add(qName);
      cls = BinWorksheetItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "BinWorksheetItemList");
      this.cachedSerQNames.add(qName);
      cls = BinWorksheetItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InterCompanyTransferOrder");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyTransferOrder.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InterCompanyTransferOrderItem");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyTransferOrderItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InterCompanyTransferOrderItemList");
      this.cachedSerQNames.add(qName);
      cls = InterCompanyTransferOrderItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryAdjustment");
      this.cachedSerQNames.add(qName);
      cls = InventoryAdjustment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryAdjustmentInventory");
      this.cachedSerQNames.add(qName);
      cls = InventoryAdjustmentInventory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryAdjustmentInventoryList");
      this.cachedSerQNames.add(qName);
      cls = InventoryAdjustmentInventoryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryCostRevaluation");
      this.cachedSerQNames.add(qName);
      cls = InventoryCostRevaluation.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryCostRevaluationCostComponent");
      this.cachedSerQNames.add(qName);
      cls = InventoryCostRevaluationCostComponent.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryCostRevaluationCostComponentList");
      this.cachedSerQNames.add(qName);
      cls = InventoryCostRevaluationCostComponentList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryTransfer");
      this.cachedSerQNames.add(qName);
      cls = InventoryTransfer.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryTransferInventory");
      this.cachedSerQNames.add(qName);
      cls = InventoryTransferInventory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryTransferInventoryList");
      this.cachedSerQNames.add(qName);
      cls = InventoryTransferInventoryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "PartnersList");
      this.cachedSerQNames.add(qName);
      cls = PartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "SalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = SalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "TransferOrder");
      this.cachedSerQNames.add(qName);
      cls = TransferOrder.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "TransferOrderItem");
      this.cachedSerQNames.add(qName);
      cls = TransferOrderItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "TransferOrderItemList");
      this.cachedSerQNames.add(qName);
      cls = TransferOrderItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrder");
      this.cachedSerQNames.add(qName);
      cls = WorkOrder.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderClose");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderClose.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderCompletion");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderCompletion.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderCompletionComponent");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderCompletionComponent.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderCompletionComponentList");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderCompletionComponentList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderCompletionOperation");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderCompletionOperation.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderCompletionOperationList");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderCompletionOperationList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderIssue");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderIssue.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderIssueComponent");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderIssueComponent.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderIssueComponentList");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderIssueComponentList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderItem");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderItemList");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "Campaign");
      this.cachedSerQNames.add(qName);
      cls = Campaign.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignAudience");
      this.cachedSerQNames.add(qName);
      cls = CampaignAudience.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignCategory");
      this.cachedSerQNames.add(qName);
      cls = CampaignCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignChannel");
      this.cachedSerQNames.add(qName);
      cls = CampaignChannel.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignDirectMail");
      this.cachedSerQNames.add(qName);
      cls = CampaignDirectMail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignDirectMailList");
      this.cachedSerQNames.add(qName);
      cls = CampaignDirectMailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEmail");
      this.cachedSerQNames.add(qName);
      cls = CampaignEmail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEmailList");
      this.cachedSerQNames.add(qName);
      cls = CampaignEmailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEvent");
      this.cachedSerQNames.add(qName);
      cls = CampaignEvent.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEventList");
      this.cachedSerQNames.add(qName);
      cls = CampaignEventList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEventResponse");
      this.cachedSerQNames.add(qName);
      cls = CampaignEventResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEventResponseList");
      this.cachedSerQNames.add(qName);
      cls = CampaignEventResponseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignFamily");
      this.cachedSerQNames.add(qName);
      cls = CampaignFamily.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignOffer");
      this.cachedSerQNames.add(qName);
      cls = CampaignOffer.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignResponse");
      this.cachedSerQNames.add(qName);
      cls = CampaignResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignResponseResponses");
      this.cachedSerQNames.add(qName);
      cls = CampaignResponseResponses.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignResponseResponsesList");
      this.cachedSerQNames.add(qName);
      cls = CampaignResponseResponsesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignSearch");
      this.cachedSerQNames.add(qName);
      cls = CampaignSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CampaignSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignSearchEngine");
      this.cachedSerQNames.add(qName);
      cls = CampaignSearchEngine.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CampaignSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignSubscription");
      this.cachedSerQNames.add(qName);
      cls = CampaignSubscription.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignVertical");
      this.cachedSerQNames.add(qName);
      cls = CampaignVertical.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CouponCode");
      this.cachedSerQNames.add(qName);
      cls = CouponCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CouponCodeSearch");
      this.cachedSerQNames.add(qName);
      cls = CouponCodeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CouponCodeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CouponCodeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CouponCodeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CouponCodeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCode");
      this.cachedSerQNames.add(qName);
      cls = PromotionCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeCurrency");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeCurrency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeCurrencyList");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeCurrencyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeItems");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeItems.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeItemsList");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeItemsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodePartners");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodePartners.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodePartnersList");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodePartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeSearch");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ApplicationInfo");
      this.cachedSerQNames.add(qName);
      cls = ApplicationInfo.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncAddListResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncAddListResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncDeleteListResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncDeleteListResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncGetListResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncGetListResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncInitializeListResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncInitializeListResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncSearchResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncSearchResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncUpdateListResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncUpdateListResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncUpsertListResult");
      this.cachedSerQNames.add(qName);
      cls = AsyncUpsertListResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "DocumentInfo");
      this.cachedSerQNames.add(qName);
      cls = DocumentInfo.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "PartnerInfo");
      this.cachedSerQNames.add(qName);
      cls = PartnerInfo.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "Preferences");
      this.cachedSerQNames.add(qName);
      cls = Preferences.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponse");
      this.cachedSerQNames.add(qName);
      cls = ReadResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ReadResponseList");
      this.cachedSerQNames.add(qName);
      cls = ReadResponseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SearchPreferences");
      this.cachedSerQNames.add(qName);
      cls = SearchPreferences.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "SessionResponse");
      this.cachedSerQNames.add(qName);
      cls = SessionResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponse");
      this.cachedSerQNames.add(qName);
      cls = WriteResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "WriteResponseList");
      this.cachedSerQNames.add(qName);
      cls = WriteResponseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipment");
      this.cachedSerQNames.add(qName);
      cls = InboundShipment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentItems");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentItems.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentItemsList");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentItemsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentSearch");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentSearchRow");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings10() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "ItemReceipt");
      this.cachedSerQNames.add(qName);
      Class cls = ItemReceipt.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "ItemReceiptExpense");
      this.cachedSerQNames.add(qName);
      cls = ItemReceiptExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "ItemReceiptExpenseList");
      this.cachedSerQNames.add(qName);
      cls = ItemReceiptExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "ItemReceiptItem");
      this.cachedSerQNames.add(qName);
      cls = ItemReceiptItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "ItemReceiptItemList");
      this.cachedSerQNames.add(qName);
      cls = ItemReceiptItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseOrder");
      this.cachedSerQNames.add(qName);
      cls = PurchaseOrder.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseOrderExpense");
      this.cachedSerQNames.add(qName);
      cls = PurchaseOrderExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseOrderExpenseList");
      this.cachedSerQNames.add(qName);
      cls = PurchaseOrderExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseOrderItem");
      this.cachedSerQNames.add(qName);
      cls = PurchaseOrderItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseOrderItemList");
      this.cachedSerQNames.add(qName);
      cls = PurchaseOrderItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisition");
      this.cachedSerQNames.add(qName);
      cls = PurchaseRequisition.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpense");
      this.cachedSerQNames.add(qName);
      cls = PurchaseRequisitionExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpenseList");
      this.cachedSerQNames.add(qName);
      cls = PurchaseRequisitionExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisitionItem");
      this.cachedSerQNames.add(qName);
      cls = PurchaseRequisitionItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisitionItemList");
      this.cachedSerQNames.add(qName);
      cls = PurchaseRequisitionItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchLandedCostList");
      this.cachedSerQNames.add(qName);
      cls = PurchLandedCostList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorBill");
      this.cachedSerQNames.add(qName);
      cls = VendorBill.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorBillExpense");
      this.cachedSerQNames.add(qName);
      cls = VendorBillExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorBillExpenseList");
      this.cachedSerQNames.add(qName);
      cls = VendorBillExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorBillItem");
      this.cachedSerQNames.add(qName);
      cls = VendorBillItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorBillItemList");
      this.cachedSerQNames.add(qName);
      cls = VendorBillItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorCredit");
      this.cachedSerQNames.add(qName);
      cls = VendorCredit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorCreditApply");
      this.cachedSerQNames.add(qName);
      cls = VendorCreditApply.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorCreditApplyList");
      this.cachedSerQNames.add(qName);
      cls = VendorCreditApplyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorCreditExpense");
      this.cachedSerQNames.add(qName);
      cls = VendorCreditExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorCreditExpenseList");
      this.cachedSerQNames.add(qName);
      cls = VendorCreditExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorCreditItem");
      this.cachedSerQNames.add(qName);
      cls = VendorCreditItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorCreditItemList");
      this.cachedSerQNames.add(qName);
      cls = VendorCreditItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorPayment");
      this.cachedSerQNames.add(qName);
      cls = VendorPayment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorPaymentApply");
      this.cachedSerQNames.add(qName);
      cls = VendorPaymentApply.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorPaymentApplyList");
      this.cachedSerQNames.add(qName);
      cls = VendorPaymentApplyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorPaymentCredit");
      this.cachedSerQNames.add(qName);
      cls = VendorPaymentCredit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorPaymentCreditList");
      this.cachedSerQNames.add(qName);
      cls = VendorPaymentCreditList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorization");
      this.cachedSerQNames.add(qName);
      cls = VendorReturnAuthorization.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationExpense");
      this.cachedSerQNames.add(qName);
      cls = VendorReturnAuthorizationExpense.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationExpenseList");
      this.cachedSerQNames.add(qName);
      cls = VendorReturnAuthorizationExpenseList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationItem");
      this.cachedSerQNames.add(qName);
      cls = VendorReturnAuthorizationItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationItemList");
      this.cachedSerQNames.add(qName);
      cls = VendorReturnAuthorizationItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "BillingAccount");
      this.cachedSerQNames.add(qName);
      cls = BillingAccount.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "BillingAccountSearch");
      this.cachedSerQNames.add(qName);
      cls = BillingAccountSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "BillingAccountSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = BillingAccountSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "BillingAccountSearchRow");
      this.cachedSerQNames.add(qName);
      cls = BillingAccountSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CategoryList");
      this.cachedSerQNames.add(qName);
      cls = CategoryList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "Contact");
      this.cachedSerQNames.add(qName);
      cls = Contact.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "ContactAccessRoles");
      this.cachedSerQNames.add(qName);
      cls = ContactAccessRoles.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "ContactAccessRolesList");
      this.cachedSerQNames.add(qName);
      cls = ContactAccessRolesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "ContactAddressbook");
      this.cachedSerQNames.add(qName);
      cls = ContactAddressbook.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "ContactAddressbookList");
      this.cachedSerQNames.add(qName);
      cls = ContactAddressbookList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "ContactSearch");
      this.cachedSerQNames.add(qName);
      cls = ContactSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "ContactSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ContactSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "ContactSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ContactSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "Customer");
      this.cachedSerQNames.add(qName);
      cls = Customer.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerAddressbook");
      this.cachedSerQNames.add(qName);
      cls = CustomerAddressbook.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerAddressbookList");
      this.cachedSerQNames.add(qName);
      cls = CustomerAddressbookList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerCreditCards");
      this.cachedSerQNames.add(qName);
      cls = CustomerCreditCards.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerCreditCardsList");
      this.cachedSerQNames.add(qName);
      cls = CustomerCreditCardsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerCurrency");
      this.cachedSerQNames.add(qName);
      cls = CustomerCurrency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerCurrencyList");
      this.cachedSerQNames.add(qName);
      cls = CustomerCurrencyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerDownload");
      this.cachedSerQNames.add(qName);
      cls = CustomerDownload.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerDownloadList");
      this.cachedSerQNames.add(qName);
      cls = CustomerDownloadList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerGroupPricing");
      this.cachedSerQNames.add(qName);
      cls = CustomerGroupPricing.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerGroupPricingList");
      this.cachedSerQNames.add(qName);
      cls = CustomerGroupPricingList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerItemPricing");
      this.cachedSerQNames.add(qName);
      cls = CustomerItemPricing.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerItemPricingList");
      this.cachedSerQNames.add(qName);
      cls = CustomerItemPricingList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerPartnersList");
      this.cachedSerQNames.add(qName);
      cls = CustomerPartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = com.netsuite.suitetalk.proxy.v2018_1.lists.relationships.CustomerSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = CustomerSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerSearch");
      this.cachedSerQNames.add(qName);
      cls = CustomerSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CustomerSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CustomerSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerStatus");
      this.cachedSerQNames.add(qName);
      cls = CustomerStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerStatusSearch");
      this.cachedSerQNames.add(qName);
      cls = CustomerStatusSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerStatusSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CustomerStatusSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerStatusSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CustomerStatusSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "EntityGroup");
      this.cachedSerQNames.add(qName);
      cls = EntityGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "EntityGroupSearch");
      this.cachedSerQNames.add(qName);
      cls = EntityGroupSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "EntityGroupSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = EntityGroupSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "EntityGroupSearchRow");
      this.cachedSerQNames.add(qName);
      cls = EntityGroupSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "Job");
      this.cachedSerQNames.add(qName);
      cls = Job.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobAddressbook");
      this.cachedSerQNames.add(qName);
      cls = JobAddressbook.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobAddressbookList");
      this.cachedSerQNames.add(qName);
      cls = JobAddressbookList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobCreditCards");
      this.cachedSerQNames.add(qName);
      cls = JobCreditCards.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobCreditCardsList");
      this.cachedSerQNames.add(qName);
      cls = JobCreditCardsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobMilestones");
      this.cachedSerQNames.add(qName);
      cls = JobMilestones.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobMilestonesList");
      this.cachedSerQNames.add(qName);
      cls = JobMilestonesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobPercentCompleteOverride");
      this.cachedSerQNames.add(qName);
      cls = JobPercentCompleteOverride.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobPercentCompleteOverrideList");
      this.cachedSerQNames.add(qName);
      cls = JobPercentCompleteOverrideList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobPlStatement");
      this.cachedSerQNames.add(qName);
      cls = JobPlStatement.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobPlStatementList");
      this.cachedSerQNames.add(qName);
      cls = JobPlStatementList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobResources");
      this.cachedSerQNames.add(qName);
      cls = JobResources.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobResourcesList");
      this.cachedSerQNames.add(qName);
      cls = JobResourcesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobSearch");
      this.cachedSerQNames.add(qName);
      cls = JobSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = JobSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobSearchRow");
      this.cachedSerQNames.add(qName);
      cls = JobSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobStatus");
      this.cachedSerQNames.add(qName);
      cls = JobStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobStatusSearch");
      this.cachedSerQNames.add(qName);
      cls = JobStatusSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobStatusSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = JobStatusSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobStatusSearchRow");
      this.cachedSerQNames.add(qName);
      cls = JobStatusSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobType");
      this.cachedSerQNames.add(qName);
      cls = JobType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobTypeSearch");
      this.cachedSerQNames.add(qName);
      cls = JobTypeSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings11() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobTypeSearchAdvanced");
      this.cachedSerQNames.add(qName);
      Class cls = JobTypeSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobTypeSearchRow");
      this.cachedSerQNames.add(qName);
      cls = JobTypeSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "OriginatingLeadSearch");
      this.cachedSerQNames.add(qName);
      cls = OriginatingLeadSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "OriginatingLeadSearchRow");
      this.cachedSerQNames.add(qName);
      cls = OriginatingLeadSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "Partner");
      this.cachedSerQNames.add(qName);
      cls = Partner.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "PartnerAddressbook");
      this.cachedSerQNames.add(qName);
      cls = PartnerAddressbook.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "PartnerAddressbookList");
      this.cachedSerQNames.add(qName);
      cls = PartnerAddressbookList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "PartnerPromoCode");
      this.cachedSerQNames.add(qName);
      cls = PartnerPromoCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "PartnerPromoCodeList");
      this.cachedSerQNames.add(qName);
      cls = PartnerPromoCodeList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "PartnerSearch");
      this.cachedSerQNames.add(qName);
      cls = PartnerSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "PartnerSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PartnerSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "PartnerSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PartnerSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "Subscriptions");
      this.cachedSerQNames.add(qName);
      cls = Subscriptions.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "SubscriptionsList");
      this.cachedSerQNames.add(qName);
      cls = SubscriptionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "Vendor");
      this.cachedSerQNames.add(qName);
      cls = Vendor.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorAddressbook");
      this.cachedSerQNames.add(qName);
      cls = VendorAddressbook.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorAddressbookList");
      this.cachedSerQNames.add(qName);
      cls = VendorAddressbookList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorCurrency");
      this.cachedSerQNames.add(qName);
      cls = VendorCurrency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorCurrencyList");
      this.cachedSerQNames.add(qName);
      cls = VendorCurrencyList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorPricingSchedule");
      this.cachedSerQNames.add(qName);
      cls = VendorPricingSchedule.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorPricingScheduleList");
      this.cachedSerQNames.add(qName);
      cls = VendorPricingScheduleList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorRoles");
      this.cachedSerQNames.add(qName);
      cls = VendorRoles.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorRolesList");
      this.cachedSerQNames.add(qName);
      cls = VendorRolesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorSearch");
      this.cachedSerQNames.add(qName);
      cls = VendorSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = VendorSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorSearchRow");
      this.cachedSerQNames.add(qName);
      cls = VendorSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionSearch");
      this.cachedSerQNames.add(qName);
      cls = AccountingTransactionSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = AccountingTransactionSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionSearchRow");
      this.cachedSerQNames.add(qName);
      cls = AccountingTransactionSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSale");
      this.cachedSerQNames.add(qName);
      cls = CashSale.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleExpCost");
      this.cachedSerQNames.add(qName);
      cls = CashSaleExpCost.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleExpCostList");
      this.cachedSerQNames.add(qName);
      cls = CashSaleExpCostList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleItem");
      this.cachedSerQNames.add(qName);
      cls = CashSaleItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleItemCost");
      this.cachedSerQNames.add(qName);
      cls = CashSaleItemCost.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleItemCostList");
      this.cachedSerQNames.add(qName);
      cls = CashSaleItemCostList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleItemList");
      this.cachedSerQNames.add(qName);
      cls = CashSaleItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSalePartnersList");
      this.cachedSerQNames.add(qName);
      cls = CashSalePartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = CashSaleSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = CashSaleSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleShipGroupList");
      this.cachedSerQNames.add(qName);
      cls = CashSaleShipGroupList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleTime");
      this.cachedSerQNames.add(qName);
      cls = CashSaleTime.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleTimeList");
      this.cachedSerQNames.add(qName);
      cls = CashSaleTimeList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "Estimate");
      this.cachedSerQNames.add(qName);
      cls = Estimate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "EstimateItem");
      this.cachedSerQNames.add(qName);
      cls = EstimateItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "EstimateItemList");
      this.cachedSerQNames.add(qName);
      cls = EstimateItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "EstimatePartnersList");
      this.cachedSerQNames.add(qName);
      cls = EstimatePartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "EstimateSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = EstimateSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "EstimateSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = EstimateSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "EstimateShipGroupList");
      this.cachedSerQNames.add(qName);
      cls = EstimateShipGroupList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "GiftCertRedemption");
      this.cachedSerQNames.add(qName);
      cls = GiftCertRedemption.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "GiftCertRedemptionList");
      this.cachedSerQNames.add(qName);
      cls = GiftCertRedemptionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "Invoice");
      this.cachedSerQNames.add(qName);
      cls = Invoice.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceExpCost");
      this.cachedSerQNames.add(qName);
      cls = InvoiceExpCost.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceExpCostList");
      this.cachedSerQNames.add(qName);
      cls = InvoiceExpCostList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceItem");
      this.cachedSerQNames.add(qName);
      cls = InvoiceItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceItemCost");
      this.cachedSerQNames.add(qName);
      cls = InvoiceItemCost.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceItemCostList");
      this.cachedSerQNames.add(qName);
      cls = InvoiceItemCostList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceItemList");
      this.cachedSerQNames.add(qName);
      cls = InvoiceItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoicePartnersList");
      this.cachedSerQNames.add(qName);
      cls = InvoicePartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = InvoiceSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = InvoiceSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceShipGroupList");
      this.cachedSerQNames.add(qName);
      cls = InvoiceShipGroupList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceTime");
      this.cachedSerQNames.add(qName);
      cls = InvoiceTime.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "InvoiceTimeList");
      this.cachedSerQNames.add(qName);
      cls = InvoiceTimeList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillment");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentItem");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentItemList");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackage");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExList");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedExList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageList");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsList");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUpsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUsps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUsps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsList");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUspsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "Opportunity");
      this.cachedSerQNames.add(qName);
      cls = Opportunity.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunityCompetitors");
      this.cachedSerQNames.add(qName);
      cls = OpportunityCompetitors.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunityCompetitorsList");
      this.cachedSerQNames.add(qName);
      cls = OpportunityCompetitorsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunityItem");
      this.cachedSerQNames.add(qName);
      cls = OpportunityItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunityItemList");
      this.cachedSerQNames.add(qName);
      cls = OpportunityItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunityPartnersList");
      this.cachedSerQNames.add(qName);
      cls = OpportunityPartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunitySalesTeam");
      this.cachedSerQNames.add(qName);
      cls = OpportunitySalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunitySalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = OpportunitySalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunitySearch");
      this.cachedSerQNames.add(qName);
      cls = OpportunitySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunitySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = OpportunitySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunitySearchRow");
      this.cachedSerQNames.add(qName);
      cls = OpportunitySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "Promotions");
      this.cachedSerQNames.add(qName);
      cls = Promotions.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "PromotionsList");
      this.cachedSerQNames.add(qName);
      cls = PromotionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "SalesOrder");
      this.cachedSerQNames.add(qName);
      cls = SalesOrder.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderItem");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderItem.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderItemList");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderPartnersList");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderPartnersList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderSalesTeam");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderSalesTeam.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderSalesTeamList");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderSalesTeamList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderShipGroupList");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderShipGroupList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "TransactionSearch");
      this.cachedSerQNames.add(qName);
      cls = TransactionSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "TransactionSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TransactionSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "TransactionSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TransactionSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "TransactionShipGroup");
      this.cachedSerQNames.add(qName);
      cls = TransactionShipGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "Usage");
      this.cachedSerQNames.add(qName);
      cls = Usage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   private void addBindings12() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "UsageSearch");
      this.cachedSerQNames.add(qName);
      Class cls = UsageSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "UsageSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = UsageSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "UsageSearchRow");
      this.cachedSerQNames.add(qName);
      cls = UsageSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEvent");
      this.cachedSerQNames.add(qName);
      cls = CalendarEvent.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventAttendee");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventAttendee.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventAttendeeList");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventAttendeeList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventResource");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventResource.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventResourceList");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventResourceList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventSearch");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventSearchRow");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventTimeItemList");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventTimeItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ExclusionDateList");
      this.cachedSerQNames.add(qName);
      cls = ExclusionDateList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCall");
      this.cachedSerQNames.add(qName);
      cls = PhoneCall.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallContact");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallContact.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallContactList");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallContactList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallSearch");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallSearchRow");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallTimeItemList");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallTimeItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTask");
      this.cachedSerQNames.add(qName);
      cls = ProjectTask.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskAssignee");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskAssignee.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskAssigneeList");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskAssigneeList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPredecessor");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskPredecessor.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorList");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskPredecessorList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskSearch");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskTimeItemList");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskTimeItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ResourceAllocation");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocation.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ResourceAllocationSearch");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocationSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ResourceAllocationSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocationSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ResourceAllocationSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocationSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "Task");
      this.cachedSerQNames.add(qName);
      cls = Task.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "TaskContact");
      this.cachedSerQNames.add(qName);
      cls = TaskContact.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "TaskContactList");
      this.cachedSerQNames.add(qName);
      cls = TaskContactList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "TaskSearch");
      this.cachedSerQNames.add(qName);
      cls = TaskSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "TaskSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TaskSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "TaskSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TaskSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "TaskTimeItemList");
      this.cachedSerQNames.add(qName);
      cls = TaskTimeItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingCostDetail");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostDetail.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingCostDetailList");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostDetailList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingCostTemplate");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostTemplate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingCostTemplateSearch");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostTemplateSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingCostTemplateSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostTemplateSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingCostTemplateSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingCostTemplateSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTask");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTask.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessor");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskPredecessor.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorList");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskPredecessorList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskSearch");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRouting");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRouting.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingComponent");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingRoutingComponent.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingComponentList");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingRoutingComponentList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingStep");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingRoutingStep.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingStepList");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingRoutingStepList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRoutingSearch");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRoutingSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingRoutingSearchRow");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingRoutingSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "EmailEmployeesList");
      this.cachedSerQNames.add(qName);
      cls = EmailEmployeesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "Issue");
      this.cachedSerQNames.add(qName);
      cls = Issue.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueRelatedIssues");
      this.cachedSerQNames.add(qName);
      cls = IssueRelatedIssues.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueRelatedIssuesList");
      this.cachedSerQNames.add(qName);
      cls = IssueRelatedIssuesList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueSearch");
      this.cachedSerQNames.add(qName);
      cls = IssueSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = IssueSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueSearchRow");
      this.cachedSerQNames.add(qName);
      cls = IssueSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueVersion");
      this.cachedSerQNames.add(qName);
      cls = IssueVersion.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueVersionList");
      this.cachedSerQNames.add(qName);
      cls = IssueVersionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "Solution");
      this.cachedSerQNames.add(qName);
      cls = Solution.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "Solutions");
      this.cachedSerQNames.add(qName);
      cls = Solutions.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SolutionSearch");
      this.cachedSerQNames.add(qName);
      cls = SolutionSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SolutionSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = SolutionSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SolutionSearchRow");
      this.cachedSerQNames.add(qName);
      cls = SolutionSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SolutionsList");
      this.cachedSerQNames.add(qName);
      cls = SolutionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SolutionTopics");
      this.cachedSerQNames.add(qName);
      cls = SolutionTopics.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SolutionTopicsList");
      this.cachedSerQNames.add(qName);
      cls = SolutionTopicsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCase");
      this.cachedSerQNames.add(qName);
      cls = SupportCase.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseEscalateTo");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseEscalateTo.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseEscalateToList");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseEscalateToList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseIssue");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseIssue.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseOrigin");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseOrigin.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCasePriority");
      this.cachedSerQNames.add(qName);
      cls = SupportCasePriority.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseSearch");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseSearchRow");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseSolutions");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseSolutions.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseSolutionsList");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseSolutionsList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseStatus");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseTimeItemList");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseTimeItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "SupportCaseType");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "Topic");
      this.cachedSerQNames.add(qName);
      cls = Topic.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSearch");
      this.cachedSerQNames.add(qName);
      cls = TopicSearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = TopicSearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSearchRow");
      this.cachedSerQNames.add(qName);
      cls = TopicSearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSolution");
      this.cachedSerQNames.add(qName);
      cls = TopicSolution.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSolutionList");
      this.cachedSerQNames.add(qName);
      cls = TopicSolutionList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "AccountingBookStatus");
      this.cachedSerQNames.add(qName);
      cls = AccountingBookStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "AccountType");
      this.cachedSerQNames.add(qName);
      cls = AccountType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "AssemblyItemEffectiveBomControl");
      this.cachedSerQNames.add(qName);
      cls = AssemblyItemEffectiveBomControl.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
   }

   private void addBindings13() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleFrequency");
      this.cachedSerQNames.add(qName);
      Class cls = BillingScheduleFrequency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleMonthDow");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleMonthDow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleMonthDowim");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleMonthDowim.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceMode");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleRecurrenceMode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleRecurrencePattern");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleRecurrencePattern.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceRecurrenceUnits");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleRecurrenceRecurrenceUnits.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleRepeatEvery");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleRepeatEvery.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleType");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleYearDow");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleYearDow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleYearDowim");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleYearDowim.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleYearDowimMonth");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleYearDowimMonth.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "BillingScheduleYearMonth");
      this.cachedSerQNames.add(qName);
      cls = BillingScheduleYearMonth.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "CashFlowRateType");
      this.cachedSerQNames.add(qName);
      cls = CashFlowRateType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ConsolidatedRate");
      this.cachedSerQNames.add(qName);
      cls = ConsolidatedRate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "CostCategoryItemCostType");
      this.cachedSerQNames.add(qName);
      cls = CostCategoryItemCostType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "CurrencyCurrencyPrecision");
      this.cachedSerQNames.add(qName);
      cls = CurrencyCurrencyPrecision.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "CurrencyFxRateUpdateTimezone");
      this.cachedSerQNames.add(qName);
      cls = CurrencyFxRateUpdateTimezone.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "CurrencyLocale");
      this.cachedSerQNames.add(qName);
      cls = CurrencyLocale.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "FairValuePriceFairValueRangePolicy");
      this.cachedSerQNames.add(qName);
      cls = FairValuePriceFairValueRangePolicy.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "GeneralRateType");
      this.cachedSerQNames.add(qName);
      cls = GeneralRateType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "HazmatPackingGroup");
      this.cachedSerQNames.add(qName);
      cls = HazmatPackingGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "InventoryItemFraudRisk");
      this.cachedSerQNames.add(qName);
      cls = InventoryItemFraudRisk.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemAccountMappingItemAccount");
      this.cachedSerQNames.add(qName);
      cls = ItemAccountMappingItemAccount.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemAtpMethod");
      this.cachedSerQNames.add(qName);
      cls = ItemAtpMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemCostAccountingStatus");
      this.cachedSerQNames.add(qName);
      cls = ItemCostAccountingStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemCostingMethod");
      this.cachedSerQNames.add(qName);
      cls = ItemCostingMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemDemandSource");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandSource.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemEbayAuctionDuration");
      this.cachedSerQNames.add(qName);
      cls = ItemEbayAuctionDuration.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemEbayRelistingOption");
      this.cachedSerQNames.add(qName);
      cls = ItemEbayRelistingOption.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemInvtClassification");
      this.cachedSerQNames.add(qName);
      cls = ItemInvtClassification.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemMatrixType");
      this.cachedSerQNames.add(qName);
      cls = ItemMatrixType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemOutOfStockBehavior");
      this.cachedSerQNames.add(qName);
      cls = ItemOutOfStockBehavior.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType");
      this.cachedSerQNames.add(qName);
      cls = ItemOverallQuantityPricingType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemOverheadType");
      this.cachedSerQNames.add(qName);
      cls = ItemOverheadType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemPreferenceCriterion");
      this.cachedSerQNames.add(qName);
      cls = ItemPreferenceCriterion.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemProductFeed");
      this.cachedSerQNames.add(qName);
      cls = ItemProductFeed.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemSubType");
      this.cachedSerQNames.add(qName);
      cls = ItemSubType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemSupplyLotSizingMethod");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyLotSizingMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemSupplyReplenishmentMethod");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyReplenishmentMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemSupplyType");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemType");
      this.cachedSerQNames.add(qName);
      cls = ItemType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemVsoeSopGroup");
      this.cachedSerQNames.add(qName);
      cls = ItemVsoeSopGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemWeightUnit");
      this.cachedSerQNames.add(qName);
      cls = ItemWeightUnit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "LocationAutoAssignmentRegionSetting");
      this.cachedSerQNames.add(qName);
      cls = LocationAutoAssignmentRegionSetting.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "LocationGeolocationMethod");
      this.cachedSerQNames.add(qName);
      cls = LocationGeolocationMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "LocationTimeZone");
      this.cachedSerQNames.add(qName);
      cls = LocationTimeZone.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "LocationType");
      this.cachedSerQNames.add(qName);
      cls = LocationType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "PeriodicLotSizeType");
      this.cachedSerQNames.add(qName);
      cls = PeriodicLotSizeType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleAmortizationStatus");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleAmortizationStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleAmortizationType");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleAmortizationType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleRecogIntervalSrc");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleRecogIntervalSrc.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceType");
      this.cachedSerQNames.add(qName);
      cls = RevRecScheduleRecurrenceType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "SalesTaxItemAvailable");
      this.cachedSerQNames.add(qName);
      cls = SalesTaxItemAvailable.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ScheduleBCode");
      this.cachedSerQNames.add(qName);
      cls = ScheduleBCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "TaxAcctType");
      this.cachedSerQNames.add(qName);
      cls = TaxAcctType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "AlcoholRecipientType");
      this.cachedSerQNames.add(qName);
      cls = AlcoholRecipientType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "AvsMatchCode");
      this.cachedSerQNames.add(qName);
      cls = AvsMatchCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Country");
      this.cachedSerQNames.add(qName);
      cls = Country.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "CscMatchCode");
      this.cachedSerQNames.add(qName);
      cls = CscMatchCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "CurrencySymbolPlacement");
      this.cachedSerQNames.add(qName);
      cls = CurrencySymbolPlacement.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus");
      this.cachedSerQNames.add(qName);
      cls = GlobalSubscriptionStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "IntercoStatus");
      this.cachedSerQNames.add(qName);
      cls = IntercoStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "ItemCostEstimateType");
      this.cachedSerQNames.add(qName);
      cls = ItemCostEstimateType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "ItemSource");
      this.cachedSerQNames.add(qName);
      cls = ItemSource.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "LandedCostMethod");
      this.cachedSerQNames.add(qName);
      cls = LandedCostMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "LandedCostSource");
      this.cachedSerQNames.add(qName);
      cls = LandedCostSource.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Language");
      this.cachedSerQNames.add(qName);
      cls = Language.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "PermissionCode");
      this.cachedSerQNames.add(qName);
      cls = PermissionCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "PermissionLevel");
      this.cachedSerQNames.add(qName);
      cls = PermissionLevel.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "PostingPeriodDate");
      this.cachedSerQNames.add(qName);
      cls = PostingPeriodDate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "PresentationItemType");
      this.cachedSerQNames.add(qName);
      cls = PresentationItemType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "RecurrenceDow");
      this.cachedSerQNames.add(qName);
      cls = RecurrenceDow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "RecurrenceDowim");
      this.cachedSerQNames.add(qName);
      cls = RecurrenceDowim.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "RecurrenceFrequency");
      this.cachedSerQNames.add(qName);
      cls = RecurrenceFrequency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "RevenueCommitStatus");
      this.cachedSerQNames.add(qName);
      cls = RevenueCommitStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "RevenueStatus");
      this.cachedSerQNames.add(qName);
      cls = RevenueStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "ShippingCarrier");
      this.cachedSerQNames.add(qName);
      cls = ShippingCarrier.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "SitemapPriority");
      this.cachedSerQNames.add(qName);
      cls = SitemapPriority.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Source");
      this.cachedSerQNames.add(qName);
      cls = Source.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "TimeItemTimeType");
      this.cachedSerQNames.add(qName);
      cls = TimeItemTimeType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "VsoeDeferral");
      this.cachedSerQNames.add(qName);
      cls = VsoeDeferral.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "VsoePermitDiscount");
      this.cachedSerQNames.add(qName);
      cls = VsoePermitDiscount.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "VsoeSopGroup");
      this.cachedSerQNames.add(qName);
      cls = VsoeSopGroup.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.communication_2018_1.general.webservices.netsuite.com", "MessageMessageType");
      this.cachedSerQNames.add(qName);
      cls = MessageMessageType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.communication_2018_1.general.webservices.netsuite.com", "NoteDirection");
      this.cachedSerQNames.add(qName);
      cls = NoteDirection.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "AsyncStatusType");
      this.cachedSerQNames.add(qName);
      cls = AsyncStatusType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventAttendeeResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "DeletedRecordType");
      this.cachedSerQNames.add(qName);
      cls = DeletedRecordType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "DurationUnit");
      this.cachedSerQNames.add(qName);
      cls = DurationUnit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "GetAllRecordType");
      this.cachedSerQNames.add(qName);
      cls = GetAllRecordType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "GetCustomizationType");
      this.cachedSerQNames.add(qName);
      cls = GetCustomizationType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "GetSelectValueFilterOperator");
      this.cachedSerQNames.add(qName);
      cls = GetSelectValueFilterOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "InitializeAuxRefType");
      this.cachedSerQNames.add(qName);
      cls = InitializeAuxRefType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "InitializeRefType");
      this.cachedSerQNames.add(qName);
      cls = InitializeRefType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "InitializeType");
      this.cachedSerQNames.add(qName);
      cls = InitializeType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "RecordType");
      this.cachedSerQNames.add(qName);
      cls = RecordType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchDate");
      this.cachedSerQNames.add(qName);
      cls = SearchDate.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchDateFieldOperator");
      this.cachedSerQNames.add(qName);
      cls = SearchDateFieldOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchDoubleFieldOperator");
      this.cachedSerQNames.add(qName);
      cls = SearchDoubleFieldOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectFieldOperator");
      this.cachedSerQNames.add(qName);
      cls = SearchEnumMultiSelectFieldOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
   }

   private void addBindings14() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchLongFieldOperator");
      this.cachedSerQNames.add(qName);
      Class cls = SearchLongFieldOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectFieldOperator");
      this.cachedSerQNames.add(qName);
      cls = SearchMultiSelectFieldOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchRecordType");
      this.cachedSerQNames.add(qName);
      cls = SearchRecordType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchStringFieldOperator");
      this.cachedSerQNames.add(qName);
      cls = SearchStringFieldOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SearchTextNumberFieldOperator");
      this.cachedSerQNames.add(qName);
      cls = SearchTextNumberFieldOperator.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "SignatureAlgorithm");
      this.cachedSerQNames.add(qName);
      cls = SignatureAlgorithm.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customers_2018_1.transactions.webservices.netsuite.com", "ChargeStage");
      this.cachedSerQNames.add(qName);
      cls = ChargeStage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customers_2018_1.transactions.webservices.netsuite.com", "ChargeUse");
      this.cachedSerQNames.add(qName);
      cls = ChargeUse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationOrderStatus");
      this.cachedSerQNames.add(qName);
      cls = ReturnAuthorizationOrderStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationAccessLevel");
      this.cachedSerQNames.add(qName);
      cls = CustomizationAccessLevel.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationDisplayType");
      this.cachedSerQNames.add(qName);
      cls = CustomizationDisplayType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationDynamicDefault");
      this.cachedSerQNames.add(qName);
      cls = CustomizationDynamicDefault.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationFieldType");
      this.cachedSerQNames.add(qName);
      cls = CustomizationFieldType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationFilterCompareType");
      this.cachedSerQNames.add(qName);
      cls = CustomizationFilterCompareType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationSearchLevel");
      this.cachedSerQNames.add(qName);
      cls = CustomizationSearchLevel.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeAccessType");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypeAccessType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsPermittedLevel");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypePermissionsPermittedLevel.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsRestriction");
      this.cachedSerQNames.add(qName);
      cls = CustomRecordTypePermissionsRestriction.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "ItemCustomFieldItemSubType");
      this.cachedSerQNames.add(qName);
      cls = ItemCustomFieldItemSubType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com", "DayOfTheWeek");
      this.cachedSerQNames.add(qName);
      cls = DayOfTheWeek.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlanCalendarType");
      this.cachedSerQNames.add(qName);
      cls = DemandPlanCalendarType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlanMonth");
      this.cachedSerQNames.add(qName);
      cls = DemandPlanMonth.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemDemandPlanProjectionMethod");
      this.cachedSerQNames.add(qName);
      cls = ItemDemandPlanProjectionMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemSupplyPlanOrderType");
      this.cachedSerQNames.add(qName);
      cls = ItemSupplyPlanOrderType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeAccruedTimeAccrualMethod");
      this.cachedSerQNames.add(qName);
      cls = EmployeeAccruedTimeAccrualMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeBaseWageType");
      this.cachedSerQNames.add(qName);
      cls = EmployeeBaseWageType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeCommissionPaymentPreference");
      this.cachedSerQNames.add(qName);
      cls = EmployeeCommissionPaymentPreference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeCompensationCurrency");
      this.cachedSerQNames.add(qName);
      cls = EmployeeCompensationCurrency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeDirectDepositAccountStatus");
      this.cachedSerQNames.add(qName);
      cls = EmployeeDirectDepositAccountStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeePayFrequency");
      this.cachedSerQNames.add(qName);
      cls = EmployeePayFrequency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeTerminationCategory");
      this.cachedSerQNames.add(qName);
      cls = EmployeeTerminationCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeTerminationRegretted");
      this.cachedSerQNames.add(qName);
      cls = EmployeeTerminationRegretted.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeUseTimeData");
      this.cachedSerQNames.add(qName);
      cls = EmployeeUseTimeData.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "EmployeeWorkAssignment");
      this.cachedSerQNames.add(qName);
      cls = EmployeeWorkAssignment.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "Gender");
      this.cachedSerQNames.add(qName);
      cls = Gender.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "PayrollItemItemTypeNoHierarchy");
      this.cachedSerQNames.add(qName);
      cls = PayrollItemItemTypeNoHierarchy.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.employees_2018_1.transactions.webservices.netsuite.com", "TimeBillTimeType");
      this.cachedSerQNames.add(qName);
      cls = TimeBillTimeType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.faults_2018_1.platform.webservices.netsuite.com", "FaultCodeType");
      this.cachedSerQNames.add(qName);
      cls = FaultCodeType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.faults_2018_1.platform.webservices.netsuite.com", "StatusDetailCodeType");
      this.cachedSerQNames.add(qName);
      cls = StatusDetailCodeType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.faults_2018_1.platform.webservices.netsuite.com", "StatusDetailType");
      this.cachedSerQNames.add(qName);
      cls = StatusDetailType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.filecabinet_2018_1.documents.webservices.netsuite.com", "FileAttachFrom");
      this.cachedSerQNames.add(qName);
      cls = FileAttachFrom.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.filecabinet_2018_1.documents.webservices.netsuite.com", "FileEncoding");
      this.cachedSerQNames.add(qName);
      cls = FileEncoding.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.filecabinet_2018_1.documents.webservices.netsuite.com", "FolderFolderType");
      this.cachedSerQNames.add(qName);
      cls = FolderFolderType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.filecabinet_2018_1.documents.webservices.netsuite.com", "MediaType");
      this.cachedSerQNames.add(qName);
      cls = MediaType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.filecabinet_2018_1.documents.webservices.netsuite.com", "TextFileEncoding");
      this.cachedSerQNames.add(qName);
      cls = TextFileEncoding.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.financial_2018_1.transactions.webservices.netsuite.com", "BudgetBudgetType");
      this.cachedSerQNames.add(qName);
      cls = BudgetBudgetType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.inventory_2018_1.transactions.webservices.netsuite.com", "TransferOrderItemCommitInventory");
      this.cachedSerQNames.add(qName);
      cls = TransferOrderItemCommitInventory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.inventory_2018_1.transactions.webservices.netsuite.com", "TransferOrderOrderStatus");
      this.cachedSerQNames.add(qName);
      cls = TransferOrderOrderStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderItemItemCommitInventory");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderItemItemCommitInventory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderOrderStatus");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderOrderStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.inventory_2018_1.transactions.webservices.netsuite.com", "WorkOrderSchedulingMethod");
      this.cachedSerQNames.add(qName);
      cls = WorkOrderSchedulingMethod.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignCampaignDirectMailStatus");
      this.cachedSerQNames.add(qName);
      cls = CampaignCampaignDirectMailStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignCampaignEmailStatus");
      this.cachedSerQNames.add(qName);
      cls = CampaignCampaignEmailStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignCampaignEventStatus");
      this.cachedSerQNames.add(qName);
      cls = CampaignCampaignEventStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignCampaignEventType");
      this.cachedSerQNames.add(qName);
      cls = CampaignCampaignEventType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignChannelEventType");
      this.cachedSerQNames.add(qName);
      cls = CampaignChannelEventType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignResponse");
      this.cachedSerQNames.add(qName);
      cls = com.netsuite.suitetalk.proxy.v2018_1.lists.marketing.types.CampaignResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignResponseCategory");
      this.cachedSerQNames.add(qName);
      cls = CampaignResponseCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignResponseResponse");
      this.cachedSerQNames.add(qName);
      cls = CampaignResponseResponse.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignStatus");
      this.cachedSerQNames.add(qName);
      cls = CampaignStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeApplyDiscountTo");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeApplyDiscountTo.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeUseType");
      this.cachedSerQNames.add(qName);
      cls = PromotionCodeUseType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentShipmentStatus");
      this.cachedSerQNames.add(qName);
      cls = InboundShipmentShipmentStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseOrderOrderStatus");
      this.cachedSerQNames.add(qName);
      cls = PurchaseOrderOrderStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.purchases_2018_1.transactions.webservices.netsuite.com", "TransactionBillVarianceStatus");
      this.cachedSerQNames.add(qName);
      cls = TransactionBillVarianceStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.purchases_2018_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationOrderStatus");
      this.cachedSerQNames.add(qName);
      cls = VendorReturnAuthorizationOrderStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "BillingAccountFrequency");
      this.cachedSerQNames.add(qName);
      cls = BillingAccountFrequency.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "ContactType");
      this.cachedSerQNames.add(qName);
      cls = ContactType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerCreditHoldOverride");
      this.cachedSerQNames.add(qName);
      cls = CustomerCreditHoldOverride.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerMonthlyClosing");
      this.cachedSerQNames.add(qName);
      cls = CustomerMonthlyClosing.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerNegativeNumberFormat");
      this.cachedSerQNames.add(qName);
      cls = CustomerNegativeNumberFormat.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerNumberFormat");
      this.cachedSerQNames.add(qName);
      cls = CustomerNumberFormat.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerOtherRelationships");
      this.cachedSerQNames.add(qName);
      cls = CustomerOtherRelationships.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerStage");
      this.cachedSerQNames.add(qName);
      cls = CustomerStage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerStatusStage");
      this.cachedSerQNames.add(qName);
      cls = CustomerStatusStage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "EmailPreference");
      this.cachedSerQNames.add(qName);
      cls = EmailPreference.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "EntityGroupType");
      this.cachedSerQNames.add(qName);
      cls = EntityGroupType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "EntityType");
      this.cachedSerQNames.add(qName);
      cls = EntityType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "JobBillingType");
      this.cachedSerQNames.add(qName);
      cls = JobBillingType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "PartnerOtherRelationships");
      this.cachedSerQNames.add(qName);
      cls = PartnerOtherRelationships.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "TaxFractionUnit");
      this.cachedSerQNames.add(qName);
      cls = TaxFractionUnit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "TaxRounding");
      this.cachedSerQNames.add(qName);
      cls = TaxRounding.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "VendorOtherRelationships");
      this.cachedSerQNames.add(qName);
      cls = VendorOtherRelationships.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionRevCommitStatus");
      this.cachedSerQNames.add(qName);
      cls = AccountingTransactionRevCommitStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionRevenueStatus");
      this.cachedSerQNames.add(qName);
      cls = AccountingTransactionRevenueStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ForecastType");
      this.cachedSerQNames.add(qName);
      cls = ForecastType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentAccessibilityTypeFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentAccessibilityTypeFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentAncillaryEndorsementFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentAncillaryEndorsementFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentB13AFilingOptionFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentB13AFilingOptionFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentExportTypeUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentExportTypeUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentHazmatTypeFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentHazmatTypeFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentHomeDeliveryTypeFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentHomeDeliveryTypeFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentLicenseExceptionUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentLicenseExceptionUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentMethodOfTransportUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentMethodOfTransportUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExAdmPackageTypeFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedExAdmPackageTypeFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodFreightTypeFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedExCodFreightTypeFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodMethodFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedExCodMethodFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExDeliveryConfFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedExDeliveryConfFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPackagingFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedExPackagingFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPriorityAlertTypeFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageFedExPriorityAlertTypeFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
   }

   private void addBindings15() {
      Class beansf = BeanSerializerFactory.class;
      Class beandf = BeanDeserializerFactory.class;
      Class enumsf = EnumSerializerFactory.class;
      Class enumdf = EnumDeserializerFactory.class;
      Class arraysf = ArraySerializerFactory.class;
      Class arraydf = ArrayDeserializerFactory.class;
      Class simplesf = SimpleSerializerFactory.class;
      Class simpledf = SimpleDeserializerFactory.class;
      Class simplelistsf = SimpleListSerializerFactory.class;
      Class simplelistdf = SimpleListDeserializerFactory.class;
      QName qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExSignatureOptionsFedEx");
      this.cachedSerQNames.add(qName);
      Class cls = ItemFulfillmentPackageFedExSignatureOptionsFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsCodMethodUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUpsCodMethodUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsDeliveryConfUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUpsDeliveryConfUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsPackagingUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUpsPackagingUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsDeliveryConfUsps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUspsDeliveryConfUsps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsPackagingUsps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentPackageUspsPackagingUsps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentShipStatus");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentShipStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentTermsOfSaleFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentTermsOfSaleFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeFedEx");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentThirdPartyTypeFedEx.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeUps");
      this.cachedSerQNames.add(qName);
      cls = ItemFulfillmentThirdPartyTypeUps.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "OpportunityStatus");
      this.cachedSerQNames.add(qName);
      cls = OpportunityStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderItemCommitInventory");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderItemCommitInventory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderItemCreatePo");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderItemCreatePo.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderItemFulfillmentChoice");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderItemFulfillmentChoice.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "SalesOrderOrderStatus");
      this.cachedSerQNames.add(qName);
      cls = SalesOrderOrderStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionApprovalStatus");
      this.cachedSerQNames.add(qName);
      cls = TransactionApprovalStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionChargeType");
      this.cachedSerQNames.add(qName);
      cls = TransactionChargeType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionLineType");
      this.cachedSerQNames.add(qName);
      cls = TransactionLineType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionLinkType");
      this.cachedSerQNames.add(qName);
      cls = TransactionLinkType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionPaymentEventHoldReason");
      this.cachedSerQNames.add(qName);
      cls = TransactionPaymentEventHoldReason.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionPaymentEventResult");
      this.cachedSerQNames.add(qName);
      cls = TransactionPaymentEventResult.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionPaymentEventType");
      this.cachedSerQNames.add(qName);
      cls = TransactionPaymentEventType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionStatus");
      this.cachedSerQNames.add(qName);
      cls = TransactionStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionType");
      this.cachedSerQNames.add(qName);
      cls = TransactionType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventAccessLevel");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventAccessLevel.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventAttendeeAttendance");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventAttendeeAttendance.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventReminderMinutes");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventReminderMinutes.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventReminderType");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventReminderType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventStatus");
      this.cachedSerQNames.add(qName);
      cls = CalendarEventStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallPriority");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallPriority.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallReminderMinutes");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallReminderMinutes.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallReminderType");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallReminderType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallStatus");
      this.cachedSerQNames.add(qName);
      cls = PhoneCallStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskConstraintType");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskConstraintType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorPredecessorType");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskPredecessorPredecessorType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPriority");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskPriority.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskStatus");
      this.cachedSerQNames.add(qName);
      cls = ProjectTaskStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ResourceAllocationAllocationUnit");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocationAllocationUnit.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ResourceAllocationApprovalStatus");
      this.cachedSerQNames.add(qName);
      cls = ResourceAllocationApprovalStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "TaskPriority");
      this.cachedSerQNames.add(qName);
      cls = TaskPriority.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "TaskReminderMinutes");
      this.cachedSerQNames.add(qName);
      cls = TaskReminderMinutes.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "TaskReminderType");
      this.cachedSerQNames.add(qName);
      cls = TaskReminderType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "TaskStatus");
      this.cachedSerQNames.add(qName);
      cls = TaskStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingLagType");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingLagType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorPredecessorType");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskPredecessorPredecessorType.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskStatus");
      this.cachedSerQNames.add(qName);
      cls = ManufacturingOperationTaskStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.support_2018_1.lists.webservices.netsuite.com", "IssueEventStatus");
      this.cachedSerQNames.add(qName);
      cls = IssueEventStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.support_2018_1.lists.webservices.netsuite.com", "IssueRelationship");
      this.cachedSerQNames.add(qName);
      cls = IssueRelationship.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.support_2018_1.lists.webservices.netsuite.com", "IssueTrackCode");
      this.cachedSerQNames.add(qName);
      cls = IssueTrackCode.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.support_2018_1.lists.webservices.netsuite.com", "SolutionStatus");
      this.cachedSerQNames.add(qName);
      cls = SolutionStatus.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.support_2018_1.lists.webservices.netsuite.com", "SupportCaseStage");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseStage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:types.support_2018_1.lists.webservices.netsuite.com", "SupportCaseStatusStage");
      this.cachedSerQNames.add(qName);
      cls = SupportCaseStatusStage.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(enumsf);
      this.cachedDeserFactories.add(enumdf);
      qName = new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategory");
      this.cachedSerQNames.add(qName);
      cls = com.netsuite.suitetalk.proxy.v2018_1.lists.website.SiteCategory.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategoryPresentationItemList");
      this.cachedSerQNames.add(qName);
      cls = SiteCategoryPresentationItemList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategorySearch");
      this.cachedSerQNames.add(qName);
      cls = SiteCategorySearch.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategorySearchAdvanced");
      this.cachedSerQNames.add(qName);
      cls = SiteCategorySearchAdvanced.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategorySearchRow");
      this.cachedSerQNames.add(qName);
      cls = SiteCategorySearchRow.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategoryTranslation");
      this.cachedSerQNames.add(qName);
      cls = SiteCategoryTranslation.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
      qName = new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategoryTranslationList");
      this.cachedSerQNames.add(qName);
      cls = SiteCategoryTranslationList.class;
      this.cachedSerClasses.add(cls);
      this.cachedSerFactories.add(beansf);
      this.cachedDeserFactories.add(beandf);
   }

   protected Call createCall() throws RemoteException {
      try {
         Call _call = super._createCall();
         if (super.maintainSessionSet) {
            _call.setMaintainSession(super.maintainSession);
         }

         if (super.cachedUsername != null) {
            _call.setUsername(super.cachedUsername);
         }

         if (super.cachedPassword != null) {
            _call.setPassword(super.cachedPassword);
         }

         if (super.cachedEndpoint != null) {
            _call.setTargetEndpointAddress(super.cachedEndpoint);
         }

         if (super.cachedTimeout != null) {
            _call.setTimeout(super.cachedTimeout);
         }

         if (super.cachedPortName != null) {
            _call.setPortName(super.cachedPortName);
         }

         Enumeration keys = super.cachedProperties.keys();

         while(keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            _call.setProperty(key, super.cachedProperties.get(key));
         }

         synchronized(this) {
            if (this.firstCall()) {
               _call.setEncodingStyle((String)null);

               for(int i = 0; i < this.cachedSerFactories.size(); ++i) {
                  Class cls = (Class)this.cachedSerClasses.get(i);
                  QName qName = (QName)this.cachedSerQNames.get(i);
                  Object x = this.cachedSerFactories.get(i);
                  if (x instanceof Class) {
                     Class sf = (Class)this.cachedSerFactories.get(i);
                     Class df = (Class)this.cachedDeserFactories.get(i);
                     _call.registerTypeMapping(cls, qName, sf, df, false);
                  } else if (x instanceof SerializerFactory) {
                     org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)this.cachedSerFactories.get(i);
                     DeserializerFactory df = (DeserializerFactory)this.cachedDeserFactories.get(i);
                     _call.registerTypeMapping(cls, qName, sf, df, false);
                  }
               }
            }
         }

         return _call;
      } catch (Throwable var12) {
         throw new AxisFault("Failure trying to get the Call object", var12);
      }
   }

   public SessionResponse login(Passport passport) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[0]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("login");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "login"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{passport});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SessionResponse)_resp;
               } catch (Exception var5) {
                  return (SessionResponse)JavaUtils.convert(_resp, SessionResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof InvalidAccountFault) {
                  throw (InvalidAccountFault)var6.detail;
               }

               if (var6.detail instanceof InvalidVersionFault) {
                  throw (InvalidVersionFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public SessionResponse ssoLogin(SsoPassport ssoPassport) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[1]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("ssoLogin");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ssoLogin"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{ssoPassport});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SessionResponse)_resp;
               } catch (Exception var5) {
                  return (SessionResponse)JavaUtils.convert(_resp, SessionResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof InvalidAccountFault) {
                  throw (InvalidAccountFault)var6.detail;
               }

               if (var6.detail instanceof InvalidVersionFault) {
                  throw (InvalidVersionFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public SessionResponse mapSso(SsoCredentials ssoCredentials) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[2]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("mapSso");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "mapSso"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{ssoCredentials});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SessionResponse)_resp;
               } catch (Exception var5) {
                  return (SessionResponse)JavaUtils.convert(_resp, SessionResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof InvalidAccountFault) {
                  throw (InvalidAccountFault)var6.detail;
               }

               if (var6.detail instanceof InvalidVersionFault) {
                  throw (InvalidVersionFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public SessionResponse changePassword(ChangePassword changePassword) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[3]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("changePassword");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "changePassword"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{changePassword});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SessionResponse)_resp;
               } catch (Exception var5) {
                  return (SessionResponse)JavaUtils.convert(_resp, SessionResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof InvalidAccountFault) {
                  throw (InvalidAccountFault)var6.detail;
               }

               if (var6.detail instanceof InvalidVersionFault) {
                  throw (InvalidVersionFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public SessionResponse changeEmail(ChangeEmail changeEmail) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[4]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("changeEmail");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "changeEmail"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{changeEmail});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SessionResponse)_resp;
               } catch (Exception var5) {
                  return (SessionResponse)JavaUtils.convert(_resp, SessionResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof InvalidAccountFault) {
                  throw (InvalidAccountFault)var6.detail;
               }

               if (var6.detail instanceof InvalidVersionFault) {
                  throw (InvalidVersionFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public SessionResponse logout() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[5]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("logout");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "logout"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[0]);
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SessionResponse)_resp;
               } catch (Exception var4) {
                  return (SessionResponse)JavaUtils.convert(_resp, SessionResponse.class);
               }
            }
         } catch (AxisFault var5) {
            if (var5.detail != null) {
               if (var5.detail instanceof RemoteException) {
                  throw (RemoteException)var5.detail;
               }

               if (var5.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var5.detail;
               }

               if (var5.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var5.detail;
               }

               if (var5.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var5.detail;
               }

               if (var5.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var5.detail;
               }

               if (var5.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var5.detail;
               }
            }

            throw var5;
         }
      }
   }

   public WriteResponse add(Record record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[6]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("add");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "add"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponse)_resp;
               } catch (Exception var5) {
                  return (WriteResponse)JavaUtils.convert(_resp, WriteResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponse delete(BaseRef baseRef, DeletionReason deletionReason) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[7]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("delete");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "delete"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{baseRef, deletionReason});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponse)_resp;
               } catch (Exception var6) {
                  return (WriteResponse)JavaUtils.convert(_resp, WriteResponse.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   public SearchResult search(SearchRecord searchRecord) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[8]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("search");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "search"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{searchRecord});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SearchResult)_resp;
               } catch (Exception var5) {
                  return (SearchResult)JavaUtils.convert(_resp, SearchResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public SearchResult searchMore(int pageIndex) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[9]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("searchMore");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "searchMore"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{new Integer(pageIndex)});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SearchResult)_resp;
               } catch (Exception var5) {
                  return (SearchResult)JavaUtils.convert(_resp, SearchResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public SearchResult searchMoreWithId(String searchId, int pageIndex) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[10]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("searchMoreWithId");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "searchMoreWithId"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{searchId, new Integer(pageIndex)});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SearchResult)_resp;
               } catch (Exception var6) {
                  return (SearchResult)JavaUtils.convert(_resp, SearchResult.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   public SearchResult searchNext() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[11]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("searchNext");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "searchNext"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[0]);
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (SearchResult)_resp;
               } catch (Exception var4) {
                  return (SearchResult)JavaUtils.convert(_resp, SearchResult.class);
               }
            }
         } catch (AxisFault var5) {
            if (var5.detail != null) {
               if (var5.detail instanceof RemoteException) {
                  throw (RemoteException)var5.detail;
               }

               if (var5.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var5.detail;
               }

               if (var5.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var5.detail;
               }

               if (var5.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var5.detail;
               }

               if (var5.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var5.detail;
               }

               if (var5.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var5.detail;
               }

               if (var5.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var5.detail;
               }

               if (var5.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var5.detail;
               }

               if (var5.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var5.detail;
               }
            }

            throw var5;
         }
      }
   }

   public WriteResponse update(Record record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[12]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("update");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "update"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponse)_resp;
               } catch (Exception var5) {
                  return (WriteResponse)JavaUtils.convert(_resp, WriteResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponse upsert(Record record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[13]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("upsert");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "upsert"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponse)_resp;
               } catch (Exception var5) {
                  return (WriteResponse)JavaUtils.convert(_resp, WriteResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponseList addList(Record[] record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[14]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("addList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "addList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponseList)_resp;
               } catch (Exception var5) {
                  return (WriteResponseList)JavaUtils.convert(_resp, WriteResponseList.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponseList deleteList(BaseRef[] baseRef, DeletionReason deletionReason) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[15]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("deleteList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "deleteList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{baseRef, deletionReason});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponseList)_resp;
               } catch (Exception var6) {
                  return (WriteResponseList)JavaUtils.convert(_resp, WriteResponseList.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   public WriteResponseList updateList(Record[] record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[16]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("updateList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "updateList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponseList)_resp;
               } catch (Exception var5) {
                  return (WriteResponseList)JavaUtils.convert(_resp, WriteResponseList.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponseList upsertList(Record[] record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[17]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("upsertList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "upsertList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponseList)_resp;
               } catch (Exception var5) {
                  return (WriteResponseList)JavaUtils.convert(_resp, WriteResponseList.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public ReadResponse get(BaseRef baseRef) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[18]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("get");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "get"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{baseRef});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (ReadResponse)_resp;
               } catch (Exception var5) {
                  return (ReadResponse)JavaUtils.convert(_resp, ReadResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public ReadResponseList getList(BaseRef[] baseRef) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[19]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{baseRef});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (ReadResponseList)_resp;
               } catch (Exception var5) {
                  return (ReadResponseList)JavaUtils.convert(_resp, ReadResponseList.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetAllResult getAll(GetAllRecord record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[20]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getAll");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getAll"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetAllResult)_resp;
               } catch (Exception var5) {
                  return (GetAllResult)JavaUtils.convert(_resp, GetAllResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetSavedSearchResult getSavedSearch(GetSavedSearchRecord record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[21]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getSavedSearch");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getSavedSearch"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetSavedSearchResult)_resp;
               } catch (Exception var5) {
                  return (GetSavedSearchResult)JavaUtils.convert(_resp, GetSavedSearchResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetCustomizationIdResult getCustomizationId(CustomizationType customizationType, boolean includeInactives) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[22]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getCustomizationId");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getCustomizationId"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{customizationType, new Boolean(includeInactives)});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetCustomizationIdResult)_resp;
               } catch (Exception var6) {
                  return (GetCustomizationIdResult)JavaUtils.convert(_resp, GetCustomizationIdResult.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   public ReadResponse initialize(InitializeRecord initializeRecord) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[23]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("initialize");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "initialize"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{initializeRecord});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (ReadResponse)_resp;
               } catch (Exception var5) {
                  return (ReadResponse)JavaUtils.convert(_resp, ReadResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public ReadResponseList initializeList(InitializeRecord[] initializeRecord) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[24]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("initializeList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "initializeList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{initializeRecord});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (ReadResponseList)_resp;
               } catch (Exception var5) {
                  return (ReadResponseList)JavaUtils.convert(_resp, ReadResponseList.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetSelectValueResult getSelectValue(GetSelectValueFieldDescription fieldDescription, int pageIndex) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[25]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getSelectValue");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getSelectValue"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{fieldDescription, new Integer(pageIndex)});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetSelectValueResult)_resp;
               } catch (Exception var6) {
                  return (GetSelectValueResult)JavaUtils.convert(_resp, GetSelectValueResult.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   public GetItemAvailabilityResult getItemAvailability(ItemAvailabilityFilter itemAvailabilityFilter) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[26]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getItemAvailability");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getItemAvailability"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{itemAvailabilityFilter});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetItemAvailabilityResult)_resp;
               } catch (Exception var5) {
                  return (GetItemAvailabilityResult)JavaUtils.convert(_resp, GetItemAvailabilityResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetBudgetExchangeRateResult getBudgetExchangeRate(BudgetExchangeRateFilter budgetExchangeRateFilter) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[27]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getBudgetExchangeRate");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getBudgetExchangeRate"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{budgetExchangeRateFilter});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetBudgetExchangeRateResult)_resp;
               } catch (Exception var5) {
                  return (GetBudgetExchangeRateResult)JavaUtils.convert(_resp, GetBudgetExchangeRateResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetCurrencyRateResult getCurrencyRate(CurrencyRateFilter currencyRateFilter) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[28]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getCurrencyRate");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getCurrencyRate"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{currencyRateFilter});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetCurrencyRateResult)_resp;
               } catch (Exception var5) {
                  return (GetCurrencyRateResult)JavaUtils.convert(_resp, GetCurrencyRateResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetDataCenterUrlsResult getDataCenterUrls(String account) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[29]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getDataCenterUrls");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getDataCenterUrls"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{account});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetDataCenterUrlsResult)_resp;
               } catch (Exception var5) {
                  return (GetDataCenterUrlsResult)JavaUtils.convert(_resp, GetDataCenterUrlsResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetPostingTransactionSummaryResult getPostingTransactionSummary(PostingTransactionSummaryField fields, PostingTransactionSummaryFilter filters, int pageIndex, String operationId) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[30]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getPostingTransactionSummary");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getPostingTransactionSummary"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{fields, filters, new Integer(pageIndex), operationId});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetPostingTransactionSummaryResult)_resp;
               } catch (Exception var8) {
                  return (GetPostingTransactionSummaryResult)JavaUtils.convert(_resp, GetPostingTransactionSummaryResult.class);
               }
            }
         } catch (AxisFault var9) {
            if (var9.detail != null) {
               if (var9.detail instanceof RemoteException) {
                  throw (RemoteException)var9.detail;
               }

               if (var9.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var9.detail;
               }

               if (var9.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var9.detail;
               }

               if (var9.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var9.detail;
               }

               if (var9.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var9.detail;
               }

               if (var9.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var9.detail;
               }

               if (var9.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var9.detail;
               }

               if (var9.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var9.detail;
               }

               if (var9.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var9.detail;
               }

               if (var9.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var9.detail;
               }
            }

            throw var9;
         }
      }
   }

   public GetServerTimeResult getServerTime() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[31]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getServerTime");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getServerTime"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[0]);
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetServerTimeResult)_resp;
               } catch (Exception var4) {
                  return (GetServerTimeResult)JavaUtils.convert(_resp, GetServerTimeResult.class);
               }
            }
         } catch (AxisFault var5) {
            if (var5.detail != null) {
               if (var5.detail instanceof RemoteException) {
                  throw (RemoteException)var5.detail;
               }

               if (var5.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var5.detail;
               }

               if (var5.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var5.detail;
               }

               if (var5.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var5.detail;
               }

               if (var5.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var5.detail;
               }

               if (var5.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var5.detail;
               }

               if (var5.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var5.detail;
               }

               if (var5.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var5.detail;
               }
            }

            throw var5;
         }
      }
   }

   public WriteResponse attach(AttachReference attachReference) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[32]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("attach");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "attach"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{attachReference});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponse)_resp;
               } catch (Exception var5) {
                  return (WriteResponse)JavaUtils.convert(_resp, WriteResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponse detach(DetachReference detachReference) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[33]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("detach");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "detach"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{detachReference});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponse)_resp;
               } catch (Exception var5) {
                  return (WriteResponse)JavaUtils.convert(_resp, WriteResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponse updateInviteeStatus(UpdateInviteeStatusReference updateInviteeStatusReference) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[34]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("updateInviteeStatus");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "updateInviteeStatus"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{updateInviteeStatusReference});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponse)_resp;
               } catch (Exception var5) {
                  return (WriteResponse)JavaUtils.convert(_resp, WriteResponse.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public WriteResponseList updateInviteeStatusList(UpdateInviteeStatusReference[] updateInviteeStatusReference) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[35]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("updateInviteeStatusList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "updateInviteeStatusList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{updateInviteeStatusReference});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (WriteResponseList)_resp;
               } catch (Exception var5) {
                  return (WriteResponseList)JavaUtils.convert(_resp, WriteResponseList.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public AsyncStatusResult asyncAddList(Record[] record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[36]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("asyncAddList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncAddList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var5) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public AsyncStatusResult asyncUpdateList(Record[] record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[37]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("asyncUpdateList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncUpdateList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var5) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public AsyncStatusResult asyncUpsertList(Record[] record) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[38]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("asyncUpsertList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncUpsertList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{record});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var5) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public AsyncStatusResult asyncDeleteList(BaseRef[] baseRef, DeletionReason deletionReason) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[39]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("asyncDeleteList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncDeleteList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{baseRef, deletionReason});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var6) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   public AsyncStatusResult asyncGetList(BaseRef[] baseRef) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[40]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("asyncGetList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncGetList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{baseRef});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var5) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public AsyncStatusResult asyncInitializeList(InitializeRecord[] initializeRecord) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[41]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("asyncInitializeList");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncInitializeList"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{initializeRecord});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var5) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public AsyncStatusResult asyncSearch(SearchRecord searchRecord) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[42]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("asyncSearch");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "asyncSearch"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{searchRecord});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var5) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public AsyncResult getAsyncResult(String jobId, int pageIndex) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, AsyncFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[43]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getAsyncResult");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getAsyncResult"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{jobId, new Integer(pageIndex)});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncResult)_resp;
               } catch (Exception var6) {
                  return (AsyncResult)JavaUtils.convert(_resp, AsyncResult.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof AsyncFault) {
                  throw (AsyncFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   public AsyncStatusResult checkAsyncStatus(String jobId) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, AsyncFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[44]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("checkAsyncStatus");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "checkAsyncStatus"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{jobId});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (AsyncStatusResult)_resp;
               } catch (Exception var5) {
                  return (AsyncStatusResult)JavaUtils.convert(_resp, AsyncStatusResult.class);
               }
            }
         } catch (AxisFault var6) {
            if (var6.detail != null) {
               if (var6.detail instanceof RemoteException) {
                  throw (RemoteException)var6.detail;
               }

               if (var6.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var6.detail;
               }

               if (var6.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var6.detail;
               }

               if (var6.detail instanceof AsyncFault) {
                  throw (AsyncFault)var6.detail;
               }

               if (var6.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var6.detail;
               }

               if (var6.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var6.detail;
               }

               if (var6.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var6.detail;
               }
            }

            throw var6;
         }
      }
   }

   public GetDeletedResult getDeleted(GetDeletedFilter getDeletedFilter, int pageIndex) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault {
      if (super.cachedEndpoint == null) {
         throw new NoEndPointException();
      } else {
         Call _call = this.createCall();
         _call.setOperation(_operations[45]);
         _call.setUseSOAPAction(true);
         _call.setSOAPActionURI("getDeleted");
         _call.setEncodingStyle((String)null);
         _call.setProperty("sendXsiTypes", Boolean.FALSE);
         _call.setProperty("sendMultiRefs", Boolean.FALSE);
         _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
         _call.setOperationName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "getDeleted"));
         this.setRequestHeaders(_call);
         this.setAttachments(_call);

         try {
            Object _resp = _call.invoke(new Object[]{getDeletedFilter, new Integer(pageIndex)});
            if (_resp instanceof RemoteException) {
               throw (RemoteException)_resp;
            } else {
               this.extractAttachments(_call);

               try {
                  return (GetDeletedResult)_resp;
               } catch (Exception var6) {
                  return (GetDeletedResult)JavaUtils.convert(_resp, GetDeletedResult.class);
               }
            }
         } catch (AxisFault var7) {
            if (var7.detail != null) {
               if (var7.detail instanceof RemoteException) {
                  throw (RemoteException)var7.detail;
               }

               if (var7.detail instanceof InsufficientPermissionFault) {
                  throw (InsufficientPermissionFault)var7.detail;
               }

               if (var7.detail instanceof InvalidCredentialsFault) {
                  throw (InvalidCredentialsFault)var7.detail;
               }

               if (var7.detail instanceof ExceededConcurrentRequestLimitFault) {
                  throw (ExceededConcurrentRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRecordCountFault) {
                  throw (ExceededRecordCountFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestSizeFault) {
                  throw (ExceededRequestSizeFault)var7.detail;
               }

               if (var7.detail instanceof ExceededRequestLimitFault) {
                  throw (ExceededRequestLimitFault)var7.detail;
               }

               if (var7.detail instanceof ExceededUsageLimitFault) {
                  throw (ExceededUsageLimitFault)var7.detail;
               }

               if (var7.detail instanceof UnexpectedErrorFault) {
                  throw (UnexpectedErrorFault)var7.detail;
               }

               if (var7.detail instanceof InvalidSessionFault) {
                  throw (InvalidSessionFault)var7.detail;
               }
            }

            throw var7;
         }
      }
   }

   static {
      _initOperationDesc1();
      _initOperationDesc2();
      _initOperationDesc3();
      _initOperationDesc4();
      _initOperationDesc5();
   }
}