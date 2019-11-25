package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.collections.List

interface PagedGraphMemberList : PagedList {
  val members: List<UserEntitlement>
}
