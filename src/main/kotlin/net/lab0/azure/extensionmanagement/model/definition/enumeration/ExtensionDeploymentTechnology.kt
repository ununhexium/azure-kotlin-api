package net.lab0.azure.extensionmanagement.model.definition.enumeration

import com.squareup.moshi.Json

enum class ExtensionDeploymentTechnology {
  @Json(name = "exe")
  EXE,

  @Json(name = "msi")
  MSI,

  @Json(name = "vsix")
  VSIX,

  @Json(name = "referralLink")
  REFERRAL_LINK
}
