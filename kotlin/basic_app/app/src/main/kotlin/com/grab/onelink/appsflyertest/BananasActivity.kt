package com.grab.onelink.appsflyertest


class BananasActivity : FruitActivity() {
    override val fruitName: String = "bananas"
    override protected fun getLayoutResourceId(): Int = R.layout.activity_bananas
}