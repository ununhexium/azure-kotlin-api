package net.lab0.azure.profile.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProfilesApi {
  /**
   * Get my profile.
   */
  @GET("/_apis/profile/profiles/{id}")
  fun get(
    @Path("id") id: String,
    @Query("details") details: Boolean,
    @Query("withAttributes") withAttributes: Boolean,
    @Query("partition") partition: String,
    @Query("coreAttributes") coreAttributes: String,
    @Query("forceRefresh") forceRefresh: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
