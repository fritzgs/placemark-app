package org.wit.placemark.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placemark.*

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.placemark.R
import org.wit.placemark.models.PlacemarkModel


class PlacemarkActivity : AppCompatActivity(), AnkoLogger {

  var placemark = PlacemarkModel()
  var placemarks = ArrayList<PlacemarkModel>()

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_placemark)
    btnAdd.setOnClickListener()
    {
      placemark.title = placemarkTitle.text.toString()
      placemark.description = description.text.toString()
      if(placemark.title.isNotEmpty() && placemark.description.isNotEmpty()) {
        info("Add Button Pressed: $placemarkTitle")
        info("Description: $description")
      }
      else
      {
        toast("Please Enter a Title")
      }
    }
  }
}
