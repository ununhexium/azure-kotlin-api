package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface PagedList {
  val continuationToken: String

  val items: List<String>

  val totalCount: Int
}
