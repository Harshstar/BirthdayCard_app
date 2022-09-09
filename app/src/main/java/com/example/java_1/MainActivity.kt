package com.example.java_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.EditText
import com.google.android.gms.ads.*


class MainActivity : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mAdView.adListener = object: AdListener() {
            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked()
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                mAdView.loaded(adRequest);
            }

            override fun onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded()
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        }
    }
    fun createbirthdaycard(view: View) {

     //   Toast.makeText( this , "You clicked the button", Toast.LENGTH_LONG).show()

        val editText = findViewById<EditText>(R.id.edit)
        val name = editText.text.toString()
     //   Toast.makeText( this , "You clicked the button $name", Toast.LENGTH_LONG).show()
        val intent = Intent(this,Birthdaycard::class.java)

        intent.putExtra(Birthdaycard.Name_extra,name)

        startActivity(intent)
    }
}

private fun AdView.loaded(adRequest: AdRequest) {

}
