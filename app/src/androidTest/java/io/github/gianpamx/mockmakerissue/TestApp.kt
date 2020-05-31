package io.github.gianpamx.mockmakerissue

import android.app.Application
import io.github.gianpamx.mylibrary.DummyInterface
import io.github.gianpamx.mylibrary.DummyObject
import org.mockito.Mockito.mock

class TestApp : Application(), DummyInterface {
    private val mock: DummyObject by lazy { mock(DummyObject::class.java) }

    override fun dummyObject(): DummyObject = mock
}
