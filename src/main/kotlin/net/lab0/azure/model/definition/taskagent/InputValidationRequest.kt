package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject

interface InputValidationRequest {
  val inputs: JsonObject
}
