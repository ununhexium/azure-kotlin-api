package net.lab0.azure.profile.model.definition

import kotlin.String
import kotlin.collections.List

interface RemoteProfile {
  val avatar: List<String>

  val countryCode: String

  val displayName: String

  /**
   * Primary contact email from from MSA/AAD
   */
  val emailAddress: String
}
