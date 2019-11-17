package net.lab0.azure.workitemtracking.model.definition

import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.enumeration.ProvisioningActionType
import net.lab0.azure.workitemtracking.model.definition.enumeration.TemplateType

/**
 * Describes a update work item type template request body.
 */
interface WorkItemTypeTemplateUpdateModel {
  /**
   * Describes the type of the action for the update request.
   */
  val actionType: ProvisioningActionType

  /**
   * Methodology to which the template belongs, eg. Agile, Scrum, CMMI.
   */
  val methodology: String

  /**
   * String representation of the work item type template.
   */
  val template: String

  /**
   * The type of the template described in the request body.
   */
  val templateType: TemplateType
}
