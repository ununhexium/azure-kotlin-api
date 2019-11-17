package net.lab0.azure.workitemtrackingprocesstemplate.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.workitemtrackingprocesstemplate.model.definition.enumeration.ValidationIssueType

interface ValidationIssue {
  val description: String

  val file: String

  val helpLink: String

  val issueType: ValidationIssueType

  val line: Int
}
