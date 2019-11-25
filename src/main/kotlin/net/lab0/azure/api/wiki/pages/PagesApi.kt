package net.lab0.azure.api.wiki.pages

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.wiki.GitVersionOptions
import net.lab0.azure.model.definition.enumeration.wiki.GitVersionType
import net.lab0.azure.model.definition.enumeration.wiki.VersionControlRecursionType
import net.lab0.azure.model.definition.wiki.WikiPageCreateOrUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface PagesApi {
  /**
   * Gets metadata or content of the wiki page for the provided path. Content negotiation is done
   * based on the `Accept` header sent in the request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param wikiIdentifier Wiki Id or name.
   * @param path Wiki page path.
   * @param recursionLevel Recursion level for subpages retrieval. Defaults to `None` (Optional).
   * @param versionDescriptor_versionOptions Version options - Specify additional modifiers to
   * version (e.g Previous)
   * @param versionDescriptor_version Version string identifier (name of tag/branch, SHA1 of commit)
   * @param versionDescriptor_versionType Version type (branch, tag, or commit). Determines how Id
   * is interpreted
   * @param includeContent True to include the content of the page in the response for Json content
   * type. Defaults to false (Optional)
   */
  @GET("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}/pages")
  fun getPage(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Query("path") path: String? = null,
    @Query("recursionLevel") recursionLevel: VersionControlRecursionType? = null,
    @Query("versionDescriptor.versionOptions") versionDescriptor_versionOptions: GitVersionOptions?
        = null,
    @Query("versionDescriptor.version") versionDescriptor_version: String? = null,
    @Query("versionDescriptor.versionType") versionDescriptor_versionType: GitVersionType? = null,
    @Query("includeContent") includeContent: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Creates or edits a wiki page.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param wikiIdentifier Wiki Id or name.
   * @param path Wiki page path.
   * @param Version Version of the page on which the change is to be made. Mandatory for `Edit`
   * scenario. To be populated in the If-Match header of the request.
   * @param comment Comment to be associated with the page operation.
   */
  @PUT("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}/pages")
  fun createOrUpdatePage(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Query("path") path: String,
    @Header("Version") Version: String,
    @Query("comment") comment: String? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WikiPageCreateOrUpdateParameters
  ): Call<JsonValue>

  /**
   * Deletes a wiki page.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param wikiIdentifier Wiki Id or name.
   * @param path Wiki page path.
   * @param comment Comment to be associated with this page delete.
   */
  @DELETE("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}/pages")
  fun deletePage(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Query("path") path: String,
    @Query("comment") comment: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
