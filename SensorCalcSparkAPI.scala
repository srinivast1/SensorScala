package com.test

case class SensorMeasurment(sensorid:String,humidity : String)

object SensorCalc {

  def main(args: Array[String]): Unit = {
    var dir = "C:\\Sri\\Personel\\ACE"

    val sensorSpark=new SensorStaticSparkImpl()
    val noOfProcessedFile=sensorSpark.numOfProcessedFiles(dir)
    println("Num of processed files:" + noOfProcessedFile)
    val numOfFailedMeasure=sensorSpark.numOfFailedMeasurements()
    println("Num of failed measurements: "+numOfFailedMeasure)
    sensorSpark.minAvgMaxHumidity()
   }

}
