package com.jabaddon.book.fpp.roop.builder

import org.scalatest.junit.JUnitSuite
import org.scalatest.Matchers
import grizzled.slf4j.Logger
import org.junit.Test

class BuilderForImmutableObjectsSuite extends JUnitSuite with Matchers {

    val logger = Logger(classOf[BuilderForImmutableObjectsSuite])

    @Test
    def testBuildImmutableObjectsWithImmutableClasses() {
        // using constructor parameters positionally
        val p1 = new Person("John", "Quincy", "Adams")
        // using named parameters
        val p2 = new Person(firstName = "John", middleName = "Quincy", lastName = "Adams")

        p1.firstName should be("John")
        p1.middleName should be("Quincy")
        p1.lastName should be("Adams")

        p2.firstName should be("John")
        p2.middleName should be("Quincy")
        p2.lastName should be("Adams")
    }

    @Test
    def testBuildImmutableObjectsWithImmutableClassesWithDefaultValues() {
        // using named parameters
        val p1 = new PersonWithDefault(firstName = "John", lastName = "Adams")

        p1.firstName should be("John")
        p1.middleName should be("")
        p1.lastName should be("Adams")
    }

    @Test
    def testBuildImmutableObjectsWithCaseClasses() {
        // using named parameters
        val p1 = new PersonCaseClass(firstName = "John", lastName = "Adams")
        val p2 = new PersonCaseClass(firstName = "John", lastName = "Adams")
        val p3 = new PersonCaseClass(firstName = "John", middleName = "Quincy", lastName = "Adams")

        p1.firstName should be("John")
        p1.middleName should be("")
        p1.lastName should be("Adams")

        p1 should be (p2)
        p2 should not be p3

        val pCopy = p1.copy(middleName = "Quincy")
        val str = p3 match {
            case PersonCaseClass(firstName, middleName, lastName) =>
                "First: %s - Middle: %s - Last: %s".format(firstName, middleName, lastName)
        }

        str should be ("First: John - Middle: Quincy - Last: Adams")
    }

    @Test
    def testBuildImmutableObjectWithTuples() {
        def p = ("John", "Adams")

        p._1 should be ("John")
        p._2 should be ("Adams")
    }
}
