package com.thishkt.democrashlytics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.crashlytics.android.Crashlytics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_crash.setOnClickListener {

            Crashlytics.setUserIdentifier("user123456789")
            Crashlytics.log("message")
            Crashlytics.setBool("key_user", true /* boolean value */)

            Crashlytics.getInstance().crash()
            throw Exception("Demo Crash")
        }
    }
}
