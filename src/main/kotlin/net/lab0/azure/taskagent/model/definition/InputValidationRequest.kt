package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject

interface InputValidationRequest {
  val inputs: JsonObject
}
