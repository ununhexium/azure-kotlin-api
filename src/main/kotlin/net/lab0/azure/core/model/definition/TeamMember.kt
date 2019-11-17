package net.lab0.azure.core.model.definition

import kotlin.Boolean

interface TeamMember {
  val identity: IdentityRef

  val isTeamAdmin: Boolean
}
