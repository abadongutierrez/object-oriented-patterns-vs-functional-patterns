(ns com.jabaddon.book.fpp.roop.builder.immutable
    (:use clojure.test))

(deftest test-map
    (let [p {:first-name "John" :middle-name "Quincy" :last-name "Adams"}]
        (is (= "John" (p :first-name)))))