package net.lab0.azure.model.definition.workitemtracking

import javax.json.JsonObject

/**
 * Describes a work item template.
 */
interface WorkItemTemplate : WorkItemTemplateReference {
  /**
   * Mapping of field and its templated value.
   */
  val fields: JsonObject
}
