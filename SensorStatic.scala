package com.test

trait SensorStatic {

  def numOfProcessedFiles(dir: String): Int

  def numOfFailedMeasurements():Int

  def minAvgMaxHumidity(): Unit

}
