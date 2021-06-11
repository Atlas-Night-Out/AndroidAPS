package info.nightscout.androidaps.plugins.pump.insight.utils

import info.nightscout.androidaps.TestBase
import info.nightscout.androidaps.plugins.pump.insight.utils.ByteBuf
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ByteBufTest : TestBase() {


    @Test
    fun `test length on creation`() {
        val sut = ByteBuf(15)
        assertEquals(0, sut.filledSize) // not filled yet
        assertEquals(0, sut.bytes.size)
    }

}