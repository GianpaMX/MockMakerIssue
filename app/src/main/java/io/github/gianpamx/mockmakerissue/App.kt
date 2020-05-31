package io.github.gianpamx.mockmakerissue

import android.app.Application
import io.github.gianpamx.mylibrary.DummyInterface
import io.github.gianpamx.mylibrary.DummyObject

class App : Application(), DummyInterface {
    override fun dummyObject() = DummyObject()
}
