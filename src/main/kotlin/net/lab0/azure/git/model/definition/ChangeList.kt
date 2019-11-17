package net.lab0.azure.git.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface ChangeList {
  val allChangesIncluded: Boolean

  val changeCounts: JsonObject

  val changes: List<Change>

  val comment: String

  val commentTruncated: Boolean

  val creationDate: String

  val notes: List<CheckinNote>

  val owner: String

  val ownerDisplayName: String

  val ownerId: String

  val sortDate: String

  val version: String
}
