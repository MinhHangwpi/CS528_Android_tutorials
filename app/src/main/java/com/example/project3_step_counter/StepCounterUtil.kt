package com.example.project3_step_counter

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent

class StepCounterUtil(private val context: Context) {

    private var initializingReadings = true
    private val initialReadingsCount = 5
    private val initialReadings = mutableListOf<Float>()

    private var stepCount = 0
    private var samples = mutableListOf<Float>()
    private var max = Float.MIN_VALUE
    private var min = Float.MAX_VALUE
    private var dynamicThreshold = 0f
    private var lastCrossingTime = 0L
    private val minTimeBetweenSteps = 300

    fun detectSteps(event: SensorEvent?) {
        if (event?.sensor?.type == Sensor.TYPE_ACCELEROMETER) {
            val acceleration = calculateAcceleration(event.values)
            if (initializingReadings) {
                initializeReadings(acceleration)
            } else {
                val smoothedValue = smoothValues(acceleration)
                updateDynamicThreshold(smoothedValue)
                if (isStep(smoothedValue, System.currentTimeMillis())) {
                    incrementStepCount()
                }
            }
        }
    }

    private fun calculateAcceleration(values: FloatArray): Float {
        // TODO: calculate acceleration value from x, y, z coordinates
        return 0.0F; // returned the calculated acceleration value
    }

    private fun initializeReadings(acceleration: Float) {
        // TODO: add the calculated acceleration into the initial readings and update the max and min with max, min from initialReadings
    }

    private fun smoothValues(acceleration: Float): Float {
        // TODO: return the smoothed value which is the average of a number of sample size
        return 0.0F // return the calculated smoothed value
    }

    private fun updateDynamicThreshold(smoothedValue: Float) {
        // TODO: update dynamic threshold based on (max + min) / 2
    }

    private fun incrementStepCount() {
        // TODO: increment step count and update last crossing time
    }

    private fun isStep(smoothedValue: Float, currentTime: Long): Boolean {
        // TODO: determine if a given smoothed acceleration value corresponds to an actual step taken by the user
        return false
    }
}
