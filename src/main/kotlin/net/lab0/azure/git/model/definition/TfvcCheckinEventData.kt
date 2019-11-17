package net.lab0.azure.git.model.definition

interface TfvcCheckinEventData {
  val changeset: TfvcChangeset

  val project: TeamProjectReference
}
