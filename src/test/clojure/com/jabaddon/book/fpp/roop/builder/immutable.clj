(ns com.jabaddon.book.fpp.roop.builder.immutable
    (:use [clojure.test])
    (:require [com.jabaddon.book.fpp.roop.builder.catsanddogs]) ;require is necessary before import records from a namespace
    (:import [com.jabaddon.book.fpp.roop.builder.catsanddogs Cat NoisyCat NoiseMaker])) ;a record has to be imported

(deftest test-map
    (let [p {:first-name "John" :middle-name "Quincy" :last-name "Adams"}]
        (is (= "John" (p :first-name)))
        (is (= "Quincy" (p :middle-name)))
        (is (= "Adams" (get p :last-name)))))

(deftest test-record
    (let [r (Cat. "Calico" "Fuzzy McBootings")]
        (is (= "Fuzzy McBootings" (:name r))) ; using the key as a function call
        (is (= "Calico" (get r :color)))      ; using get function
        (is (= "Calico" (:color r)))))        ;

(deftest test-record-with-protocol
    (let [r (NoisyCat. "Calico" "Fuzzy McBootings")]
        (is (= "Fuzzy McBootings" (:name r)))               ; using key (as a map but it is a record)
        (is (= "Calico" (get r :color)))                    ; using get function
        (is (= "Fuzzy McBootings meows!" (.make-noise r))))) ;