package net.lab0.azure.wiki.model.definition

/**
 * Wiki creation parameters.
 */
interface WikiCreateParametersV2 : WikiCreateBaseParameters {
  val version: GitVersionDescriptor
}
