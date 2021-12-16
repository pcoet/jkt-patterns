package com.pcoet.patterns.oop.design

import org.junit.Test

import org.junit.Assert.*

class GizmoTest {
    val gizmo = Gizmo("TestGizmo", 0, 0, 20, 10, 11)
    @Test
    fun testToString() {
        assertEquals("Gizmo{name=TestGizmo, " +
                "upperLeftPoint=Point{x=0,y=0}, " +
                "upperRightPoint=Point{x=20,y=0}, " +
                "lowerRightPoint=Point{x=20,y=-10}, " +
                "lowerLeftPoint=Point{x=0,y=-10}, " +
                "dialRangeMax=11}", gizmo.toString())
    }

    @Test
    fun getDialRangeMax() {
        assertEquals(11, gizmo.dialRangeMax)
    }
}