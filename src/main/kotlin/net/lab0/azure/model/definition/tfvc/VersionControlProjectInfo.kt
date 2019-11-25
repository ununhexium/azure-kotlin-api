package net.lab0.azure.model.definition.tfvc

import kotlin.Boolean
import net.lab0.azure.model.definition.enumeration.tfvc.SourceControlTypes

interface VersionControlProjectInfo {
  val defaultSourceControlType: SourceControlTypes

  val project: TeamProjectReference

  val supportsGit: Boolean

  val supportsTFVC: Boolean
}
