package net.lab0.azure.tokenadministration.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TokenPersonalAccessTokensApi {
  /**
   * Lists of all the session token details of the personal access tokens (PATs) for a particular
   * user.
   *
   * @param subjectDescriptor The descriptor of the target user.
   * @param pageSize The maximum number of results to return on each page.
   * @param continuationToken An opaque data blob that allows the next page of data to resume
   * immediately after where the previous page ended. The only reliable way to know if there is more
   * data left is the presence of a continuation token.
   */
  @POST("/_apis/tokenadministration/tokenpersonalaccesstokens/{subjectDescriptor}")
  fun list(
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Query("pageSize") pageSize: Int,
    @Query("continuationToken") continuationToken: String,
    @Query("siPublic") siPublic: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: List<String>
  ): Call<JsonValue>
}
