package net.lab0.azure.model.definition.enumeration.notification

import com.squareup.moshi.Json

enum class NotificationReasonType {
  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "follows")
  FOLLOWS,

  @Json(name = "personal")
  PERSONAL,

  @Json(name = "personalAlias")
  PERSONAL_ALIAS,

  @Json(name = "directMember")
  DIRECT_MEMBER,

  @Json(name = "indirectMember")
  INDIRECT_MEMBER,

  @Json(name = "groupAlias")
  GROUP_ALIAS,

  @Json(name = "subscriptionAlias")
  SUBSCRIPTION_ALIAS,

  @Json(name = "singleRole")
  SINGLE_ROLE,

  @Json(name = "directMemberGroupRole")
  DIRECT_MEMBER_GROUP_ROLE,

  @Json(name = "inDirectMemberGroupRole")
  IN_DIRECT_MEMBER_GROUP_ROLE,

  @Json(name = "aliasMemberGroupRole")
  ALIAS_MEMBER_GROUP_ROLE
}
