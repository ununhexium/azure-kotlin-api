package net.lab0.azure.wiki.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface AttachmentsApi {
  /**
   * Creates an attachment in the wiki.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param wikiIdentifier Wiki Id or name.
   * @param name Wiki attachment name.
   */
  @PUT("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}/attachments")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Query("name") name: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: String
  ): Call<JsonValue>
}
