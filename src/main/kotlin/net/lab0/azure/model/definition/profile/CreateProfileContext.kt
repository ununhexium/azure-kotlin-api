package net.lab0.azure.model.definition.profile

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.profile.ProfileState

interface CreateProfileContext {
  val cIData: JsonObject

  val contactWithOffers: Boolean

  val countryName: String

  val displayName: String

  val emailAddress: String

  val hasAccount: Boolean

  val language: String

  val phoneNumber: String

  val profileState: ProfileState
}
