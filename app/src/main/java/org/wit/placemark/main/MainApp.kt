package org.wit.placemark.main

import org.wit.placemark.models.PlacemarkModel

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainApp : Application(), AnkoLogger
{
  val placemarks = ArrayList<PlacemarkModel>()


  override fun onCreate()
  {
    super.onCreate()
    info("MAIN: Placemark Started")
  }

}
