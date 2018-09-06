package com.netsuite.suitetalk.proxy.v2018_1.platform;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.messages.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NetSuitePortType extends Remote {
   SessionResponse login(Passport var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SessionResponse ssoLogin(SsoPassport var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SessionResponse mapSso(SsoCredentials var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SessionResponse changePassword(ChangePassword var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SessionResponse changeEmail(ChangeEmail var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SessionResponse logout() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponse add(Record var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponse delete(BaseRef var1, DeletionReason var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SearchResult search(SearchRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SearchResult searchMore(int var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SearchResult searchMoreWithId(String var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   SearchResult searchNext() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponse update(Record var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponse upsert(Record var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponseList addList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponseList deleteList(BaseRef[] var1, DeletionReason var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponseList updateList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponseList upsertList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   ReadResponse get(BaseRef var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   ReadResponseList getList(BaseRef[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetAllResult getAll(GetAllRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetSavedSearchResult getSavedSearch(GetSavedSearchRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetCustomizationIdResult getCustomizationId(CustomizationType var1, boolean var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   ReadResponse initialize(InitializeRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   ReadResponseList initializeList(InitializeRecord[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetSelectValueResult getSelectValue(GetSelectValueFieldDescription var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetItemAvailabilityResult getItemAvailability(ItemAvailabilityFilter var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetBudgetExchangeRateResult getBudgetExchangeRate(BudgetExchangeRateFilter var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetCurrencyRateResult getCurrencyRate(CurrencyRateFilter var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetDataCenterUrlsResult getDataCenterUrls(String var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidSessionFault;

   GetPostingTransactionSummaryResult getPostingTransactionSummary(PostingTransactionSummaryField var1, PostingTransactionSummaryFilter var2, int var3, String var4) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetServerTimeResult getServerTime() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponse attach(AttachReference var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponse detach(DetachReference var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponse updateInviteeStatus(UpdateInviteeStatusReference var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   WriteResponseList updateInviteeStatusList(UpdateInviteeStatusReference[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult asyncAddList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult asyncUpdateList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult asyncUpsertList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult asyncDeleteList(BaseRef[] var1, DeletionReason var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult asyncGetList(BaseRef[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult asyncInitializeList(InitializeRecord[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult asyncSearch(SearchRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncResult getAsyncResult(String var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, AsyncFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   AsyncStatusResult checkAsyncStatus(String var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, AsyncFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

   GetDeletedResult getDeleted(GetDeletedFilter var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;
}
