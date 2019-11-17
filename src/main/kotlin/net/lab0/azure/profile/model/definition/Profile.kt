package net.lab0.azure.profile.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import net.lab0.azure.profile.model.definition.enumeration.ProfileState

interface Profile {
  val applicationContainer: AttributesContainer

  val coreAttributes: JsonObject

  val coreRevision: Int

  val id: String

  val profileState: ProfileState

  val revision: Int

  val timeStamp: String
}
