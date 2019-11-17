package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String

interface SecureFile {
  val createdBy: IdentityRef

  val createdOn: String

  val id: String

  val modifiedBy: IdentityRef

  val modifiedOn: String

  val name: String

  val properties: JsonObject

  val ticket: String
}
