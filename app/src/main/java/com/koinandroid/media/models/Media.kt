package com.koinandroid.media.models


import android.util.Log

import org.json.JSONArray

import java.util.ArrayList

class Media {

    internal var imageList = ArrayList<Media>()
    internal var smallVideo = ArrayList<Media>()
    internal var largeVideoList = ArrayList<Media>()

    var source: String? = null
    var author: String? = null
    var title: String? = null
    var description: String? = null

    var url: String? = null
    var urlToImage: String? = null
    var publishedAt: String? = null

    var id: Int = 0
    var adid: Int = 0
    var driverId: Int = 0
    var adName: String? = null
    var mediaPath: String? = null
    var noOfTimes: Int = 0
    var count: Int = 0
    var latitude: Double? = null
    var longitude: Double? = null
    var adType: String? = null

    var customerId: Int = 0

    var duration: Int = 0

    companion object {

        //

        fun getJsonObject(jsonArray: JSONArray): ArrayList<Media> {

            val mediaArrayList = ArrayList<Media>()

            try {
                for (i in 0 until jsonArray.length()) {
                    val jsonObject = jsonArray.getJSONObject(i)
                    Log.d("getJSONObject", jsonArray.length().toString())

                    val mMedia = Media()

                    mMedia.id = jsonObject.optInt("id", 0)
                    mMedia.adid = jsonObject.optInt("adid", 0)
                    mMedia.driverId = jsonObject.optInt("driverId", 0)
                    mMedia.adName = jsonObject.optString("adName", "")
                    mMedia.mediaPath = jsonObject.optString("mediaPath", "")
                    mMedia.noOfTimes = jsonObject.optInt("noOfTimes", 0)
                    mMedia.count = jsonObject.optInt("count", 0)
                    mMedia.latitude = jsonObject.optDouble("latitude", 0.0)
                    mMedia.longitude = jsonObject.optDouble("longitude", 0.0)
                    mMedia.adType = jsonObject.optString("adType", "")
                    mMedia.duration = jsonObject.optInt("duration", 0)
                    mMedia.customerId = jsonObject.optInt("customerId", 0)
                    /*0 image
                        1 smallVideo
                        2 image
                        3 largevideo
                        4 image
                        5 smallvideo
                        6 image*/

                    mMedia.adType?.let { adType ->
                        if (adType.contentEquals("Image")) {
                            mMedia.imageList.add(mMedia)
                        } else if (adType.contentEquals("Small Video")) {
                            mMedia.smallVideo.add(mMedia)
                        } else if (adType.contentEquals("Large Video")) {
                            mMedia.largeVideoList.add(mMedia)
                        } else {}
                    }

                    mediaArrayList.add(mMedia)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return mediaArrayList
        }

        fun getJsonBannerObject(jsonArray: JSONArray): ArrayList<Media> {

            val bannerArrayList = ArrayList<Media>()


            try {
                for (i in 0 until jsonArray.length()) {
                    val jsonObject = jsonArray.getJSONObject(i)

                    val media = Media()

                    media.id = jsonObject.optInt("id", 0)
                    media.adid = jsonObject.optInt("adid", 0)
                    media.driverId = jsonObject.optInt("driverId", 0)
                    media.adName = jsonObject.optString("adName", "")
                    media.mediaPath = jsonObject.optString("mediaPath", "")
                    media.noOfTimes = jsonObject.optInt("noOfTimes", 0)
                    media.count = jsonObject.optInt("count", 0)
                    media.latitude = jsonObject.optDouble("latitude", 0.0)
                    media.longitude = jsonObject.optDouble("longitude", 0.0)
                    media.adType = jsonObject.optString("adType", "")
                    media.duration = jsonObject.optInt("duration", 0)
                    media.customerId = jsonObject.optInt("CustomerId", 0)

                    media.adType?.let { adType ->
                        if (adType.contentEquals("Image")) {
                            media.imageList.add(media)
                        } else if (adType.contentEquals("Small Video")) {
                            media.smallVideo.add(media)
                        } else if (adType.contentEquals("Large Video")) {
                            media.largeVideoList.add(media)
                        } else {}
                    }
                    bannerArrayList.add(media)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return bannerArrayList
        }
    }

}
