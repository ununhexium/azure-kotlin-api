package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class AuthorizationHeaderFor {
  @Json(name = "revalidateApproverIdentity")
  REVALIDATE_APPROVER_IDENTITY,

  @Json(name = "onBehalfOf")
  ON_BEHALF_OF
}
