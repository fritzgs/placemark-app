package org.wit.placemark.models

import org.jetbrains.anko.info
import org.jetbrains.anko.AnkoLogger



class PlacemarkMemStore : PlacemarkStore, AnkoLogger {

  val placemarks = ArrayList<PlacemarkModel>()

  override fun findAll(): List<PlacemarkModel> {
    return placemarks
  }

  override fun create(placemark: PlacemarkModel) {
    placemarks.add(placemark)
  }

  fun logAll() {
    placemarks.forEach{ info("${it}") }
  }
}