package net.lab0.azure.model.definition.profile

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.profile.ProfileState

interface Profile {
  val applicationContainer: AttributesContainer

  val coreAttributes: JsonObject

  val coreRevision: Int

  val id: String

  val profileState: ProfileState

  val revision: Int

  val timeStamp: String
}
