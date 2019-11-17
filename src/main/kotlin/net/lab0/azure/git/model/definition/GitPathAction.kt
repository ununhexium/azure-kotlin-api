package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitPathActions

interface GitPathAction {
  val action: GitPathActions

  val base64Content: String

  val path: String

  val rawTextContent: String

  val targetPath: String
}
