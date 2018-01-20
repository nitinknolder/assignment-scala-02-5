package edu.knoldus

import java.io._

@SerialVersionUID (3244)
class Person (val name: String,
              val age: Int,
              @transient val day: String,
              val address: Address,
              val salary: Float,
              @transient val luckyNo: Int) extends Serializable {
  override def toString: String = s"$name $age $day $address $salary $luckyNo"
}

@SerialVersionUID (2081)
class Address (val street: String, val houseNo: Int) extends Serializable {
  override def toString: String = s"$street $houseNo"
}






