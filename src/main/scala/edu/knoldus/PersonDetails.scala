package edu.knoldus

import java.io.{File, PrintWriter}

import org.apache.log4j.Logger
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization.write

import scala.io.Source

object PersonDetails {

  def main (args: Array[String]): Unit = {

    implicit val formats = DefaultFormats

    val log = Logger.getLogger(getClass)
    val name = "Nitin"
    val age = 23
    val day = "Monday"
    val street = "Lajpat Nagar"
    val houseNo = 74
    val salary = 20000
    val luckyNum: Int = 15
    val detailsOfPerson = new Person (name = name, age = age, day = day,
      address = new Address (street = street, houseNo = houseNo), salary, luckyNum)
    //writing File
    val detailsOfPersonJSON = write (detailsOfPerson)
    val writeMyFile = new PrintWriter (new File ("/home/knoldus/Desktop/object.txt"))
    writeMyFile.write (detailsOfPersonJSON)
    writeMyFile.close ()
    //Reading File
    Source.fromFile ("/home/knoldus/Desktop/object.txt").foreach (data => log.debug(data))
  }
}