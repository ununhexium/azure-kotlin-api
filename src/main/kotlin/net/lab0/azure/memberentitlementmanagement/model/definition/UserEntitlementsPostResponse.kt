package net.lab0.azure.memberentitlementmanagement.model.definition

interface UserEntitlementsPostResponse : UserEntitlementsResponseBase {
  val operationResult: UserEntitlementOperationResult
}
