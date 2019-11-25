package net.lab0.azure.model.definition.git

interface TfvcCheckinEventData {
  val changeset: TfvcChangeset

  val project: TeamProjectReference
}
