package com.grab.onelink.appsflyertest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import android.net.Uri

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ATTENTION: This was auto-generated to handle app links.
        val appLinkIntent: Intent = intent
        val appLinkAction: String? = appLinkIntent.action
        val appLinkData: Uri? = appLinkIntent.data

        if (intent.data != null) {
            handleDeeplink(intent)
        }
    }

//    override fun onNewIntent(intent: Intent?) {
//        super.onNewIntent(intent)
//        intent?.let {
//            handleDeeplink(intent)
//        }
//        setIntent(intent)
//    }

    private fun handleDeeplink(intent: Intent) {
        println("Deeplink Intent: $intent.data")
    }

    public fun goToApples(view: View?) {
        try {
            val intent =Intent(this, ApplesActivity::class.java)
            startActivity(intent)
        }
        catch (e:Exception){
            Toast.makeText(applicationContext,"Entered Catch",Toast.LENGTH_SHORT).show()
        }
    }

    public fun goToBananas(view: View?) {
        try {
            val intent =Intent(this, BananasActivity::class.java)
            startActivity(intent)
        }
        catch (e:Exception){
            Toast.makeText(applicationContext,"Entered Catch",Toast.LENGTH_SHORT).show()
        }
    }

    public fun goToPeaches(view: View?) {
        try {
            val intent =Intent(this, PeachesActivity::class.java)
            startActivity(intent)
        }
        catch (e:Exception){
            Toast.makeText(applicationContext,"Entered Catch",Toast.LENGTH_SHORT).show()
        }
    }
}
