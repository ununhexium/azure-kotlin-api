package net.lab0.azure.release.model.definition

import net.lab0.azure.release.model.definition.enumeration.PipelineProcessTypes

interface PipelineProcess {
  val type: PipelineProcessTypes
}
