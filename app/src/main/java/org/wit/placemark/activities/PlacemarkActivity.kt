package org.wit.placemark.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placemark.*

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.placemark.R

import org.wit.placemark.models.PlacemarkModel
import org.wit.placemark.main.MainApp


class PlacemarkActivity : AppCompatActivity(), AnkoLogger {

  var placemark = PlacemarkModel()
  lateinit var app : MainApp

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_placemark)
    app = application as MainApp

    btnAdd.setOnClickListener()
    {
      placemark.title = placemarkTitle.text.toString()
      placemark.description = description.text.toString()
      if(placemark.title.isNotEmpty()) {
        app!!.placemarks.add(placemark.copy()) //so that it doesn't add the same placemark object
        info("Add Button Pressed: $placemarkTitle")
        info("Description: $description")
        app!!.placemarks.forEach { info("Add button pressed: ${it}") } //!! is for null safety

      }
      else
      {
        toast("Please Enter a Title")
      }
    }
  }
}
