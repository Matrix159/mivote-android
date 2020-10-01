package io.michiganelections.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VoterRegistration(
  val registered: Boolean,
  val absentee: Boolean,
  val absenteeApplicationReceived: String?, //date
  val absenteeBallotSent: String?, //date
  val absenteeBallotRecieved: String?, //date
  val polling_location: List<String>?,
  val dropbox_location: List<String>?,
  val recently_moved: Boolean,
  val precinct: Precinct?,
  val districts: List<District>?
)
