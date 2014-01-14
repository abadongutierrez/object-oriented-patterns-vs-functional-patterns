package com.jabaddon.book.fpp.roop.functionalinterface

import grizzled.slf4j.Logger
import org.junit.Assert._
import org.junit.Before
import org.junit.Test
import org.scalatest._
import org.scalatest.junit.JUnitSuite

class FunctionalInterfaceSuite extends JUnitSuite with Matchers {
    val logger = Logger(classOf[FunctionalInterfaceSuite])

    @Test
    def verify() {
        val p1 = Person("Aaron", "Jeffrey", "Smith")
        val p2 = Person("Aaron", "Bailey", "Zanthar")
        val p3 = Person("Brian", "Adams", "Smith")
        val people = Vector(p3, p2, p1)
        
        val peopleSorted = people.sortWith(PersonExample.complicatedSort)
        logger.debug(people)
        logger.debug(peopleSorted)

        peopleSorted.indexOf(p1) should be (0)
        peopleSorted.indexOf(p2) should be (1)
        peopleSorted.indexOf(p3) should be (2)
    }
}