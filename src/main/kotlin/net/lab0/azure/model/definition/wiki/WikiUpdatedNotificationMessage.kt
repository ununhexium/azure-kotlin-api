package net.lab0.azure.model.definition.wiki

import kotlin.String

interface WikiUpdatedNotificationMessage {
  /**
   * Collection host Id for which the wikis are updated.
   */
  val collectionId: String

  /**
   * Project Id for which the wikis are updated.
   */
  val projectId: String

  /**
   * Repository Id associated with the particular wiki which is added, updated or deleted.
   */
  val repositoryId: String
}
