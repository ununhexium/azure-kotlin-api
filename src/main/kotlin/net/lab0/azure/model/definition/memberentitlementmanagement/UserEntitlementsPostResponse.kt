package net.lab0.azure.model.definition.memberentitlementmanagement

interface UserEntitlementsPostResponse : UserEntitlementsResponseBase {
  val operationResult: UserEntitlementOperationResult
}
