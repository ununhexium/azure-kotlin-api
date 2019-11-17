package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.collections.List

interface PagedGraphMemberList : PagedList {
  val members: List<UserEntitlement>
}
