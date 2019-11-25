package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitPathActions

interface GitPathAction {
  val action: GitPathActions

  val base64Content: String

  val path: String

  val rawTextContent: String

  val targetPath: String
}
