package net.lab0.azure.model.definition.core

import kotlin.Boolean

interface TeamMember {
  val identity: IdentityRef

  val isTeamAdmin: Boolean
}
