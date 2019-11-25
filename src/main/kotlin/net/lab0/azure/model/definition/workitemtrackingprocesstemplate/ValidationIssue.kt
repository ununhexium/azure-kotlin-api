package net.lab0.azure.model.definition.workitemtrackingprocesstemplate

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtrackingprocesstemplate.ValidationIssueType

interface ValidationIssue {
  val description: String

  val file: String

  val helpLink: String

  val issueType: ValidationIssueType

  val line: Int
}
