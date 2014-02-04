package com.jabaddon.book.fpp.roop.builder

class Person(
    val firstName: String,
    val middleName: String,
    val lastName: String)

class PersonWithDefault(
    val firstName: String,
    val middleName: String = "",
    val lastName: String)

case class PersonCaseClass(
    firstName: String,
    middleName: String = "",
    lastName: String)
