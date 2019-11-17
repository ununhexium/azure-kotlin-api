package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.MailSectionType

interface SummaryMailSection {
  val htmlContent: String

  val rank: Int

  val sectionType: MailSectionType

  val title: String
}
