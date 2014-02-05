(ns com.jabaddon.book.fpp.roop.builder.immutable
    (:use [clojure.test])) ;a record has to be imported

(deftest test-map
    (let [p {:first-name "John" :middle-name "Quincy" :last-name "Adams"}]
        (is (= "John" (p :first-name)))
        (is (= "Quincy" (p :middle-name)))
        (is (= "Adams" (get p :last-name)))))

(deftest test-record
    (let [r (com.jabaddon.book.fpp.roop.builder.catsanddogs.Cat. "Calico" "Fuzzy McBootings")]
        (is (= "Fuzzy McBootings" (:name r)))
        (is (= "Calico" (get r :color)))
        (is (= "Calico" (:color r)))))