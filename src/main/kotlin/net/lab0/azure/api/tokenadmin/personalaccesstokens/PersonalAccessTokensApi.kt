package net.lab0.azure.api.tokenadmin.personalaccesstokens

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PersonalAccessTokensApi {
  /**
   * Lists of all the session token details of the personal access tokens (PATs) for a particular
   * user.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectDescriptor The descriptor of the target user.
   * @param pageSize The maximum number of results to return on each page.
   * @param continuationToken An opaque data blob that allows the next page of data to resume
   * immediately after where the previous page ended. The only reliable way to know if there is more
   * data left is the presence of a continuation token.
   * @param isPublic Set to false for PAT tokens and true for SSH tokens.
   */
  @GET("/{organization}/_apis/tokenadmin/personalaccesstokens/{subjectDescriptor}")
  fun listPersonalAccessTokens(
    @Path("organization") organization: String,
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Query("pageSize") pageSize: Int? = null,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("isPublic") isPublic: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
