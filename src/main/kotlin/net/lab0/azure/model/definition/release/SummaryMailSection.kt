package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.MailSectionType

interface SummaryMailSection {
  val htmlContent: String

  val rank: Int

  val sectionType: MailSectionType

  val title: String
}
