package net.lab0.azure.symbol.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SymsrvApi {
  /**
   * Given a client key, returns the best matched debug entry.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param debugEntryClientKey A "client key" used by both ends of Microsoft's symbol protocol to
   * identify a debug entry. The semantics of client key is governed by symsrv and is beyond the scope
   * of this documentation.
   */
  @GET("/{organization}/_apis/symbol/symsrv/{debugEntryClientKey}")
  fun get(
    @Path("organization") organization: String,
    @Path("debugEntryClientKey") debugEntryClientKey: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
