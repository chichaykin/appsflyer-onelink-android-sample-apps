package com.grab.onelink.appsflyertest


class ApplesActivity : FruitActivity() {
    override val fruitName: String = "apples"
    override protected fun getLayoutResourceId(): Int = R.layout.activity_apples
}